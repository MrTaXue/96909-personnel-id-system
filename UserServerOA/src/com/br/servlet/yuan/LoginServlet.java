package com.br.servlet.yuan;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import com.br.biz.impl.yuan.AccountsBizImpl;
import com.br.biz.yuan.IAccountsBiz;
import com.br.utils.commons.Json;
import com.br.utils.entity.Accounts;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	IAccountsBiz iab=new AccountsBizImpl();
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String actionname=request.getParameter("atn");
		if("myLogin".equals(actionname)){
			//用户名验证
			Json j=null;
			j=myLogin(request, response);
			HttpSession session=request.getSession();
			session.setAttribute("mylogin", j.getObj());
			PrintWriter out=response.getWriter();
			out.print(j.getMsg());
			out.close();
		}
	}
	
	/**
	 * 验证用户名是否存在，并返回结果j（JSON对象）
	 * @param request
	 * @param response
	 * @return
	 * @throws ServletException
	 * @throws IOException
	 */
	public Json myLogin(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Json j=new Json();
		String uname=request.getParameter("uname");
		String upwd=request.getParameter("upwd");
			Accounts entity = new Accounts();
			entity.setAccName(uname);
			entity.setAccPwd(upwd);
			Accounts accts =null;
			try {
				accts=iab.login(entity);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			if(accts!=null){
				j.setMsg("success");
				j.setObj(accts);
			}else{
				j.setMsg("用户名或密码错误，请重新输入！");
				j.setObj(null);
			}
			return j;
	}
}
