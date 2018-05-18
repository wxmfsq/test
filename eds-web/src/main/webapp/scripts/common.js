/**
 * 提示框
 */
function showMsg(title, msg, specicalWidth, isClose, func) {
	var w = 330;
	// 如果调用该提示方法时传入提示框宽度则使用给定的宽度
	if (specicalWidth != undefined) {
		w = specicalWidth;
	}
	$("#alertMessage").html(
			"<div id='msgBody' style='height:80px;line-height:80px;text-align:center;'>"
					+ msg + "</div>").dialog({
		title : title,
		autoOpen : true,
		modal : true,
		width : w,
		bgiframe : true,
		resizable : false,
		close : function(event, ui) {
			if (isClose) {
				eval(func);
			}
		}
	});
}

function showMsgDialog(title, msg, type, func, myButtons, specicalWidth) {
	var w = 330;
	// 如果调用该提示方法时传入提示框宽度则使用给定的宽度
	if (specicalWidth) {
		w = specicalWidth;
	}
	var opt;
	// 带操作的提示框
	if (type == "info") {
		opt = {
			title : title,
			autoOpen : true,
			modal : true,
			width : w,
			bgiframe : true,
			resizable : false,
			close : function() {
				if (func) {
					func();
				}
			},
			buttons : {
				"确定" : function() {
					$(this).dialog("close");
					if (func) {
						func();
					}
				}
			}
		}
	}
	// 确认提示框
	else if (type == "confirm") {
		opt = {
			title : title,
			autoOpen : true,
			modal : true,
			width : w,
			bgiframe : true,
			resizable : false,
			buttons : {
				"确定" : function() {
					$(this).dialog("close");
					if (func) {
						func();
					}
				},
				"取消" : function() {
					$(this).dialog("close");
				}
			}
		}
	}
	// 自定义提示框
	else if (type == "custom") {
		opt = {
			title : title,
			autoOpen : true,
			modal : true,
			width : w,
			bgiframe : true,
			resizable : false,
			buttons : myButtons
		}
	}
	$("#alertMessage").html(
			"<div id='msgBody' style='height:80px;line-height:80px;text-align:center;'>"
					+ msg + "</div>").dialog(opt);
}

/**
 * json对象转化为json字符串(低版本浏览器 eg：ie6，ie7... etc)
 */
function changeIntoStringLowerVersion(data) {
	if (data == null) {
		return data;
	} else if (data == undefined) {
		return data;
	} else if (data == "") {
		return '"' + data + '"';
	}

	var res = [];

	if (typeof (data) == "string") {
		return "\""
				+ data.replace(/([\'\"\\])/g, "\\$1").replace(/(\n)/g, "\\n")
						.replace(/(\r)/g, "\\r").replace(/(\t)/g, "\\t") + "\"";
	}

	if (typeof (data) == "object") {
		if (!data.sort) {
			for ( var i in data) {
				res.push('"' + i + '"' + ":"
						+ changeIntoStringLowerVersion(data[i]));
			}

			res = "{" + res.join() + "}";
		} else {
			for (var i = 0; i < data.length; i++) {
				res.push(changeIntoStringLowerVersion(data[i]));
			}

			res = "[" + res.join() + "]";
		}

		return res;
	}

	return data.toString();
}

/**
 * json对象转化为json字符串
 */
function changeIntoString(data) {
	if (data != null && data != "" && data != undefined
			&& typeof (data) == "object") {
		data = JSON.stringify(data);
	}

	return data;
}
/**
 * 隐藏上栏菜单
 */
function hideTopMenu() {
	$("#topMenu").hide();
}

/**
 * 隐藏左侧菜单
 */
function hideLeftMenu() {
	$("#leftMenu").hide();
	$("#rightContent").hide();
	$("#hideContent").show();
}
