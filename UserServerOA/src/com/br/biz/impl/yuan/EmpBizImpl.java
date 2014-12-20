package com.br.biz.impl.yuan;

import java.sql.SQLException;
import java.util.List;

import com.br.biz.yuan.IEmpBiz;
import com.br.dao.impl.yuan.EmpDaoImpl;
import com.br.dao.yuan.IEmpDao;
import com.br.utils.entity.Employer;

public class EmpBizImpl implements IEmpBiz {
	
	IEmpDao dao=new EmpDaoImpl();
	@Override
	public int add(Employer entity) throws SQLException {
		return dao.add(entity);
	}

	@Override
	public int updateById(Employer entity) throws SQLException {
		return dao.updateById(entity);
	}

	@Override
	public int deleteById(String ids) throws SQLException {
		return dao.deleteById(ids);
	}

	@Override
	public Employer getEntityById(int id) throws SQLException {
		return dao.getEntityById(id);
	}

	@Override
	public int getRowsCount(Employer entity,int age2,String bargainDate2,String handlersDate2,String birthday2) throws SQLException {
		return dao.getRowsCount(entity,age2,bargainDate2,handlersDate2,birthday2);
	}

	@Override
	public List<Object> getPage(int currentPageNo, int pageSize,String sort,String order,Employer entity,int age2,String bargainDate2,String handlersDate2,String birthday2)
			throws SQLException {
		return dao.getPage(currentPageNo, pageSize,sort,order,entity,age2,bargainDate2,handlersDate2,birthday2);
	}

}
