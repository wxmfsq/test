//C表单添加方法
function AddButtonC(){
	clearC();
	$("#saveC").css("display","");
	$("#saveSQL").css("display","none");
	
}
//C表单添加子元素方法
function AddButtonCC(){
	//选中一个对象作为其父元素
	if($("input[name='ItemC']:checked").length<=0 ){
		showMsgDialog("提示","没有父元素被选中!","info",function(){
  			return;
  			});
  		return;
	}
	if($("input[name='ItemC']:checked").length>1 ){
		showMsgDialog("提示","只能选中一个作为其父元素!","info",function(){
  			return;
  			});
  		return;
	}
	var textc=$("input[name='ItemC']:checked").parent().next("td").find("input").val();
	clearC();
	$("#saveC").css("display","");
	$("#saveSQL").css("display","none");
	$("#textCC").val(textc);
}
//清空c输入表单
function clearC(){
	$("#dataGroupNameEnC").val("");
	$("#dataGroupNameCnC").val("");
	$("#textCC").val("");
	$("#minTimesC").val("");
	$("#maxTimesC").val("");
	$("#sqlEtlTextC").val("");
	
}
//克隆方法添加 ： C输入数据以后表单进行保存
function saveButtonC(){
	var num = $("#hidNumC").val(); // 
	numc = parseInt(num); 
    num++; //点击自加 
    $("#hidNumC").val(num); //重新赋值 
    $("#cloneId").clone(true).attr("id", "tRow" + num).attr("style", "").appendTo("#resultTableC"); //clone tr 并重新给定ID,装到table 
    $("#tRow" + num + " td").find("input[name='ItemCC']").attr("id", "ItemCC" + num).attr("name", "ItemC"); 
    $("#tRow" + num + " td").find("input[name='textc']").attr("id", "textc"+num).attr("name", "textc"+num);
    $("#tRow" + num + " td").find("input[name='dataGroupNameEn']").attr("id", "dataGroupNameEn" + num).attr("name","dataGroupNameEn" + num); 
    $("#tRow" + num + " td").find("input[name='dataGroupNameEn']").attr("id", "dataGroupNameEn" + num).attr("name","dataGroupNameEn" + num); 
    $("#tRow" + num + " td").find("input[name='dataGroupNameCn']").attr("id", "dataGroupNameCn" + num).attr("name","dataGroupNameCn" + num); 
    $("#tRow" + num + " td").find("input[name='minTimes']").attr("id", "minTimes" + num).attr("name", "minTimes" + num); 
    $("#tRow" + num + " td").find("input[name='maxTimes']").attr("id", "maxTimes" + num).attr("name", "maxTimes" + num); 
    $("#tRow" + num + " td").find("input[name='sqlEtlText']").attr("id", "sqlEtlText" + num).attr("name","sqlEtlText" + num);
    $("#tRow" + num + " td").find("input[name='dataGroupNo']").attr("id", "dataGroupNo" + num).attr("name","dataGroupNo" + num);

    $("#dataGroupNameEn"+num).val($("#dataGroupNameEnC").val());
    $("#dataGroupNameCn"+num).val($("#dataGroupNameCnC").val());
    $("#minTimes"+num).val($("#minTimesC").val());
    $("#maxTimes"+num).val($("#maxTimesC").val());
    $("#sqlEtlText"+num).val($("#sqlEtlTextC").val());
   	$("#textc"+num).val($("#textCC").val());
   	$("#dataGroupNo"+num).val($("#dataGroupNoC").val());
}
//统一保存方法
function SaveButtonA(){
	//统一验证表单方法
	var tanchukuang=checkForm();
	if(tanchukuang=="true"){
	//获取formA 的值
	var serviceName=$("#serviceName").val().replace(/\s+/g,"");
	var serviceType=$("#serviceType").val();
	var serviceUrl=$("#serviceUrl").val();
	var serviceGroup=$("#serviceGroup").val();
	var dataSourceSn=$("#dataSourceSn").val();
	var description=$("#description").val();
	var opMode=$("#opMode").val();
	var dataEncode=$("#dataEncode").val();
	var resultComposit=$("#resultComposit").val();
	
	//获取formB 的值
	var strB=saveB();
	//获取formC 的值
	var strC=saveC();
	//获得sql里内容两种情况
	var sqlEtlTextC=$("#sqlEtlTextC").val();
	 jQuery.post("../externalDataServe/externalDataServeSave.html",
			 {sqlEtlTextC:sqlEtlTextC,strB:strB,strC:strC,serviceName:serviceName,serviceType:serviceType,serviceUrl:serviceUrl,serviceGroup:serviceGroup,dataSourceSn:dataSourceSn,description:description,opMode:opMode,dataEncode:dataEncode,resultComposit:resultComposit},function(e){
	      	if(e.pointOut==0){
	      			//页面离开时弹出提示框
					showMsgDialog("提示","保存记录成功!","info",function(){
						window.location.href="../externalDataServe/externalDataServeList.html";
					});
					return;
				}else{
					showMsgDialog("提示","保存记录失败!"+e.pointOut,"info",function(){
						return;
					});
				}
	      });  
	}
}
//统一保存时需要遍历循环获取每列的值
function saveC(){
	var dataGroupNameEn;
	var dataGroupNameCn;
	var minTimes;
	var maxTimes;
	var sqlEtlText;
	var dataGroupNo;
	var textc;
	var strC=[];
	var C=0;
	$("#resultTableC tr").each(function(){
		  C++;
		  //因为有克隆所以从3以后取值;
		  if(C>=3){
			   var str="";
			   textc =$(this).find("td").eq(0).find("input").eq(1).val();
			   dataGroupNameEn =$(this).find("td").eq(1).find("input").val();
			   dataGroupNameCn =$(this).find("td").eq(2).find("input").val();
			   minTimes =$(this).find("td").eq(3).find("input").val();
			   maxTimes =$(this).find("td").eq(4).find("input").val();
			   sqlEtlText=$(this).find("td").eq(5).find("input").val();
			   dataGroupNo=$(this).find("td").eq(6).find("input").val();
			   if(textc==""){
					 textc="=";
				 }
				 str=dataGroupNameEn.replace(/\s+/g,"")+",,"+dataGroupNameCn.replace(/\s+/g,"")+",,"+minTimes.replace(/\s+/g,"")+",,"+maxTimes.replace(/\s+/g,"")+",,"+sqlEtlText+",,"+textc+",,"+dataGroupNo.replace(/\s+/g,"")+",,";
				 strC.push(str);
		  }	   
		});
	return strC;
}
/*根据单个复选框的选择情况确定全选复选框是否被选中*/
function selectSingleC() {
	var k = 0;
	var oInput = document.getElementsByName("ItemC");
	for ( var i = 0; i < oInput.length; i++) {
		if (oInput[i].checked == false) {
			k = 1;
			break;
		}
	}
	if (k == 0) {
		document.getElementById("recordCheckAllC").checked = true;
	} else {
		document.getElementById("recordCheckAllC").checked = false;
	}
}
/*复选框全选或全不选效果*/
function selectAllC() {
	var oInput = document.getElementsByName("ItemC");
	for ( var i = 0; i < oInput.length; i++) {
		oInput[i].checked = document.getElementById("recordCheckAllC").checked;
	}
}
//修改保存
function SaveButtonB(){
	//统一验证表单方法
	var tanchukuang=checkForm();
	if(tanchukuang=="true"){
	//验证输入是否合法；
	//获取formA 的值
	//首先获取formA 的Id值
	var serviceDefinitionSn=$("#serviceDefinitionSn").val();
	var serviceName=$("#serviceName").val().replace(/\s+/g,"");
	var serviceType=$("#serviceType").val();
	var serviceUrl=$("#serviceUrl").val();
	var serviceGroup=$("#serviceGroup").val();
	var dataSourceSn=$("#dataSourceSn").val();
	var description=$("#description").val();
	var opMode=$("#opMode").val();
	var dataEncode=$("#dataEncode").val();
	var resultComposit=$("#resultComposit").val();
	//获取formB 的值 直接循环获得数据
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
	//获取formC 的值
	var dataGroupNameEn;
	var dataGroupNameCn;
	var minTimes;
	var maxTimes;
	var sqlEtlText;
	var dataGroupNo;
	var textc;
	var strC=[];
	var C=0;
	$("#resultTableC tr").each(function(){
		  C++;
		  //因为有克隆所以从3以后取值;
		  if(C>=3){
			   var str="";
			   textc =$(this).find("td").eq(0).find("input").eq(1).val();
			   dataGroupNameEn =$(this).find("td").eq(1).find("input").val();
			   dataGroupNameCn =$(this).find("td").eq(2).find("input").val();
			   minTimes =$(this).find("td").eq(3).find("input").val();
			   maxTimes =$(this).find("td").eq(4).find("input").val();
			   sqlEtlText=$(this).find("td").eq(5).find("input").val();
			   dataGroupNo=$(this).find("td").eq(6).find("input").val();
			   if(textc==""){
					 textc="=";
				 }
				 str=dataGroupNameEn.replace(/\s+/g,"")+",,"+dataGroupNameCn.replace(/\s+/g,"")+",,"+minTimes.replace(/\s+/g,"")+",,"+maxTimes.replace(/\s+/g,"")+",,"+sqlEtlText+",,"+textc+",,"+dataGroupNo.replace(/\s+/g,"")+",,";
				 strC.push(str);
		  }	   
		});
	//获得sql里内容两种情况
	var sqlEtlTextC=$("#sqlEtlTextC").val();
	 jQuery.post("../externalDataServe/externalDataServeUpdate.html",
			 {serviceDefinitionSn:serviceDefinitionSn,sqlEtlTextC:sqlEtlTextC,strB:strB,strC:strC,serviceName:serviceName,serviceType:serviceType,serviceUrl:serviceUrl,serviceGroup:serviceGroup,dataSourceSn:dataSourceSn,description:description,opMode:opMode,dataEncode:dataEncode,resultComposit:resultComposit},function(e){
	      	if(e.pointOut==0){
	      			//页面离开时弹出提示框
					showMsgDialog("提示","保存记录成功!","info",function(){
						window.location.href="../externalDataServe/externalDataServeList.html";
					});
					return;
				}else {
					showMsgDialog("提示","保存记录失败!","info",function(){
						return;
					});
				}
	      });  
	}
}
//修改效果
function UpdateButtonA(){
	var serviceDefinitionSn=$("#serviceDefinitionSn").val();
	if(serviceDefinitionSn==""){
		showMsgDialog("提示","请选择要修改的数据!","info",function(){
  			return;
  			});
  		return;
	}
	$("#saveB").css("display","");
	$("#cancelA").css("display","");
}
//B模块单独删除
function DeleteButtonB(){
	if($("input[name='ItemB']:checked").length==0){
		showMsgDialog("提示","请选择要删除的数据!","info",function(){
			return;
		});
		return;
	}
	showMsgDialog("删除","您确定要删除所选记录的数据吗?","confirm",function(){
		 $("input[name='ItemB']:checked").each(function(){
			 $("input[name='ItemB']:checked").closest('tr').remove();
	      });
	});
}
//C模块单独删除
function DeleteButtonC(){
	if($("input[name='ItemC']:checked").length==0){
		showMsgDialog("提示","请选择要删除的数据!","info",function(){
			return;
		});
		return;
	}
	showMsgDialog("删除","您确定要删除所选记录的数据吗?","confirm",function(){
		 $("input[name='ItemC']:checked").each(function(){
			 $("input[name='ItemC']:checked").closest('tr').remove();
	      });
	});
}
function checkForm(){
	var returnBack="false";
	//A表单验证--开始
	var serviceName=$("#serviceName").val();
	var serviceType=$("#serviceType").val();
	var serviceUrl=$("#serviceUrl").val();
	var serviceGroup=$("#serviceGroup").val();
	var dataSourceSn=$("#dataSourceSn").val();
	var opMode=$("#opMode").val();
	var dataEncode=$("#dataEncode").val();
	var resultComposit=$("#resultComposit").val();
	if(serviceName=="" || serviceName.replace(/\s+/g,"").length==0){
		showMsgDialog("提示","接口名称不能为空或空格!","info",function(){
			return;
		});
		return;
	}
	if(serviceType==""){
		showMsgDialog("提示","接口类型不能为空!","info",function(){
			return;
		});
		return;
	}
	if(serviceUrl==""|| serviceUrl.replace(/\s+/g,"").length==0){
		showMsgDialog("提示","服务URL不能为空或空格!","info",function(){
			return;
		});
		return;
	}
	if(serviceGroup==""){
		showMsgDialog("提示","接口分组不能为空!","info",function(){
			return;
		});
		return;
	}
	if(dataSourceSn==""){
		showMsgDialog("提示","选择数据源不能为空!","info",function(){
			return;
		});
		return;
	}
	if(opMode==""){
		showMsgDialog("提示","操作方式不能为空!","info",function(){
			return;
		});
		return;
	}
	if(dataEncode==""){
		showMsgDialog("提示","数据编码不能为空!","info",function(){
			return;
		});
		return;
	}
	if(resultComposit==""){
		showMsgDialog("提示","返回值结构不能为空!","info",function(){
			return;
		});
		return;
	}
	//A表单验证--结束
	//B表单验证--开始
	var B=0;
	//no为空 no不是数字 名称为空 类型不能为空 最小次数为空或者不为数字 最大次数为空或者不为数据 
	var paramNoNull=0;
	var paramNoNan=0;
	var paramNameNull=0;
	var paramTypeNull=0;
	var minTimesNull=0;
	var minTimesNan=0;
	var maxTimesNull=0;
	var maxTimesNan=0;
	
	var paramNo;
	var paramName;
	var paramType;
	var minTimes;
	var maxTimes;
	$("#inputTable tr").each(function(){
	  B++;
	  if(B>=3){
		  paramNo=$(this).find("td").eq(1).find("input").val();
		  paramName=$(this).find("td").eq(2).find("input").val();
		  paramType=$(this).find("td").eq(3).find("select").val();
		  minTimes=$(this).find("td").eq(4).find("input").val();
		  maxTimes=$(this).find("td").eq(5).find("input").val();
		  if(paramNo=="" ||paramNo.replace(/\s+/g,"").length==0){
			  paramNoNull++; 
		  }
		  if(isNaN(paramNo)){
			  paramNoNan++;
		  }
		  if(paramName==""||paramName.replace(/\s+/g,"").length==0){
			  paramNameNull++; 
		  }
		  if(paramType==""||paramType.replace(/\s+/g,"").length==0){
			  paramTypeNull++; 
		  }
		  if(minTimes=="" ||minTimes.replace(/\s+/g,"").length==0){
			  minTimesNull++; 
		  }
		  if(isNaN(minTimes)){
			  minTimesNan++;
		  }
		  if(maxTimes==""||maxTimes.replace(/\s+/g,"").length==0){
			  maxTimesNull++; 
		  }
//		  if(isNaN(maxTimes)){
//			  maxTimesNan++;
//		  }
	  }
	});
	if(paramNoNull>0){
		showMsgDialog("提示","输入结果的NO输入不能为空或空格!","info",function(){
			return;
		});
		return;
	}
	if(paramNoNan>0){
		showMsgDialog("提示","输入结果的NO有非数字存在!","info",function(){
			return;
		});
		return;
	}
	if(paramNameNull>0){
		showMsgDialog("提示","输入结果的名称输入不能为空或空格!","info",function(){
			return;
		});
		return;
	}
	if(paramTypeNull>0){
		showMsgDialog("提示","输入结果的类型输入不能为空或空格!","info",function(){
			return;
		});
		return;
	}
	if(minTimesNull>0){
		showMsgDialog("提示","输入结果的最小次数输入不能为空或空格!","info",function(){
			return;
		});
		return;
	}
	if(minTimesNan>0){
		showMsgDialog("提示","输入结果的最小次数有非数字存在!","info",function(){
			return;
		});
		return;
	}
	if(maxTimesNull>0){
		showMsgDialog("提示","输入结果的最大次数输入不能为空或空格!","info",function(){
			return;
		});
		return;
	}
//	if(maxTimesNan>0){
//		showMsgDialog("提示","输入结果的最大次数有非数字存在!","info",function(){
//			return;
//		});
//		return;
//	}
	//B表单验证--结束
	//C表单验证--开始
	//获取formC 的值
	var dataGroupNameEnNull=0;
	var dataGroupNameCnNull=0;
	var minTimescNull=0;
	var minTimescNan=0;
	var maxTimescNull=0;
	var maxTimescNan=0;
	var sqlEtlTextNull=0;
	var dataGroupNoNull=0;
	var dataGroupNoNan=0;
	
	var dataGroupNameEn;
	var dataGroupNameCn;
	var minTimesc;
	var maxTimesc;
	var sqlEtlText;
	var dataGroupNo;
	var C=0;
	$("#resultTableC tr").each(function(){
		  C++;
		  //因为有克隆所以从3以后取值;
		  if(C>=3){
			   dataGroupNameEn =$(this).find("td").eq(1).find("input").val();
			   dataGroupNameCn =$(this).find("td").eq(2).find("input").val();
			   minTimesc =$(this).find("td").eq(3).find("input").val();
			   maxTimesc =$(this).find("td").eq(4).find("input").val();
			   sqlEtlText=$(this).find("td").eq(5).find("input").val();
			   dataGroupNo=$(this).find("td").eq(6).find("input").val();
			   if(dataGroupNameEn==""||dataGroupNameEn.replace(/\s+/g,"").length==0){
				   dataGroupNameEnNull++; 
				  }
				  if(dataGroupNameCn==""||dataGroupNameCn.replace(/\s+/g,"").length==0){
					  dataGroupNameCnNull++; 
				  }
				  if(minTimesc==""||minTimesc.replace(/\s+/g,"").length==0){
					  minTimescNull++; 
				  }
				  if(isNaN(minTimesc)){
					  minTimescNan++;
				  }
				  if(maxTimesc=="" ||maxTimesc.replace(/\s+/g,"").length==0){
					  maxTimescNull++; 
				  }
//				  if(isNaN(maxTimesc)){
//					  maxTimescNan++;
//				  }
				  if(sqlEtlText==""||sqlEtlText.replace(/\s+/g,"").length==0){
					  sqlEtlTextNull++; 
				  }
				  if(dataGroupNo==""||dataGroupNo.replace(/\s+/g,"").length==0){
					  dataGroupNoNull++; 
				  }
				  if(isNaN(dataGroupNo)){
					  dataGroupNoNan++;
				  }
		  }   
		});
	if($("#resultComposit").val()=="S002" && dataGroupNameEnNull>0){
		showMsgDialog("提示","输出结果的数据组名称输入不能为空或空格!","info",function(){
			return;
		});
		return;
	}
	if($("#resultComposit").val()=="S002" && dataGroupNameCnNull>0){
		showMsgDialog("提示","输出结果的数据组描述输入不能为空或空格!","info",function(){
			return;
		});
		return;
	}
	if($("#resultComposit").val()=="S002" && minTimescNull>0){
		showMsgDialog("提示","输出结果的最小次数输入不能为空或空格!","info",function(){
			return;
		});
		return;
	}
	if($("#resultComposit").val()=="S002" && minTimescNan>0){
		showMsgDialog("提示","输出结果的最小次数有非数字存在!","info",function(){
			return;
		});
		return;
	}if($("#resultComposit").val()=="S002" && maxTimescNull>0){
		showMsgDialog("提示","输出结果的最大次数输入不能为空或空格!","info",function(){
			return;
		});
		return;
	}
//	if(maxTimescNan>0){
//		showMsgDialog("提示","输出结果的最大次数有非数字存在!","info",function(){
//			return;
//		});
//		return;
//	}
	if($("#resultComposit").val()=="S002" && sqlEtlTextNull>0){
		showMsgDialog("提示","输出结果的SQL输入不能为空或空格!","info",function(){
			return;
		});
		return;
	}if($("#resultComposit").val()=="S002" && dataGroupNoNull>0){
		showMsgDialog("提示","输出结果的数据组序号输入不能为空或空格!","info",function(){
			return;
		});
		return;
	}if($("#resultComposit").val()=="S002" && dataGroupNoNan>0){
		showMsgDialog("提示","输出结果的数据组序号有非数字存在!","info",function(){
			return;
		});
		return;
	}
	//C表单验证--结束
	//C输入框值是否可以为空
	if($("#resultComposit").val()=="S001" && $("#sqlEtlTextC").val()==""){
		showMsgDialog("提示","输出结果的SQL内容不能为空!","info",function(){
			return;
		});
		return;
	}
	//alert($("#sqlEtlTextC").val().replace(/\s+/g,"").length);
	//判断B表单和C表单不能为空
	if($("#resultComposit").val()=="S002" && B<=2){
		showMsgDialog("提示","输入表单内容不能整体为空!","info",function(){
			return;
		});
		return;
	}
	if($("#resultComposit").val()=="S002" && C<=2){
		showMsgDialog("提示","输出表单内容不能整体为空!","info",function(){
			return;
		});
		return;
	}
	returnBack="true";
	return  returnBack;
}
