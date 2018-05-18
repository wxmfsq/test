package com.founder.eds.entity;

import java.math.BigDecimal;
import java.util.Date;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.GeneratedValue;
import org.seasar.doma.GenerationType;
import org.seasar.doma.Id;
import org.seasar.doma.SequenceGenerator;
import org.seasar.doma.Table;
import org.seasar.doma.Version;

@Entity(listener = InputParamListener.class)
@Table(name = "INPUT_PARAM")
public class InputParam {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(sequence = "SEQ_INPUT_PARAM")
    @Column(name = "INPUT_PARAM_SN")
	private BigDecimal inputParamSn;
	
	@Column(name = "SERVICE_DEFINITION_SN")
	private BigDecimal serviceDefinitionSn;
	
	@Column(name = "PARAM_NO")
	private BigDecimal paramNo;
	
	@Column(name = "PARAM_NAME")
	private String paramName;  
	
	@Column(name = "PARAM_TYPE")
	private String paramType;
	
	@Column(name = "MIN_TIMES")
	private BigDecimal minTimes;
	
	@Column(name = "MAX_TIMES")
	private String maxTimes;
	
	@Column(name = "PARAM_TEXT")
	private String paramText;
	
	@Column(name = "CREATE_TIME")
	private Date createTime;
	
	@Column(name = "UPDATE_TIME")
	private Date updateTime;
	
	@Column(name = "DELETE_FLAG")
	private String deleteFlag;
	
	@Column(name = "UPDATE_COUNT")
	@Version
	private BigDecimal updateCount;
	
	@Column(name = "DELETE_TIME")
	private Date deleteTime;
	
	@Column(name = "CREATEBY")
	private String createby;
	
	@Column(name = "UPDATEBY")
	private String updateby;
	
	@Column(name = "DELETEBY")
	private String deleteby;
	public BigDecimal getInputParamSn() {
		return inputParamSn;
	}

	public void setInputParamSn(BigDecimal inputParamSn) {
		this.inputParamSn = inputParamSn;
	}

	public BigDecimal getServiceDefinitionSn() {
		return serviceDefinitionSn;
	}

	public void setServiceDefinitionSn(BigDecimal serviceDefinitionSn) {
		this.serviceDefinitionSn = serviceDefinitionSn;
	}

	public BigDecimal getParamNo() {
		return paramNo;
	}

	public void setParamNo(BigDecimal paramNo) {
		this.paramNo = paramNo;
	}

	public String getParamName() {
		return paramName;
	}

	public void setParamName(String paramName) {
		this.paramName = paramName;
	}

	public String getParamType() {
		return paramType;
	}

	public void setParamType(String paramType) {
		this.paramType = paramType;
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

	public String getParamText() {
		return paramText;
	}

	public void setParamText(String paramText) {
		this.paramText = paramText;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getDeleteFlag() {
		return deleteFlag;
	}

	public void setDeleteFlag(String deleteFlag) {
		this.deleteFlag = deleteFlag;
	}

	public BigDecimal getUpdateCount() {
		return updateCount;
	}

	public void setUpdateCount(BigDecimal updateCount) {
		this.updateCount = updateCount;
	}

	public Date getDeleteTime() {
		return deleteTime;
	}

	public void setDeleteTime(Date deleteTime) {
		this.deleteTime = deleteTime;
	}

	public String getCreateby() {
		return createby;
	}

	public void setCreateby(String createby) {
		this.createby = createby;
	}

	public String getUpdateby() {
		return updateby;
	}

	public void setUpdateby(String updateby) {
		this.updateby = updateby;
	}

	public String getDeleteby() {
		return deleteby;
	}

	public void setDeleteby(String deleteby) {
		this.deleteby = deleteby;
	}
}
