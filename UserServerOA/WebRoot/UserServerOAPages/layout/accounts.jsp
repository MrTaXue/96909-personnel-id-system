<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<script type="text/javascript">
	$(function() {
		var pathName = window.document.location.pathname;
		var projectName = pathName.substring(0,pathName.substr(1).indexOf('/') + 1);
		var editRow = undefined;
		var accState = [ {
			"value" : "可用",
			"text" : "可用"
		}, {
			"value" : "不可用",
			"text" : "不可用"
		} ];
		var accCompanyGrand = [ {
			"value" : "总公司",
			"text" : "总公司"
		}, {
			"value" : "分公司",
			"text" : "分公司"
		} ];
		$("#accdatagrid").datagrid(
			{
				url : projectName + '/acc?action=acclist',
				striped : true,
				title : '账号管理',
				rownumbers : true,
				pagination : true,
				pageSize : 5,
				pageList : [ 5, 10, 20 ],
				fit : true,
				fitColumns : true,
				nowrap : false,
				border : false,
				idField : 'accountId',
				sortName : 'accountId',
				sortOrder : 'desc',
				frozenColumns : [ [ {
					checkbox : true,
					field : 'id',
					title : 'id',
					width : 100
				}, {
					field : 'accName',
					title : '用户名',
					sortable : true,
					width : 100,
					editor : {
						type : 'validatebox',
						options : {
							required : true,
							missingMessage : '请输入用户名！'
						}
					}
				} ] ],
				columns : [ [ {
					field : 'fName',
					title : '姓名',
					sortable : true,
					width : 100,
					editor : {
						type : 'validatebox',
						options : {
							required : true,
							missingMessage : '请输入您的姓名！'
						}
					}
				},{
					field : 'aEmail',
					title : '邮箱',
					sortable : true,
					width : 100,
					editor : {
						type : 'validatebox',
						options : {
							required : true,
							validType:'email',
							missingMessage : '请输入您的邮箱！'
						}
					}
				},{
					field : 'accPwd',
					title : '密码',
					sortable : true,
					width : 100,
					editor : {
						type : 'validatebox',
						options : {
							required : true,
							missingMessage : '请输入您的密码！'
						}
					}
				},{
					field : 'accState',
					title : '状态',
					sortable : true,
					width : 100,
					editor : {
						type : 'combobox',
						options : {
							editable : false,
							panelHeight : 48,
							missingMessage : '请选择账号状态！',
							required : true,
							data : accState,
							valueField : 'value',
							textField : 'text'
						}
					}
				},{
					field : 'companyGrand',
					title : '公司级别',
					sortable : true,
					width : 100,
					editor : {
						type : 'combobox',
						options : {
							editable : false,
							panelHeight : 48,
							missingMessage : '请选择公司级别！',
							required : true,
							data : accCompanyGrand,
							valueField : 'value',
							textField : 'text'
						}
					}
				},{
					field : 'companyId',
					title : '公司编号',
					sortable : true,
					width : 100,
					editor : {
						type : 'numberbox',
						options : {
							required : true,
							min:1001,
							missingMessage : '请输入您的公司编号！'
						}
					}
				} ] ],
				toolbar : [
					{
						text : '添加',
						iconCls : 'icon-add',
						handler : function() {
							if (editRow != undefined) {
									$("#accdatagrid").datagrid('endEdit', editRow);
								}
							if (editRow == undefined) {
									$("#accdatagrid").datagrid('insertRow', {
										index : 0,
										row : {}
									});
									$("#accdatagrid").datagrid('beginEdit', 0);
									editRow = 0;
								}
						}
					},'-',
					{
						text : '删除',
						iconCls : 'icon-remove',
						handler : function() {
							var rows = $("#accdatagrid").datagrid('getSelections');
								if (rows.length > 0) {
									$.messager.confirm('请确认','您确定要删除当前记录吗？',
										function(r) {
											if (r) {
												var ids = [];
												for (var i = 0; i < rows.length; i++) {
													ids.push(rows[i].accountId);
												}
											$.post(projectName+ '/acc?action='+ ids,
												function(msg) {
													$("#accdatagrid").datagrid('load',{});
													$("#accdatagrid").datagrid('unselectAll');
													$.messager.show({
														title : '提示信息',
														msg : msg,
														timeout : 3000,
														showType : 'slide'
													});
												});
											}
										});
								} else {
										$.messager.show({
											title : '提示信息',
											msg : '请选中要删除的账号信息！',
											timeout : 3000,
											showType : 'slide'
										});
								}
							}
						},'-',
						{
							text : '修改',
							iconCls : 'icon-edit',
							handler : function() {
								var rows = $("#accdatagrid").datagrid('getSelections');
								if (rows.length == 1) {
									if (editRow != undefined) {
										$("#accdatagrid").datagrid('endEdit', editRow);
									}
									if (editRow == undefined) {
										var rowsindex = $("#accdatagrid").datagrid('getRowIndex',rows[0]);
										$("#accdatagrid").datagrid('beginEdit',rowsindex);
										editRow = rowsindex;
									}
								}
							}
						},'-',
						{
							text : '查找',
							iconCls : 'icon-search',
							handler : function() {
								accfind();
							}
						},'-',
						{
							text : '保存',
							iconCls : 'icon-save',
							handler : function() {
								$("#accdatagrid").datagrid('endEdit',editRow);
							}
						},'-',
						{
							text : '取消编辑',
							iconCls : 'icon-redo',
							handler : function() {
								$("#accdatagrid").datagrid('rejectChanges');
								$("#accdatagrid").datagrid('unselectAll');
								editRow = undefined;
							}
						}, '-' ],
						onAfterEdit : function(rowIndex, rowData, changes) {
							var inserted = $("#accdatagrid").datagrid('getChanges', 'inserted');
								var updated = $("#accdatagrid").datagrid('getChanges', 'updated');
								var urlemp = '';
								if (inserted.length < 1 && updated.length < 1) {
									editRow = undefined;
									$("#accdatagrid").datagrid('unselectAll');
									return;
								}
								if (inserted.length > 0) {
									urlemp = projectName + '/acc?action=accadd';
								}
								if (updated.length > 0) {
									urlemp = projectName + '/acc?action=accupdate';
								}
								$.post(urlemp, rowData, function(result) {
									if (result == '修改成功！') {
										$("#accdatagrid").datagrid('acceptChanges');
										$.messager.show({
											title : '提示信息',
											msg : '修改成功！',
											timeout : 3000,
											showType : 'slide'
										});
									} else if (result == '添加成功！') {
										$("#accdatagrid").datagrid('acceptChanges');
										$.messager.show({
											title : '提示信息',
											msg : '添加成功！',
											timeout : 3000,
											showType : 'slide'
										});
									} else {
										$("#accdatagrid").datagrid('rejectChanges');
										$.messager.show({
											title : '提示信息',
											msg : '操作失败！',
											timeout : 3000,
											showType : 'slide'
										});
									};
									editRow = undefined;
									$("#accdatagrid").datagrid('unselectAll');
								});
							},
							onDblClickRow : function(rowIndex, rowData) {
								if (editRow != undefined) {
									$("#accdatagrid").datagrid('endEdit', editRow);
								}
								if (editRow == undefined) {
									$("#accdatagrid").datagrid('beginEdit',rowIndex);
									editRow = rowIndex;
								}
							},
						});
		function accfind() {
			//点击查询按钮，弹出右边的面板
			$("#acclayout").layout('expand', 'east');
		};
	});
