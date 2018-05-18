var objServiceTr = null;
var objServiceFilter = null;
var isValidIpFlag = null;
var classFlag = "ipValidation";
var isRepeatAdd = null;
var isRepeat = null;

$(function() {
	$(".serviceFilter").click(function() {
		selServiceGround($(this));
	});

	var inp = $("input[name='ix']:checked").parent().parent().find(
			"td > input[name='ipInput']");
	var addInp = $(".addServiceTrEl").find("td > input[name='ipAddInput']");

	inp.keyup(function() {
		removeValidation($(this));
	});

	addInp.keyup(function() {
		removeValidation($(this));
	});

	$("#ipSelect").keyup(function(event) {
		if (event.keyCode == 13) {
			ipSelect();
		}
	});

	var systemAccountTab = $("#systemAccountTab").find("tr:eq(0)");

	if (systemAccountTab.size() > 0) {
		selServiceDef(systemAccountTab[0]);
	}
});

function cancelValidation(obj) {
	removeValidation($(obj));
}

function removeValidation(obj) {
	obj.removeClass("inpBorder");
}

function addValidation(obj) {
	obj.addClass("inpBorder");
}

function privilegeSave() {
	var groupObjs = $("input[name='itemGroupService']:checked");
	var serObjs = $("input[name='itemService']:checked");
	var serGroupObjs = serObjs.next();
	var userSel = $(".selBackGround").find("td[class='accountSn']");

	var groupObjArr = getInputArray(groupObjs);
	var serObjArr = getInputArray(serObjs);
	var serGroupObjArr = getInputArray(serGroupObjs);
	var userSelSn = userSel.text();

	if (userSel.size() == 0) {
		showMsgDialog("提示", "请选择用户", "info", function() {
			return;
		});

		return;
	}

	if (groupObjs.size() == 0 && serObjs.size() == 0) {
		showMsgDialog("提示", "没有需要保存的权限内容", "info", function() {
			return;
		});

		return;
	}

	$
			.ajax({
				type : "POST",
				url : "../externalDataServe/savePrivilege.html",
				cache : false,
				dataType : "json",
				data : {
					"groupObjArr" : groupObjArr,
					"serObjArr" : serObjArr,
					"serGroupObjArr" : serGroupObjArr,
					"userSelSn" : userSelSn
				},
				error : function(XMLHttpRequest, textStatus, errorThrown) {
					showMsgDialog("提示", "保存失败" + " " + errorThrown, "info",
							function() {
								return;
							});
				},
				success : function(data) {
					var systemPrivileges = data.systemPrivileges;

					clearSel();

					if (systemPrivileges != null
							&& systemPrivileges.length != 0) {
						for ( var i = 0; i < systemPrivileges.length; i++) {
							var priType = systemPrivileges[i].privilegeType;
							var priDefinition = systemPrivileges[i].privilegeDefinition;

							if (priType == '0') {
								var serObj = $("#" + priDefinition
										+ "definitionPrimaryId")[0];

								serObj.checked = true;
								selectRelated(serObj);
							} else if (priType = '1') {
								var groupObj = $("#" + priDefinition
										+ "groupPrimaryId")[0];

								groupObj.checked = true;
								selectRelatedGroup(groupObj);
							}
						}
					}

					showMsgDialog("提示", "保存成功", "info", function() {
						return;
					});
				}
			});
}

