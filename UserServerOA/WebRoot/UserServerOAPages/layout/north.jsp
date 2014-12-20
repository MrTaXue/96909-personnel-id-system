<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<table width="100%" border="0" cellpadding="0" cellspacing="0"
	background="./UserServerOAPages/img/title_bg.jpg">
	<tr>
		<td width="390"><img src="./UserServerOAPages/img/logo.jpg"
			width="542" height="60">
		</td>
		<td align="right" valign="bottom">
			<table width="100%" border="0" cellspacing="0" cellpadding="0">
				<tr>
					<td height="24" align="right">&nbsp;</td>
				</tr>
			</table>
			<table width="100%" border="0" cellspacing="0" cellpadding="0">
				<tr>
					<td align="right"></td>
				</tr>
			</table>
		</td>
	</tr>
</table>
<table width="100%" height="29" border="0" cellpadding="0"
	cellspacing="0" background="./UserServerOAPages/img/menu_bg.jpg">
	<tr>
		<td>
			欢迎您，${mylogin.fName }！
			<a id="btngrxx" href="#" class="easyui-linkbutton"
			data-options="iconCls:'icon-man',plain:true">个人信息</a>
			
			 <a id="btnexit"
			href="/UserServerOA/myexit" class="easyui-linkbutton"
			data-options="iconCls:'icon-undo',plain:true">登出</a>
		</td>
	</tr>
</table>
