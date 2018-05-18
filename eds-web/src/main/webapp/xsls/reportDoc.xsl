<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:sc="urn:hl7-org:v3"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:Constants="xalan://com.founder.cdr.core.Constants">
	<xsl:template match="/sc:ClinicalDocument">
		<html>
			<head>
				<meta http-equiv="Pragma" content="no-cache" />
				<meta http-equiv="Cache-Control" content="no-cache" />
				<meta http-equiv="Expires" content="0" />
				<script type="text/javascript">
					$(function() {
						var birthday = parseInt("<xsl:value-of select="sc:recordTarget/sc:patientRole/sc:patient/sc:birthTime/@value" />");
						var birthYear=parseInt(birthday/10000);
						var	birthMonth=parseInt((birthday%10000)/100);
						var	birthDay=birthday%100;
						var todayDate=new Date();
						var	todayYear=todayDate.getFullYear();
						var	todayMonth=todayDate.getMonth()+1;
						var todayDay=todayDate.getDate();
					
						var monthDiff=(todayMonth-birthMonth)+(todayYear-birthYear)*12;
						var result="";
						if(todayDay>=birthDay){
							result+=parseInt(monthDiff/12)+"岁"+(monthDiff%12)+"月"+(todayDay-birthDay)+"天";
						}else{
							monthDiff-=1;
							result+=parseInt(monthDiff/12)+"岁"+(monthDiff%12)+"月"+(30+todayDay-birthDay)+"天";
						}
						
						$("#age").val(result);
					});
				</script>
			</head>
			<body>
				<div id="mainContent">
					<div name="selectTabs">
						<div>
							<xsl:value-of select="Constants:getResponsabilityClaimingContent()" />
						</div>
						<table border="1px solid #D3D3D3" align="center" width="100%"
							cellspacing="1" cellpadding="2"
							style="border-collapse:collapse;table-layout:fixed;border-bottom: solid 1px #B3C4D4;bgcolor:white;">
							<tr>
								<td colspan="4" height="30" align="center"
									style="background-color:#fcffe2;border-bottom: solid 1px #B3C4D4;">
									<h3>
										<xsl:value-of select="sc:title" />
									</h3>
								</td>
							</tr>
							<tr>
								<td>
									科室：
									<xsl:value-of
										select="sc:recordTarget/sc:patientRole/sc:providerOrganization/sc:name" />
								</td>
								<td>
									病区：
									<xsl:value-of
										select="sc:recordTarget/sc:patientRole/sc:addr/sc:houseNumber" />
								</td>
								<td>
									床号：
									<xsl:value-of
										select="sc:recordTarget/sc:patientRole/sc:addr/sc:careOf" />
								</td>
								<td>
									病案号：
									<xsl:value-of
										select="sc:recordTarget/sc:patientRole/sc:id[@root='1.2.156.112606.1.2.1.12']/@extension" />
								</td>
							</tr>
							<tr>
								<td>
									姓名：
									<xsl:value-of
										select="sc:recordTarget/sc:patientRole/sc:patient/sc:name" />
								</td>
								<td>
									性别：
									<xsl:value-of
										select="sc:recordTarget/sc:patientRole/sc:patient/sc:administrativeGenderCode/@displayName" />
								</td>
								<td>
									年龄：
									<input type="text" style="border: 0;" readonly="true" id="age"/>
								</td>
								<td>
									住院天数：
									<xsl:value-of
										select="sc:component/sc:structuredBody/sc:component[sc:section/sc:code/@code='34076-0']/sc:section/sc:entry[sc:observation/sc:code/@code='266938001']/sc:observation/sc:repeatNumber/@value" />
								</td>
							</tr>
							<tr>
								<td colspan="2">
									入院日期：
									<xsl:choose>
										<xsl:when
											test="string-length(sc:component/sc:structuredBody/sc:component[sc:section/sc:code/@code='34076-0']/sc:section/sc:entry[sc:observation/sc:code/@code='406543005']/sc:observation/sc:value/@value)>8">
											<xsl:value-of
												select="substring(sc:component/sc:structuredBody/sc:component[sc:section/sc:code/@code='34076-0']/sc:section/sc:entry[sc:observation/sc:code/@code='406543005']/sc:observation/sc:value/@value,1,4)" />
											年
											<xsl:value-of
												select="substring(sc:component/sc:structuredBody/sc:component[sc:section/sc:code/@code='34076-0']/sc:section/sc:entry[sc:observation/sc:code/@code='406543005']/sc:observation/sc:value/@value,5,2)" />
											月
											<xsl:value-of
												select="substring(sc:component/sc:structuredBody/sc:component[sc:section/sc:code/@code='34076-0']/sc:section/sc:entry[sc:observation/sc:code/@code='406543005']/sc:observation/sc:value/@value,7,2)" />
											日
											<xsl:value-of
												select="substring(sc:component/sc:structuredBody/sc:component[sc:section/sc:code/@code='34076-0']/sc:section/sc:entry[sc:observation/sc:code/@code='406543005']/sc:observation/sc:value/@value,9,2)" />
											时
											<xsl:value-of
												select="substring(sc:component/sc:structuredBody/sc:component[sc:section/sc:code/@code='34076-0']/sc:section/sc:entry[sc:observation/sc:code/@code='406543005']/sc:observation/sc:value/@value,11,2)" />
											分
										</xsl:when>
										<xsl:when
											test="string-length(sc:component/sc:structuredBody/sc:component[sc:section/sc:code/@code='34076-0']/sc:section/sc:entry[sc:observation/sc:code/@code='406543005']/sc:observation/sc:value/@value)>0">
											<xsl:value-of
												select="substring(sc:component/sc:structuredBody/sc:component[sc:section/sc:code/@code='34076-0']/sc:section/sc:entry[sc:observation/sc:code/@code='406543005']/sc:observation/sc:value/@value,1,4)" />
											年
											<xsl:value-of
												select="substring(sc:component/sc:structuredBody/sc:component[sc:section/sc:code/@code='34076-0']/sc:section/sc:entry[sc:observation/sc:code/@code='406543005']/sc:observation/sc:value/@value,5,2)" />
											月
											<xsl:value-of
												select="substring(sc:component/sc:structuredBody/sc:component[sc:section/sc:code/@code='34076-0']/sc:section/sc:entry[sc:observation/sc:code/@code='406543005']/sc:observation/sc:value/@value,7,2)" />
											日
										</xsl:when>
									</xsl:choose>
								</td>
								<td colspan="2"></td>
							</tr>
							<tr>
								<td colspan="2">
									出院日期：
									<xsl:choose>
										<xsl:when
											test="string-length(sc:component/sc:structuredBody/sc:component[sc:section/sc:code/@code='34076-0']/sc:section/sc:entry[sc:observation/sc:code/@code='442864001']/sc:observation/sc:value/@value)>8">
											<xsl:value-of
												select="substring(sc:component/sc:structuredBody/sc:component[sc:section/sc:code/@code='34076-0']/sc:section/sc:entry[sc:observation/sc:code/@code='442864001']/sc:observation/sc:value/@value,1,4)" />
											年
											<xsl:value-of
												select="substring(sc:component/sc:structuredBody/sc:component[sc:section/sc:code/@code='34076-0']/sc:section/sc:entry[sc:observation/sc:code/@code='442864001']/sc:observation/sc:value/@value,5,2)" />
											月
											<xsl:value-of
												select="substring(sc:component/sc:structuredBody/sc:component[sc:section/sc:code/@code='34076-0']/sc:section/sc:entry[sc:observation/sc:code/@code='442864001']/sc:observation/sc:value/@value,7,2)" />
											日
											<xsl:value-of
												select="substring(sc:component/sc:structuredBody/sc:component[sc:section/sc:code/@code='34076-0']/sc:section/sc:entry[sc:observation/sc:code/@code='442864001']/sc:observation/sc:value/@value,9,2)" />
											时
											<xsl:value-of
												select="substring(sc:component/sc:structuredBody/sc:component[sc:section/sc:code/@code='34076-0']/sc:section/sc:entry[sc:observation/sc:code/@code='442864001']/sc:observation/sc:value/@value,11,2)" />
											分
										</xsl:when>
										<xsl:when
											test="string-length(sc:component/sc:structuredBody/sc:component[sc:section/sc:code/@code='34076-0']/sc:section/sc:entry[sc:observation/sc:code/@code='442864001']/sc:observation/sc:value/@value)>0">
											<xsl:value-of
												select="substring(sc:component/sc:structuredBody/sc:component[sc:section/sc:code/@code='34076-0']/sc:section/sc:entry[sc:observation/sc:code/@code='442864001']/sc:observation/sc:value/@value,1,4)" />
											年
											<xsl:value-of
												select="substring(sc:component/sc:structuredBody/sc:component[sc:section/sc:code/@code='34076-0']/sc:section/sc:entry[sc:observation/sc:code/@code='442864001']/sc:observation/sc:value/@value,5,2)" />
											月
											<xsl:value-of
												select="substring(sc:component/sc:structuredBody/sc:component[sc:section/sc:code/@code='34076-0']/sc:section/sc:entry[sc:observation/sc:code/@code='442864001']/sc:observation/sc:value/@value,7,2)" />
											日
										</xsl:when>
									</xsl:choose>
								</td>
								<td colspan="2"></td>
							</tr>
							<tr>
								<td colspan="4">
									监测日期：
									<xsl:choose>
										<xsl:when
											test="string-length(sc:component/sc:structuredBody/sc:component[sc:section/sc:code/@code='34076-0']/sc:section/sc:entry[sc:observation/sc:code/@code='399651003']/sc:observation/sc:value/@value)>8">
											<xsl:value-of
												select="substring(sc:component/sc:structuredBody/sc:component[sc:section/sc:code/@code='34076-0']/sc:section/sc:entry[sc:observation/sc:code/@code='399651003']/sc:observation/sc:value/@value,1,4)" />
											年
											<xsl:value-of
												select="substring(sc:component/sc:structuredBody/sc:component[sc:section/sc:code/@code='34076-0']/sc:section/sc:entry[sc:observation/sc:code/@code='399651003']/sc:observation/sc:value/@value,5,2)" />
											月
											<xsl:value-of
												select="substring(sc:component/sc:structuredBody/sc:component[sc:section/sc:code/@code='34076-0']/sc:section/sc:entry[sc:observation/sc:code/@code='399651003']/sc:observation/sc:value/@value,7,2)" />
											日
											<xsl:value-of
												select="substring(sc:component/sc:structuredBody/sc:component[sc:section/sc:code/@code='34076-0']/sc:section/sc:entry[sc:observation/sc:code/@code='399651003']/sc:observation/sc:value/@value,9,2)" />
											时
											<xsl:value-of
												select="substring(sc:component/sc:structuredBody/sc:component[sc:section/sc:code/@code='34076-0']/sc:section/sc:entry[sc:observation/sc:code/@code='399651003']/sc:observation/sc:value/@value,11,2)" />
											分
										</xsl:when>
										<xsl:when
											test="string-length(sc:component/sc:structuredBody/sc:component[sc:section/sc:code/@code='34076-0']/sc:section/sc:entry[sc:observation/sc:code/@code='399651003']/sc:observation/sc:value/@value)>0">
											<xsl:value-of
												select="substring(sc:component/sc:structuredBody/sc:component[sc:section/sc:code/@code='34076-0']/sc:section/sc:entry[sc:observation/sc:code/@code='399651003']/sc:observation/sc:value/@value,1,4)" />
											年
											<xsl:value-of
												select="substring(sc:component/sc:structuredBody/sc:component[sc:section/sc:code/@code='34076-0']/sc:section/sc:entry[sc:observation/sc:code/@code='399651003']/sc:observation/sc:value/@value,5,2)" />
											月
											<xsl:value-of
												select="substring(sc:component/sc:structuredBody/sc:component[sc:section/sc:code/@code='34076-0']/sc:section/sc:entry[sc:observation/sc:code/@code='399651003']/sc:observation/sc:value/@value,7,2)" />
											日
										</xsl:when>
									</xsl:choose>
								</td>
							</tr>
							<tr>
								<td colspan="4">
									疾病诊断：
									<xsl:value-of
										select="sc:component/sc:structuredBody/sc:component[sc:section/sc:code/@code='34076-0']/sc:section/sc:entry[sc:observation/sc:code/@code='310867007']/sc:observation/sc:value/@displayName" />
								</td>
							</tr>
							<tr>
								<td colspan="4" height="300px">
									<div style="border:1px solid #D3D3D3;">
										<table id="inner" border="1px" align="center" width="100%"
											cellspacing="1" cellpadding="2"
											style="border-collapse:collapse;table-layout:fixed;border-bottom: solid 1px #B3C4D4;bgcolor:white;">
											<tr>
												<td align="right">
													<font color="red">*</font>
													疾病转归：
												</td>
												<td colspan="4">
													<xsl:value-of
														select="sc:component/sc:structuredBody/sc:component[sc:section/sc:code/@code='34076-0']/sc:section/sc:entry[sc:observation/sc:code/@code='9857008']/sc:observation/sc:entryRelationship/sc:organizer/sc:component[sc:observation/sc:value/@value='true']/sc:observation/sc:code/@displayName" />
												</td>
											</tr>
											<tr>
												<td align="right">
													<font color="red">*</font>
													与死亡的关系：
												</td>
												<td colspan="4">
													<xsl:value-of
														select="sc:component/sc:structuredBody/sc:component[sc:section/sc:code/@code='34076-0']/sc:section/sc:entry[sc:observation/sc:code/@code='419620001']/sc:observation/sc:entryRelationship/sc:organizer/sc:component[sc:observation/sc:value/@value='true']/sc:observation/sc:code/@displayName" />
												</td>
											</tr>
											<tr>
												<td align="right">
													<font color="red">*</font>
													感染性疾病病程：
												</td>
												<td colspan="4">
													<xsl:value-of
														select="sc:component/sc:structuredBody/sc:component[sc:section/sc:code/@code='34076-0']/sc:section/sc:entry[sc:observation/sc:code/@code='84635008']/sc:observation/sc:text" />
												</td>
											</tr>
											<tr>
												<td align="right">
													<font color="red">*</font>
													诊断依据：
												</td>
												<td colspan="4">
													<xsl:value-of
														select="sc:component/sc:structuredBody/sc:component[sc:section/sc:code/@code='34076-0']/sc:section/sc:entry[sc:observation/sc:code/@code='310867007']/sc:observation/sc:text" />
												</td>
											</tr>
											<tr>
												<td align="right">
													<font color="red">*</font>
													在ICU治疗过：
												</td>
												<td colspan="2">
													<xsl:value-of
														select="sc:component/sc:structuredBody/sc:component[sc:section/sc:code/@code='34076-0']/sc:section/sc:entry[sc:observation/sc:code/@code='79034004']/sc:observation/sc:value" />
												</td>
												<td colspan="2" align="left">
													转入ICU时间：
													<xsl:choose>
														<xsl:when
															test="string-length(sc:component/sc:structuredBody/sc:component[sc:section/sc:code/@code='34076-0']/sc:section/sc:entry[sc:observation/sc:code/@code='79034004']/sc:observation/sc:value/@value)>8">
															<xsl:value-of
																select="substring(sc:component/sc:structuredBody/sc:component[sc:section/sc:code/@code='34076-0']/sc:section/sc:entry[sc:observation/sc:code/@code='79034004']/sc:observation/sc:value/@value,1,4)" />
															年
															<xsl:value-of
																select="substring(sc:component/sc:structuredBody/sc:component[sc:section/sc:code/@code='34076-0']/sc:section/sc:entry[sc:observation/sc:code/@code='79034004']/sc:observation/sc:value/@value,5,2)" />
															月
															<xsl:value-of
																select="substring(sc:component/sc:structuredBody/sc:component[sc:section/sc:code/@code='34076-0']/sc:section/sc:entry[sc:observation/sc:code/@code='79034004']/sc:observation/sc:value/@value,7,2)" />
															日
															<xsl:value-of
																select="substring(sc:component/sc:structuredBody/sc:component[sc:section/sc:code/@code='34076-0']/sc:section/sc:entry[sc:observation/sc:code/@code='79034004']/sc:observation/sc:value/@value,9,2)" />
															时
															<xsl:value-of
																select="substring(sc:component/sc:structuredBody/sc:component[sc:section/sc:code/@code='34076-0']/sc:section/sc:entry[sc:observation/sc:code/@code='79034004']/sc:observation/sc:value/@value,11,2)" />
															分
														</xsl:when>
														<xsl:when
															test="string-length(sc:component/sc:structuredBody/sc:component[sc:section/sc:code/@code='34076-0']/sc:section/sc:entry[sc:observation/sc:code/@code='79034004']/sc:observation/sc:value/@value)>0">
															<xsl:value-of
																select="substring(sc:component/sc:structuredBody/sc:component[sc:section/sc:code/@code='34076-0']/sc:section/sc:entry[sc:observation/sc:code/@code='79034004']/sc:observation/sc:value/@value,1,4)" />
															年
															<xsl:value-of
																select="substring(sc:component/sc:structuredBody/sc:component[sc:section/sc:code/@code='34076-0']/sc:section/sc:entry[sc:observation/sc:code/@code='79034004']/sc:observation/sc:value/@value,5,2)" />
															月
															<xsl:value-of
																select="substring(sc:component/sc:structuredBody/sc:component[sc:section/sc:code/@code='34076-0']/sc:section/sc:entry[sc:observation/sc:code/@code='79034004']/sc:observation/sc:value/@value,7,2)" />
															日
														</xsl:when>
													</xsl:choose>
												</td>
											</tr>
											<tr>
												<td align="right">
													<font color="red">*</font>
													ICU科别：
												</td>
												<td colspan="4">
													<xsl:value-of
														select="sc:component/sc:structuredBody/sc:component[sc:section/sc:code/@code='34076-0']/sc:section/sc:entry[sc:observation/sc:code/@code='79034004']/sc:observation/sc:entryRelationship/sc:organizer/sc:component[sc:observation/sc:value/@value='true']/sc:observation/sc:code/@displayName" />
												</td>
											</tr>
											<tr>
												<td align="right">
													<font color="red">*</font>
													院感发生日期：
												</td>
												<td colspan="2">
													<xsl:choose>
														<xsl:when
															test="string-length(sc:component/sc:structuredBody/sc:component[sc:section/sc:code/@code='34076-0']/sc:section/sc:entry[sc:observation/sc:code/@code='439771001']/sc:observation/sc:value/@value)>8">
															<xsl:value-of
																select="substring(sc:component/sc:structuredBody/sc:component[sc:section/sc:code/@code='34076-0']/sc:section/sc:entry[sc:observation/sc:code/@code='439771001']/sc:observation/sc:value/@value,1,4)" />
															年
															<xsl:value-of
																select="substring(sc:component/sc:structuredBody/sc:component[sc:section/sc:code/@code='34076-0']/sc:section/sc:entry[sc:observation/sc:code/@code='439771001']/sc:observation/sc:value/@value,5,2)" />
															月
															<xsl:value-of
																select="substring(sc:component/sc:structuredBody/sc:component[sc:section/sc:code/@code='34076-0']/sc:section/sc:entry[sc:observation/sc:code/@code='439771001']/sc:observation/sc:value/@value,7,2)" />
															日
															<xsl:value-of
																select="substring(sc:component/sc:structuredBody/sc:component[sc:section/sc:code/@code='34076-0']/sc:section/sc:entry[sc:observation/sc:code/@code='439771001']/sc:observation/sc:value/@value,9,2)" />
															时
															<xsl:value-of
																select="substring(sc:component/sc:structuredBody/sc:component[sc:section/sc:code/@code='34076-0']/sc:section/sc:entry[sc:observation/sc:code/@code='439771001']/sc:observation/sc:value/@value,11,2)" />
															分
														</xsl:when>
														<xsl:when
															test="string-length(sc:component/sc:structuredBody/sc:component[sc:section/sc:code/@code='34076-0']/sc:section/sc:entry[sc:observation/sc:code/@code='439771001']/sc:observation/sc:value/@value)>0">
															<xsl:value-of
																select="substring(sc:component/sc:structuredBody/sc:component[sc:section/sc:code/@code='34076-0']/sc:section/sc:entry[sc:observation/sc:code/@code='439771001']/sc:observation/sc:value/@value,1,4)" />
															年
															<xsl:value-of
																select="substring(sc:component/sc:structuredBody/sc:component[sc:section/sc:code/@code='34076-0']/sc:section/sc:entry[sc:observation/sc:code/@code='439771001']/sc:observation/sc:value/@value,5,2)" />
															月
															<xsl:value-of
																select="substring(sc:component/sc:structuredBody/sc:component[sc:section/sc:code/@code='34076-0']/sc:section/sc:entry[sc:observation/sc:code/@code='439771001']/sc:observation/sc:value/@value,7,2)" />
															日
														</xsl:when>
													</xsl:choose>
												</td>
												<td colspan="2"></td>
											</tr>
											<tr>
												<td align="right">感染部位：</td>
												<td colspan="4">
													<xsl:value-of
														select="sc:component/sc:structuredBody/sc:component[sc:section/sc:code/@code='51899-3']/sc:section/sc:component[sc:section/sc:code/@code='301810000']/sc:section/sc:component/sc:section/sc:entry[sc:observation/sc:code/@displayName='感染部位']/sc:observation/sc:targetSiteCode/sc:translation/@displayName" />
												</td>
											</tr>
											<tr>
												<td align="right">侵袭性操作：</td>
												<td colspan="4">
													<xsl:value-of
														select="sc:component/sc:structuredBody/sc:component[sc:section/sc:code/@code='51899-3']/sc:section/sc:component[sc:section/sc:code/@code='301810000']/sc:section/sc:component/sc:section/sc:entry[sc:observation/sc:code/@displayName='侵袭性操作']/sc:observation/sc:text" />
												</td>
											</tr>
											<tr>
												<td align="right">
													<font color="red">*</font>
													感染因素：
												</td>
												<td colspan="4">
													<xsl:value-of
														select="sc:component/sc:structuredBody/sc:component[sc:section/sc:code/@code='34076-0']/sc:section/sc:entry[sc:observation/sc:code/@code='246083009']/sc:observation/sc:entryRelationship/sc:organizer/sc:component[sc:observation/sc:value/@value='true']/sc:observation/sc:code/@displayName" />
												</td>
											</tr>
											<tr>
												<td align="right">其他：</td>
												<td colspan="4">
													<xsl:value-of
														select="sc:component/sc:structuredBody/sc:component[sc:section/sc:code/@code='34076-0']/sc:section/sc:entry[sc:observation/sc:code/@code='246083009']/sc:observation/sc:text" />
												</td>
											</tr>
											<tr>
												<td align="right">
													<font color="red">*</font>
													是否有手术：
												</td>
												<td colspan="4">
													<xsl:value-of
														select="sc:component/sc:structuredBody/sc:component[sc:section/sc:code/@code='34076-0']/sc:section/sc:entry[sc:observation/sc:code/@code='40733004']/sc:observation/sc:entryRelationship/sc:organizer/sc:component[sc:observation/sc:code/@displayName='是否有手术']/sc:observation/sc:value" />
												</td>
											</tr>
											<tr>
												<td align="right">
													<font color="red">*</font>
													院内感染诊断依据：
												</td>
												<td colspan="4">
													<xsl:value-of
														select="sc:component/sc:structuredBody/sc:component[sc:section/sc:code/@code='34076-0']/sc:section/sc:entry[sc:observation/sc:code/@code='40733004']/sc:observation/sc:text" />
												</td>
											</tr>
											<tr>
												<td align="right">
													<font color="red">*</font>
													病原学检查：
												</td>
												<td colspan="4">
													<xsl:value-of
														select="sc:component/sc:structuredBody/sc:component[sc:section/sc:code/@code='34076-0']/sc:section/sc:entry[sc:observation/sc:code/@code='40733004']/sc:observation/sc:entryRelationship/sc:organizer/sc:component[sc:observation/sc:code/@displayName='病原学检查']/sc:observation/sc:value" />
												</td>
											</tr>
											<tr>
												<td align="right">
													<font color="red">*</font>
													是否迟报：
												</td>
												<td colspan="4">
													<xsl:value-of
														select="sc:component/sc:structuredBody/sc:component[sc:section/sc:code/@code='34076-0']/sc:section/sc:entry[sc:observation/sc:code/@code='40733004']/sc:observation/sc:entryRelationship/sc:organizer/sc:component[sc:observation/sc:code/@displayName='是否迟报']/sc:observation/sc:value" />
												</td>
											</tr>
											<tr>
												<td align="right">
													<font color="red">*</font>
													使用抗生素：
												</td>
												<td colspan="4">
													<xsl:value-of
														select="sc:component/sc:structuredBody/sc:component[sc:section/sc:code/@code='34076-0']/sc:section/sc:entry[sc:observation/sc:code/@code='40733004']/sc:observation/sc:entryRelationship/sc:organizer/sc:component[sc:observation/sc:code/@displayName='使用抗生素']/sc:observation/sc:value" />
												</td>
											</tr>
											<tr>
												<td colspan="5" align="center">
													<h4>手术切口感染信息：</h4>
												</td>
											</tr>
											<xsl:for-each
												select="sc:component/sc:structuredBody/sc:component[sc:section/sc:code/@code='51899-3']/sc:section/sc:component[sc:section/sc:code/@code='58126003']/sc:section/sc:component">
												<tr>
													<td align="right">手术名称：</td>
													<td colspan="4">
														<xsl:value-of
															select="sc:section/sc:entry[sc:observation/sc:code/@displayName='手术名称']/sc:observation/sc:value/@displayName" />
													</td>
												</tr>
												<tr>
													<td align="right">急诊手术：</td>
													<td colspan="4">
														<xsl:value-of
															select="sc:section/sc:entry[sc:observation/sc:code/@displayName='急诊手术']/sc:observation/sc:value" />
													</td>
												</tr>
												<tr>
													<td align="right">手术类型：</td>
													<td colspan="2">
														<xsl:value-of
															select="sc:section/sc:entry[sc:observation/sc:code/@displayName='手术类型']/sc:observation/sc:value/@displayName" />
													</td>
													<td colspan="2">手术切口类型：<xsl:value-of
															select="sc:section/sc:entry[sc:observation/sc:code/@displayName='手术切口类型']/sc:observation/sc:value/@displayName" />
													</td>
												</tr>
												<tr>
													<td align="right">引起院内感染：</td>
													<td colspan="2">
														<xsl:value-of
															select="sc:section/sc:entry[sc:observation/sc:code/@displayName='引起院内感染']/sc:observation/sc:text" />
													</td>
													<td colspan="2"></td>
												</tr>
												<tr>
													<td align="right">开始时间：</td>
													<td colspan="2">
														<xsl:choose>
															<xsl:when
																test="string-length(sc:section/sc:entry[sc:observation/sc:code/@displayName='开始时间']/sc:observation/sc:value/@value)>8">
																<xsl:value-of
																	select="substring(sc:section/sc:entry[sc:observation/sc:code/@displayName='开始时间']/sc:observation/sc:value/@value,1,4)" />
																年
																<xsl:value-of
																	select="substring(sc:section/sc:entry[sc:observation/sc:code/@displayName='开始时间']/sc:observation/sc:value/@value,5,2)" />
																月
																<xsl:value-of
																	select="substring(sc:section/sc:entry[sc:observation/sc:code/@displayName='开始时间']/sc:observation/sc:value/@value,7,2)" />
																日
																<xsl:value-of
																	select="substring(sc:section/sc:entry[sc:observation/sc:code/@displayName='开始时间']/sc:observation/sc:value/@value,9,2)" />
																时
																<xsl:value-of
																	select="substring(sc:section/sc:entry[sc:observation/sc:code/@displayName='开始时间']/sc:observation/sc:value/@value,11,2)" />
																分
															</xsl:when>
															<xsl:when
																test="string-length(sc:section/sc:entry[sc:observation/sc:code/@displayName='开始时间']/sc:observation/sc:value/@value)>0">
																<xsl:value-of
																	select="substring(sc:section/sc:entry[sc:observation/sc:code/@displayName='开始时间']/sc:observation/sc:value/@value,1,4)" />
																年
																<xsl:value-of
																	select="substring(sc:section/sc:entry[sc:observation/sc:code/@displayName='开始时间']/sc:observation/sc:value/@value,5,2)" />
																月
																<xsl:value-of
																	select="substring(sc:section/sc:entry[sc:observation/sc:code/@displayName='开始时间']/sc:observation/sc:value/@value,7,2)" />
																日
															</xsl:when>
														</xsl:choose>
													</td>
													<td colspan="2">
														结束时间：
														<xsl:choose>
															<xsl:when
																test="string-length(sc:section/sc:entry[sc:observation/sc:code/@displayName='结束时间']/sc:observation/sc:value/@value)>8">
																<xsl:value-of
																	select="substring(sc:section/sc:entry[sc:observation/sc:code/@displayName='结束时间']/sc:observation/sc:value/@value,1,4)" />
																年
																<xsl:value-of
																	select="substring(sc:section/sc:entry[sc:observation/sc:code/@displayName='结束时间']/sc:observation/sc:value/@value,5,2)" />
																月
																<xsl:value-of
																	select="substring(sc:section/sc:entry[sc:observation/sc:code/@displayName='结束时间']/sc:observation/sc:value/@value,7,2)" />
																日
																<xsl:value-of
																	select="substring(sc:section/sc:entry[sc:observation/sc:code/@displayName='结束时间']/sc:observation/sc:value/@value,9,2)" />
																时
																<xsl:value-of
																	select="substring(sc:section/sc:entry[sc:observation/sc:code/@displayName='结束时间']/sc:observation/sc:value/@value,11,2)" />
																分
															</xsl:when>
															<xsl:when
																test="string-length(sc:section/sc:entry[sc:observation/sc:code/@displayName='结束时间']/sc:observation/sc:value/@value)>0">
																<xsl:value-of
																	select="substring(sc:section/sc:entry[sc:observation/sc:code/@displayName='结束时间']/sc:observation/sc:value/@value,1,4)" />
																年
																<xsl:value-of
																	select="substring(sc:section/sc:entry[sc:observation/sc:code/@displayName='结束时间']/sc:observation/sc:value/@value,5,2)" />
																月
																<xsl:value-of
																	select="substring(sc:section/sc:entry[sc:observation/sc:code/@displayName='结束时间']/sc:observation/sc:value/@value,7,2)" />
																日
															</xsl:when>
														</xsl:choose>
													</td>
												</tr>
												<tr>
													<td align="right">麻醉方法：</td>
													<td colspan="4">
														<xsl:value-of
															select="sc:section/sc:entry[sc:observation/sc:code/@displayName='麻醉方法']/sc:observation/sc:value/@displayName" />
													</td>
												</tr>
												<tr>
													<td align="right">手术医生：</td>
													<td colspan="2">
														<xsl:value-of
															select="sc:section/sc:entry[sc:observation/sc:code/@displayName='手术医生']/sc:observation/sc:value/@displayName" />
													</td>
													<td colspan="2">
														职称：
														<xsl:value-of
															select="sc:section/sc:entry[sc:observation/sc:code/@displayName='职称']/sc:observation/sc:value/@displayName" />
													</td>
												</tr>
												<tr>
													<td align="right">切口类型：</td>
													<td colspan="2">
														<xsl:value-of
															select="sc:section/sc:entry[sc:observation/sc:code/@displayName='切口类型']/sc:observation/sc:value/@displayName" />
													</td>
													<td colspan="2">
														愈合情况：
														<xsl:value-of
															select="sc:section/sc:entry[sc:observation/sc:code/@displayName='愈合情况']/sc:observation/sc:text" />
													</td>
												</tr>
												<tr>
													<td align="right">切口感染：</td>
													<td colspan="2">
														<xsl:value-of
															select="sc:section/sc:entry[sc:observation/sc:code/@displayName='切口感染']/sc:observation/sc:value" />
													</td>
													<td colspan="2">
														手术部位感染类型：
														<xsl:value-of
															select="sc:section/sc:entry[sc:observation/sc:code/@displayName='手术部位感染类型']/sc:observation/sc:value/@displayName" />
													</td>
												</tr>
												<tr>
													<td align="right">术前白细胞数：</td>
													<td colspan="2">
														<xsl:value-of
															select="sc:section/sc:entry[sc:observation/sc:code/@displayName='术前白细胞数']/sc:observation/sc:text" />
													</td>
													<td colspan="2">
														ASA评分：
														<xsl:value-of
															select="sc:section/sc:entry[sc:observation/sc:code/@displayName='ASA评分']/sc:observation/sc:text" />
													</td>
												</tr>
												<tr>
													<td align="right">多种操作：</td>
													<td colspan="2">
														<xsl:value-of
															select="sc:section/sc:entry[sc:observation/sc:code/@displayName='多种操作']/sc:observation/sc:text" />
													</td>
													<td colspan="2">
														美国麻醉学会体质状况分类：
														<xsl:value-of
															select="sc:section/sc:entry[sc:observation/sc:code/@displayName='美国麻醉学会体质状况分类']/sc:observation/sc:value/@displayName" />
													</td>
												</tr>
												<tr>
													<td align="right">腔镜手术：</td>
													<td colspan="2">
														<xsl:value-of
															select="sc:section/sc:entry[sc:observation/sc:code/@displayName='腔镜手术']/sc:observation/sc:text" />
													</td>
													<td colspan="2">
														假体或移植物：
														<xsl:value-of
															select="sc:section/sc:entry[sc:observation/sc:code/@displayName='假体或移植物']/sc:observation/sc:text" />
													</td>
												</tr>
												<tr>
													<td align="right">手术感染部位：</td>
													<td colspan="4">
														<xsl:value-of
															select="sc:section/sc:entry[sc:observation/sc:code/@displayName='手术感染部位']/sc:observation/sc:targetSiteCode/sc:translation/@displayName" />
													</td>
												</tr>
											</xsl:for-each>
											<tr>
												<td colspan="5" align="center">
													<h4>感染部位信息：</h4>
												</td>
											</tr>
											<xsl:for-each
												select="sc:component/sc:structuredBody/sc:component[sc:section/sc:code/@code='51899-3']/sc:section/sc:component[sc:section/sc:code/@code='301810000']/sc:section/sc:component">
												<tr>
													<td align="right">感染日期：</td>
													<td colspan="4">
														<xsl:choose>
															<xsl:when
																test="string-length(sc:section/sc:entry[sc:observation/sc:code/@displayName='感染时间']/sc:observation/sc:effectiveTime/@value)>8">
																<xsl:value-of
																	select="substring(sc:section/sc:entry[sc:observation/sc:code/@displayName='感染时间']/sc:observation/sc:effectiveTime/@value,1,4)" />
																年
																<xsl:value-of
																	select="substring(sc:section/sc:entry[sc:observation/sc:code/@displayName='感染时间']/sc:observation/sc:effectiveTime/@value,5,2)" />
																月
																<xsl:value-of
																	select="substring(sc:section/sc:entry[sc:observation/sc:code/@displayName='感染时间']/sc:observation/sc:effectiveTime/@value,7,2)" />
																日
																<xsl:value-of
																	select="substring(sc:section/sc:entry[sc:observation/sc:code/@displayName='感染时间']/sc:observation/sc:effectiveTime/@value,9,2)" />
																时
																<xsl:value-of
																	select="substring(sc:section/sc:entry[sc:observation/sc:code/@displayName='感染时间']/sc:observation/sc:effectiveTime/@value,11,2)" />
																分
															</xsl:when>
															<xsl:when
																test="string-length(sc:section/sc:entry[sc:observation/sc:code/@displayName='感染时间']/sc:observation/sc:effectiveTime/@value)>0">
																<xsl:value-of
																	select="substring(sc:section/sc:entry[sc:observation/sc:code/@displayName='感染时间']/sc:observation/sc:effectiveTime/@value,1,4)" />
																年
																<xsl:value-of
																	select="substring(sc:section/sc:entry[sc:observation/sc:code/@displayName='感染时间']/sc:observation/sc:effectiveTime/@value,5,2)" />
																月
																<xsl:value-of
																	select="substring(sc:section/sc:entry[sc:observation/sc:code/@displayName='感染时间']/sc:observation/sc:effectiveTime/@value,7,2)" />
																日
															</xsl:when>
														</xsl:choose>
													</td>
												</tr>
												<tr>
													<td align="right">感染部位：</td>
													<td colspan="4">
														<xsl:value-of
															select="sc:section/sc:entry[sc:observation/sc:code/@displayName='感染部位']/sc:observation/sc:targetSiteCode/sc:translation/@displayName" />
													</td>
												</tr>
												<tr>
													<td align="right">侵袭性操作：</td>
													<td colspan="4">
														<xsl:value-of
															select="sc:section/sc:entry[sc:observation/sc:code/@displayName='侵袭性操作']/sc:observation/sc:text" />
													</td>
												</tr>
											</xsl:for-each>
											<tr>
												<td colspan="5" align="center">
													<h4>抗菌用药信息：</h4>
												</td>
											</tr>
											<xsl:for-each
												select="sc:component/sc:structuredBody/sc:component[sc:section/sc:code/@code='51899-3']/sc:section/sc:component[sc:section/sc:code/@code='346325008']/sc:section/sc:component">
												<tr>
													<td align="right">使用抗菌药物：</td>
													<td colspan="2">
														<xsl:value-of
															select="sc:section/sc:entry[sc:observation/sc:code/@displayName='药名']/sc:observation/sc:value/@displayName" />
													</td>
													<td colspan="2">
														给药途径：
														<xsl:value-of
															select="sc:section/sc:entry[sc:observation/sc:code/@displayName='给药途径']/sc:observation/sc:value" />
													</td>
												</tr>
												<tr>
													<td align="right">剂量：</td>
													<td colspan="2">
														<xsl:value-of
															select="sc:section/sc:entry[sc:observation/sc:code/@displayName='剂量']/sc:observation/sc:text" />
													</td>
													<td colspan="2">
														用法：
														<xsl:value-of
															select="sc:section/sc:entry[sc:observation/sc:code/@displayName='用法']/sc:observation/sc:value/@displayName" />
													</td>
												</tr>
												<tr>
													<td align="right">起始时间：</td>
													<td colspan="2">
														<xsl:choose>
															<xsl:when
																test="string-length(sc:section/sc:entry[sc:observation/sc:code/@displayName='起始时间']/sc:observation/sc:effectiveTime/@value)>8">
																<xsl:value-of
																	select="substring(sc:section/sc:entry[sc:observation/sc:code/@displayName='起始时间']/sc:observation/sc:effectiveTime/@value,1,4)" />
																年
																<xsl:value-of
																	select="substring(sc:section/sc:entry[sc:observation/sc:code/@displayName='起始时间']/sc:observation/sc:effectiveTime/@value,5,2)" />
																月
																<xsl:value-of
																	select="substring(sc:section/sc:entry[sc:observation/sc:code/@displayName='起始时间']/sc:observation/sc:effectiveTime/@value,7,2)" />
																日
																<xsl:value-of
																	select="substring(sc:section/sc:entry[sc:observation/sc:code/@displayName='起始时间']/sc:observation/sc:effectiveTime/@value,9,2)" />
																时
																<xsl:value-of
																	select="substring(sc:section/sc:entry[sc:observation/sc:code/@displayName='起始时间']/sc:observation/sc:effectiveTime/@value,11,2)" />
																分
															</xsl:when>
															<xsl:when
																test="string-length(sc:section/sc:entry[sc:observation/sc:code/@displayName='起始时间']/sc:observation/sc:effectiveTime/@value)>0">
																<xsl:value-of
																	select="substring(sc:section/sc:entry[sc:observation/sc:code/@displayName='起始时间']/sc:observation/sc:effectiveTime/@value,1,4)" />
																年
																<xsl:value-of
																	select="substring(sc:section/sc:entry[sc:observation/sc:code/@displayName='起始时间']/sc:observation/sc:effectiveTime/@value,5,2)" />
																月
																<xsl:value-of
																	select="substring(sc:section/sc:entry[sc:observation/sc:code/@displayName='起始时间']/sc:observation/sc:effectiveTime/@value,7,2)" />
																日
															</xsl:when>
														</xsl:choose>
													</td>
													<td colspan="2">
														截止时间：
														<xsl:choose>
															<xsl:when
																test="string-length(sc:section/sc:entry[sc:observation/sc:code/@displayName='截止时间']/sc:observation/sc:effectiveTime/@value)>8">
																<xsl:value-of
																	select="substring(sc:section/sc:entry[sc:observation/sc:code/@displayName='截止时间']/sc:observation/sc:effectiveTime/@value,1,4)" />
																年
																<xsl:value-of
																	select="substring(sc:section/sc:entry[sc:observation/sc:code/@displayName='截止时间']/sc:observation/sc:effectiveTime/@value,5,2)" />
																月
																<xsl:value-of
																	select="substring(sc:section/sc:entry[sc:observation/sc:code/@displayName='截止时间']/sc:observation/sc:effectiveTime/@value,7,2)" />
																日
																<xsl:value-of
																	select="substring(sc:section/sc:entry[sc:observation/sc:code/@displayName='截止时间']/sc:observation/sc:effectiveTime/@value,9,2)" />
																时
																<xsl:value-of
																	select="substring(sc:section/sc:entry[sc:observation/sc:code/@displayName='截止时间']/sc:observation/sc:effectiveTime/@value,11,2)" />
																分
															</xsl:when>
															<xsl:when
																test="string-length(sc:section/sc:entry[sc:observation/sc:code/@displayName='截止时间']/sc:observation/sc:effectiveTime/@value)>0">
																<xsl:value-of
																	select="substring(sc:section/sc:entry[sc:observation/sc:code/@displayName='截止时间']/sc:observation/sc:effectiveTime/@value,1,4)" />
																年
																<xsl:value-of
																	select="substring(sc:section/sc:entry[sc:observation/sc:code/@displayName='截止时间']/sc:observation/sc:effectiveTime/@value,5,2)" />
																月
																<xsl:value-of
																	select="substring(sc:section/sc:entry[sc:observation/sc:code/@displayName='截止时间']/sc:observation/sc:effectiveTime/@value,7,2)" />
																日
															</xsl:when>
														</xsl:choose>
													</td>
												</tr>
												<tr>
													<td align="right">用药方式：</td>
													<td colspan="2">
														<xsl:value-of
															select="sc:section/sc:entry[sc:observation/sc:code/@displayName='用药方式']/sc:observation/sc:value" />
													</td>
													<td colspan="2">
														目的：
														<xsl:value-of
															select="sc:section/sc:entry[sc:observation/sc:code/@displayName='目的']/sc:observation/sc:text" />
													</td>
												</tr>
												<tr>
													<td align="right">治疗用药方式：</td>
													<td colspan="4">
														<xsl:value-of
															select="sc:section/sc:entry[sc:observation/sc:code/@displayName='治疗用药方式']/sc:observation/sc:value" />
													</td>
												</tr>
												<tr>
													<td align="right">预防用药方式：</td>
													<td colspan="4">
														<xsl:value-of
															select="sc:section/sc:entry[sc:observation/sc:code/@displayName='预防用药方式']/sc:observation/sc:value" />
													</td>
												</tr>
												<tr>
													<td align="right">预防用药指征：</td>
													<td colspan="4">
														<xsl:value-of
															select="sc:section/sc:entry[sc:observation/sc:code/@displayName='预防用药指征']/sc:observation/sc:value" />
													</td>
												</tr>
												<tr>
													<td align="right">预防用药效果：</td>
													<td colspan="4">
														<xsl:value-of
															select="sc:section/sc:entry[sc:observation/sc:code/@displayName='预防用药效果']/sc:observation/sc:value" />
													</td>
												</tr>
												<tr>
													<td align="right">联合用药：</td>
													<td colspan="4">
														<xsl:value-of
															select="sc:section/sc:entry[sc:observation/sc:code/@displayName='联合用药']/sc:observation/sc:value" />
													</td>
												</tr>
												<tr>
													<td align="right">术前用药时间：</td>
													<td colspan="2">
														<xsl:choose>
															<xsl:when
																test="string-length(sc:section/sc:entry[sc:observation/sc:code/@displayName='术前用药时间']/sc:observation/sc:value/@value)>8">
																<xsl:value-of
																	select="substring(sc:section/sc:entry[sc:observation/sc:code/@displayName='术前用药时间']/sc:observation/sc:value/@value,1,4)" />
																年
																<xsl:value-of
																	select="substring(sc:section/sc:entry[sc:observation/sc:code/@displayName='术前用药时间']/sc:observation/sc:value/@value,5,2)" />
																月
																<xsl:value-of
																	select="substring(sc:section/sc:entry[sc:observation/sc:code/@displayName='术前用药时间']/sc:observation/sc:value/@value,7,2)" />
																日
																<xsl:value-of
																	select="substring(sc:section/sc:entry[sc:observation/sc:code/@displayName='术前用药时间']/sc:observation/sc:value/@value,9,2)" />
																时
																<xsl:value-of
																	select="substring(sc:section/sc:entry[sc:observation/sc:code/@displayName='术前用药时间']/sc:observation/sc:value/@value,11,2)" />
																分
															</xsl:when>
															<xsl:when
																test="string-length(sc:section/sc:entry[sc:observation/sc:code/@displayName='术前用药时间']/sc:observation/sc:value/@value)>0">
																<xsl:value-of
																	select="substring(sc:section/sc:entry[sc:observation/sc:code/@displayName='术前用药时间']/sc:observation/sc:value/@value,1,4)" />
																年
																<xsl:value-of
																	select="substring(sc:section/sc:entry[sc:observation/sc:code/@displayName='术前用药时间']/sc:observation/sc:value/@value,5,2)" />
																月
																<xsl:value-of
																	select="substring(sc:section/sc:entry[sc:observation/sc:code/@displayName='术前用药时间']/sc:observation/sc:value/@value,7,2)" />
																日
															</xsl:when>
														</xsl:choose>
													</td>
													<td colspan="2">
														术后用药天数：
														<xsl:value-of
															select="sc:section/sc:entry[sc:observation/sc:code/@displayName='术后用药天数']/sc:observation/sc:repeatNumber/@value" />
													</td>
												</tr>
												<tr>
													<td align="right">药物不良反应：</td>
													<td colspan="2">
														<xsl:value-of
															select="sc:section/sc:entry[sc:observation/sc:code/@displayName='药物不良反应']/sc:observation/sc:value" />
													</td>
													<td colspan="2">
														二重感染：
														<xsl:value-of
															select="sc:section/sc:entry[sc:observation/sc:code/@displayName='二重感染']/sc:observation/sc:value" />
													</td>
												</tr>
											</xsl:for-each>
											<tr>
												<td colspan="5" align="center">
													<h4>药敏信息：</h4>
												</td>
											</tr>
											<xsl:for-each
												select="sc:component/sc:structuredBody/sc:component[sc:section/sc:code/@code='51899-3']/sc:section/sc:component[sc:section/sc:code/@code='365705006']/sc:section/sc:component">
												<tr>
													<td align="right">送检日期：</td>
													<td colspan="2">
														<xsl:choose>
															<xsl:when
																test="string-length(sc:section/sc:entry[sc:observation/sc:code/@displayName='送检日期']/sc:observation/sc:effectiveTime/@value)>8">
																<xsl:value-of
																	select="substring(sc:section/sc:entry[sc:observation/sc:code/@displayName='送检日期']/sc:observation/sc:effectiveTime/@value,1,4)" />
																年
																<xsl:value-of
																	select="substring(sc:section/sc:entry[sc:observation/sc:code/@displayName='送检日期']/sc:observation/sc:effectiveTime/@value,5,2)" />
																月
																<xsl:value-of
																	select="substring(sc:section/sc:entry[sc:observation/sc:code/@displayName='送检日期']/sc:observation/sc:effectiveTime/@value,7,2)" />
																日
																<xsl:value-of
																	select="substring(sc:section/sc:entry[sc:observation/sc:code/@displayName='送检日期']/sc:observation/sc:effectiveTime/@value,9,2)" />
																时
																<xsl:value-of
																	select="substring(sc:section/sc:entry[sc:observation/sc:code/@displayName='送检日期']/sc:observation/sc:effectiveTime/@value,11,2)" />
																分
															</xsl:when>
															<xsl:when
																test="string-length(sc:section/sc:entry[sc:observation/sc:code/@displayName='送检日期']/sc:observation/sc:effectiveTime/@value)>0">
																<xsl:value-of
																	select="substring(sc:section/sc:entry[sc:observation/sc:code/@displayName='送检日期']/sc:observation/sc:effectiveTime/@value,1,4)" />
																年
																<xsl:value-of
																	select="substring(sc:section/sc:entry[sc:observation/sc:code/@displayName='送检日期']/sc:observation/sc:effectiveTime/@value,5,2)" />
																月
																<xsl:value-of
																	select="substring(sc:section/sc:entry[sc:observation/sc:code/@displayName='送检日期']/sc:observation/sc:effectiveTime/@value,7,2)" />
																日
															</xsl:when>
														</xsl:choose>
													</td>
													<td colspan="2">
														样本：
														<xsl:value-of
															select="sc:section/sc:entry[sc:observation/sc:code/@displayName='样本']/sc:observation/sc:specimen/sc:specimenRole/sc:specimenPlayingEntity/sc:code/@displayName" />
													</td>
												</tr>
												<tr>
													<td align="right">检验方法：</td>
													<td colspan="2">
														<xsl:value-of
															select="sc:section/sc:entry[sc:observation/sc:code/@displayName='检验方法']/sc:observation/sc:methodCode/sc:translation/@displayName" />
													</td>
													<td colspan="2">
														病原体种类：
														<xsl:value-of
															select="sc:section/sc:entry[sc:observation/sc:code/@displayName='病原体种类']/sc:observation/sc:value" />
													</td>
												</tr>
												<tr>
													<td align="right">标本检验结果：</td>
													<td colspan="2">
														<xsl:value-of
															select="sc:section/sc:entry[sc:observation/sc:code/@displayName='标本检验结果']/sc:observation/sc:text" />
													</td>
													<td colspan="2"></td>
												</tr>
												<tr>
													<td colspan="3">
														病原菌抗生素药敏实验：
														<xsl:value-of
															select="sc:section/sc:entry[sc:observation/sc:code/@displayName='病原菌抗生素药敏实验']/sc:observation/sc:value" />
													</td>
													<td colspan="2">
														病原菌抗生素药敏结果：
														<xsl:value-of
															select="sc:section/sc:entry[sc:observation/sc:code/@displayName='病原菌抗生素药敏结果']/sc:observation/sc:value" />
													</td>
												</tr>
											</xsl:for-each>
											<xsl:for-each
												select="sc:component/sc:structuredBody/sc:component[sc:section/sc:code/@code='51899-3']/sc:section/sc:component[sc:section/sc:code/@code='359822006']/sc:section/sc:entry/sc:observation[sc:entryRelationship]">
												<tr>
													<td colspan="5" align="center">
														<h4>
															<xsl:value-of
																select="sc:entryRelationship/sc:organizer/sc:code/@displayName" />
														</h4>
													</td>
												</tr>
												<tr>
													<td colspan="3" align="center">
														<h4>抗生素</h4>
													</td>
													<td colspan="2" align="center">
														<h4>敏感度</h4>
													</td>
												</tr>
												<xsl:for-each
													select="sc:entryRelationship/sc:organizer/sc:component">
													<tr>
														<td colspan="3" align="center">
															<xsl:value-of select="sc:observation/sc:code/@displayName" />
														</td>
														<td colspan="2" align="center">
															<xsl:value-of select="sc:observation/sc:text" />
														</td>
													</tr>
												</xsl:for-each>
											</xsl:for-each>
										</table>
									</div>
								</td>
							</tr>
							<tr>
								<td colspan="2">
									<font color="red">*</font>
									填报人：
									<xsl:value-of
										select="sc:author/sc:assignedAuthor/sc:assignedPerson/sc:name" />
								</td>
								<td colspan="2">
									<font color="red">*</font>
									填报日期：
									<xsl:choose>
										<xsl:when test="string-length(sc:author/sc:time/@value)>8">
											<xsl:value-of select="substring(sc:author/sc:time/@value,1,4)" />
											年
											<xsl:value-of select="substring(sc:author/sc:time/@value,5,2)" />
											月
											<xsl:value-of select="substring(sc:author/sc:time/@value,7,2)" />
											日
											<xsl:value-of select="substring(sc:author/sc:time/@value,9,2)" />
											时
											<xsl:value-of select="substring(sc:author/sc:time/@value,11,2)" />
											分
										</xsl:when>
										<xsl:when test="string-length(sc:author/sc:time/@value)>0">
											<xsl:value-of select="substring(sc:author/sc:time/@value,1,4)" />
											年
											<xsl:value-of select="substring(sc:author/sc:time/@value,5,2)" />
											月
											<xsl:value-of select="substring(sc:author/sc:time/@value,7,2)" />
											日
										</xsl:when>
									</xsl:choose>
								</td>
							</tr>
						</table>
					</div>
				</div>
			</body>
		</html>
	</xsl:template>
</xsl:stylesheet>





