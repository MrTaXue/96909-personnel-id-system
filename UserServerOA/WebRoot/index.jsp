<%@page import="com.br.utils.entity.Accounts"%>
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
<meta charset="utf-8">
<title></title>
<script src="UserServerOAPages/jquery-1.9.1.js" type="text/javascript" charset="utf-8"></script>
<script src="UserServerOAPages/JQueryEasyUI/jquery.easyui.min.js" type="text/javascript"></script>
<link rel="stylesheet" type="text/css" href="UserServerOAPages/JQueryEasyUI/themes/default/easyui.css" />
<link rel="stylesheet" type="text/css" href="UserServerOAPages/JQueryEasyUI/themes/icon.css" />
<script src="UserServerOAPages/JQueryEasyUI/locale/easyui-lang-zh_CN.js" type="text/javascript" charset="utf-8"></script>
<link rel="stylesheet" href="UserServerOAPages/css/protal.css" type="text/css"></link>
<script type="text/javascript" src="UserServerOAPages/js/index.js"></script>
<link rel="stylesheet" href="UserServerOAPages/css/emp.css" type="text/css"></link>
<!--  	
		body里是用easyui的另外一种定义方式class定义的layout，
		具体的属性可以翻看api，
		href嵌套的是其他页面
		href调用只能调用该页面的body部分，也就是说，写在body外的部分是不会起任何作用的，所以在写的时候，全部可以删去，如head，title
-->
<body id="cc" class="easyui-layout">
	<div id="north"
		data-options="region:'north',href:'UserServerOAPages/layout/north.jsp'"
		style="height:94px;overflow: hidden;"></div>
	<div id="south"
		data-options="region:'south',href:'UserServerOAPages/layout/south.jsp'"
		style="height:40px; padding:10px;overflow: hidden;"></div>
	<div id="west" data-options="region:'west',split:true,title:'菜单',href:'UserServerOAPages/layout/west.jsp'"
		style="width:230px;overflow: hidden;"></div>
	<div id="center"
		data-options="region:'center',iconCls:'icon-large-chart',title:' ',href:'UserServerOAPages/layout/center.jsp'"
		style="overflow: hidden;"></div>
</body>

</html>