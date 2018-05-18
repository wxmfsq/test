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

@Entity(listener = DictServiceGroupListener.class)
@Table(name = "DICT_SERVICE_GROUP")
public class DictServiceGroup {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(sequence = "SEQ_DICT_SERVICE_GROUP")
    @Column(name = "GROUP_SN")
	private BigDecimal groupSn;
	
	@Column(name = "SERVICE_GROUP_NAME")
	private String serviceGroupName;
	
	@Column(name = "MEMO")
	private String memo;
	
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

	public BigDecimal getGroupSn() {
		return groupSn;
	}

	public void setGroupSn(BigDecimal groupSn) {
		this.groupSn = groupSn;
	}

	public String getServiceGroupName() {
		return serviceGroupName;
	}

	public void setServiceGroupName(String serviceGroupName) {
		this.serviceGroupName = serviceGroupName;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
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
