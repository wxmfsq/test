package com.founder.eds.dto.monitor;

import org.seasar.doma.Entity;

@Entity
public class ServiceDeDto {
	
	public Integer  serviceDefinitionSn;
    public String   serviceGroup;
    public String   serviceName;
    public Integer  serviceGroups;
    public Integer  serviceNames;
    public String   serviceGroupName;
	public Integer getServiceDefinitionSn() {
		return serviceDefinitionSn;
	}
	public void setServiceDefinitionSn(Integer serviceDefinitionSn) {
		this.serviceDefinitionSn = serviceDefinitionSn;
	}
	public String getServiceGroup() {
		return serviceGroup;
	}
	public void setServiceGroup(String serviceGroup) {
		this.serviceGroup = serviceGroup;
	}
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	public Integer getServiceGroups() {
		return serviceGroups;
	}
	public void setServiceGroups(Integer serviceGroups) {
		this.serviceGroups = serviceGroups;
	}
	public Integer getServiceNames() {
		return serviceNames;
	}
	public void setServiceNames(Integer serviceNames) {
		this.serviceNames = serviceNames;
	}
	public String getServiceGroupName() {
		return serviceGroupName;
	}
	public void setServiceGroupName(String serviceGroupName) {
		this.serviceGroupName = serviceGroupName;
	}
    
}
