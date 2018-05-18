package com.founder.eds.service.monitor.Impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.seasar.doma.jdbc.SelectOptions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.founder.eds.core.Constants;
import com.founder.eds.dao.ExternalDataDao;
import com.founder.eds.dto.DataSourceDto;
import com.founder.eds.dto.DefaultUserDetails;
import com.founder.eds.dto.DictServiceGroupDto;
import com.founder.eds.dto.ResultParamDto;
import com.founder.eds.dto.monitor.ServiceDeDto;
import com.founder.eds.dto.monitor.ServiceDeListDto;
import com.founder.eds.entity.DataSource;
import com.founder.eds.entity.DataSourceEntity;
import com.founder.eds.entity.DictServiceGroup;
import com.founder.eds.entity.InputParam;
import com.founder.eds.entity.ResultParam;
import com.founder.eds.entity.ServiceDefinition;
import com.founder.eds.service.monitor.ExternalDataService;
import com.founder.eds.util.DateUtils;

@Service
public class ExternalDataServiceImpl implements ExternalDataService{
	
	@Autowired
    private ExternalDataDao externalDataDao;
	
	@Override
	public List<ServiceDeListDto> selectServiceDefinition() {
		//查询数据的集合
		List<ServiceDeDto> serviceDefinition=externalDataDao.selectServiceDefinition();
		//最终返回集合
		List<ServiceDeListDto>serviceDeListDtos=new ArrayList<ServiceDeListDto>();
		if(serviceDefinition.size()>0){
			Integer index=0;
			//由于group是固定，index是自增的所以先把值取出防止溢出
			int groups=serviceDefinition.get(index).getServiceGroups();
			for(int i=0;i<groups;i++){
				//传值数据
				ServiceDeListDto serviceListDtos=new ServiceDeListDto();
				Map<Integer,String>map=new HashMap<Integer,String>();
				//同理由于name是固定，index是自增的所以先把值取出防止溢出
				int names=serviceDefinition.get(index).getServiceNames();
				for(int k=0;k<names;k++){
					map.put(serviceDefinition.get(index).getServiceDefinitionSn(),serviceDefinition.get(index).getServiceName());
					serviceListDtos.setName(serviceDefinition.get(index).getServiceGroupName());
					index++;
				}
				serviceListDtos.setMap(map);
				serviceDeListDtos.add(serviceListDtos);
			}
		}
		return serviceDeListDtos;
	}

	@Override
	public List<DataSource> selectPullDown() {
		
		return externalDataDao.selectPullDown();
	}

	@Override
	public List<DictServiceGroup> selectServicedf() {

		return  externalDataDao.selectServicedf();
	}

	@Override
	public ServiceDefinition selectServiceDfinition(Integer key) {
		
		return externalDataDao.selectServiceDfinition(key);
	}

	@Override
	public List<InputParam> selectInputParam(Integer key) {

		return externalDataDao.selectInputParam(key);
	}

	@Override
	public List<ResultParamDto> selectResultParam(Integer key) {

		return externalDataDao.selectResultParam(key);
	}