function ipSave() {
	var cb = $("input[name='ix']:checked");
	var inp = cb.parent().parent().find("td > input[name='ipInput']");
	var memoInp = cb.parent().parent().find("td > input[name='memoInput']");
	var addTr = $(".addServiceTrEl");
	var addInp = addTr.find("td > input[name='ipAddInput']");
	var memoAddInp = addTr.find("td > input[name='memoAddInput']");
	var isEmpty = false;
	var isValidIp = false;

	$(".inpValid").removeClass("inpValidBorder");
	$(".inpValid").removeClass("inpValid");

	$(".inpRepeatBorder").removeClass("inpRepeatBorder");

	if (cb.size() == 0 && addTr.size() == 0) {
		showMsgDialog("提示", "没有要保存的内容", "info", function() {
			return;
		});

		return;
	} else {
		inp.each(function() {
			if ($(this).val() == null || $(this).val() == '') {
				isEmpty = true;

				addValidation($(this));
			}

			validateValidIp($(this));
		});

		addInp.each(function() {
			if ($(this).val() == null || $(this).val() == '') {
				isEmpty = true;

				addValidation($(this));
			}

			validateValidIp($(this));
		});

		if (isEmpty) {
			showMsgDialog("提示", "IP不能为空", "info", function() {
				return;
			});

			return;
		}

		if (!isValidIpFlag) {
			showMsgDialog("提示", "请输入正确的IP", "info", function() {
				return;
			});

			$(".inpValid").addClass("inpValidBorder");

			return;
		}

		// 前台验证新添加的IP地址是否存在重复
		// addIpRepeatValidation(addInp);

		// if(isRepeatAdd)
		// {
		// showMsgDialog("提示","IP不能重复","info",function()
		// {
		// return;
		// });
		//			
		// return;
		// }

		var dataExistSn = getInputArray(cb);
		var dataExistIp = getInputArray(inp, true);
		var dataExistMemo = getInputArray(memoInp, true);
		var dataExistsUpdateCount = getInputArrayByAttr(inp, "versionIp");
		var addInpIp = getInputArray(addInp, true);
		var addInpMemo = getInputArray(memoAddInp, true);

		// 后台全局验证ip是否重复
//		jQuery.post("../externalDataServe/validateIpRepeat.html", {
//			dataExistIp : dataExistIp,
//			addInpIp : addInpIp
//		}, function(data) {
			// isRepeat = false;
			//			
			// if(data.accessRepeatIp != null && data.accessRepeatIp.length !=
			// 0)
			// {
			// if(inp.size() > 0)
			// {
			// inp.each(function()
			// {
			// arrContain(data.accessRepeatIp, $(this));
			// });
			// }
			//				
			// if(addInp.size() > 0)
			// {
			// addInp.each(function()
			// {
			// arrContain(data.accessRepeatIp, $(this));
			// });
			// }
			// }

			// if(isRepeat)
			// {
			// showMsgDialog("提示","IP不能重复","info",function()
			// {
			// return;
			// });
			//				
			// return;
			// }

			$.ajax({
				type : "POST",
				url : "../externalDataServe/saveSystemAccessIp.html",
				cache : false,
				dataType : "json",
				data : {
					existsSn : dataExistSn,
					existsIp : dataExistIp,
					existsMemo : dataExistMemo,
					existsUpdateCount : dataExistsUpdateCount,
					addIps : addInpIp,
					addMemos : addInpMemo
				},
				error : function(XMLHttpRequest, textStatus, errorThrown) {
					showMsgDialog("提示", "保存失败" + errorThrown, "info",
							function() {
								return;
							});
				},
				success : function(data) {
					var systemAccessIps = data.systemAccessIps;

					for ( var i = 0; i < systemAccessIps.length; i++) {
						var dt = systemAccessIps[i];

						if ($("#" + dt.accessIpSn + "aip").size() > 0) {
							$("#" + dt.accessIpSn + "aip").val(dt.accessIp);
							$("#" + dt.accessIpSn + "aip").attr("versionIp",
									dt.updateCount);
						} else {
							$(".cloneTr").remove();
							var cloneData = $("#cloneData").clone(true);
							cloneData.addClass("account backChange")
									.removeAttr("id").removeAttr("style");
							cloneData.children().find("input[type='checkbox']")
									.attr("name", "ix").attr("id",
											dt.accessIpSn).val(dt.accessIpSn);
							cloneData.children().find(
									"input[name='ipInputClone']").addClass(
									"validateRepeat").attr("name", "ipInput")
									.attr("id", dt.accessIpSn + "aip").attr(
											"versionIp", dt.updateCount).val(
											dt.accessIp);
							cloneData.children().find(
									"input[name='memoInputClone']").attr(
									"name", "memoInput").attr("id",
									dt.accessIpSn + "aip").attr("versionIp",
									dt.updateCount).val(dt.memo);
							cloneData.appendTo("#serviceTab");
						}
					}

					cb.each(function() {
						$(this)[0].checked = false;
					});

					selServiceChangeGround($(".backChange"));

					showMsgDialog("提示", "保存成功", "info", function() {
						return;
					});
				}
			});
//		});
	}
}

