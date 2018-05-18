package com.founder.eds.dto;

import org.seasar.doma.Entity;

@Entity
public class ServiceDefinitionDto {
	
	public Integer dataSourceSn;
	public String  serviceGroup;
	public Integer getDataSourceSn() {
		return dataSourceSn;
	}
	public void setDataSourceSn(Integer dataSourceSn) {
		this.dataSourceSn = dataSourceSn;
	}
	public String getServiceGroup() {
		return serviceGroup;
	}
	public void setServiceGroup(String serviceGroup) {
		this.serviceGroup = serviceGroup;
	}
}
