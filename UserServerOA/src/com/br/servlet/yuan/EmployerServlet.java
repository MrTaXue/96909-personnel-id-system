package com.br.servlet.yuan;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import com.br.biz.impl.yuan.EmpBizImpl;
import com.br.biz.yuan.IEmpBiz;
import com.br.utils.entity.Employer;

@WebServlet(urlPatterns = "/emp")
public class EmployerServlet extends HttpServlet {

	IEmpBiz biz = new EmpBizImpl();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		this.doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String actionname = request.getParameter("action");
		if (actionname.equals("emplist")) {
			//显示列表
			empDataGrid(request, response);
		}else if (actionname.equals("empadd")) {
			//添加
			empAdd(request, response);
		}else if(actionname.equals("empupdate")){
			empUpdate(request, response);
		}else{
			//调用删除方法
			String ids = actionname;
			int iline = -1 ;
			try {
				iline = biz.deleteById(ids);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			String msg = "删除操作失败，请重试！" ;
			if(iline == -1){
				msg ="删除操作失败，请重试！";
			}
			if(iline > 0){
				msg = "删除成功，已删除"+iline+"行数据！";
			}
			if(iline == 0){
				msg ="删除操作失败，请重试！";
			}
			PrintWriter out = response.getWriter();
			out.print(msg);
			out.close();
		}
		
	}

