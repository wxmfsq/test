$(function(){
//是否隐藏输出框下拉列表
	$("#resultComposit").change(function(){
		//与结果一致
		if($("#resultComposit").val()=="S001"){
			//输出Sql显示
			$("#resultSql").css("display","");
			//输出Form隐藏
			$("#resultForm").css("display","none");
			//输出table隐藏
			$("#resultTable").css("display","none");
			//输出Div隐藏
			$("#resultDiv").css("display","none");
			$("#sqlEtlTextC").css("height","400px");
			$("#divdiv").css("display","none");
		}
		//层次结构
		if($("#resultComposit").val()=="S002"){
			//输出Form显示
			$("#resultForm").css("display","");
			//输出Div显示
			$("#resultDiv").css("display","");
			//输出显示table
			$("#resultTable").css("display","");
			//输出Sql显示
			$("#resultSql").css("display","");
			$("#sqlEtlTextC").css("height","60px");
			$("#divdiv").css("display","none");
		}
		//什么也没有被选中
		if($("#resultComposit").val()!="S001" && $("#resultComposit").val()!="S002"){
			//输出Sql隐藏
			$("#resultSql").css("display","none");
			//输出Form隐藏
			$("#resultForm").css("display","none");
			//输出table隐藏
			$("#resultTable").css("display","none");
			//输出Div隐藏
			$("#resultDiv").css("display","none");
			$("#divdiv").css("display","");
		}
	});
	//与结果一致
	if($("#resultComposit").val()=="S001"){
		//输出Sql显示
		$("#resultSql").css("display","");
		//输出Form隐藏
		$("#resultForm").css("display","none");
		//输出table隐藏
		$("#resultTable").css("display","none");
		//输出Div隐藏
		$("#resultDiv").css("display","none");
		//sql与结果一致时赋值
		$("#sqlEtlTextC").css("height","400px");
		$("#sqlEtlTextC").val($("#SqlEqual").val());
		$("#divdiv").css("display","none");
	}
	//层次结构
	if($("#resultComposit").val()=="S002"){
		//输出Form显示
		$("#resultForm").css("display","");
		//输出Div显示
		$("#resultDiv").css("display","");
		//输出显示table
		$("#resultTable").css("display","");
		//输出Sql显示
		$("#sqlEtlTextC").css("height","60px");
		$("#resultSql").css("display","");
		$("#divdiv").css("display","none");
	}
	//选择接口类型选择http方式时 服务url自动显示/rest/ , 数据编码自动选择:jason
	//接口类型选择soap方式时 服务url自动显示/service/, 数据编码自动选择:xml
	$("#serviceType").change(function(){
		if($("#serviceDefinitionSn").val()==""){
			if($("#serviceType").val()=='S001'){
				$("#serviceUrl").val("/rest/");
				$("#dataEncode").val('S001')
			}else if($("#serviceType").val()=='S002'){
				$("#serviceUrl").val("/service/");
				$("#dataEncode").val('S002')
			}
		}
		
	});
});
//克隆方法添加
	function AddButtonI(){
		var num = $("#hidNum").val(); // 
        num = parseInt(num); 
        num++; //点击自加 
        $("#hidNum").val(num); //重新赋值 
        $("#cloneTd").clone(true).attr("id", "tRow" + num).attr("style", "").appendTo("#inputTable"); //clone tr 并重新给定ID,装到table 
        $("#tRow" + num + " td").find("input[name='ItemBB']").attr("id", "ItemB"+num).attr("name", "ItemB"); 
        $("#tRow" + num + " td").find("input[name='paramNo']").attr("id", "paramNo" + num).attr("paramNo","paramNo" + num); 
        $("#tRow" + num + " td").find("input[name='paramName']").attr("id", "paramName" + num).attr("paramName","paramName" + num); 
        $("#tRow" + num + " td").find("select[name='paramType']").attr("id", "paramType" + num).attr("paramType","paramType" + num); 
        $("#tRow" + num + " td").find("input[name='minTimes']").attr("id", "minTimesB" + num).attr("name", "minTimes" + num); 
        $("#tRow" + num + " td").find("input[name='maxTimes']").attr("id", "maxTimesB" + num).attr("name", "maxTimes" + num); 
        $("#tRow" + num + " td").find("input[name='paramText']").attr("id", "paramText" + num).attr("name","paramText" + num); 
	}
	/*根据单个复选框的选择情况确定全选复选框是否被选中*/
	function selectSingleB() {
		var k = 0;
		var oInput = document.getElementsByName("ItemB");
		for ( var i = 0; i < oInput.length; i++) {
			if (oInput[i].checked == false) {
				k = 1;
				break;
			}
		}
		if (k == 0) {
			document.getElementById("recordCheckAllB").checked = true;
		} else {
			document.getElementById("recordCheckAllB").checked = false;
		}
	}
	/*复选框全选或全不选效果*/
	function selectAllB() {
		var oInput = document.getElementsByName("ItemB");
		for ( var i = 0; i < oInput.length; i++) {
			oInput[i].checked = document.getElementById("recordCheckAllB").checked;
		}
	}
	//function
//B输入表单保存
	function saveB(){
		var paramNo;
		var paramName;
		var paramType;
		var minTimes;
		var maxTimes;
		var paramText;
		
		var strB=[];
		var B=0;
		$("#inputTable tr").each(function(){
		  B++;
		  //因为有克隆所以从3以后取值;
		  if(B>=3){
			  var str="";
			  paramNo=$(this).find("td").eq(1).find("input").val();
			  paramName=$(this).find("td").eq(2).find("input").val();
			  paramType=$(this).find("td").eq(3).find("select").val();
			  minTimes=$(this).find("td").eq(4).find("input").val();
			  maxTimes=$(this).find("td").eq(5).find("input").val();
			  paramText=$(this).find("td").eq(6).find("input").val();
			  if(paramText==""){
					 paramText="=";
				 }
				 str=paramNo.replace(/\s+/g,"")+","+paramName.replace(/\s+/g,"")+","+paramType+","+minTimes.replace(/\s+/g,"")+","+maxTimes.replace(/\s+/g,"")+","+paramText+",";
				 strB.push(str);	
		  }	   
		});
		return strB;
	}
