package com.founder.eds.dto;

import org.seasar.doma.Entity;

@Entity
public class DictServiceGroupDto extends PagingDto{
	
	private Integer groupSn;
	private String serviceGroupName;
	private String memo;
	public Integer getGroupSn() {
		return groupSn;
	}
	public void setGroupSn(Integer groupSn) {
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
	
}
