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