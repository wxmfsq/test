function firstPage(form)
{
	var uh=$("#updatehelp").val();  
	if(uh=="true"){
		 //判断是否有修改	
				$("#dialogDiv").dialog();
				$("#dialogDiv").dialog({
				autoOpen : false,   // 是否自动弹出窗口
				modal : true,    // 设置为模态对话框
				resizable : true,
				width : 410,   //弹出框宽度
				height : 240,   //弹出框高度
				title : "提示信息",  //弹出框标题
				position : "center", //窗口显示的位置
				buttons:{
				'确定':function(){
				//调用保存的方法
					updateform();
					form.jumpToPage.value = 1;
				    form.submit();
			    	$(this).dialog("close");
				},
				'否':function(){
					form.jumpToPage.value = 1;
				    form.submit();
					$(this).dialog("close");
				},
				'取消':function(){	
				$(this).dialog("close");
				}
				}
				});
	}else{
		
		form.jumpToPage.value = 1;
	    form.submit();
	}
    
}

function prevPage(form)
{
	
	var uh=$("#updatehelp").val();  
	if(uh=="true"){
		 //判断是否有修改	
				$("#dialogDiv").dialog();
				$("#dialogDiv").dialog({
				autoOpen : false,   // 是否自动弹出窗口
				modal : true,    // 设置为模态对话框
				resizable : true,
				width : 410,   //弹出框宽度
				height : 240,   //弹出框高度
				title : "提示信息",  //弹出框标题
				position : "center", //窗口显示的位置
				buttons:{
				'确定':function(){
				//调用保存的方法
					updateform();
					var cp = parseInt(form.currentPage.value, 10);
				    form.reset();
				    if(cp <= 1)
				        form.jumpToPage.value = 1;
				    else
				        form.jumpToPage.value = cp - 1;
				    form.submit();
			    	$(this).dialog("close");
				},
				'否':function(){
					var cp = parseInt(form.currentPage.value, 10);
				    //alert(cp);
				    form.reset();
				    if(cp <= 1)
				        form.jumpToPage.value = 1;
				    else
				        form.jumpToPage.value = cp - 1;
				    form.submit();
					$(this).dialog("close");
				},
				'取消':function(){	
				$(this).dialog("close");
				}
				}
				});
	}else{
		
		var cp = parseInt(form.currentPage.value, 10);
	    form.reset();
	    if(cp <= 1)
	        form.jumpToPage.value = 1;
	    else
	        form.jumpToPage.value = cp - 1;
	    form.submit();
	}
    
}
//验证是否修改保存
function updatehelp(uh){
	
    if(uh=="true"){
    	
	$("#dialogDiv").dialog();
	$("#dialogDiv").dialog({
	autoOpen : false,   // 是否自动弹出窗口
	modal : true,    // 设置为模态对话框
	resizable : true,
	width : 410,   //弹出框宽度
	height : 240,   //弹出框高度
	title : "提示信息",  //弹出框标题
	position : "center", //窗口显示的位置
	buttons:{
	'确定':function(){
	//调用保存的方法
    	
    	$(this).dialog("close");
	},
	'否':function(){
		
		$(this).dialog("close");
	},
	'取消':function(){	
	$(this).dialog("close");
	}
	}
	});
	}
    
}
function nextPage(form)
{	
	var uh=$("#updatehelp").val();
	if(uh=="true"){
		 //判断是否有修改	
				$("#dialogDiv").dialog();
				$("#dialogDiv").dialog({
				autoOpen : false,   // 是否自动弹出窗口
				modal : true,    // 设置为模态对话框
				resizable : true,
				width : 410,   //弹出框宽度
				height : 240,   //弹出框高度
				title : "提示信息",  //弹出框标题
				position : "center", //窗口显示的位置
				buttons:{
				'确定':function(){
				//调用保存的方法
					updateform();
					nextPage1(form);
			    	$(this).dialog("close");
				},
				'否':function(){
					nextPage1(form);
					$(this).dialog("close");
				},
				'取消':function(){	
				$(this).dialog("close");
				}
				}
				});
	}else{
		nextPage1(form);
	}
}
function nextPage1(form)
{	
	var cp = parseInt(form.currentPage.value, 10);
    var tp = parseInt(form.totalPage.value, 10);
    form.reset();
    if(cp >= tp)
        form.jumpToPage.value = tp;
    else
        form.jumpToPage.value = cp + 1;
    form.submit();
    
}
function lastPage(form)
{
	
	var uh=$("#updatehelp").val();  
	if(uh=="true"){
		 //判断是否有修改	
				$("#dialogDiv").dialog();
				$("#dialogDiv").dialog({
				autoOpen : false,   // 是否自动弹出窗口
				modal : true,    // 设置为模态对话框
				resizable : true,
				width : 410,   //弹出框宽度
				height : 240,   //弹出框高度
				title : "提示信息",  //弹出框标题
				position : "center", //窗口显示的位置
				buttons:{
				'确定':function(){
				//调用保存的方法
					updateform();
					form.reset();
				    form.jumpToPage.value = form.totalPage.value;
				    form.submit();
			    	$(this).dialog("close");
				},
				'否':function(){
					form.reset();
				    form.jumpToPage.value = form.totalPage.value;
				    form.submit();
					$(this).dialog("close");
				},
				'取消':function(){	
				$(this).dialog("close");
				}
				}
				});
	}else{
		
		form.reset();
	    form.jumpToPage.value = form.totalPage.value;
	    form.submit();
	}
    
}

