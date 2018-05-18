package com.founder.eds.dao;

import java.util.List;

import org.seasar.doma.AnnotateWith;
import org.seasar.doma.Annotation;
import org.seasar.doma.AnnotationTarget;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;
import org.seasar.doma.jdbc.SelectOptions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.founder.eds.dto.DataSourceDto;
import com.founder.eds.dto.DictServiceGroupDto;
import com.founder.eds.dto.ResultParamDto;
import com.founder.eds.dto.monitor.ServiceDeDto;
import com.founder.eds.entity.DataSource;
import com.founder.eds.entity.DataSourceEntity;
import com.founder.eds.entity.DictServiceGroup;
import com.founder.eds.entity.InputParam;
import com.founder.eds.entity.ResultParam;
import com.founder.eds.entity.ServiceDefinition;

@Dao
@AnnotateWith(annotations = {
		@Annotation(target = AnnotationTarget.CLASS, type = Component.class),
		@Annotation(target = AnnotationTarget.CONSTRUCTOR, type = Autowired.class) })
public interface ExternalDataDao {
	
	@Select
	public List<ServiceDeDto> selectServiceDefinition();
	
	@Select
	public List<DataSource>selectPullDown();
	
	@Select
	public List<DictServiceGroup> selectServicedf();
	
	@Select 
	public ServiceDefinition selectServiceDfinition(Integer key);
	
	@Select
	public List<InputParam>selectInputParam(Integer key);

	@Select
	public List<ResultParamDto> selectResultParam(Integer key) ;
	
	@Select
	public List<ResultParam> selectResultParamEntity(Integer key) ;
	
	@Insert
	public int externalDataServeSave(ServiceDefinition serviceDefinition);
	
	@Insert
	public int inputSave(InputParam  inputParam);
	
	@Insert 
	public int  resultSave(ResultParam resultParam);
	
	@Delete
	public int inputParamDele(InputParam inputParam);
	@Delete
	public int resultParamDele(ResultParam resultParam);
	@Delete
	public int serviceDefinitionDele(ServiceDefinition serviceDefinition);
	
	@Update
	public int externalDataServeUpdate(ServiceDefinition serviceDefinition);
	
	@Select
	public List<DataSourceDto> selectDataSource(DataSourceDto cond,
			SelectOptions selectOptions);
	
	@Insert
	public int dataSourceSave(DataSource dataSource);
	
	@Select
	public List<DataSourceEntity> selectDataSourcebyId(Integer integer,List<Integer>list);
	
	@Update
	public int dataSourceDelete(DataSource dataSource);
	
	@Select 
	public DataSourceDto selectDataSourceId(Integer dataSourceSn);
	
	@Select
	public DataSourceEntity selectAllDataSourceId(Integer dataSourceSn);
	
	@Update
	public int UpdateDataSource(DataSource dataSource);
	
	@Select
	public List<DictServiceGroup>selectServiceGroup(DictServiceGroupDto dictServiceGroupDto,SelectOptions selectOptions);
	
	@Insert
	public int groupManageSave(DictServiceGroup dictServiceGroup);
	
	@Select
	public List<DictServiceGroup>selectServiceGroupById(Integer integer,List<Integer> list);
	
	@Delete
	public int groupManageDelete(DictServiceGroup dictServiceGroup);
	
	@Select
	public DictServiceGroup groupManageUpdate(Integer  groupSn);
	
	@Update
	public int updateGroupManage(DictServiceGroup dictServiceGroup);
	
	@Select 
	public List<ServiceDefinition> selectServiceById(Integer integer,List<Integer> list);
	
	@Select
	public List<DictServiceGroup> selectgroupName(String  serviceGroupName);
	
	@Select
	public List<DictServiceGroup> selectgroupNameSn(DictServiceGroupDto dictServiceGroupDto);
}