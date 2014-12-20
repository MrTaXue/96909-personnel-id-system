package com.br.biz.impl.yuan;

import java.sql.SQLException;
import java.util.List;

import com.br.biz.yuan.IAccountsBiz;
import com.br.dao.impl.yuan.AccountsDaoImpl;
import com.br.dao.yuan.IAccountsDao;
import com.br.utils.entity.Accounts;

public class AccountsBizImpl implements IAccountsBiz {
	IAccountsDao iad= new AccountsDaoImpl();
	@Override
	public Accounts login(Accounts entity) throws SQLException {
		return iad.login(entity);
	}
	@Override
	public int add(Accounts entity) throws SQLException {
		return iad.add(entity);
	}
	@Override
	public int updateById(Accounts entity) throws SQLException {
		return iad.updateById(entity);
	}
	@Override
	public int deleteById(String ids) throws SQLException {
		return iad.deleteById(ids);
	}
	@Override
	public int getRowsCount(Accounts entity) throws SQLException {
		return iad.getRowsCount(entity);
	}
	@Override
	public List<Object> getPage(int currentPageNo, int pageSize, String sort,
			String order, Accounts entity) throws SQLException {
		return iad.getPage(currentPageNo, pageSize, sort, order, entity);
	}

}
