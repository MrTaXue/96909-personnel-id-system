<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<script>
	$("#tree").tree({
		animate : true,
		lines : true,
		data : [ {
			text : '后台管理',
			state : 'closed',
			children : [ {
				text : '用户管理',
				state : 'closed',
				children : [ {
					text : '账号管理',
					attributes : {
						"url":"UserServerOAPages/layout/accounts.jsp"
					}
				}, {
					text : '雇主管理',
					attributes : {
						"url":"UserServerOAPages/layout/empdatagrid.jsp"
					}
				}, {
					text : '员工管理'
				} ]
			}, {
				text : '业务管理',
				state : 'closed',
				children : [ {
					text : '用工管理',
					attributes : {
					}
				}, {
					text : '消费管理',
					attributes : {
					}
				}, {
					text : '收费管理'
				} ]
			}, {
				text : '财务管理'
			}, {
				text : '工具箱'
			} ]
		}, {
			text : '系统管理'
		} ],
		onClick : function(node) {
			addTab(node);
		},
		onDblClick : function(node) {
			if(node.state == 'closed'){
				$(this).tree('expand',node.target);
			}else{
				$(this).tree('collapse',node.target);
			}
		}

	});
</script>
<ul id="tree" class="easyui-tree"></ul>
