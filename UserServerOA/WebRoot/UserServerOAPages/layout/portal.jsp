<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<div id="container" fit="true">
	<p>
		<a>96909社区服务中心</a>
	</p>
	<p>
		<a>欢迎您，${mylogin.accName }！</a>
	</p>
	<p>
		<a>请放心使用！</a>
	</p>
	<p>
		<a>部分功能待完善...</a>
	</p>
	<p>
		<a>开发环境：MyEclipse10</a>
	</p>
	<p>
		<a>开发人员：苑博</a>
	</p>
</div>


