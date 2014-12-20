<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE html>
<html>

	<head>
		<meta charset="utf-8" />
		<title>广州市信访局来电登记处理系统</title>
		<script src="jquery-1.9.1.js" type="text/javascript" charset="utf-8"></script>
		<script src="JQueryEasyUI/jquery.easyui.min.js" type="text/javascript"></script>
		<link rel="stylesheet" type="text/css"
			href="JQueryEasyUI/themes/gray/easyui.css" />
		<link rel="stylesheet" type="text/css"
			href="JQueryEasyUI/themes/icon.css" />
		<script src="JQueryEasyUI/locale/easyui-lang-zh_CN.js"
			type="text/javascript" charset="utf-8"></script>
		<link rel="stylesheet" type="text/css" href="css/myindex.css" />
		<script src="js/login.js" type="text/javascript" charset="utf-8"></script>
	</head>
	
	<body>
		<div id="login">
			<div id="parent">
				<div id="ipt">
					<form id="loginform" method="post">
						<table>
							<tr>
								<th>用户名：</th>
								<td><input type="text" name="uname" id="uname"
									class="easyui-validatebox"
									data-options="required:true,missingMessage:'请输入用户名'" value="" />
								</td>
							</tr>
							<tr>
								<th></th>
								<td></td>
							</tr>
							<tr>
								<th>密&nbsp;&nbsp;码：</th>
								<td><input type="password" name="upwd" id="upwd"
									class="easyui-validatebox"
									data-options="required:true,missingMessage:'请输入登陆密码！'" value="" />
								</td>
							</tr>
							<tr>
								<th colspan="2" id="msg"></th>
							</tr>
						</table>
					</form>
				</div>
			</div>
		</div>
	</body>

</html>