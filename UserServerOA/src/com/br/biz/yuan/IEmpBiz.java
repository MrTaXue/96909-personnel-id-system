package com.br.biz.yuan;

import java.sql.SQLException;
import java.util.List;

import com.br.utils.entity.Employer;

public interface IEmpBiz {
	/**
	 * 添加方法
	 * 
	 * @param entity
	 * @return
	 * @throws SQLException
	 */
	public int add(Employer entity) throws SQLException;

	/**
	 * 根据id修改
	 * 
	 * @param entity
	 * @return
	 * @throws SQLException
	 */
	public int updateById(Employer entity) throws SQLException;

	/**
	 * 刪除方法
	 * 
	 * @param id
	 * @return
	 * @throws SQLException
	 */
	public int deleteById(String ids) throws SQLException;

	/**
	 * 得到一個雇主的实体对象
	 * 
	 * @param id
	 * @return
	 * @throws SQLException
	 */
	public Employer getEntityById(int id) throws SQLException;

	/**
	 * 得到总行数
	 * 
	 * @return
	 * @throws SQLException
	 */
	public int getRowsCount(Employer entity,int age2,String bargainDate2,String handlersDate2,String birthday2) throws SQLException;

	/**
	 * 得到某一页面的全部结果
	 * 
	 * @param currentPageNo
	 * @param pageSize
	 * @return
	 * @throws SQLException
	 */
	public List<Object> getPage(int currentPageNo,int pageSize,String sort,String order,Employer entity,int age2,String bargainDate2,String handlersDate2,String birthday2) throws SQLException;
	}
