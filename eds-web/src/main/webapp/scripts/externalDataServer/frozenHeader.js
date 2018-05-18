(function(jQuery)
{ 
	if(jQuery.browser) return; 

	jQuery.browser = {}; 
	jQuery.browser.mozilla = false; 
	jQuery.browser.webkit = false; 
	jQuery.browser.opera = false; 
	jQuery.browser.msie = false; 

	var nAgt = navigator.userAgent; 
	jQuery.browser.name = navigator.appName; 
	jQuery.browser.fullVersion = ''+parseFloat(navigator.appVersion); 
	jQuery.browser.majorVersion = parseInt(navigator.appVersion,10);
	
	var nameOffset,verOffset,ix; 

	// In Opera, the true version is after "Opera" or after "Version" 
	if ((verOffset=nAgt.indexOf("Opera"))!=-1) 
	{ 
		jQuery.browser.opera = true; 
		jQuery.browser.name = "Opera"; 
		jQuery.browser.fullVersion = nAgt.substring(verOffset+6);
		
		if ((verOffset=nAgt.indexOf("Version"))!=-1) 
			jQuery.browser.fullVersion = nAgt.substring(verOffset+8); 
	} 
	// In MSIE, the true version is after "MSIE" in userAgent 
	else if ((verOffset=nAgt.indexOf("MSIE"))!=-1) 
	{ 
		jQuery.browser.msie = true; 
		jQuery.browser.name = "Microsoft Internet Explorer"; 
		jQuery.browser.fullVersion = nAgt.substring(verOffset+5); 
	} 
	// In Chrome, the true version is after "Chrome" 
	else if ((verOffset=nAgt.indexOf("Chrome"))!=-1) 
	{ 
		jQuery.browser.webkit = true; 
		jQuery.browser.name = "Chrome"; 
		jQuery.browser.fullVersion = nAgt.substring(verOffset+7); 
	} 
	// In Safari, the true version is after "Safari" or after "Version" 
	else if ((verOffset=nAgt.indexOf("Safari"))!=-1) 
	{ 
		jQuery.browser.webkit = true; 
		jQuery.browser.name = "Safari"; 
		jQuery.browser.fullVersion = nAgt.substring(verOffset+7); 
		
		if ((verOffset=nAgt.indexOf("Version"))!=-1) 
			jQuery.browser.fullVersion = nAgt.substring(verOffset+8); 
	} 
	// In Firefox, the true version is after "Firefox" 
	else if ((verOffset=nAgt.indexOf("Firefox"))!=-1) 
	{ 
		jQuery.browser.mozilla = true; 
		jQuery.browser.name = "Firefox"; 
		jQuery.browser.fullVersion = nAgt.substring(verOffset+8); 
	} 
	// In most other browsers, "name/version" is at the end of userAgent 
	else if ( (nameOffset=nAgt.lastIndexOf(' ')+1) < (verOffset=nAgt.lastIndexOf('/')) ) 
	{ 
		jQuery.browser.name = nAgt.substring(nameOffset,verOffset); 
		jQuery.browser.fullVersion = nAgt.substring(verOffset+1); 
		if (jQuery.browser.name.toLowerCase()==jQuery.browser.name.toUpperCase()) 
		{ 
			jQuery.browser.name = navigator.appName; 
		} 
	}
	
	// trim the fullVersion string at semicolon/space if present 
	if ((ix=jQuery.browser.fullVersion.indexOf(";"))!=-1) 
		jQuery.browser.fullVersion=jQuery.browser.fullVersion.substring(0,ix); 
	if ((ix=jQuery.browser.fullVersion.indexOf(" "))!=-1) 
		jQuery.browser.fullVersion=jQuery.browser.fullVersion.substring(0,ix); 

	jQuery.browser.majorVersion = parseInt(''+jQuery.browser.fullVersion,10);
	
	if (isNaN(jQuery.browser.majorVersion)) 
	{ 
		jQuery.browser.fullVersion = ''+parseFloat(navigator.appVersion); 
		jQuery.browser.majorVersion = parseInt(navigator.appVersion,10); 
	}
	
	jQuery.browser.version = jQuery.browser.majorVersion; 
})(jQuery); 