	@Override
	@Transactional
	public void externalDataServeSave(String sqlEtlTextC,String[] strB, String[] strC,
			String serviceName, String serviceType, String serviceUrl,
			String serviceGroup, String dataSourceSn, String description,
			String opMode, String dataEncode, String resultComposit) {
		//保存数据服务接口数据
		ServiceDefinition serviceDefinition=new ServiceDefinition();
		serviceDefinition.setServiceName(serviceName);
		serviceDefinition.setServiceType(serviceType);
		serviceDefinition.setServiceUrl(serviceUrl);
		serviceDefinition.setServiceGroup(serviceGroup);
		serviceDefinition.setDataSourceSn(new BigDecimal(dataSourceSn));
		serviceDefinition.setDescription(description);
		serviceDefinition.setOpMode(opMode);
		serviceDefinition.setDataEncode(dataEncode);
		serviceDefinition.setResultComposit(resultComposit);
		serviceDefinition.setDeleteFlag("0");
		externalDataDao.externalDataServeSave(serviceDefinition);
		//获取插入的当前ID
		BigDecimal serviceDefinitionSn=new BigDecimal(0);
		serviceDefinitionSn=serviceDefinition.getServiceDefinitionSn();
		//保存input数据
		InputParam  inputParam=new InputParam();
		//解析strB
		List<String >list=new ArrayList<String >();
		String[] strs=new String[5];
		
		for(int i=0;i<strB.length;i++){
				list.add(strB[i]);
		}
		for (int k=0;k<list.size();k++){
			strs=list.get(k).split(",");
			inputParam.setParamNo(new BigDecimal(strs[0]));
			inputParam.setParamName(strs[1]);
			inputParam.setParamType(strs[2]);
			inputParam.setMinTimes(new BigDecimal(strs[3]));
			inputParam.setMaxTimes(strs[4]);
			if("=".equals(strs[5])){
				inputParam.setParamText("");
			}else{
				inputParam.setParamText(strs[5]);
			}
			inputParam.setServiceDefinitionSn(serviceDefinitionSn);
			inputParam.setDeleteFlag("0");
			externalDataDao.inputSave(inputParam);
		}
		//保存result数据 分两种情况，如果 A层级机构和 B与结果一致
		ResultParam  resultParam=new ResultParam();
		//B
		if("S001".equals(resultComposit)){
			resultParam.setDataGroupNameCn(null);
			resultParam.setDataGroupNameEn(null);
			resultParam.setMinTimes(null);
			resultParam.setMaxTimes(null);
			resultParam.setSqlText(sqlEtlTextC);
			resultParam.setServiceDefinitionSn(serviceDefinitionSn);
			resultParam.setParaentSn(null);
			resultParam.setDataGroupNo(null);
			resultParam.setDeleteFlag("0");
			externalDataDao.resultSave(resultParam);
		//A
		}else if("S002".equals(resultComposit)){
			//解析strC
			List<String >listc=new ArrayList<String >();
			String[] strsc=new String[7];
				for(int i=0;i<strC.length;i++){
					if(strC[i]!=""){
						listc.add(strC[i]);
					}
				}
			//获得插入的父元素sn做准备
				Map<String,BigDecimal>map=new HashMap<String,BigDecimal>();
				
				for(int k=0;k<listc.size();k++){
					strsc=listc.get(k).split(",,");
					//第五项有值就是子元素 没有就是正常的添加
					if("=".equals(strsc[5])){
						resultParam.setDataGroupNameCn(strsc[1]);
						resultParam.setDataGroupNameEn(strsc[0]);
						resultParam.setMinTimes(new BigDecimal(strsc[2]));
						resultParam.setMaxTimes(strsc[3]);
						resultParam.setSqlText(strsc[4]);
						resultParam.setServiceDefinitionSn(serviceDefinitionSn);
						resultParam.setParaentSn(null);
						resultParam.setDataGroupNo(new BigDecimal(strsc[6]));
						resultParam.setDeleteFlag("0");
						externalDataDao.resultSave(resultParam);
						map.put(resultParam.getDataGroupNameEn(), resultParam.getResultSn());
					}else{
						resultParam.setDataGroupNameCn(strsc[1]);
						resultParam.setDataGroupNameEn(strsc[0]);
						resultParam.setMinTimes(new BigDecimal(strsc[2]));
						resultParam.setMaxTimes(strsc[3]);
						resultParam.setSqlText(strsc[4]);
						resultParam.setServiceDefinitionSn(serviceDefinitionSn);
						resultParam.setParaentSn(map.get(strsc[5]));
						resultParam.setDataGroupNo(new BigDecimal(strsc[6]));
						resultParam.setDeleteFlag("0");
						externalDataDao.resultSave(resultParam);
						map.put(resultParam.getDataGroupNameEn(), resultParam.getResultSn());
					}
				}
		}
		
	}
	//设计缺陷修改先查询出来再去删除，不然直接导致无数据删除失败
	@Override
	public void externalDataServeDelete(String serviceDefinitionSn) {
		ServiceDefinition serviceDefinition=new ServiceDefinition();
		serviceDefinition=selectServiceDfinition(Integer.parseInt(serviceDefinitionSn));
		List<InputParam>  inputParam=new ArrayList<InputParam>();
		inputParam=selectInputParam(Integer.parseInt(serviceDefinitionSn));
		List<ResultParam>  resultParam=new ArrayList<ResultParam>();
		resultParam=externalDataDao.selectResultParamEntity(Integer.parseInt(serviceDefinitionSn));
		for(InputParam inputParams:inputParam){
			externalDataDao.inputParamDele(inputParams);
		}
		for(ResultParam resultParams:resultParam){
			externalDataDao.resultParamDele(resultParams);
		}
		externalDataDao.serviceDefinitionDele(serviceDefinition);
	}

