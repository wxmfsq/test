package com.founder.eds.service.monitor;

import java.util.List;

import org.seasar.doma.jdbc.SelectOptions;

import com.founder.eds.dto.DataSourceDto;
import com.founder.eds.dto.DictServiceGroupDto;
import com.founder.eds.dto.ResultParamDto;
import com.founder.eds.dto.monitor.ServiceDeListDto;
import com.founder.eds.entity.DataSource;
import com.founder.eds.entity.DictServiceGroup;
import com.founder.eds.entity.InputParam;
import com.founder.eds.entity.ResultParam;
import com.founder.eds.entity.ServiceDefinition;

public interface ExternalDataService {
		
	public List<ServiceDeListDto> selectServiceDefinition();
	
	public List<DataSource>selectPullDown();
	
	public List<DictServiceGroup> selectServicedf();
	
	public ServiceDefinition selectServiceDfinition(Integer key);
	
	public List<InputParam>selectInputParam(Integer key);
	
	public List<ResultParamDto>selectResultParam(Integer key);
	
	public void externalDataServeSave(String sqlEtlTextC,String[] strB,String[] strC,String serviceName,String serviceType,
			String serviceUrl,String serviceGroup,String dataSourceSn,String description,
			String opMode,String dataEncode,String resultComposit);
	
	public void externalDataServeDelete(String serviceDefinitionSn);
	
	public void externalDataServeUpdate(String serviceDefinitionSn,String sqlEtlTextC,String[] strB,String[] strC,
			String serviceName,String serviceType,String serviceUrl,String serviceGroup,String dataSourceSn,
			String description,String opMode,String dataEncode,String resultComposit);
	
	public List<DataSourceDto> selectDataSource(DataSourceDto cond,SelectOptions selectOptions);
	
	public void dataSourceSave(DataSourceDto dataSourceSearch);
	
	public void dataSourceDelete(String strs);
	
	public DataSourceDto selectDataSourceId(Integer dataSourceSn);
	
	public void UpdateDataSource(DataSourceDto dataSourceSearch);
	
	public List<DictServiceGroup>selectServiceGroup(DictServiceGroupDto dictServiceGroupDto,SelectOptions selectOptions);
	
	public int groupManageSave(DictServiceGroupDto dictServiceGroupDto); 
	
	public int groupManageDelete(String groupSn);
	
	public DictServiceGroup groupManageUpdate(Integer groupSn);
	
	public int  updateGroupManage(DictServiceGroupDto  dictServiceGroupDto);
}