function jumpTo(form, pageNo)
{
    form.reset();
    var tp = parseInt(form.totalPage.value, 10);
    try
    {
        var inpVal = parseInt(pageNo.value, 10);
        if(isNaN(inpVal) || inpVal < 1)
        {
            var msg = "请输入正确的页码！";
            showMsgDialog("提示",msg,"info",function(){});
//            var err = new Error(msg);
//            if(!err.message)
//            {
//                err.message = msg;
//            }
//            throw err;
        }
        else if(inpVal > tp)
        {
            var msg = "输入的页码超过总页数，请重新输入！";
            showMsgDialog("提示",msg,"info",function(){});
//            var err = new Error(msg);
//            if(!err.message)
//            {
//                err.message = msg;
//            }
//            throw err;
        }
        else
        {
            form.reset();
            pageNo.value = inpVal;
            form.jumpToPage.value = inpVal;
            form.submit();
        }
    }
    catch(e)
    {
        pageNo.focus();
        pageNo.select();
    }
}

function toggleMenu(item)
{
    var parent = $(item).parent();
    if(parent.hasClass('closed'))
        parent.removeClass('closed');
    else
        parent.addClass('closed');
}

//checkbox选择
function checkParent(){
    var children = document.getElementsByName("childrenBox");
    var parent = document.getElementById("parentBox");
    var tempState=parent.checked;
    for(i=0;i<children.length;i++) {
        if(children[i].checked!=tempState)
            children[i].click();
     }
}
function checkChildren() {
     var children = document.getElementsByName("childrenBox");
     var parent = document.getElementById("parentBox");
     for(var i=0; i<children.length; i++) {
         if(!children[i].checked) {
             parent.checked = false;
         return;
         }
     }
     parent.checked = true;
}


function jumpToPage(form, pageNo)
{
	
	var uh=$("#updatehelp").val();
   
	if(uh=="true"){
		 //判断是否有修改	
				$("#dialogDiv").dialog();
				$("#dialogDiv").dialog({
				autoOpen : false,   // 是否自动弹出窗口
				modal : true,    // 设置为模态对话框
				resizable : true,
				width : 410,   //弹出框宽度
				height : 240,   //弹出框高度
				title : "提示信息",  //弹出框标题
				position : "center", //窗口显示的位置
				buttons:{
				'确定':function(){
				//调用保存的方法
					updateform();
					jumpToPage1(form, pageNo);
			    	$(this).dialog("close");
				},
				'否':function(){
					jumpToPage1(form, pageNo);
					$(this).dialog("close");
				},
				'取消':function(){	
				$(this).dialog("close");
				}
				}
				});
	}else{
		
		jumpToPage1(form, pageNo);
	}
}
function jumpToPage1(form, pageNo)
{
	var num = pageNo.value;
    form.reset();
    var tp = parseInt(form.totalPage.value, 10);
    try
    {
        var inpVal = parseInt(num, 10);
        if(isNaN(inpVal) || inpVal < 1)
        {
            var msg = "请输入正确的页码！";
            showMsgDialog("提示",msg,"info",function(){});
//            var err = new Error(msg);
//            if(!err.message)
//            {
//                err.message = msg;
//            }
//            throw err;
        }
        else if(inpVal > tp)
        {
        	var msg = "输入的页码超过总页数，请重新输入！";
            showMsgDialog("提示",msg,"info",function(){});
//            var err = new Error(msg);
//            if(!err.message)
//            {
//                err.message = msg;
//            }
//            throw err;
        }
        else
        {
            form.reset();
            form.jumpToPage.value = inpVal;
            form.submit();
        }
    }
    catch(e)
    {
    	alert(e);
        pageNo.focus();
        pageNo.select();
    }
}

$(function(){
	//处理按回车键提交表单
	$("#jumpToInput").keypress(function (e) {
		var keyCode = e.keyCode ? e.keyCode : e.which ? e.which : e.charCode;
		if (keyCode == 13){
			//Author moyufeng
			//Date 2014/6/23 16:26
			//[BUG]0045337 MODIFY BEGIN
			$(".datatable-paging-jump-go").click();
			//[BUG]0045337 MODIFY END
		}else{
			 return true;
		}
	});
	
	//处理ajax请求session过期后跳转
	$.ajaxSetup({   
      contentType:"application/x-www-form-urlencoded;charset=utf-8",   
      cache:false ,   
      complete:function(XHR,TS){   
	        var resText=XHR.responseText;
	        if(XHR.status=="401"){ 
	        	 window.top.location.href = "../security/login.html";
	        }   
      }   
  });   

});
$(function(e){
	$(".tbody tr").click(function(e){
		var l = $(this).find("input[type=checkbox]").length;
		if(l>0){
			$(this).find("input[type=checkbox]").get(0).click();
		}
	});
});