	@Override
	public void externalDataServeUpdate(String serviceDefinitionSn,
			String sqlEtlTextC, String[] strB, String[] strC,
			String serviceName, String serviceType, String serviceUrl,
			String serviceGroup, String dataSourceSn, String description,
			String opMode, String dataEncode, String resultComposit) {
		// 分两大步走 首先删除之前inputParam 和ResultParam 数据 然后再去修改对外接口数据表 ，进行从新插入
		//删除之前数据
		
		List<InputParam>  inputParamDel=new ArrayList<InputParam>();
		inputParamDel=selectInputParam(Integer.parseInt(serviceDefinitionSn));
		List<ResultParam>  resultParamDel=new ArrayList<ResultParam>();
		resultParamDel=externalDataDao.selectResultParamEntity(Integer.parseInt(serviceDefinitionSn));
		for(InputParam inputParams:inputParamDel){
			externalDataDao.inputParamDele(inputParams);
		}
		for(ResultParam resultParams:resultParamDel){
			externalDataDao.resultParamDele(resultParams);
		}
		
		//保存数据
		//对数据服务接口数据进行修改操作 一  :检索出要修改数据,二: 修改保存.
		//一 检索出要修改数据
		
				ServiceDefinition serviceDefinition=externalDataDao.selectServiceDfinition(Integer.parseInt(serviceDefinitionSn));
				serviceDefinition.setServiceName(serviceName);
				serviceDefinition.setServiceType(serviceType);
				serviceDefinition.setServiceUrl(serviceUrl);
				serviceDefinition.setServiceGroup(serviceGroup);
				serviceDefinition.setDataSourceSn(new BigDecimal(dataSourceSn));
				serviceDefinition.setDescription(description);
				serviceDefinition.setOpMode(opMode);
				serviceDefinition.setDataEncode(dataEncode);
				serviceDefinition.setResultComposit(resultComposit);
				externalDataDao.externalDataServeUpdate(serviceDefinition);
		//二 修改保存		
				
				
				//保存input数据
				InputParam  inputParam=new InputParam();
				//解析strB
				List<String >list=new ArrayList<String >();
				String[] strs=new String[5];
				
				for(int i=0;i<strB.length;i++){
						list.add(strB[i]);
				}
				for (int k=0;k<list.size();k++){
					strs=list.get(k).split(",");
					inputParam.setParamNo(new BigDecimal(strs[0]));
					inputParam.setParamName(strs[1]);
					inputParam.setParamType(strs[2]);
					inputParam.setMinTimes(new BigDecimal(strs[3]));
					inputParam.setMaxTimes(strs[4]);
					if("=".equals(strs[5])){
						inputParam.setParamText("");
					}else{
						inputParam.setParamText(strs[5]);
					}
					inputParam.setServiceDefinitionSn(new BigDecimal(serviceDefinitionSn));
					inputParam.setDeleteFlag("0");
					externalDataDao.inputSave(inputParam);
				}
				//保存result数据 分两种情况，如果 A层级机构和 B与结果一致
				ResultParam  resultParam=new ResultParam();
				//B
				if("S001".equals(resultComposit)){
					resultParam.setDataGroupNameCn(null);
					resultParam.setDataGroupNameEn(null);
					resultParam.setMinTimes(null);
					resultParam.setMaxTimes(null);
					resultParam.setSqlText(sqlEtlTextC);
					resultParam.setServiceDefinitionSn(new BigDecimal(serviceDefinitionSn));
					resultParam.setParaentSn(null);
					resultParam.setDataGroupNo(null);
					resultParam.setDeleteFlag("0");
					externalDataDao.resultSave(resultParam);
				//A
				}else if("S002".equals(resultComposit)){
					//解析strC
					List<String >listc=new ArrayList<String >();
					String[] strsc=new String[7];
						for(int i=0;i<strC.length;i++){
							if(strC[i]!=""){
								listc.add(strC[i]);
							}
						}
					//获得插入的父元素sn做准备
						Map<String,BigDecimal>map=new HashMap<String,BigDecimal>();
						
						for(int k=0;k<listc.size();k++){
							strsc=listc.get(k).split(",,");
							//第五项有值就是子元素 没有就是正常的添加
							if("=".equals(strsc[5])){
								resultParam.setDataGroupNameCn(strsc[1]);
								resultParam.setDataGroupNameEn(strsc[0]);
								resultParam.setMinTimes(new BigDecimal(strsc[2]));
								resultParam.setMaxTimes(strsc[3]);
								resultParam.setSqlText(strsc[4]);
								resultParam.setServiceDefinitionSn(new BigDecimal(serviceDefinitionSn));
								resultParam.setParaentSn(null);
								resultParam.setDataGroupNo(new BigDecimal(strsc[6]));
								resultParam.setDeleteFlag("0");
								externalDataDao.resultSave(resultParam);
								map.put(resultParam.getDataGroupNameEn(), resultParam.getResultSn());
							}else{
								resultParam.setDataGroupNameCn(strsc[1]);
								resultParam.setDataGroupNameEn(strsc[0]);
								resultParam.setMinTimes(new BigDecimal(strsc[2]));
								resultParam.setMaxTimes(strsc[3]);
								resultParam.setSqlText(strsc[4]);
								resultParam.setServiceDefinitionSn(new BigDecimal(serviceDefinitionSn));
								resultParam.setParaentSn(map.get(strsc[5]));
								resultParam.setDataGroupNo(new BigDecimal(strsc[6]));
								resultParam.setDeleteFlag("0");
								externalDataDao.resultSave(resultParam);
								map.put(resultParam.getDataGroupNameEn(), resultParam.getResultSn());
							}
						}
				}
	}

