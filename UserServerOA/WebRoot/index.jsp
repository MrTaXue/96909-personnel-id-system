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
<script src="UserServerOAPages/jquery-1.9.1.js" type="text/javascript"
	charset="utf-8"></script>
<script src="UserServerOAPages/JQueryEasyUI/jquery.easyui.min.js"
	type="text/javascript"></script>
<link rel="stylesheet" type="text/css"
	href="UserServerOAPages/JQueryEasyUI/themes/default/easyui.css" />
<link rel="stylesheet" type="text/css"
	href="UserServerOAPages/JQueryEasyUI/themes/icon.css" />
<script src="UserServerOAPages/JQueryEasyUI/locale/easyui-lang-zh_CN.js"
	type="text/javascript" charset="utf-8"></script>
<script type="text/javascript">
	function serializeObject(form) {//自定义一个方法，可以将form表单元素的值序列化成对象
		var o = {};//声明一个对象
		$.each(form.serializeArray(), function(index) {
			if (o[this['name']]) {
				o[this['name']] = o[this['name']] + "," + this['value'];
			} else {
				o[this['name']] = this['value'];
			}
		});
		return o;
	};
	function accbtnqrcx() {/*账号表单确认查询*/
		$("#accdatagrid").datagrid('load',serializeObject($("#accfindform")));
		$("#acclayout").layout('collapse', 'east');
	};
	function accbtnchz() {/*清空账号查询表单的值*/
		$("#accdatagrid").datagrid('load',{});
		$("#accfindform input").val("");
		$("#acclayout").layout('collapse', 'east');
	};
	function empbtnqrcx() {/*雇主查询表单确认查询*/
		$("#datagrid").datagrid('load',serializeObject($("#empfindform")));
		$("#emplayout").layout('collapse', 'north');
	};
	function empbtnchz() {/*清空雇主查询表单的值*/
		$("#datagrid").datagrid('load',{});
		$("#empfindform input").val("");
		$("#emplayout").layout('collapse', 'north');
	};
	/*body里是用easyui的另外一种定义方式class定义的layout，
		具体的属性可以翻看api，
		href嵌套的是其他页面
		href调用只能调用该页面的body部分，也就是说，写在body外的部分是不会起任何作用的，所以在写的时候，全部可以删去，如head，title
	*/
</script>
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