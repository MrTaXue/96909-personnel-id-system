package com.br.utils.commons;

import java.io.IOException;
import java.lang.reflect.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyBaseServlet extends HttpServlet {
	public boolean isforward=true;
	public String urlPath="";
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("utf-8");
		String action=request.getParameter("action");
		try {
			Method mymethod=this.getClass().getDeclaredMethod(action, HttpServletRequest.class,HttpServletResponse.class);
			mymethod.invoke(this, request,response);
			
			if(isforward){
				request.getRequestDispatcher(urlPath).forward(request, response);
			}else{
				response.sendRedirect(urlPath);
			}
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
	}
	
}