</script>
<div id="acclayout" fit="true" class="easyui-layout">
	<div id="east"
		data-options="region:'east',collapsed:true,iconCls:'icon-search',border:false,title:'筛选'"
		style="width:250px">

		<form id="accfindform" method="post">
			<table fit="true" class="accfind datagrid-toolbar">
				<tr>
					<th>用户名：</th>
					<td><input type="text" id="accName" name="accName" />
					</td>
				</tr>
				<tr>
					<th>姓名：</th>
					<td><input type="text" id="fName" name="fName" />
					</td>
				</tr>
				<tr>
					<th>Email：</th>
					<td><input type="text" class="easyui-validatebox"
						data-options="validType:'email'" id="aEmail" name="aEmail" /></td>
				</tr>
				<tr>
					<th>状态：</th>
					<td><select class="easyui-combobox" style="width:80px;"
						id="accState" name="accState">
							<option value="">不限</option>
							<option value="可用">可用</option>
							<option value="不可用">不可用</option>
					</select></td>
				</tr>
				<tr>
					<th>公司级别：</th>
					<td><select class="easyui-combobox" style="width:80px;"
						id="companyGrand" name="companyGrand">
							<option value="">不限</option>
							<option value="总公司">总公司</option>
							<option value="分公司">分公司</option>
					</select></td>
				</tr>
				<tr>
					<th>公司ID：</th>
					<td><input type="text" class="easyui-numberbox" value=""
						data-options="min:1001" id="companyId" name="companyId" />
					</td>
				</tr>
				<tr>
					<th></th>
					<td><a id="accbtnqrcx" href="#" class="easyui-linkbutton"
						data-options="iconCls:'icon-search',plain:true"
						onClick="accbtnqrcx()">确认筛选</a> <a id="accbtnchz" href="#"
						class="easyui-linkbutton"
						data-options="iconCls:'icon-clear',plain:true"
						onClick="accbtnchz()">重置条件</a></td>
				</tr>
			</table>
		</form>
	</div>
	<div data-options="region:'center'">
		<table id="accdatagrid"></table>
	</div>
</div>
