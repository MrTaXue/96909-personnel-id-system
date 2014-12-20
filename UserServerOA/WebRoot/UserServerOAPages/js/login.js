$(function() {
	var form=$("#loginform");//定义登录界面的表单
	var pathName = window.document.location.pathname;
	var projectName = pathName.substring(0, pathName.substr(1).indexOf('/') + 1);//获取根路径
	function loginFun () {
		//登录按钮和回车键处罚函数
		if(form.form("validate")){//通过easyui里的validate方法对表单中的所有字段进行验证，所有字段验证通过时返回true
			var url=projectName+"/login?atn=myLogin";
			//post向后台传值，得到结果并执行回调函数
			//serialize（）方法是Jquery提供的方法，序列化表格的内容为字符串。
			//result是指后台返回的值，这里可以随便定义名称，方便在函数中使用就行
			$.post(url,form.serialize(),function(result) {
				if(result=="success"){
					//跳转到index页面（首页）
					location.replace(projectName+'/index.jsp');
				}else{
					$("#msg").html(result);
				}
			});
		}
	};
	
	$('#loginform input').keyup(function(event) {
		//选中登录表单下的所有input组件，执行键盘函数
		if (event.keyCode == '13') {
			//回车
			loginFun();
		}
	});
	
	$("#ipt").dialog({
		//定义一个dialog，easyui两种定义方式之一
		//属性不一一注释，api都有
		closable :false,
		draggable:false,//dialog继承自window，所以可以调用window中的所有方法和属性
		buttons:[{
			iconCls:'icon-ok',
			text:'登陆',
			handler:function(){
				loginFun();
			}
		},{
			iconCls:'icon-clear',
			text:'重置',
			handler:function(){
				$("input").val("");
				$("[name='uname']").focus();
			}
		}],
		title:'用户登录'
		});
});