	@Override
	public List<DataSourceDto> selectDataSource(DataSourceDto cond,
			SelectOptions selectOptions) {
		
		return externalDataDao.selectDataSource(cond, selectOptions);
	}

	@Override
	public void dataSourceSave(DataSourceDto dataSourceSearch) {
		DataSource dataSource=new DataSource();
		dataSource.setConnectionName(dataSourceSearch.getConnectionName().trim());
		dataSource.setDatabaseType(dataSourceSearch.getDatabaseType());
		dataSource.setConnectionUrl(dataSourceSearch.getConnectionUrl().trim());
		dataSource.setUser(dataSourceSearch.getUser().trim());
		dataSource.setPassWord(dataSourceSearch.getPassWord().trim());
		dataSource.setDeleteFlag("0");
		externalDataDao.dataSourceSave(dataSource);
	}
	@Override
	public void dataSourceDelete(String strs){
		DefaultUserDetails userDetails = (DefaultUserDetails) SecurityContextHolder
				.getContext().getAuthentication().getPrincipal();
		String[] str=strs.split(",");
		List<Integer>list=new ArrayList<Integer>();
		for (int i=0;i<str.length;i++){
			list.add(Integer.parseInt(str[i]));
		}
		List<DataSourceEntity>lists=new ArrayList<DataSourceEntity>();
		Integer integer=0;
		lists=externalDataDao.selectDataSourcebyId(integer,list);
		List<DataSource>dataSourcelist=new ArrayList<DataSource>();
		DataSource dataSources=new DataSource();
		//由DataSourceEntity 赋值给DataSource
		for(DataSourceEntity dataSourceEntity:lists){
			dataSources=returnDateSource(dataSourceEntity);
			dataSourcelist.add(dataSources);
		}
		for(DataSource dataSource:dataSourcelist){
			dataSource.setDeleteFlag(Constants.UPDATE_COUNT_DEFAULT);
			dataSource.setDeleteby(userDetails.getUsername());
			dataSource.setDeleteTime(DateUtils.getSystemTime());
			dataSource.setUpdateby(userDetails.getUsername());
			dataSource.setUpdateTime(DateUtils.getSystemTime());
			externalDataDao.dataSourceDelete(dataSource);
		}
	}

	@Override
	public DataSourceDto selectDataSourceId(Integer dataSourceSn) {

		return externalDataDao.selectDataSourceId(dataSourceSn);
	}

	@Override
	public void UpdateDataSource(DataSourceDto dataSourceSearch) {
		DataSourceEntity dataSourceEntity=new DataSourceEntity();
		DataSource dataSource=new DataSource();
		dataSourceEntity=externalDataDao.selectAllDataSourceId(dataSourceSearch.getDataSourceSn());
		dataSource=returnDateSource(dataSourceEntity);
		dataSource.setConnectionName(dataSourceSearch.getConnectionName().trim());
		dataSource.setConnectionUrl(dataSourceSearch.getConnectionUrl().trim());
		dataSource.setDatabaseType(dataSourceSearch.getDatabaseType());
		dataSource.setUser(dataSourceSearch.getUser().trim());
		dataSource.setPassWord(dataSourceSearch.getPassWord().trim());
		externalDataDao.UpdateDataSource(dataSource);
	}
	//由于user在数据库是关键字，再次转换，封装；
	public DataSource returnDateSource(DataSourceEntity dataSourceEntity){
		DataSource dataSource=new DataSource();
		dataSource.setDataSourceSn(dataSourceEntity.getDataSourceSn());
		dataSource.setConnectionName(dataSourceEntity.getConnectionName());
		dataSource.setConnectionUrl(dataSourceEntity.getConnectionUrl());
		dataSource.setDatabaseType(dataSourceEntity.getDatabaseType());
		dataSource.setUser(dataSourceEntity.getUser());
		dataSource.setPassWord(dataSourceEntity.getPassWord());
		dataSource.setCreateby(dataSourceEntity.getCreateby());
		dataSource.setCreateTime(dataSourceEntity.getCreateTime());
		dataSource.setDeleteby(dataSourceEntity.getDeleteby());
		dataSource.setDeleteFlag(dataSourceEntity.getDeleteFlag());
		dataSource.setDeleteTime(dataSourceEntity.getDeleteTime());
		dataSource.setUpdateby(dataSourceEntity.getUpdateby());
		dataSource.setUpdateCount(dataSourceEntity.getUpdateCount());
		dataSource.setUpdateTime(dataSourceEntity.getUpdateTime());
		return dataSource;
	}

