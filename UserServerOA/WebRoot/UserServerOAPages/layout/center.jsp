<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<script>
	//定义一个tab面板
	var centerTabs = $('#centerTabs').tabs({
		fit : true,
		border : false,
		onContextMenu : function(e, title) {
			//邮件点击的时候触发
			e.preventDefault();//阻止浏览器自身的右键菜单
			$("#tabsMenu").menu('show', {
				left : e.pageX,
				top : e.pageY
			}).data('tabTitle', title);
		}
	});
	//定义方法，点击树上的层，弹出对应的tab面板，
	function addTab(node) {
		if (centerTabs.tabs('exists', node.text)) {
			//如果面板存在，则跳转到该面板
			centerTabs.tabs('select', node.text)
		} else {
			if (node.attributes.url && node.attributes.url.length > 0) {
				//attributes是tree的方法，作用是添加自定义属性到节点。
				centerTabs.tabs('add', {
					title : node.text,
					closable : true,
					href : node.attributes.url,
					tools : [ {
						iconCls : 'icon-mini-refresh',
						handler : function() {
							refreshTab(node.text);
						}
					} ]
				});
			}
		}
	}
	function refreshTab(title) {
		//刷新面板
		var tab = centerTabs.tabs('getTab', title);
		centerTabs.tabs('update', {
			tab : tab,
			options : tab.panel('options')
		});
	}
</script>
<div id="centerTabs">
	<div title="首页" border="false"
		href="UserServerOAPages/layout/portal.jsp" style="overflow : hidden;"></div>
</div>
<div id="tabsMenu" class="easyui-menu" style="width:120px;display:none;">
	<div onClick="emprightappend()" iconCls="icon-add">关闭</div>
	<div onClick="emprightremove()" iconCls="icon-remove">关闭其他面板</div>
	<div onClick="emprightedit()" iconCls="icon-edit">关闭所有所有</div>
</div>
