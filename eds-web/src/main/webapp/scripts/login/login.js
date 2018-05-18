$(function(){
	$("#j_username").focus();
	$("#loginForm").validationEngine();
	$("#loginIn").click(function(){
		var unVal = $("#j_username").val();
		var pwVal = $("#j_password").val();
		if(unVal == null || unVal == "")
	    {
		   $("#j_username").focus();
	    }
	    else if(pwVal == null || pwVal == "")
	    {
		   $("#j_password").focus();
	    }
	});
	
	var userName = '${userName}';
	
	var errorMessageTips = '${errorMessageTips}';
	
	var status = '${status}';
    
    if(userName.indexOf('&#64;') >= 0)
	{
		userName = userName.substring(0,userName.indexOf('&#64;'));
	}
    
    if(status != null && status != "" && status == "error")
	{
    	if(userName != null && userName != "")
		{
    		errorUrlTips({"userName":userName,"errorMessage":errorMessageTips});	    		
		}
	}
});

function errorUrlTips(data)
{
	if(data == null || data == undefined)
	{
		return false;
	}
	
	$.ajax(
		{
			   type: "GET",
			   cache: false,
			   url: "login.html",
			   data: "status=errorLog" + "&userName=" + data.userName + "&errorMessage=" + data.errorMessage
		});
}