	@Override
	public List<DictServiceGroup> selectServiceGroup(
			DictServiceGroupDto dictServiceGroupDto,SelectOptions selectOptions) {
		
		return externalDataDao.selectServiceGroup(dictServiceGroupDto, selectOptions);
	}

	@Override
	public int groupManageSave(DictServiceGroupDto dictServiceGroupDto) {
		DictServiceGroup dictServiceGroup=new DictServiceGroup();
		int returnBack=0;
		//判断与之前数据是否重复
		List<DictServiceGroup> dictServiceGroups=externalDataDao.selectgroupName(dictServiceGroupDto.getServiceGroupName());
		if(dictServiceGroups.size()>0){
			returnBack=1;
		}else{
			dictServiceGroup.setServiceGroupName(dictServiceGroupDto.getServiceGroupName());
			dictServiceGroup.setMemo(dictServiceGroupDto.getMemo());
			dictServiceGroup.setDeleteFlag("0");
			externalDataDao.groupManageSave(dictServiceGroup);
		}
		
		return returnBack;
	}

	@Override
	public int groupManageDelete(String groupSn) {
		DefaultUserDetails userDetails = (DefaultUserDetails) SecurityContextHolder
				.getContext().getAuthentication().getPrincipal();
		String[] str=groupSn.split(",");
		List<Integer>list=new ArrayList<Integer>();
		for (int i=0;i<str.length;i++){
			list.add(Integer.parseInt(str[i]));
		}
		List<DictServiceGroup>lists=new ArrayList<DictServiceGroup>();
		Integer integer=0;
		//验证是否在用
		List<ServiceDefinition>serviceDefinition=new ArrayList<ServiceDefinition>();
		serviceDefinition=externalDataDao.selectServiceById(integer, list);
		if(serviceDefinition.size()==0){
			lists=externalDataDao.selectServiceGroupById(integer,list);
			//循环删除
			for(DictServiceGroup dictServiceGroup:lists){
				dictServiceGroup.setDeleteFlag(Constants.UPDATE_COUNT_DEFAULT);
				dictServiceGroup.setDeleteby(userDetails.getUsername());
				dictServiceGroup.setDeleteTime(DateUtils.getSystemTime());
				dictServiceGroup.setUpdateby(userDetails.getUsername());
				dictServiceGroup.setUpdateTime(DateUtils.getSystemTime());
				externalDataDao.groupManageDelete(dictServiceGroup);
			}
		}else{
			integer=1;
		}
		return integer;
	}

	@Override
	public DictServiceGroup groupManageUpdate(Integer groupSn) {
		
		return externalDataDao.groupManageUpdate( groupSn);
	}

	@Override
	public int updateGroupManage(DictServiceGroupDto dictServiceGroupDto) {
		int returnBack=0;
		//判断与之前数据是否重复
		List<DictServiceGroup> dictServiceGroups=externalDataDao.selectgroupNameSn(dictServiceGroupDto);
		if(dictServiceGroups.size()>0){
			returnBack=1;
		}else{
		DictServiceGroup  dictServiceGroup=externalDataDao.groupManageUpdate( dictServiceGroupDto.getGroupSn());
		if(dictServiceGroup!=null){
			dictServiceGroup.setServiceGroupName(dictServiceGroupDto.getServiceGroupName());
			dictServiceGroup.setMemo(dictServiceGroupDto.getMemo());
			externalDataDao.updateGroupManage(dictServiceGroup);
		}
		}
		return returnBack;
	}
}
