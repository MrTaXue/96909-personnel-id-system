package com.br.utils.commons;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.jsp.jstl.sql.Result;
import javax.servlet.jsp.jstl.sql.ResultSupport;
import javax.sql.DataSource;

public class DBHelper {
	public static PreparedStatement pst;
	public static Connection mycon;
	
	public static Connection getConnection()throws SQLException{
		DataSource ds=null;
		
		try {
			Context cnt=new InitialContext();
			ds=(DataSource)cnt.lookup("java:comp/env/jdbc/UserServerOA");
		} catch (NamingException e) {
			e.printStackTrace();
		}
		return ds.getConnection();
	}
	
	public static int myExecuteUpdate(String sql,Object [] params)throws SQLException{
		mycon=getConnection();
		pst=mycon.prepareStatement(sql);
		if(params!=null){
			int idx=1;
			for(Object obj:params){
				pst.setObject(idx, obj);
				idx++;
			}
		}
		int iline=pst.executeUpdate();
		pst.close();
		mycon.close();
		return iline;
	}
	
	public static ResultSet getResultset(String sql,Object [] params) throws SQLException{
		mycon=getConnection();
		pst=mycon.prepareStatement(sql);
		if(params!=null){
			int idx=1;
			for(Object obj : params){
				pst.setObject(idx,obj );
				idx++;
			}
		}
		ResultSet rst = pst.executeQuery();
		return rst;
	}
	
	public static Result getResult(String sql,Object [] params) throws SQLException{
		Result rs=null;
		mycon=getConnection();
		pst=mycon.prepareStatement(sql);
		if(params!=null){
			int idx=1;
			for(Object obj : params){
				pst.setObject(idx,obj );
				idx++;
			}
		}
		ResultSet rst = pst.executeQuery();
		rs = ResultSupport.toResult(rst);
		rst.close();
		pst.close();
		mycon.close();
		return rs;
	}
	
	/**
	 * 执行多条sql语句（包括增，删，改）
	 * 使用事物完成
	 * @param sqlList
	 * @return
	 * @throws SQLException
	 */
	public static int myTransaction(List<String> sqlList){
		int iline=-1;
		try {
			mycon=getConnection();
			mycon.setAutoCommit(false);//将sql语句事物自动提交该为false(就是改成了手动提交)
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		
		try{
			if(sqlList.size()>0){
				for(String sql : sqlList){
					pst=mycon.prepareStatement(sql);
					pst.executeUpdate();
				}
			}
			mycon.commit();//如果所有语句执行成功，则提交事物
			iline=1;
		}catch(SQLException e){
			try {
				mycon.rollback();//如果执行语句过程中出现错误，则回滚事物
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}finally{
			try{
				pst.close();
				mycon.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		return iline;
	}
	
	/**
	 * 返回第一行第一列的值
	 * @param sql
	 * @param params
	 * @return
	 * @throws SQLException
	 */
	public static Object getObject(String sql,Object [] params) throws SQLException{
		Object object=null;
		ResultSet rst=null;
		mycon=getConnection();
		pst=mycon.prepareStatement(sql);
		if(params!=null){
			int idx=1;
			for(Object obj : params){
				pst.setObject(idx, obj);
				idx++;
			}
		}
		rst=pst.executeQuery();
		while(rst.next()){
			object = rst.getObject(1);
		}
		rst.close();
		closeResources();
		return object;
	}
	
	public static void closeResources() throws SQLException{
		if(pst!=null){
			pst.close();
		}
		if(mycon!=null){
			mycon.close();
		}
	}
}
