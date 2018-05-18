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
@Entity
@Table(name = "DATA_SOURCE")
public class DataSourceEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(sequence = "SEQ_DATA_SOURCE")
    @Column(name = "DATA_SOURCE_SN")
	private BigDecimal dataSourceSn;
	
	@Column(name = "CONNECTION_NAME")
	private String connectionName;
	
	@Column(name = "DATABASE_TYPE")
	private String databaseType;
	
	@Column(name = "CONNECTION_URL")
	private String connectionUrl;
	
	@Column(name = "user")
	private String user;
	
	@Column(name = "PASSWORD")
	private String passWord;
	
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

	public BigDecimal getDataSourceSn() {
		return dataSourceSn;
	}

	public void setDataSourceSn(BigDecimal dataSourceSn) {
		this.dataSourceSn = dataSourceSn;
	}

	public String getConnectionName() {
		return connectionName;
	}

	public void setConnectionName(String connectionName) {
		this.connectionName = connectionName;
	}

	public String getDatabaseType() {
		return databaseType;
	}

	public void setDatabaseType(String databaseType) {
		this.databaseType = databaseType;
	}

	public String getConnectionUrl() {
		return connectionUrl;
	}

	public void setConnectionUrl(String connectionUrl) {
		this.connectionUrl = connectionUrl;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
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