//整个页面新增以后隐藏按钮效果:新增保存；
	function AddButtonA(){
		if($("#serviceDefinitionSn").val()!=""){
			clearForm();
		}
		//显示保存按钮
		$("#saveB").css("display","none");
		$("#saveA").css("display","");
		$("#cancelA").css("display","");
	}
//清空整个表单方法
	function clearForm(){
		$("#serviceDefinitionSn").val("");
		$("#serviceName").val("");
		$("#serviceType").val("");
		$("#serviceUrl").val("");
		$("#serviceGroup").val("");
		$("#dataSourceSn").val("");
		$("#description").val("");
		$("#opMode").val("");
		$("#dataEncode").val("");
		$("#resultComposit").val("");
		clearC();
		//先把所有数据选中然后做删除留下克隆行 
		// 1、formB
		var oInput = document.getElementsByName("ItemB");
		for ( var i = 0; i < oInput.length; i++) {
			oInput[i].checked = true;
		}
		$("input[name='ItemB']:checked").each(function(){
			 $("input[name='ItemB']:checked").closest('tr').remove();
	      });
		// 2、formC
		var oInputC = document.getElementsByName("ItemC");
		for ( var i = 0; i < oInputC.length; i++) {
			oInputC[i].checked = true;
		}
		$("input[name='ItemC']:checked").each(function(){
			 $("input[name='ItemC']:checked").closest('tr').remove();
	      });
	}
//删除整页数据
	function DeleteButtonA(){
		var serviceDefinitionSn=$("#serviceDefinitionSn").val();
		if(serviceDefinitionSn==""){
			showMsgDialog("提示","请选择要删除的数据!","info",function(){
	  			return;
	  			});
	  		return;
		}else{
			showMsgDialog("删除","您确定要删除所选记录的数据吗?","confirm",function(){
				jQuery.post("../externalDataServe/externalDataServeDelete.html",{serviceDefinitionSn:serviceDefinitionSn},function(e){
					if(e.pointOut==0){
						showMsgDialog("提示","删除记录成功","info",function(){
							window.location.href="../externalDataServe/externalDataServeList.html";
							});
						return;
					}else{
						showMsgDialog("提示","删除记录失败","info",function(){
							return;
						});
					}
				});
			});
		}
	} 
//点击其中一个显示整个SQL值
	function clickSql(value){
		
		if($("input[name='ItemC']:checked").length<1){
			showMsgDialog("提示","请选择一条要添加的数据!","info",function(){
	  			return;
	  			});
	  		return;
		}
		if($("input[name='ItemC']:checked").length>1){
			showMsgDialog("提示","每次只能修改一条!","info",function(){
	  			return;
	  			});
	  		return;
		}
		if($("input[name='ItemC']:checked").parent().nextAll().eq(4).find("input").val()==value){
			$("#sqlEtlTextC").val(value);
			$("#dataGroupNameEnC").val($("input[name='ItemC']:checked").parent().nextAll().eq(0).find("input").val());
			$("#dataGroupNameCnC").val($("input[name='ItemC']:checked").parent().nextAll().eq(1).find("input").val());
			if($("input[name='ItemC']:checked").parent().eq(0).find("input").eq(1).val()=="="){
				$("#textCC").val("");
			}else{
				$("#textCC").val($("input[name='ItemC']:checked").parent().eq(0).find("input").eq(1).val());
			}
			$("#minTimesC").val($("input[name='ItemC']:checked").parent().nextAll().eq(2).find("input").val());
			$("#maxTimesC").val($("input[name='ItemC']:checked").parent().nextAll().eq(3).find("input").val());
			$("#dataGroupNoC").val($("input[name='ItemC']:checked").parent().nextAll().eq(5).find("input").val());
			$("#saveC").css("display","none");
			$("#saveSQL").css("display","");
		}
		
	}
//单机sql内容显示到下面的SQL内容输入框里
	function saveButtonSQL(){
		if($("input[name='ItemC']:checked").length<1){
			showMsgDialog("提示","请选择一条要添加的数据!","info",function(){
	  			return;
	  			});
	  		return;
		}
		if($("input[name='ItemC']:checked").length>1){
			showMsgDialog("提示","每次只能修改一条!","info",function(){
	  			return;
	  			});
	  		return;
		}
		$("input[name='ItemC']:checked").parent().nextAll().eq(0).find("input").val($("#dataGroupNameEnC").val());
		$("input[name='ItemC']:checked").parent().nextAll().eq(1).find("input").val($("#dataGroupNameCnC").val());
		$("input[name='ItemC']:checked").parent().eq(0).find("input").eq(1).val($("#textCC").val());
		$("input[name='ItemC']:checked").parent().nextAll().eq(2).find("input").val($("#minTimesC").val());
		$("input[name='ItemC']:checked").parent().nextAll().eq(3).find("input").val($("#maxTimesC").val());
		$("input[name='ItemC']:checked").parent().nextAll().eq(4).find("input").val($("#sqlEtlTextC").val());
		$("input[name='ItemC']:checked").parent().nextAll().eq(5).find("input").val($("#dataGroupNoC").val());
		
		$("#saveSQL").css("display","none");
	}