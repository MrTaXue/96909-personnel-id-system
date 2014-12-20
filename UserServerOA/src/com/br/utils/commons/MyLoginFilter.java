package com.br.utils.commons;

import java.io.IOException;

import javax.jws.soap.InitParam;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 登陆过滤+utf-8过滤
 * @author kyle
 *
 */
@WebFilter(urlPatterns="/*")
public class MyLoginFilter implements Filter {

	@Override
	public void destroy() {
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp,
			FilterChain chain) throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest)req;
		HttpServletResponse response = (HttpServletResponse)resp;
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		HttpSession session = request.getSession();
		String uri=request.getRequestURI();//得到用户请求的URI
		if(uri.equals("/UserServerOA/UserServerOAPages/login.jsp")
				|| uri.equals("/UserServerOA/UserServerOAPages/jquery-1.9.1.js") 
				|| uri.equals("/UserServerOA/UserServerOAPages/JQueryEasyUI/themes/icon.css") 
				|| uri.equals("/UserServerOA/UserServerOAPages/JQueryEasyUI/jquery.easyui.min.js") 
				|| uri.equals("/UserServerOA/UserServerOAPages/JQueryEasyUI/themes/gray/easyui.css") 
				|| uri.equals("/UserServerOA/UserServerOAPages/css/myindex.css")
				|| uri.equals("/UserServerOA/UserServerOAPages/JQueryEasyUI/locale/easyui-lang-zh_CN.js")
				|| uri.equals("/UserServerOA/UserServerOAPages/js/login.js")
				|| uri.equals("/UserServerOA/UserServerOAPages/img/l_bg.jpg")
				|| uri.equals("/UserServerOA/UserServerOAPages/img/ov2.jpg")
				|| uri.equals("/UserServerOA/UserServerOAPages/JQueryEasyUI/themes/gray/images/blank.gif")
				|| uri.equals("/UserServerOA/UserServerOAPages/JQueryEasyUI/themes/icons/ok.png")
				|| uri.equals("/UserServerOA/UserServerOAPages/JQueryEasyUI/themes/icons/clear.png")
				|| uri.equals("/UserServerOA/login")
				){
			//请求页面是登录页面(判断过程中，外链得图片、css、js也要进行判断，否则将无法显示)
			chain.doFilter(request, response);
			return;
		}else{
			//请求页面是其他页面
			if(session.getAttribute("mylogin")==null){
				response.sendRedirect("/UserServerOA/UserServerOAPages/login.jsp");
				return;
			}else{
				chain.doFilter(request, response);
				return;
			}
		}
		
	}

	@Override
	public void init(FilterConfig config) throws ServletException {
	}

}
