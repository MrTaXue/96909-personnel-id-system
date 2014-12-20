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

import net.sf.json.JSONObject;

import com.br.biz.impl.yuan.AccountsBizImpl;
import com.br.biz.yuan.IAccountsBiz;
import com.br.utils.entity.Accounts;

@WebServlet(urlPatterns="/acc")
public class AccountsServlet extends HttpServlet {
	IAccountsBiz biz = new AccountsBizImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		this.doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String actionname = request.getParameter("action");
		if(actionname.equals("acclist")){
			accDataGrid(request, response);
		}else if (actionname.equals("accadd")) {
			//添加
			accAdd(request, response);
		}else if(actionname.equals("accupdate")){
			accUpdate(request, response);
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
	
	public void accDataGrid(HttpServletRequest request,
			HttpServletResponse response) {
		int currentPageNo = Integer.valueOf(request.getParameter("page"));
		int pageSize = Integer.valueOf(request.getParameter("rows"));
		String sort = request.getParameter("sort");
		String order = request.getParameter("order");
		int rowscount = 0;
		int accountId = -1;
		if (request.getParameter("accountId") != null
				&& request.getParameter("accountId") != "") {
			accountId = Integer.valueOf(request.getParameter("accountId"));
		}
		String accName = request.getParameter("accName");
		String fName = request.getParameter("fName");
		String aEmail = request.getParameter("aEmail");
		String accPwd = request.getParameter("accPwd");
		String accState = request.getParameter("accState");
		String companyGrand = request.getParameter("companyGrand");
		int companyId = -1;
		if (request.getParameter("companyId") != null
				&& request.getParameter("companyId") != "") {
			companyId = Integer.valueOf(request.getParameter("companyId"));
		}
		Accounts entity =new Accounts(accountId,accName,fName,aEmail,accPwd,accState,companyGrand,companyId);
		List<Object> list = new ArrayList<Object>();
		Map m = new HashMap();
		try {
			list = biz.getPage(currentPageNo, pageSize, sort, order, entity);
			rowscount = biz.getRowsCount(entity);
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
	public void accAdd(HttpServletRequest request,
			HttpServletResponse response) {
		int accountId = -1;
		if (request.getParameter("accountId") != null
				&& request.getParameter("accountId") != "") {
			accountId = Integer.valueOf(request.getParameter("accountId"));
		}
		String accName = request.getParameter("accName");
		String fName = request.getParameter("fName");
		String aEmail = request.getParameter("aEmail");
		String accPwd = request.getParameter("accPwd");
		String accState = request.getParameter("accState");
		String companyGrand = request.getParameter("companyGrand");
		int companyId = -1;
		if (request.getParameter("companyId") != null
				&& request.getParameter("companyId") != "") {
			companyId = Integer.valueOf(request.getParameter("companyId"));
		}
		Accounts entity =new Accounts(accountId,accName,fName,aEmail,accPwd,accState,companyGrand,companyId);
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
		}else{
			msg = "添加成功！" ;
		}
		out.print(msg);
		out.close();
	}
	public void accUpdate(HttpServletRequest request,
			HttpServletResponse response) {
		int accountId = -1;
		if (request.getParameter("accountId") != null
				&& request.getParameter("accountId") != "") {
			accountId = Integer.valueOf(request.getParameter("accountId"));
		}
		String accName = request.getParameter("accName");
		String fName = request.getParameter("fName");
		String aEmail = request.getParameter("aEmail");
		String accPwd = request.getParameter("accPwd");
		String accState = request.getParameter("accState");
		String companyGrand = request.getParameter("companyGrand");
		int companyId = -1;
		if (request.getParameter("companyId") != null
				&& request.getParameter("companyId") != "") {
			companyId = Integer.valueOf(request.getParameter("companyId"));
		}
		Accounts entity =new Accounts(accountId,accName,fName,aEmail,accPwd,accState,companyGrand,companyId);
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
