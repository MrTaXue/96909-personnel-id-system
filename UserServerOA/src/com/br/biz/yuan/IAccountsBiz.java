package com.br.biz.yuan;

import java.sql.SQLException;
import java.util.List;

import com.br.utils.entity.Accounts;

public interface IAccountsBiz {
	/**
	 * 登陆方法
	 * @param entity
	 * @return
	 */
	public Accounts login(Accounts entity)throws SQLException;
	public int add(Accounts entity)throws SQLException;
	public int updateById(Accounts entity)throws SQLException;
	public int deleteById(String ids)throws SQLException;
	public int getRowsCount(Accounts entity) throws SQLException;
	public List<Object> getPage(int currentPageNo,int pageSize,String sort,String order,Accounts entity) throws SQLException;
}
