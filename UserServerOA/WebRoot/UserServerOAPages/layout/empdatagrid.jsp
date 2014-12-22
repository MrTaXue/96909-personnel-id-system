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
		var empsex = [ {//对象数组
			"value" : "男",
			"text" : "男"
		}, {
			"value" : "女",
			"text" : "女"
		} ];
		var editRow = undefined;//定义一个属性，记录状态
		$("#datagrid").datagrid({
			//定义一个数据表格
			url : projectName + '/emp?action=emplist',//数据表格调用的后台路径
			striped : true,
			title : '雇主管理',
			rownumbers : true,
			pagination : true,//显示底部分页工具栏
			pageSize : 5,
			pageList : [ 5, 10, 20 ],
			fit : true,
			fitColumns : false,
			nowrap : false,
			border : false,
			idField : 'employerId',//指明标识字段。
			sortName : 'employerId',//定义默认排序
			sortOrder : 'desc',
			frozenColumns : [ [ {//冻结列
				checkbox : true,
				field : 'id',
				title : 'id',
				width : 100
			}, {
				field : 'fName',//会传回后台，所以最好和后台对应
				title : '姓名',
				sortable : true,//允许该列排序
				width : 100,
				editor : {//可以打开编辑模式
					type : 'validatebox',
					options : {
						required : true,
						missingMessage : '请输入真实姓名！'
					}
				}
			} ] ],
			columns : [ [ {
				field : 'comId',
				title : '公司编号',
				sortable : true,
				width : 100,
				editor : {
					type : 'validatebox',
					options : {
						required : true,
						missingMessage : '请输入您的公司编号！'
					}
				}
			}, {
				field : 'wSex',
				title : '性别',
				sortable : true,
				width : 100,
				editor : {
					type : 'combobox',
					options : {
						editable : false,//不可输入
						panelHeight : 48,
						missingMessage : '请选择性别！',
						required : true,
						data : empsex,//调用上面定义的对象数组
						valueField : 'value',
						textField : 'text'
					}
				}
			}, {
				field : 'age',
				title : '年龄',
				sortable : true,
				width : 100,
				editor : {
					type : 'numberbox',//数字输入框
					options : {
						missingMessage : '请输入您的年龄！',
						required : true,
						min : 0,//可输入的最小数字
						max : 100,//可输入的最大数字
					}
				}
			}, {
				field : 'enation',
				title : '民族',
				sortable : true,
				width : 100,
				editor : {
					type : 'validatebox',
					options : {}
				}
			}, {
				field : 'empNative',
				title : '籍贯',
				sortable : true,
				width : 100,
				editor : {
					type : 'validatebox',
					options : {}
				}
			}, {
				field : 'schoolAge',
				title : '学历',
				sortable : true,
				width : 100,
				editor : {
					type : 'validatebox',
					options : {}
				}
			}, {
				field : 'cardNum',
				title : '身份证号',
				sortable : true,
				width : 100,
				editor : {
					type : 'validatebox',
					options : {
						missingMessage : '请输入您的身份证号！',
						required : true
					}
				}
			}, {
				field : 'workerUnit',
				title : '工作单位',
				sortable : true,
				width : 100,
				editor : {
					type : 'validatebox',
					options : {}
				}
			}, {
				field : 'profession',
				title : '职业',
				sortable : true,
				width : 100,
				editor : {
					type : 'validatebox',
					options : {}
				}
			}, {
				field : 'bargainNum',
				title : '合同号',
				sortable : true,
				width : 100,
				editor : {
					type : 'validatebox',
					options : {
						missingMessage : '请输入合同号！',
						required : true
					}
				}
			}, {
				field : 'bargainDate',
				title : '合同期限',
				sortable : true,
				width : 100,
				editor : {
					type : 'datetimebox',
					options : {
						editable : false,
						missingMessage : '请选择合同期限！',
						required : true
					}
				}
			}, {
				field : 'phone',
				title : '电话号',
				sortable : true,
				width : 100,
				editor : {
					type : 'validatebox',
					options : {
						missingMessage : '请输入您的电话号码！',
						required : true
					}
				}
			}, {
				field : 'mobilePhone',
				title : '手机号',
				sortable : true,
				width : 100,
				editor : {
					type : 'validatebox',
					options : {
						missingMessage : '请输入您的手机号码！',
						required : true
					}
				}
			}, {
				field : 'empAddress',
				title : '住宅',
				sortable : true,
				width : 100,
				editor : {
					type : 'validatebox',
					options : {}
				}
			}, {
				field : 'empRegistered',
				title : '户口所在地',
				sortable : true,
				width : 100,
				editor : {
					type : 'validatebox',
					options : {}
				}
			}, {
				field : 'serveAddress',
				title : '服务处',
				sortable : true,
				width : 100,
				editor : {
					type : 'validatebox',
					options : {
						missingMessage : '请输入服务处地址！',
						required : true
					}
				}
			}, {
				field : 'familyAddress',
				title : '居住地址',
				sortable : true,
				width : 100,
				editor : {
					type : 'validatebox',
					options : {
						missingMessage : '请输入您的居住地址！',
						required : true
					}
				}
			}, {
				field : 'familyNum',
				title : '家庭人数',
				sortable : true,
				width : 100,
				editor : {
					type : 'numberbox',
					options : {
						missingMessage : '请输入您的家庭人数！',
						required : true
					}
				}
			}, {
				field : 'empRequestBaseid',
				title : '雇用要求',
				sortable : true,
				width : 100,
				editor : {
					type : 'validatebox',
					options : {
						missingMessage : '请填写您的雇佣要求！',
						required : true
					}
				}
			}, {
				field : 'familyContent',
				title : '服务内容',
				sortable : true,
				width : 100,
				editor : {
					type : 'validatebox',
					options : {
						missingMessage : '请填写所需服务内容！',
						required : true
					}
				}
			}, {
				field : 'familyArea',
				title : '房屋面积',
				sortable : true,
				width : 100,
				editor : {
					type : 'numberbox',
					options : {
						missingMessage : '请填写您的房屋面积！',
						required : true,
						min : 0,
						max : 1000,
					}
				}
			}, {
				field : 'familyEat',
				title : '饮食习惯',
				sortable : true,
				width : 100,
				editor : {
					type : 'validatebox',
					options : {}
				}
			}, {
				field : 'familyDesc',
				title : '其他备注',
				sortable : true,
				width : 100,
				editor : {
					type : 'validatebox',
					options : {}
				}
			}, {
				field : 'handlers',
				title : '经办人',
				sortable : true,
				width : 100,
				editor : {
					type : 'numberbox',
					options : {
						missingMessage : '请填写经办人ID！',
						required : true
					}
				}
			}, {
				field : 'handlersDate',
				title : '登记时间',
				sortable : true,
				width : 100,
				editor : {
					type : 'datetimebox',//日期时间输入框
					options : {
						editable : false,
						missingMessage : '请填写登记时间！',
						required : true
					}
				}
			}, {
				field : 'maxSalary',
				title : '接受的最高工资',
				sortable : true,
				width : 100,
				editor : {
					type : 'numberbox',
					options : {
						missingMessage : '请填写接受的最高工资！',
						min : 0,
						prefix : '￥',
						required : true
					}
				}
			}, {
				field : 'minSalary',
				title : '接受的最低工资',
				sortable : true,
				width : 100,
				editor : {
					type : 'numberbox',
					options : {
						missingMessage : '请填写接受的最低工资！',
						min : 0,
						prefix : '￥',
						required : true
					}
				}
			}, {
				field : 'birthday',
				title : '出生日期',
				sortable : true,
				width : 100,
				editor : {
					type : 'datetimebox',
					options : {
						editable : false,
						missingMessage : '请选择您的出生日期！'
					}
				}
			} ] ],
			toolbar : [//工具栏
				{
					text : '添加',
					iconCls : 'icon-add',
					handler : function() {
						if (editRow != undefined) {
							//对记录属性进行判断，如果不为undefined，则关闭当前记录行的编辑状态
							$("#datagrid").datagrid('endEdit', editRow);
						}
						if (editRow == undefined) {
							//插入一行
							$("#datagrid").datagrid('insertRow', {
								index : 0,
								row : {}//全空的行，还可以设置默认值
							});
							$("#datagrid").datagrid('beginEdit', 0);//开启编辑状态
							editRow = 0;//记录当前可编辑行的行数，从0开始
						}
					}
				},
				'-',//分隔符
				{
					text : '删除',
					iconCls : 'icon-remove',
					handler : function() {
						var rows = $("#datagrid").datagrid('getSelections');
						//得到当前被选中行的索引
						if (rows.length > 0) {
							$.messager.confirm('请确认','您确定要删除当前记录吗？',function(r) {
								if (r) {
									var ids = [];
									for ( var i = 0; i < rows.length; i++) {
										ids.push(rows[i].employerId);
									}
									$.post(projectName+ '/emp?action='+ ids,function(msg) {
										$("#datagrid").datagrid('load',{});
										$("#datagrid").datagrid('unselectAll');
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
								msg : '请选中要删除的雇主信息！',
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
						var rows = $("#datagrid").datagrid('getSelections');
						if (rows.length == 1) {
							if (editRow != undefined) {
								$("#datagrid").datagrid('endEdit', editRow);
							}
							if (editRow == undefined) {
								var rowsindex = $("#datagrid").datagrid('getRowIndex',rows[0]);
								$("#datagrid").datagrid('beginEdit',rowsindex);
								editRow = rowsindex;
							}
						}
					}
				},'-',
				{
					text : '查找',
					iconCls : 'icon-search',
					handler : function() {
						empfind();
					}
				},
				'-',
				{
					text : '保存',
					iconCls : 'icon-save',
					handler : function() {
						$("#datagrid").datagrid('endEdit',editRow);
					}
				},
				'-',
				{
					text : '取消编辑',
					iconCls : 'icon-redo',
					handler : function() {
						$("#datagrid").datagrid('rejectChanges');
						$("#datagrid").datagrid('unselectAll');
						editRow = undefined;
					}
				}, '-' 
			],
			onAfterEdit : function(rowIndex, rowData, changes) {
				var inserted = $("#datagrid").datagrid('getChanges', 'inserted');
				var updated = $("#datagrid").datagrid('getChanges', 'updated');
				var urlemp = '';
				if (inserted.length < 1 && updated.length < 1) {
					editRow = undefined;
					$("#datagrid").datagrid('unselectAll');
					return;
				}
				if (inserted.length > 0) {
					urlemp = projectName + '/emp?action=empadd';
				}
				if (updated.length > 0) {
					urlemp = projectName + '/emp?action=empupdate';
				}
				$.post(urlemp, rowData, function(result) {
					if (result == '修改成功！') {
						$("#datagrid").datagrid('acceptChanges');
						$.messager.show({
							title : '提示信息',
							msg : '修改成功！',
							timeout : 3000,
							showType : 'slide'
						});
					} else if (result == '添加成功！') {
						$("#datagrid").datagrid('acceptChanges');
						$.messager.show({
							title : '提示信息',
							msg : '添加成功！',
							timeout : 3000,
							showType : 'slide'
						});
					} else {
						$("#datagrid").datagrid('rejectChanges');
						$.messager.show({
							title : '提示信息',
							msg : '操作失败！',
							timeout : 3000,
							showType : 'slide'
						});
					}
					;
					editRow = undefined;
					$("#datagrid").datagrid('unselectAll');
				});
			},
			onDblClickRow : function(rowIndex, rowData) {
				if (editRow != undefined) {
					$("#datagrid").datagrid('endEdit', editRow);
				}
				if (editRow == undefined) {
					$("#datagrid").datagrid('beginEdit',rowIndex);
					editRow = rowIndex;
				}
			},
		});
		function empfind() {
			$("#emplayout").layout('expand', 'north');
		}
		;
	});
</script>
<div id="emplayout" fit="true" class="easyui-layout">
	<div id="north"
		data-options="region:'north',fit:true,iconCls:'icon-search',border:false,title:'筛选'">

		<form id="empfindform" method="post">
			<table class="empfind datagrid-toolbar">
				<tr>
					<th>雇主编号</th>
					<td><input type="text" id="employerId" name="employerId"
						value="" /></td>
					<th>公司编号</th>
					<td><input type="text" id="comId" name="comId" value="" /></td>
					<th>姓名</th>
					<td><input type="text" id="fName" name="fName" value="" /></td>

				</tr>
				<tr>
					<th>性别</th>
					<td><input type="radio" name="wSex" id="wSex" value="男" />男
						<input type="radio" name="wSex" id="wSex" value="女" />女</td>
					<th>年龄</th>
					<td><input type="text" id="age1" name="age1" value="" />至 <input
						type="text" id="age2" name="age2" value="" /></td>
					<th>民族</th>
					<td><input type="text" id="enation" name="enation" value="" />
					</td>
				</tr>
				<tr>
					<th>籍贯</th>
					<td><input type="text" id="empNative" name="empNative"
						value="" /></td>
					<th>学历</th>
					<td><input type="text" id="schoolAge" name="schoolAge"
						value="" /></td>
					<th>身份证号</th>
					<td><input type="text" id="cardNum" name="cardNum" value="" />
					</td>
				</tr>
				<tr>
					<th>工作单位</th>
					<td><input type="text" id="workerUnit" name="workerUnit"
						value="" /></td>
					<th>职业</th>
					<td><input type="text" id="profession" name="profession"
						value="" /></td>
					<th>合同号</th>
					<td><input type="text" id="bargainNum" name="bargainNum"
						value="" /></td>
				</tr>
				<tr>
					<th>合同期限</th>
					<td><input type="text" id="bargainDate1" name="bargainDate1"
						class="easyui-datetimebox" editable="false" value="" />至<input
						type="text" id="bargainDate2" name="bargainDate2"
						class="easyui-datetimebox" editable="false" value="" /></td>
					<th>电话号</th>
					<td><input type="text" id="phone" name="phone" value="" /></td>
					<th>手机号</th>
					<td><input type="text" id="mobilePhone" name="mobilePhone"
						value="" /></td>
				</tr>
				<tr>
					<th>住宅</th>
					<td><input type="text" id="empAddress" name="empAddress"
						value="" /></td>
					<th>户口所在地</th>
					<td><input type="text" id="empRegistered"
						name="empRegistered" value="" /></td>
					<th>服务处地址</th>
					<td><input type="text" id="serveAddress" name="serveAddress"
						value="" /></td>
				</tr>
				<tr>
					<th>居住地址</th>
					<td><input type="text" id="familyAddress"
						name="familyAddress" value="" /></td>
					<th>家庭人数</th>
					<td><input type="text" id="familyNum" name="familyNum"
						value="" /></td>
					<th>雇佣要求</th>
					<td><input type="text" id="empRequestBaseid"
						name="empRequestBaseid" value="" /></td>
				</tr>
				<tr>
					<th>服务内容</th>
					<td><input type="text" id="familyContent"
						name="familyContent" value="" /></td>
					<th>房屋面积</th>
					<td><input type="text" id="familyArea" name="familyArea"
						value="" /></td>
					<th>饮食习惯</th>
					<td><input type="text" id="familyEat" name="familyEat"
						value="" /></td>
				</tr>
				<tr>
					<th>经办人</th>
					<td><input type="text" id="handlers" name="handlers" value="" />
					</td>
					<th>接受的最低工资</th>
					<td><input type="text" id="minSalary" name="minSalary"
						value="" /></td>
					<th>接受的最高工资</th>
					<td><input type="text" id="maxSalary" name="maxSalary"
						value="" /></td>
				</tr>
				<tr>
					<th>登记时间</th>
					<td><input type="text" id="handlersDate1"
						name="handlersDate1" class="easyui-datetimebox" editable="false"
						value="" />至<input type="text" id="handlersDate2"
						name="handlersDate2" class="easyui-datetimebox" editable="false"
						value="" /></td>
					<th>出生日期</th>
					<td><input type="text" id="birthday1" name="birthday1"
						class="easyui-datetimebox" editable="false" value="" />至<input
						type="text" id="birthday2" name="birthday2"
						class="easyui-datetimebox" editable="false" value="" /></td>
					<th></th>
					<td><a id="empbtnqrcx" href="#" class="easyui-linkbutton"
						data-options="iconCls:'icon-search',plain:true"
						onClick="empbtnqrcx()">确认筛选</a> <a id="empbtnchz" href="#"
						class="easyui-linkbutton"
						data-options="iconCls:'icon-clear',plain:true"
						onClick="empbtnchz()">重置条件</a>
					</td>
				</tr>
			</table>
		</form>
	</div>
	<div data-options="region:'center'">
		<table id="datagrid"></table>
	</div>
</div>
