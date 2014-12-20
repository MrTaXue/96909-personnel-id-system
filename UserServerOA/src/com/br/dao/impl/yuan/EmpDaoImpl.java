package com.br.dao.impl.yuan;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.jsp.jstl.sql.Result;

import com.br.dao.yuan.IEmpDao;
import com.br.utils.commons.DBHelper;
import com.br.utils.entity.Company;
import com.br.utils.entity.Employer;
import com.br.utils.entity.Worker;

public class EmpDaoImpl implements IEmpDao {

	@Override
	public int add(Employer entity) throws SQLException {
		int iline = 0;
		String sqlcomid = "select * from company where comid = "
				+ entity.getComId();
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
			String sqlworkerid = "select * from worker where workerid = "
					+ entity.getHandlers();
			Result rs1 = DBHelper.getResult(sqlworkerid, null);
			Worker worker = null;
			if (rs1 != null) {
				Map maps1[] = (Map[]) rs1.getRows();
				for (Map m1 : maps1) {
					worker = new Worker();
					worker.setWorkerId(Integer.valueOf(m1.get("workerid")
							.toString()));
				}
			}
			if (worker == null) {
				iline = -2;// 员工编号不存在
				return iline;
			} else {
				String sql = "insert into employer values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
				Object[] params = { entity.getComId(), entity.getfName(),
						entity.getwSex(), entity.getAge(), entity.getEnation(),
						entity.getEmpNative(), entity.getSchoolAge(),
						entity.getCardNum(), entity.getWorkerUnit(),
						entity.getProfession(), entity.getBargainNum(),
						entity.getBargainDate(), entity.getPhone(),
						entity.getMobilePhone(), entity.getEmpAddress(),
						entity.getEmpRegistered(), entity.getServeAddress(),
						entity.getFamilyAddress(), entity.getFamilyNum(),
						entity.getEmpRequestBaseid(), entity.getFamilyContent(),
						entity.getFamilyArea(), entity.getFamilyEat(),
						entity.getFamilyDesc(), entity.getHandlers(),
						entity.getHandlersDate(), entity.getMaxSalary(),
						entity.getMinSalary(), entity.getBirthday() };
				iline = DBHelper.myExecuteUpdate(sql, params);
				return iline;
			}
		}
	}

	@Override
	public int updateById(Employer entity) throws SQLException {
		int iline = -1;
		String sql = "update employer set comid="+entity.getComId()+",fname='"+entity.getfName()+"',wsex='"+entity.getwSex()+"',age="+entity.getAge()+",enation='"+entity.getEnation()+"',empnative='"+entity.getEmpNative()+"',schoolage='"+entity.getSchoolAge()+"',cardnum='"+entity.getCardNum()+"',";
		sql += "workerunit='"+entity.getWorkerUnit()+"',profession='"+entity.getProfession()+"',bargainnum='"+entity.getBargainNum()+"',bargaindate='"+entity.getBargainDate()+"',phone='"+entity.getPhone()+"',mobilephone='"+entity.getMobilePhone()+"',empaddress='"+entity.getEmpAddress()+"',empregistered='"+entity.getEmpRegistered()+"',";
		sql += "serveaddress='"+entity.getServeAddress()+"',family_address='"+entity.getFamilyAddress()+"',family_num='"+entity.getFamilyNum()+"',emprequest_baseid='"+entity.getEmpRequestBaseid()+"',family_content='"+entity.getFamilyContent()+"',family_area='"+entity.getFamilyArea()+"',";
		sql += "family_eat='"+entity.getFamilyEat()+"',family_desc='"+entity.getFamilyDesc()+"',handlers="+entity.getHandlers()+",handlersdate='"+entity.getHandlersDate()+"',maxsalary="+entity.getMaxSalary()+",minsalary="+entity.getMinSalary()+",birthday='"+entity.getBirthday()+"' ";
		sql += "where employerid="+entity.getEmployerId()+"";
		iline = DBHelper.myExecuteUpdate(sql, null);
		return iline;
	}

	@Override
	public int deleteById(String ids) throws SQLException {
		int iline = 0;
		String sql = "delete from employer where employerid in ( "+ids+" )";
		iline = DBHelper.myExecuteUpdate(sql, null);
		return iline;
	}

	@Override
	public Employer getEntityById(int id) throws SQLException {
		return null;
	}

	@Override
	public int getRowsCount(Employer entity, int age2, String bargainDate2,
			String handlersDate2, String birthday2) throws SQLException {
		int icount = -1;
		String sql = "select count(1) from employer where 1=1 ";
		sql += sqlIf(entity, age2, bargainDate2, handlersDate2, birthday2);
		Object obj = DBHelper.getObject(sql, null);
		if (obj != null && !obj.toString().equals("")) {
			icount = Integer.parseInt(obj.toString());
		}
		return icount;
	}

	public String sqlIf(Employer entity, int age2, String bargainDate2,
			String handlersDate2, String birthday2) {
		String sql = "";
		if (entity.getEmployerId() != -1) {
			sql += "and employerid like '%" + entity.getEmployerId() + "%' ";
		}
		if (entity.getComId() != -1) {
			sql += "and comid like '%" + entity.getComId() + "%' ";
		}
		if (entity.getfName() != null && entity.getfName() != "") {
			sql += "and fname like '%" + entity.getfName() + "%' ";
		}
		if (entity.getwSex() != null && entity.getwSex() != "") {
			sql += "and wsex like '%" + entity.getwSex() + "%' ";
		}

		// 年龄
		if (entity.getAge() != -1 && age2 != -1) {
			sql += "and age between " + entity.getAge() + " and " + age2 + " ";
		}
		if (entity.getAge() != -1 && age2 == -1) {
			sql += "and age like '%" + entity.getAge() + "%' ";
		}
		if (entity.getAge() == -1 && age2 != -1) {
			sql += "and age like '%" + age2 + "%' ";
		}

		if (entity.getEnation() != null && entity.getEnation() != "") {
			sql += "and enation like '%" + entity.getEnation() + "%' ";
		}
		if (entity.getEmpNative() != null && entity.getEmpNative() != "") {
			sql += "and empnative like '%" + entity.getEmpNative() + "%' ";
		}
		if (entity.getSchoolAge() != null && entity.getSchoolAge() != "") {
			sql += "and schoolage like '%" + entity.getSchoolAge() + "%' ";
		}
		if (entity.getCardNum() != null && entity.getCardNum() != "") {
			sql += "and cardnum like '%" + entity.getCardNum() + "%' ";
		}
		if (entity.getWorkerUnit() != null && entity.getWorkerUnit() != "") {
			sql += "and workerunit like '%" + entity.getWorkerUnit() + "%' ";
		}
		if (entity.getProfession() != null && entity.getProfession() != "") {
			sql += "and profession like '%" + entity.getProfession() + "%' ";
		}
		if (entity.getBargainNum() != null && entity.getBargainNum() != "") {
			sql += "and bargainnum like '%" + entity.getBargainNum() + "%' ";
		}

		// 合同期限
		if (entity.getBargainDate() != null && entity.getBargainDate() != ""
				&& bargainDate2 != null && bargainDate2 != "") {
			sql += "and bargaindate between '" + entity.getBargainDate()
					+ "' and '" + bargainDate2 + "' ";
		}

		if (entity.getPhone() != null && entity.getPhone() != "") {
			sql += "and phone like '%" + entity.getPhone() + "%' ";
		}
		if (entity.getMobilePhone() != null && entity.getMobilePhone() != "") {
			sql += "and mobilephone like '%" + entity.getMobilePhone() + "%' ";
		}
		if (entity.getEmpAddress() != null && entity.getEmpAddress() != "") {
			sql += "and empaddress like '%" + entity.getEmpAddress() + "%' ";
		}
		if (entity.getEmpRegistered() != null
				&& entity.getEmpRegistered() != "") {
			sql += "and empregistered like '%" + entity.getEmpRegistered()
					+ "%' ";
		}
		if (entity.getServeAddress() != null && entity.getServeAddress() != "") {
			sql += "and serveaddress like '%" + entity.getServeAddress()
					+ "%' ";
		}
		if (entity.getFamilyAddress() != null
				&& entity.getFamilyAddress() != "") {
			sql += "and family_address like '%" + entity.getFamilyAddress()
					+ "%' ";
		}
		if (entity.getFamilyNum() != null && entity.getFamilyNum() != "") {
			sql += "and family_num like '%" + entity.getFamilyNum() + "%' ";
		}
		if (entity.getEmpRequestBaseid() != null
				&& entity.getEmpRequestBaseid() != "") {
			sql += "and emprequest_baseid like '%"
					+ entity.getEmpRequestBaseid() + "%' ";
		}
		if (entity.getFamilyContent() != null
				&& entity.getFamilyContent() != "") {
			sql += "and family_content like '%" + entity.getFamilyContent()
					+ "%' ";
		}
		if (entity.getFamilyArea() != null && entity.getFamilyArea() != "") {
			sql += "and family_area like '%" + entity.getFamilyArea() + "%' ";
		}
		if (entity.getFamilyEat() != null && entity.getFamilyEat() != "") {
			sql += "and family_eat like '%" + entity.getFamilyEat() + "%' ";
		}
		if (entity.getHandlers() != -1) {
			sql += "and handlers like '%" + entity.getHandlers() + "%' ";
		}

		// 登记时间
		if (entity.getHandlersDate() != null && entity.getHandlersDate() != ""
				&& handlersDate2 != null && handlersDate2 != "") {
			sql += "and handlersdate between '" + entity.getHandlersDate()
					+ "' and '" + handlersDate2 + "' ";
		}

		if (entity.getMaxSalary() != -1) {
			sql += "and maxsalary like '%" + entity.getMaxSalary() + "%' ";
		}
		if (entity.getMinSalary() != -1) {
			sql += "and minsalary like '%" + entity.getMinSalary() + "%' ";
		}

		// 生日
		if (entity.getBirthday() != null && entity.getBirthday() != ""
				&& birthday2 != null && birthday2 != "") {
			sql += "and birthday between '" + entity.getBirthday() + "' and '"
					+ birthday2 + "' ";
		}
		return sql;
	}

	@Override
	public List<Object> getPage(int currentPageNo, int pageSize, String sort,
			String order, Employer entity, int age2, String bargainDate2,
			String handlersDate2, String birthday2) throws SQLException {
		String sql = "select top " + pageSize + " * from employer where "
				+ " employerid not in (select top " + (currentPageNo - 1)
				* pageSize + " employerid from employer where 1=1 ";
		sql += sqlIf(entity, age2, bargainDate2, handlersDate2, birthday2);

		sql += " order by " + sort + " " + order + ") ";

		sql += sqlIf(entity, age2, bargainDate2, handlersDate2, birthday2);

		sql += " order by " + sort + " " + order;
		List<Object> list = new ArrayList<Object>();
		Result rs = DBHelper.getResult(sql, null);
		Employer emp = null;
		if (rs != null) {
			Map maps[] = (Map[]) rs.getRows();
			for (Map m : maps) {
				emp = new Employer();
				emp.setEmployerId(Integer.valueOf(m.get("employerid")
						.toString()));
				emp.setComId(Integer.valueOf(m.get("comid").toString()));
				emp.setfName(m.get("fname").toString());
				emp.setwSex(m.get("wsex").toString());
				emp.setAge(Integer.valueOf(m.get("age").toString()));
				emp.setEnation(m.get("enation").toString());
				emp.setEmpNative(m.get("empnative").toString());
				emp.setSchoolAge(m.get("schoolage").toString());
				emp.setCardNum(m.get("cardnum").toString());
				emp.setWorkerUnit(m.get("workerunit").toString());
				emp.setProfession(m.get("profession").toString());
				emp.setBargainNum(m.get("bargainnum").toString());
				emp.setBargainDate(m.get("bargaindate").toString());
				emp.setPhone(m.get("phone").toString());
				emp.setMobilePhone(m.get("mobilephone").toString());
				emp.setEmpAddress(m.get("empaddress").toString());
				emp.setEmpRegistered(m.get("empregistered").toString());
				emp.setServeAddress(m.get("serveaddress").toString());
				emp.setFamilyAddress(m.get("family_address").toString());
				emp.setFamilyNum(m.get("family_num").toString());
				emp.setEmpRequestBaseid(m.get("emprequest_baseid").toString());
				emp.setFamilyContent(m.get("family_content").toString());
				emp.setFamilyArea(m.get("family_area").toString());
				emp.setFamilyEat(m.get("family_eat").toString());
				emp.setFamilyDesc(m.get("family_desc") != null ? m.get(
						"family_desc").toString() : "");
				emp.setHandlers(Integer.valueOf(m.get("handlers").toString()));
				emp.setHandlersDate(m.get("handlersdate").toString());
				emp.setMaxSalary(Double.valueOf(m.get("maxsalary").toString()));
				emp.setMinSalary(Double.valueOf(m.get("minsalary").toString()));
				emp.setBirthday(m.get("birthday").toString());
				list.add(emp);
			}
		}
		return list;
	}

}
