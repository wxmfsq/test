//新增隐藏按钮
function AddButton(){
	//隐藏新增
	$("#add").css("display", "none");
	//隐藏修改
	$("#update").css("display", "none");
	//隐藏删除
	$("#delete").css("display", "none");
	//隐藏检索
	$("#check").css("display", "none");
	//隐藏清空
	$("#clear").css("display", "none");
	//显示保存和取消
	var save=document.getElementById('save');
	$("#save").css("display", "");
	$("#cancel").css("display", "");
	
	$("#connectionName").val("");
	$("#databaseType").val("");
	$("#connectionUrl").val("");
	$("#user").val("");
	$("#passWord").val("");
	
	
}
//取消 保存页面
function CancelButton(){
	//显示新增
	$("#add").css("display", "");
	//显示修改
	$("#update").css("display", "");
	//显示删除
	$("#delete").css("display", "");
	//显示检索
	$("#check").css("display", "");
	//显示清空
	$("#clear").css("display", "");
	//隐藏保存和取消
	$("#save").css("display", "none");
	$("#cancel").css("display", "none");
	
	$("#dataSourceSn").val("");	
}
//清空所有输入选项
function ClearButton(){
	$("#connectionName").val("");
	$("#databaseType").val("");
	$("#connectionUrl").val("");
	$("#user").val("");
	$("#passWord").val("");
	$("#dataSourceSn").val("");	
}
//检索验证
function CheckButton(){
//	if($("#displayOrder").val()==""){
//	}
	if(isNaN($("#displayOrder").val())){
		showMsgDialog("提示","显示顺序类型有误!","info",function(){
			return;
		});
		return;
	}
	$("#dictLabSearchDtoid").submit();
}
//保存验证:分为新增保存，修改保存
function SaveButton(){
	if($("#connectionName").val()==""){
		showMsgDialog("提示","连接名称不能为空!","info",function(){
			return;
		});
		return;
	}
	if($("#databaseType").val()==""){
		showMsgDialog("提示","数据库类型不能为空!","info",function(){
			return;
		});
		return;
	}
	if($("#connectionUrl").val()==""){
		showMsgDialog("提示","连接URL不能为空!","info",function(){
			return;
		});
		return;
	}
	if($("#user").val()==""){
		showMsgDialog("提示","用户名不能为空!","info",function(){
			return;
		});
		return;
	}
	if($("#passWord").val()==""){
		showMsgDialog("提示","密码不能为空!","info",function(){
			return;
		});
		return;
	}
	//区分新增保存，修改保存状态字段：有值是修改，没有值是新增保存
	var dataSourceSn=$("#dataSourceSn").val();
	if(dataSourceSn!=""){
		//修改
		jQuery.post("../externalDataServe/UpdateDataSource.html",$('#dataSourceSearchID').serialize(),function(e){
	      	if(e.pointOut==0){
	      			//页面离开时弹出提示框
					showMsgDialog("提示","保存记录成功!","info",function(){
						window.location.href="../externalDataServe/DataSourceList.html";
					});
					return;
				}else{
					showMsgDialog("提示","保存记录失败!","info",function(){
						return;
					});
				}
	      });  
	}else{
		//保存
		jQuery.post("../externalDataServe/dataSourceSave.html",$('#dataSourceSearchID').serialize(),function(e){
	      	if(e.pointOut==0){
	      			//页面离开时弹出提示框
					showMsgDialog("提示","保存记录成功!","info",function(){
						window.location.href="../externalDataServe/DataSourceList.html";
					});
					return;
				}else{
					showMsgDialog("提示","保存记录失败!","info",function(){
						return;
					});
				}
	      });  
	}
}
	//删除操作
	function DeleteButton(){
		var strs="";
		  $("input[name='Item']:checked").each(function(){
	         strs+=$(this).val()+","
	      });
		if($("input[name='Item']:checked").length==0){
			showMsgDialog("提示","请选择要删除的记录","info",function(){
					return;
				});
			return;
		}else{
			showMsgDialog("删除","您确定要删除所选记录的数据吗?","confirm",function(){ 
					//删除
					jQuery.post("../externalDataServe/dataSourceDelete.html",{strs:strs},function(e){
				      	if(e.pointOut==0){
				      			//页面离开时弹出提示框
								showMsgDialog("提示","删除记录成功!","info",function(){
									window.location.href="../externalDataServe/DataSourceList.html";
								});
								return;
							}else{
								showMsgDialog("提示","删除记录失败!","info",function(){
									return;
								});
							}
				      });  
			});
		}
	}
	//修改操作
	function UpdateButton(){
		var dataSourceSn=$("input[name='Item']:checked").val();
		if($("input[name='Item']:checked").length==0){
			showMsgDialog("提示","请选择要修改的记录","info",function(){
					return;
				});
			return;
		}else if($("input[name='Item']:checked").length>1){
			showMsgDialog("提示","只能修改一条记录","info",function(){
				return;
				});
			return;
		}else{
			    AddButton();
				jQuery.post("../externalDataServe/dataSourceUpdate.html",{dataSourceSn:dataSourceSn},function(e){
					$("#connectionName").val(e.pointOut.connectionName);
					$("#databaseType").val(e.pointOut.databaseType);
					$("#connectionUrl").val(e.pointOut.connectionUrl);
					$("#user").val(e.pointOut.user);
					$("#passWord").val(e.pointOut.passWord);
					$("#dataSourceSn").val(e.pointOut.dataSourceSn);
				});
		}
	}
/*根据单个复选框的选择情况确定全选复选框是否被选中*/
function selectSingle() {
	var k = 0;
	var oInput = document.getElementsByName("Item");
	for ( var i = 0; i < oInput.length; i++) {
		if (oInput[i].checked == false) {
			k = 1;
			break;
		}
	}
	if (k == 0) {
		document.getElementById("recordCheckAll").checked = true;
	} else {
		document.getElementById("recordCheckAll").checked = false;
	}
}
/*复选框全选或全不选效果*/
function selectAll() {
	var oInput = document.getElementsByName("Item");
	for ( var i = 0; i < oInput.length; i++) {
		oInput[i].checked = document.getElementById("recordCheckAll").checked;
	}
}