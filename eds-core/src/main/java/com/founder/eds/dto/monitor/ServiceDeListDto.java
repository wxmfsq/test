package com.founder.eds.dto.monitor;

import java.util.Map;

public class ServiceDeListDto {
	
	public String name;
	public Map<Integer ,String >map;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Map<Integer, String> getMap() {
		return map;
	}
	public void setMap(Map<Integer, String> map) {
		this.map = map;
	}
}
