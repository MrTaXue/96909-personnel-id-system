package com.br.dao.impl.yuan;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.jsp.jstl.sql.Result;

import com.br.dao.yuan.IAccountsDao;
import com.br.utils.commons.DBHelper;
import com.br.utils.entity.Accounts;
import com.br.utils.entity.Company;

public class AccountsDaoImpl implements IAccountsDao {

	@Override
	public Accounts login(Accounts entity)throws SQLException {
		String sql="select * from accounts where accname=? and accpwd=?";
		Object [] params={entity.getAccName(),entity.getAccPwd()};
		Result rs=DBHelper.getResult(sql, params);
		entity=null;
		if(rs!=null && rs.getRowCount()>0){
		    Map [] maps =(Map [])rs.getRows();
		    for(Map m : maps){
		    	entity=new Accounts();
		    	entity.setAccountId(Integer.parseInt(m.get("accountid").toString()));
		    	entity.setAccName(m.get("accname").toString());
		    	entity.setfName(m.get("fname").toString());
		    	entity.setaEmail(m.get("aemail").toString());
		    	entity.setAccPwd(m.get("accpwd").toString());
		    	entity.setAccState(m.get("accstate").toString());
		    	entity.setCompanyGrand(m.get("companygrand").toString());
		    	entity.setCompanyId(Integer.parseInt(m.get("companyid").toString()));
		    }
		}
		if(entity!=null){
			return entity;
		}
		return null;
	}

	@Override
	public int add(Accounts entity) throws SQLException {
		int iline = 0;
		String sqlcomid = "select * from company where comid = "
				+ entity.getCompanyId();
		Result rs = DBHelper.getResult(sqlcomid, null);
		Company company = null;
		if (rs != null) {
			Map maps[] = (Map[]) rs.getRows();
			for (Map m : maps) {
				company = new Company();
				company.setComid(Integer.valueOf(m.get("comid").toString()));
			}
		}
		if (company == null) {
			iline = -1;// 公司编号不存在
			return iline;
		} else {
			String sql = "insert into accounts values(?,?,?,?,?,?,?)";
			Object[] params ={
					entity.getAccName(),
					entity.getfName(),
					entity.getaEmail(),
					entity.getAccPwd(),
					entity.getAccState(),
					entity.getCompanyGrand(),
					entity.getCompanyId()
			};
			iline = DBHelper.myExecuteUpdate(sql, params);
			return iline;
		}
		
	}

	@Override
	public int updateById(Accounts entity) throws SQLException {
		int iline = -1;
		String sql ="update accounts set accname = '"+entity.getAccName()+"',fname='"+entity.getfName()+"',aemail='"+entity.getaEmail()+"',accpwd='"+entity.getAccPwd()+"',accstate='"+entity.getAccState()+"',companygrand='"+entity.getCompanyGrand()+"',companyid='"+entity.getCompanyId()+"' where accountid="+entity.getAccountId();
		System.out.println(sql);
		iline = DBHelper.myExecuteUpdate(sql, null);
		return iline;
	}

	@Override
	public int deleteById(String ids) throws SQLException {
		int iline = 0;
		String sql = "delete from accounts where accountid in ( '"+ids+"' )";
		iline = DBHelper.myExecuteUpdate(sql, null);
		return iline;
	}
	public String sqlIf(Accounts entity) {
		String sql = "";
		if (entity.getAccountId() != -1) {
			sql += "and accountid like '%" + entity.getAccountId() + "%' ";
		}
		if (entity.getAccName() != null && entity.getAccName() != "") {
			sql += "and accname like '%" + entity.getAccName() + "%' ";
		}
		if (entity.getfName() != null && entity.getfName() != "") {
			sql += "and fname like '%" + entity.getfName() + "%' ";
		}
		if (entity.getaEmail() != null && entity.getaEmail() != "") {
			sql += "and aemail like '%" + entity.getaEmail() + "%' ";
		}
		if (entity.getAccPwd() != null && entity.getAccPwd() != "") {
			sql += "and accpwd like '%" + entity.getAccPwd() + "%' ";
		}
		if (entity.getAccState() != null && entity.getAccState() != "") {
			sql += "and accstate = '" + entity.getAccState() + "' ";
		}
		if (entity.getCompanyGrand() != null && entity.getCompanyGrand() != "") {
			sql += "and companygrand like '%" + entity.getCompanyGrand() + "%' ";
		}
		if (entity.getCompanyId() != -1) {
			sql += "and companyid like '%" + entity.getCompanyId() + "%' ";
		}
		return sql;
	}
	@Override
	public int getRowsCount(Accounts entity) throws SQLException {
		int icount = -1;
		String sql = "select count(1) from accounts where 1=1 ";
		sql += sqlIf(entity);
		Object obj = DBHelper.getObject(sql, null);
		if (obj != null && !obj.toString().equals("")) {
			icount = Integer.parseInt(obj.toString());
		}
		return icount;
	}

	@Override
	public List<Object> getPage(int currentPageNo, int pageSize, String sort,
			String order, Accounts entity) throws SQLException {
		String sql = "select top " + pageSize + " * from accounts where "
				+ " accountid not in (select top " + (currentPageNo - 1)
				* pageSize + " accountid from accounts where 1=1 ";
		sql += sqlIf(entity);
		sql += " order by " + sort + " " + order + ") ";
		sql += sqlIf(entity);
		sql += " order by " + sort + " " + order;
		List<Object> list = new ArrayList<Object>();
		Accounts acc = null;
		Result rs = DBHelper.getResult(sql, null);
		if (rs != null) {
			Map maps[] = (Map[]) rs.getRows();
			for (Map m : maps) {
				acc = new Accounts();
				acc.setAccountId(Integer.valueOf(m.get("accountid").toString()));
				acc.setAccName(m.get("accname").toString());
				acc.setfName(m.get("fname").toString());
				acc.setaEmail(m.get("aemail").toString());
				acc.setAccPwd(m.get("accpwd").toString());
				acc.setAccState(m.get("accstate").toString());
				acc.setCompanyGrand(m.get("companygrand").toString());
				acc.setCompanyId(Integer.valueOf(m.get("companyid").toString()));
				list.add(acc);
			}
		}
		return list;
	}

}