function validateValidIp(obj) {
	isValidIpFlag = true;
	var ipValidMatch = /^(\d{1,2}|1\d\d|2[0-4]\d|25[0-5])\.(\d{1,2}|1\d\d|2[0-4]\d|25[0-5])\.(\d{1,2}|1\d\d|2[0-4]\d|25[0-5])\.(\d{1,2}|1\d\d|2[0-4]\d|25[0-5])$/;

	if (!ipValidMatch.test(obj.val())) {
		isValidIpFlag = false;

		obj.addClass("inpValid");
	}
}

function arrContain(arr, obj) {
	if (arr != null && arr.length != 0) {
		for ( var i = 0; i < arr.length; i++) {
			if (obj.val() == arr[i]) {
				isRepeat = true;
				obj.addClass("inpRepeatBorder");
				break;
			}
		}
	}
}

function addIpRepeatValidation(obj) {
	isRepeatAdd = false;

	obj.each(function() {
		$(this).addClass("repeatValidation" + $(this).val());
	});

	obj.each(function() {
		if ($(".repeatValidation" + $(this).val()).size() > 1) {
			$(this).addClass("inpRepeatBorder");
			isRepeatAdd = true;
		}

		$(this).removeClass("repeatValidation" + $(this).val());
	});
}

function ipDelete() {
	var cb = $("input[name='ix']:checked");
	var inp = cb.parent().parent().find("td > input[name='ipInput']");

	if (cb.size() == 0) {
		showMsgDialog("提示", "没有要删除的内容", "info", function() {
			return;
		});

		return;
	}

	var dataExistSn = getInputArray(cb);
	var dataExistsUpdateCount = getInputArrayByAttr(inp, "versionIp");

	$.ajax({
		type : "POST",
		url : "../externalDataServe/deleteSystemAccessIp.html",
		cache : false,
		dataType : "json",
		data : {
			existsSn : dataExistSn,
			existUpdateCount : dataExistsUpdateCount
		},
		error : function(XMLHttpRequest, textStatus, errorThrown) {
			showMsgDialog("提示", "删除失败" + " " + errorThrown, "info", function() {
				return;
			});
		},
		success : function(data) {
			var systemAccessIps = data.systemAccessIps;

			for ( var i = 0; i < systemAccessIps.length; i++) {
				var dt = systemAccessIps[i];

				if ($("#" + dt.accessIpSn + "aip").size() > 0) {
					$("#" + dt.accessIpSn + "aip").parent().parent().remove();
				}
			}

			selServiceChangeGround($(".backChange"));

			showMsgDialog("提示", "删除成功", "info", function() {
				return;
			});
		}
	});
}

function getInputArray(obj, addClassFlag) {
	var arr = [];

	if (obj.size() != 0) {
		obj.each(function() {
			var objVal = $(this).val();

			arr.push(objVal);

			if (addClassFlag != undefined) {
				$(this).addClass(classFlag + objVal);
			}
		});
	}

	return arr;
}

function getInputArrayByAttr(obj, attrName) {
	var arr = [];

	if (obj.size() != 0) {
		obj.each(function() {
			var objAttr = $(this).attr(attrName);

			arr.push(objAttr);
		});
	}

	return arr;
}

function upGroup() {
	$("#gId").animate({
		height : "30px"
	}, 700, function() {
		$("#gId").css("overflow", "hidden");
		$("#gDownId").slideDown("normal");
	});
}

function downGroup() {
	$("#gDownId").slideUp("normal", function() {
		$("#gId").animate({
			height : "300px"
		}, 700, function() {
			$("#gId").css("overflow", "auto");
		});
	});
}