	public void empDataGrid(HttpServletRequest request,
			HttpServletResponse response) {
		int currentPageNo = Integer.valueOf(request.getParameter("page"));
		int pageSize = Integer.valueOf(request.getParameter("rows"));
		String sort = request.getParameter("sort");
		String order = request.getParameter("order");
		int rowscount = 0;
		int employerId = -1;
		if (request.getParameter("employerId") != null
				&& request.getParameter("employerId") != "") {
			employerId = Integer.valueOf(request.getParameter("employerId"));// 雇主编号
		}
		int comId = -1;
		if (request.getParameter("comId") != null
				&& request.getParameter("comId") != "") {
			comId = Integer.valueOf(request.getParameter("comId"));// 公司编号
		}
		String fName = request.getParameter("fName");// 姓名
		String wSex = request.getParameter("wSex");// 性别
		int age1 = -1;
		if (request.getParameter("age1") != null
				&& request.getParameter("age1") != "") {
			Integer.valueOf(request.getParameter("age1"));// 年龄1
		}
		int age2 = -1;
		if (request.getParameter("age2") != null
				&& request.getParameter("age2") != "") {
			age2 = Integer.valueOf(request.getParameter("age2"));// 年龄2
		}
		String enation = request.getParameter("enation");// 民族
		String empNative = request.getParameter("empNative");// 籍贯
		String schoolAge = request.getParameter("schoolAge");// 学历
		String cardNum = request.getParameter("cardNum");// 身份证号
		String workerUnit = request.getParameter("workerUnit");// 工作单位
		String profession = request.getParameter("profession");// 职业
		String bargainNum = request.getParameter("bargainNum");// 合同号
		String bargainDate1 = request.getParameter("bargainDate1");// 合同期限
		String bargainDate2 = request.getParameter("bargainDate2");// 合同期限
		String phone = request.getParameter("phone");// 电话号
		String mobilePhone = request.getParameter("mobilePhone");// 手机号
		String empAddress = request.getParameter("empAddress");// 住宅
		String empRegistered = request.getParameter("empRegistered");// 户口所在地
		String serveAddress = request.getParameter("serveAddress");// 服务处地址
		String familyAddress = request.getParameter("familyAddress");// 家庭资料之居住地址
		String familyNum = request.getParameter("familyNum");// 家庭资料之家庭人数
		String empRequestBaseid = request.getParameter("empRequestBaseid");// 雇佣要求
		String familyContent = request.getParameter("familyContent");// 家庭资料之服务内容
		String familyArea = request.getParameter("familyArea");// 家庭资料之房屋面积
		String familyEat = request.getParameter("familyEat");// 家庭资料之饮食习惯
		String familyDesc = null;// 家庭资料之其他
		int handlers = -1;
		if (request.getParameter("handlers") != null
				&& request.getParameter("handlers") != "") {
			handlers = Integer.valueOf(request.getParameter("handlers"));// 经办人
		}
		String handlersDate1 = request.getParameter("handlersDate1");// 登记时间
		String handlersDate2 = request.getParameter("handlersDate2");// 登记时间
		double maxSalary = -1;
		if (request.getParameter("maxSalary") != null
				&& request.getParameter("maxSalary") != "") {
			maxSalary = Double.valueOf(request.getParameter("maxSalary"));// 接受的最高工资
		}
		double minSalary = -1;
		if (request.getParameter("minSalary") != null
				&& request.getParameter("minSalary") != "") {
			minSalary = Double.valueOf(request.getParameter("minSalary"));// 接受的最低工资
		}
		String birthday1 = request.getParameter("birthday1");// 出生日期
		String birthday2 = request.getParameter("birthday2");// 出生日期
		Employer entity = new Employer(employerId, comId, fName, wSex, age1,
				enation, empNative, schoolAge, cardNum, workerUnit, profession,
				bargainNum, bargainDate1, phone, mobilePhone, empAddress,
				empRegistered, serveAddress, familyAddress, familyNum,
				empRequestBaseid, familyContent, familyArea, familyEat,
				familyDesc, handlers, handlersDate1, maxSalary, minSalary,
				birthday1);
		List<Object> list = new ArrayList<Object>();
		Map m = new HashMap();
		try {
			list = biz.getPage(currentPageNo, pageSize, sort, order, entity,
					age2, bargainDate2, handlersDate2, birthday2);
			rowscount = biz.getRowsCount(entity, age2, bargainDate2,
					handlersDate2, birthday2);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		m.put("total", rowscount);
		m.put("rows", list);
		JSONObject objm = JSONObject.fromObject(m);
		PrintWriter out = null;
		try {
			out = response.getWriter();
		} catch (IOException e) {
			e.printStackTrace();
		}
		out.print(objm);
		out.close();
	}

	public void empAdd(HttpServletRequest request, HttpServletResponse response) {
		int comId = Integer.valueOf(request.getParameter("comId"));// 公司编号
		String fName = request.getParameter("fName");// 姓名
		String wSex = request.getParameter("wSex");// 性别
		int age = Integer.valueOf(request.getParameter("age"));// 年龄
		String enation = request.getParameter("enation");// 民族
		String empNative = request.getParameter("empNative");// 籍贯
		String schoolAge = request.getParameter("schoolAge");// 学历
		String cardNum = request.getParameter("cardNum");// 身份证号
		String workerUnit = request.getParameter("workerUnit");// 工作单位
		String profession = request.getParameter("profession");// 职业
		String bargainNum = request.getParameter("bargainNum");// 合同号
		String bargainDate = request.getParameter("bargainDate");// 合同期限
		String phone = request.getParameter("phone");// 电话号
		String mobilePhone = request.getParameter("mobilePhone");// 手机号
		String empAddress = request.getParameter("empAddress");// 住宅
		String empRegistered = request.getParameter("empRegistered");// 户口所在地
		String serveAddress = request.getParameter("serveAddress");// 服务处地址
		String familyAddress = request.getParameter("familyAddress");// 家庭资料之居住地址
		String familyNum = request.getParameter("familyNum");// 家庭资料之家庭人数
		String empRequestBaseid = request.getParameter("empRequestBaseid");// 雇佣要求
		String familyContent = request.getParameter("familyContent");// 家庭资料之服务内容
		String familyArea = request.getParameter("familyArea");// 家庭资料之房屋面积
		String familyEat = request.getParameter("familyEat");// 家庭资料之饮食习惯
		String familyDesc = null;// 家庭资料之其他
		int handlers = Integer.valueOf(request.getParameter("handlers"));// 经办人
		String handlersDate = request.getParameter("handlersDate");// 登记时间
		double maxSalary = Double.valueOf(request.getParameter("maxSalary"));// 接受的最高工资
		double minSalary = Double.valueOf(request.getParameter("minSalary"));// 接受的最低工资
		String birthday = request.getParameter("birthday");// 出生日期
		Employer entity = new Employer(0, comId, fName, wSex, age, enation,
				empNative, schoolAge, cardNum, workerUnit, profession,
				bargainNum, bargainDate, phone, mobilePhone, empAddress,
				empRegistered, serveAddress, familyAddress, familyNum,
				empRequestBaseid, familyContent, familyArea, familyEat,
				familyDesc, handlers, handlersDate, maxSalary, minSalary,
				birthday);
		int iline = 0;
		try {
			iline = biz.add(entity);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		String msg = null;
		PrintWriter out = null;
		try {
			out = response.getWriter();
		} catch (IOException e) {
			e.printStackTrace();
		}
		if (iline == 0) {
			//sql没有执行
			msg = "添加操作失败，请重试！";
		}else if(iline == -1){
			//公司编号不存在
			msg = "公司编号不存在，请确认并重新添加！";
		}else if(iline == -2){
			//员工编号不存在
			msg = "员工编号不存在，请确认并重新添加！";
		}else{
			msg = "添加成功！" ;
		}
		out.print(msg);
		out.close();
	}
	
	public void empUpdate(HttpServletRequest request, HttpServletResponse response){
		int employerId = Integer.valueOf(request.getParameter("employerId"));
		int comId = Integer.valueOf(request.getParameter("comId"));// 公司编号
		String fName = request.getParameter("fName");// 姓名
		String wSex = request.getParameter("wSex");// 性别
		int age = Integer.valueOf(request.getParameter("age"));// 年龄
		String enation = request.getParameter("enation");// 民族
		String empNative = request.getParameter("empNative");// 籍贯
		String schoolAge = request.getParameter("schoolAge");// 学历
		String cardNum = request.getParameter("cardNum");// 身份证号
		String workerUnit = request.getParameter("workerUnit");// 工作单位
		String profession = request.getParameter("profession");// 职业
		String bargainNum = request.getParameter("bargainNum");// 合同号
		String bargainDate = request.getParameter("bargainDate");// 合同期限
		String phone = request.getParameter("phone");// 电话号
		String mobilePhone = request.getParameter("mobilePhone");// 手机号
		String empAddress = request.getParameter("empAddress");// 住宅
		String empRegistered = request.getParameter("empRegistered");// 户口所在地
		String serveAddress = request.getParameter("serveAddress");// 服务处地址
		String familyAddress = request.getParameter("familyAddress");// 家庭资料之居住地址
		String familyNum = request.getParameter("familyNum");// 家庭资料之家庭人数
		String empRequestBaseid = request.getParameter("empRequestBaseid");// 雇佣要求
		String familyContent = request.getParameter("familyContent");// 家庭资料之服务内容
		String familyArea = request.getParameter("familyArea");// 家庭资料之房屋面积
		String familyEat = request.getParameter("familyEat");// 家庭资料之饮食习惯
		String familyDesc = null;// 家庭资料之其他
		int handlers = Integer.valueOf(request.getParameter("handlers"));// 经办人
		String handlersDate = request.getParameter("handlersDate");// 登记时间
		double maxSalary = Double.valueOf(request.getParameter("maxSalary"));// 接受的最高工资
		double minSalary = Double.valueOf(request.getParameter("minSalary"));// 接受的最低工资
		String birthday = request.getParameter("birthday");// 出生日期
		Employer entity = new Employer(employerId, comId, fName, wSex, age, enation,
				empNative, schoolAge, cardNum, workerUnit, profession,
				bargainNum, bargainDate, phone, mobilePhone, empAddress,
				empRegistered, serveAddress, familyAddress, familyNum,
				empRequestBaseid, familyContent, familyArea, familyEat,
				familyDesc, handlers, handlersDate, maxSalary, minSalary,
				birthday);
		int iline = -1 ;
		String msg = "修改失败，请重试！";
		try {
			iline = biz.updateById(entity);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if(iline == -1){
			msg = "修改失败，请重试！";
		}
		if(iline == 1){
			msg = "修改成功！";
		}
		PrintWriter out = null;
		try {
			out =response.getWriter();
		} catch (IOException e) {
			e.printStackTrace();
		}
		out.print(msg);
		out.close();
	}
	
}
