package com.founder.eds.dto;

import java.math.BigDecimal;

import org.seasar.doma.Entity;

@Entity
public class ResultParamDto {
	
	private String dataGroupName;
	
	private BigDecimal resultSn;
	
	private BigDecimal serviceDefinitionSn;
	
	private String dataGroupNameEn;
	
	private String dataGroupNameCn;
	
	private BigDecimal minTimes;
	
	private String maxTimes;
	
	private BigDecimal paraentSn;
	
	private String sqlText;
	
	private BigDecimal dataGroupNo;
	
	public BigDecimal getDataGroupNo() {
		return dataGroupNo;
	}

	public void setDataGroupNo(BigDecimal dataGroupNo) {
		this.dataGroupNo = dataGroupNo;
	}

	public String getDataGroupName() {
		return dataGroupName;
	}

	public void setDataGroupName(String dataGroupName) {
		this.dataGroupName = dataGroupName;
	}

	public BigDecimal getResultSn() {
		return resultSn;
	}

	public void setResultSn(BigDecimal resultSn) {
		this.resultSn = resultSn;
	}

	public BigDecimal getServiceDefinitionSn() {
		return serviceDefinitionSn;
	}

	public void setServiceDefinitionSn(BigDecimal serviceDefinitionSn) {
		this.serviceDefinitionSn = serviceDefinitionSn;
	}

	public String getDataGroupNameEn() {
		return dataGroupNameEn;
	}

	public void setDataGroupNameEn(String dataGroupNameEn) {
		this.dataGroupNameEn = dataGroupNameEn;
	}

	public String getDataGroupNameCn() {
		return dataGroupNameCn;
	}

	public void setDataGroupNameCn(String dataGroupNameCn) {
		this.dataGroupNameCn = dataGroupNameCn;
	}

	public BigDecimal getMinTimes() {
		return minTimes;
	}

	public void setMinTimes(BigDecimal minTimes) {
		this.minTimes = minTimes;
	}

	public String getMaxTimes() {
		return maxTimes;
	}

	public void setMaxTimes(String maxTimes) {
		this.maxTimes = maxTimes;
	}

	public BigDecimal getParaentSn() {
		return paraentSn;
	}

	public void setParaentSn(BigDecimal paraentSn) {
		this.paraentSn = paraentSn;
	}

	public String getSqlText() {
		return sqlText;
	}

	public void setSqlText(String sqlText) {
		this.sqlText = sqlText;
	}
	
}