function selServiceGround(obj) {
	if (objServiceFilter != null) {
		objServiceFilter.removeClass("filtersel");
	}

	objServiceFilter = obj;

	objServiceFilter.addClass("filtersel");

	selServiceFilter(obj);
}

function selServiceFilter(obj) {
	var id = obj.attr("id");

	if (id == "allFilter") {
		var filterAll = $(".filterItem");
		filterAll.show();
		selServiceChangeGround(filterAll);
	} else if (id == "checkedFilter") {
		var filterChecked = $(
				".filterItem > td > input[type='checkbox']:checked").parent()
				.parent();
		filterChecked.show();
		$(".filterItem > td > input[type='checkbox']:not(:checked)").parent()
				.parent().hide();
		selServiceChangeGround(filterChecked);
	} else if (id == "uncheckedFilter") {
		var filterUnchecked = $(
				".filterItem > td > input[type='checkbox']:not(:checked)")
				.parent().parent();
		$(".filterItem > td > input[type='checkbox']:not(:checked)").parent()
				.parent().show();
		$(".filterItem > td > input[type='checkbox']:checked").parent()
				.parent().hide();
		selServiceChangeGround(filterUnchecked);
	}
}

function selServiceChangeGround(obj) {
	obj.removeClass("datatable-even");
	obj.removeClass("datatable-odd");

	var fgroup = [];
	var f = [];

	obj.each(function() {
		if ($(this).hasClass("filterItemGroup")) {
			fgroup.push($(this));
		} else {
			f.push($(this));
		}
	});

	setBackGround(fgroup);
	setBackGround(f);
}

function setBackGround(data) {
	if (data.length != 0) {
		for ( var i = 0; i < data.length; i++) {
			if (i % 2 == 0) {
				data[i].addClass("datatable-even");
			} else {
				data[i].addClass("datatable-odd");
			}
		}
	}
}

function selServiceDef(obj) {
	if (objServiceTr != null) {
		objServiceTr.removeClass("selBackGround");
	}

	objServiceTr = $(obj);

	objServiceTr.addClass("selBackGround");

	var accountSn = objServiceTr.children("td[class='accountSn']").text();

	jQuery
			.post(
					"../externalDataServe/selectSystemPrivilege.html",
					{
						accountSn : accountSn
					},
					function(data) {
						var systemPrivileges = data.systemPrivileges;

						clearSel();

						if (systemPrivileges != null
								&& systemPrivileges.length != 0) {
							for ( var i = 0; i < systemPrivileges.length; i++) {
								var priType = systemPrivileges[i].privilegeType;
								var priDefinition = systemPrivileges[i].privilegeDefinition;

								if (priType == '0') {
									var serObj = $("#" + priDefinition
											+ "definitionPrimaryId")[0];

									serObj.checked = true;
									selectRelated(serObj);
								} else if (priType = '1') {
									var groupObj = $("#" + priDefinition
											+ "groupPrimaryId")[0];

									groupObj.checked = true;
									selectRelatedGroup(groupObj);
								}
							}
						}

						if ($(".filtersel").size() > 0) {
							selServiceGround($(".filtersel"));
						}
					});
}

function filterCheckSel() {
	if ($(".filtersel").size() > 0) {
		selServiceGround($(".filtersel"));
	}
}

function validateRepeat(obj) {

}

function clearSel() {
	selectAll('itemGroupService', 'checkGroupAll', false);
	selectAll('itemService', 'checkAll', false);
	$("#checkAll")[0].checked = false;
	$("#checkGroupAll")[0].checked = false;
}

function addServiceTr() {
	/*
	 * $("#cloneTr").clone(true).removeAttr("id").removeAttr("style").addClass("addServiceTrEl
	 * cloneTr").appendTo("#serviceTab"); $("#serviceDiv").animate({scrollTop:
	 * $(".addServiceTrEl").last().offset().top}, 1000);
	 */

	var cloneData = $("#cloneTr").clone(true);
	cloneData.removeAttr("id").removeAttr("style").addClass(
			"addServiceTrEl cloneTr");
	cloneData.children().find("input[type='text']").addClass("validateRepeat");
	cloneData.appendTo("#serviceTab");
	$("#serviceDiv").animate({
		scrollTop : $(".addServiceTrEl").last().offset().top
	}, 1000);
}