function FixTable(TableID, FixColumnNumber, width, height) 
{
	if ($("#" + TableID + "_tableLayout").length != 0) 
	{
		$("#" + TableID + "_tableLayout").before($("#" + TableID));
		$("#" + TableID + "_tableLayout").empty();
	}
	else 
	{
		$("#" + TableID).after("<div id='" + TableID + "_tableLayout' style='overflow:hidden;height:" + height + "px; width:" + width + "px;'></div>");
	}
	
	$('<div id="' + TableID + '_tableFix"></div>'
	+ '<div id="' + TableID + '_tableHead"></div>'
	+ '<div id="' + TableID + '_tableColumn"></div>'
	+ '<div id="' + TableID + '_tableData"></div>').appendTo("#" + TableID + "_tableLayout");

	var oldtable = $("#" + TableID);
	var tableFixClone = oldtable.clone(true);

	tableFixClone.attr("id", TableID + "_tableFixClone");
	$("#" + TableID + "_tableFix").append(tableFixClone);
	
	var tableHeadClone = oldtable.clone(true);
	tableHeadClone.attr("id", TableID + "_tableHeadClone");
	$("#" + TableID + "_tableHead").append(tableHeadClone);
	
	var tableColumnClone = oldtable.clone(true);
	tableColumnClone.attr("id", TableID + "_tableColumnClone");
	$("#" + TableID + "_tableColumn").append(tableColumnClone);
	$("#" + TableID + "_tableData").append(oldtable);
	$("#" + TableID + "_tableLayout table").each(function () 
	{
		$(this).css("margin", "0");
	});
	
	var HeadHeight = $("#" + TableID + "_tableHead thead").height();
	HeadHeight += 2;
	$("#" + TableID + "_tableHead").css("height", HeadHeight);
	$("#" + TableID + "_tableFix").css("height", HeadHeight);
	
	var ColumnsWidth = 0;
	var ColumnsNumber = 0;
	
	var currentTableTdEveryTr = $("#outlineTab").find("tr:eq(0)").children().size();
	
	if(currentTableTdEveryTr > 2)
	{
		$("#" + TableID + "_tableColumn tr:last td:lt(" + FixColumnNumber + ")").each(function () {
			ColumnsWidth += $(this).outerWidth(true);
			ColumnsNumber++;
		});
	}
	
	ColumnsWidth += 2;
	
	if ($.browser.msie) 
	{
		switch ($.browser.version) 
		{
			case 7:
				if (ColumnsNumber >= 3) ColumnsWidth--;
				break;
			case 8:
				if (ColumnsNumber >= 2) ColumnsWidth--;
				break;
		}
	}
	
	$("#" + TableID + "_tableColumn").css("width", ColumnsWidth - 11);
	$("#" + TableID + "_tableFix").css("width", ColumnsWidth - 10);
	$("#" + TableID + "_tableData").scroll(function () 
	{
		$("#" + TableID + "_tableHead").scrollLeft($("#" + TableID + "_tableData").scrollLeft());
		$("#" + TableID + "_tableColumn").scrollTop($("#" + TableID + "_tableData").scrollTop());
	});
	
	$("#" + TableID + "_tableFix").css({ "overflow": "hidden", "position": "relative", "z-index": "50", "background-color": "Silver" });
	$("#" + TableID + "_tableHead").css({ "overflow": "hidden", "width": width - 17, "position": "relative", "z-index": "45", "background-color": "Silver" });
	$("#" + TableID + "_tableColumn").css({ "overflow": "hidden", "height": height - 17, "position": "relative", "z-index": "40", "background-color": "Silver" });
	$("#" + TableID + "_tableData").css({ "overflow": "scroll", "width": width, "height": height, "position": "relative", "z-index": "35" });
	
	if ($("#" + TableID + "_tableHead").width() > $("#" + TableID + "_tableFix table").width()) 
	{
		//$("#" + TableID + "_tableHead").css("width", $("#" + TableID + "_tableFix table").width());
		//$("#" + TableID + "_tableData").css("width", $("#" + TableID + "_tableFix table").width() + 17);
	}
	if ($("#" + TableID + "_tableColumn").height() > $("#" + TableID + "_tableColumn table").height()) 
	{
		//$("#" + TableID + "_tableColumn").css("height", $("#" + TableID + "_tableColumn table").height());
		//$("#" + TableID + "_tableData").css("height", $("#" + TableID + "_tableColumn table").height() + 17);
		//$("#" + TableID + "_tableHead").css("height", $("#" + TableID + "_tableFix table").height());
	}
	
	$("#" + TableID + "_tableFix").offset($("#" + TableID + "_tableLayout").offset());
	$("#" + TableID + "_tableHead").offset($("#" + TableID + "_tableLayout").offset());
	$("#" + TableID + "_tableColumn").offset($("#" + TableID + "_tableLayout").offset());
	$("#" + TableID + "_tableData").offset($("#" + TableID + "_tableLayout").offset());
}