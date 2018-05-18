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

@Entity(listener = ResultParamListener.class)
@Table(name = "RESULT_PARAM")
public class ResultParam {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(sequence = "SEQ_RESULT_PARAM")
    @Column(name = "RESULT_SN")
	private BigDecimal resultSn;
	
	@Column(name = "SERVICE_DEFINITION_SN")
	private BigDecimal serviceDefinitionSn;
	
	@Column(name = "DATA_GROUP_NAME_EN")
	private String dataGroupNameEn;
	
	@Column(name = "DATA_GROUP_NAME_CN")
	private String dataGroupNameCn;
	
	@Column(name = "MIN_TIMES")
	private BigDecimal minTimes;
	
	@Column(name = "MAX_TIMES")
	private String maxTimes;
	
	@Column(name = "PARENT_SN")
	private BigDecimal paraentSn;
	
	@Column(name = "SQL_TEXT")
	private String sqlText;
	
	@Column(name = "DATA_GROUP_NO")
	private BigDecimal dataGroupNo;
	
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

	public BigDecimal getDataGroupNo() {
		return dataGroupNo;
	}

	public void setDataGroupNo(BigDecimal dataGroupNo) {
		this.dataGroupNo = dataGroupNo;
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