function deleteServiceTr(obj) {
	$(obj).parents("tr:eq(0)").remove();
}

/**
 * 阻止事件冒泡
 * 
 * @param e
 */
function stopBubble(event) {
	// 如果提供了事件对象，则这是一个非IE浏览器
	if (event && event.stopPropagation)
		// 因此它支持W3C的stopPropagation()方法
		event.stopPropagation();
	else
		// 否则，我们需要使用IE的方式来取消事件冒泡
		event.cancelBubble = true;
}

function showIpGroup() {
	$("#tes").animate({
		width : 263
	}, 700, function() {
		$(".hideButton").show(700);
		$("#ipHead").show(700);
		$("#ipSelectSpan").show(700);
	});

	$("#gIpShowId").hide();
	$("#gIpHideId").show();
}

function hideIpGroup() {
	$("#tes").animate({
		width : 0
	}, 700, function() {
		$(".hideButton").hide();
		$("#ipHead").hide();
		$("#ipSelectSpan").hide();
	});

	$("#gIpHideId").hide();
	$("#gIpShowId").show();
}

function ipSelect() {
	var ipVal = $("#ipSelect").val();

	$("#serviceDiv").load("../externalDataServe/selectSystemAccessIp.html", {
		accessIp : ipVal
	}, function(response, status, xhr) {
		// 如果异步加载数据成功
		if (status == "success") {

		}
		// 如果状态是error或者timeout, 显示错误对话框
		else if (status == "error" || status == "timeout") {
			showMsgDialog("提示", "查询失败", "info", function() {
				return;
			});
		}
	});
}

/* 根据单个复选框的选择情况确定全选复选框是否被选中 */
function selectSingle(singleCheckName, allCheckName, obj) {
	var k = 0;
	var oInput = document.getElementsByName(singleCheckName);

	if (obj != undefined) {
		if ($(obj).find("td > input:checked").size() > 0) {
			$(obj).find("td > input")[0].checked = false;
		} else {
			$(obj).find("td > input")[0].checked = true;
		}
	}

	for ( var i = 0; i < oInput.length; i++) {
		if (oInput[i].checked == false) {
			k = 1;
			break;
		}
	}

	if (k == 0) {
		document.getElementById(allCheckName).checked = true;
	} else {
		document.getElementById(allCheckName).checked = false;
	}

	stopBubble(event);
}

/* 复选框全选或全不选效果 */
function selectAll(singleCheckName, allCheckName, valFlag) {
	var oInput = document.getElementsByName(singleCheckName);
	var allCheck = document.getElementById(allCheckName).checked;

	if (valFlag != null && valFlag != undefined) {
		allCheck = valFlag;
	}

	for ( var i = 0; i < oInput.length; i++) {
		oInput[i].checked = allCheck;
	}
}

function selectTrRelated(obj) {
	selectRelated($(obj).find("td > input[type='checkbox']"));
}

function selectRelated(obj) {
	var groupSn = $(obj).next().val();

	if ($("." + groupSn + "groupSn" + ":not(:checked)").size() > 0) {
		$("." + groupSn + "groupSnAll")[0].checked = false;
	} else {
		$("." + groupSn + "groupSnAll")[0].checked = true;
	}

	selectSingle('itemGroupService', 'checkGroupAll');
}

function selectRelatedAll(obj) {
	$("input[name='itemService']").each(function() {
		selectRelated($(this));
	});
}

function selectTrRelatedGroup(obj) {
	selectRelatedGroup($(obj).find("td > input[type='checkbox']"));
}

function selectRelatedGroup(obj) {
	var groupSnVal = $(obj).val();
	var checkFlag = $(obj)[0].checked;

	$("." + groupSnVal + "groupSn").each(function() {
		$(this)[0].checked = checkFlag;
	});

	selectSingle('itemService', 'checkAll');
}

function selectRelatedGroupAll(obj) {
	$("input[name='itemGroupService']").each(function() {
		selectRelatedGroup($(this));
	});
}