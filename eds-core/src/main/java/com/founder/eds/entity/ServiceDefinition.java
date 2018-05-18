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


@Entity(listener = ServiceDefinitionListener.class)
@Table(name = "SERVICE_DEFINITION")
public class ServiceDefinition {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(sequence = "SEQ_SERVICE_DEFINITION")
    @Column(name = "SERVICE_DEFINITION_SN")
	private BigDecimal serviceDefinitionSn;
	
	@Column(name = "DATA_SOURCE_SN")
	private BigDecimal dataSourceSn;
	
	@Column(name = "SERVICE_NAME")
	private String serviceName;
	
	@Column(name = "SERVICE_TYPE")
	private String serviceType;
	
	@Column(name = "SERVICE_URL")
	private String serviceUrl;
	
	@Column(name = "SERVICE_GROUP")
	private String serviceGroup;
	
	@Column(name = "DESCRIPTION")
	private String description;
	
	@Column(name = "OP_MODE")
	private String opMode;
	
	@Column(name = "DATA_ENCODE")
	private String dataEncode;
	
	@Column(name = "RESULT_COMPOSIT")
	private String resultComposit;
	
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

	public BigDecimal getServiceDefinitionSn() {
		return serviceDefinitionSn;
	}

	public void setServiceDefinitionSn(BigDecimal serviceDefinitionSn) {
		this.serviceDefinitionSn = serviceDefinitionSn;
	}

	public BigDecimal getDataSourceSn() {
		return dataSourceSn;
	}

	public void setDataSourceSn(BigDecimal dataSourceSn) {
		this.dataSourceSn = dataSourceSn;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getServiceType() {
		return serviceType;
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public String getServiceUrl() {
		return serviceUrl;
	}

	public void setServiceUrl(String serviceUrl) {
		this.serviceUrl = serviceUrl;
	}

	public String getServiceGroup() {
		return serviceGroup;
	}

	public void setServiceGroup(String serviceGroup) {
		this.serviceGroup = serviceGroup;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getOpMode() {
		return opMode;
	}

	public void setOpMode(String opMode) {
		this.opMode = opMode;
	}

	public String getDataEncode() {
		return dataEncode;
	}

	public void setDataEncode(String dataEncode) {
		this.dataEncode = dataEncode;
	}

	public String getResultComposit() {
		return resultComposit;
	}

	public void setResultComposit(String resultComposit) {
		this.resultComposit = resultComposit;
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
