package com.founder.eds.dto;


import org.seasar.doma.Entity;


@Entity
public class DataSourceDto extends PagingDto{
	
	private Integer dataSourceSn;
	
	private String connectionName;
	
	private String databaseType;
	
	private String connectionUrl;
	
	private String user;
	
	private String passWord;

	public Integer getDataSourceSn() {
		return dataSourceSn;
	}

	public void setDataSourceSn(Integer dataSourceSn) {
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
	
}
