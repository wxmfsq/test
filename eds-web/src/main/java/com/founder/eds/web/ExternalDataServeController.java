package com.founder.eds.web;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.seasar.doma.jdbc.SelectOptions;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

import com.founder.eds.cache.DictionaryCache;
import com.founder.eds.core.Constants;
import com.founder.eds.dto.DictServiceGroupDto;
import com.founder.eds.dto.DictionaryCacheDto;
import com.founder.eds.dto.ResultParamDto;
import com.founder.eds.dto.ServiceDefinitionDto;
import com.founder.eds.dto.monitor.ServiceDeDto;
import com.founder.eds.dto.monitor.ServiceDeListDto;
import com.founder.eds.entity.DataSource;
import com.founder.eds.entity.DictServiceGroup;
import com.founder.eds.entity.InputParam;
import com.founder.eds.entity.ResultParam;
import com.founder.eds.entity.ServiceDefinition;
import com.founder.eds.service.monitor.ExternalDataService;
import com.founder.eds.web.util.TermCache;

/**
 * 对外数据服务Controller
 * 
 * @version 1.0, 2014/8/26 14:30:00
 * @author wangxiaomin
 */
@Controller
@RequestMapping("/externalDataServe")
public class ExternalDataServeController extends AbstractController implements ApplicationContextAware{
	@Autowired
	private ExternalDataService   externalDataService;
	
	/**
	 * 对外数据服务初始加载数据Controller
	 * @version 1.0, 2014/8/26 14:30:00 
	 * @author wangxiaomin
	 */
	@RequestMapping("/externalDataServeList")
	public ModelAndView externalDataServeList( WebRequest request, ModelMap model){
		//查询左侧菜单列表数据
		List<ServiceDeListDto> serviceDeListDto=new ArrayList<ServiceDeListDto>();
		serviceDeListDto=externalDataService.selectServiceDefinition();
		//下拉效果
		model=PullDown();
		model.addAttribute("serviceDeListDto", serviceDeListDto);
		//首先显示数据服务接口内容
		ServiceDefinition serviceDefinitionList=new ServiceDefinition();
		model.addAttribute("serviceDefinitionList", serviceDefinitionList);
		//再次输入项数据内容
	    List<InputParam>inputParam=new ArrayList<InputParam>();
		model.addAttribute("inputParam", inputParam);

		//最后输出项数据内容
		List<ResultParam>resultParam=new ArrayList<ResultParam>();
		model.addAttribute("resultParam", resultParam);
		model.addAttribute("SqlEqual", "");
		return includeTemplate(model, "externalDataServe/externalDataServeList");
	}
	/**
	 * 对外数据服务增加  “参数” 以后显示数据Controller
	 * @version 1.0, 2014/9/3 19:00
	 * @author wangxiaomin
	 */
	@RequestMapping("/externalDataServeDList")
	public ModelAndView externalDataServeDList( Integer key,WebRequest request, ModelMap model){
		TermCache codeToName = new TermCache();
		//首先显示数据服务接口内容
		ServiceDefinition serviceDefinitionList=new ServiceDefinition();
		serviceDefinitionList=externalDataService.selectServiceDfinition(key);
		//再次输入项数据内容
		List<InputParam>inputParam=new ArrayList<InputParam>();
		inputParam=externalDataService.selectInputParam(key);
		//最后输出项数据内容
		List<ResultParamDto>resultParamm=new ArrayList<ResultParamDto>();
		resultParamm=externalDataService.selectResultParam(key);
		//添加父子关系标识
		List<ResultParamDto>resultParam=new ArrayList<ResultParamDto>();
		Map<String,String>map=new HashMap<String,String>();
		for(ResultParamDto resultParamDto:resultParamm){
			map.put(resultParamDto.getResultSn().toString(), resultParamDto.getDataGroupNameEn());
		}
		for(ResultParamDto resultParamDto:resultParamm){
			if(resultParamDto.getParaentSn()==null){
				resultParamDto.setDataGroupName("=");
			}else if(resultParamDto.getParaentSn()!=null && "".equals(resultParamDto.getParaentSn())){
				resultParamDto.setDataGroupName(map.get(resultParamDto.getParaentSn()));
			}
			resultParam.add(resultParamDto);
		}
		//查询左侧菜单列表数据
		List<ServiceDeListDto> serviceDeListDto=new ArrayList<ServiceDeListDto>();
		serviceDeListDto=externalDataService.selectServiceDefinition();
		//下拉效果
		model=PullDown();
		model.addAttribute("serviceDeListDto", serviceDeListDto);
		model.addAttribute("codeToName", codeToName);
		model.addAttribute("serviceDefinitionList", serviceDefinitionList);
		model.addAttribute("inputParam", inputParam);
		model.addAttribute("resultParam", resultParam);
		//判断是否是与结果一致。如果一致没那么直接显示sql内容
		
		if("S001".equals(serviceDefinitionList.getResultComposit()) && resultParam.size()>0){
			model.addAttribute("SqlEqual", resultParam.get(0).getSqlText());
		}else{
			model.addAttribute("SqlEqual", "");
		}
		return includeTemplate(model, "externalDataServe/externalDataServeList");
	}
	@Override
	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		// TODO Auto-generated method stub
	}
	/**
	 * 封装下拉框方法
	 * @version 1.0, 2014/9/3 20:46
	 * @author wangxiaomin
	 */
	public ModelMap PullDown(){
		ModelMap model=new ModelMap();
		//显示接口类型下拉列表效果
		Collection<DictionaryCacheDto> serviceType = DictionaryCache.getCollectionDictionaries(Constants.ST001);
		//显示接口分组下拉列表效果
	    List<DictServiceGroup> dictServiceGroup=new ArrayList<DictServiceGroup>();
	    dictServiceGroup=externalDataService.selectServicedf();
		//显示选择数据源 下拉列表效果
	    List<DataSource> dataSource=new ArrayList<DataSource>();
		dataSource=externalDataService.selectPullDown();
		//显示操作方式下拉列表效果
		Collection<DictionaryCacheDto> opMode = DictionaryCache.getCollectionDictionaries(Constants.ST002);
		//显示数据编码下拉列表效果
		Collection<DictionaryCacheDto> dataEncode = DictionaryCache.getCollectionDictionaries(Constants.ST003);
		//显示基本数据类型下拉列表效果
		Collection<DictionaryCacheDto> paramTypeName = DictionaryCache.getCollectionDictionaries(Constants.ST004);
		//显示返回值结构下拉列表效果
		Collection<DictionaryCacheDto> resultComposit = DictionaryCache.getCollectionDictionaries(Constants.ST005);
				
		model.addAttribute("serviceType", serviceType);
		model.addAttribute("dataSource", dataSource);
		model.addAttribute("dictServiceGroup", dictServiceGroup);
		model.addAttribute("opMode", opMode);
		model.addAttribute("dataEncode", dataEncode);
		model.addAttribute("paramTypeName", paramTypeName);
		model.addAttribute("resultComposit", resultComposit);
		return  model;
	}
	/**
	 * 接口分组管理弹出框内容加载
	 * @version 1.0, 2014/9/4 15:38
	 * @author wangxiaomin
	 */
	@RequestMapping("/groupManage")
	public ModelAndView groupManage(DictServiceGroupDto  dictServiceGroupDto,WebRequest request, ModelMap model){
		model.clear();
		//从接口数据表里取出数据
		SelectOptions selectOptions = getSelectOptions(dictServiceGroupDto);
		 List<DictServiceGroup> dictServiceGroup=new ArrayList<DictServiceGroup>();
		    dictServiceGroup=externalDataService.selectServiceGroup(dictServiceGroupDto,selectOptions);
		    pageSetting(dictServiceGroupDto, selectOptions);
		 model.addAttribute("dictServiceGroup",dictServiceGroup);
		 model.addAttribute("dictServiceGroupDto",dictServiceGroupDto);
		return includeTemplate(model, "externalDataServe/groupManage");
	}
	/**
	 * 接口分组保存方法
	 * @version 1.0, 2014/9/22 10:21
	 * @author wangxiaomin
	 */
	@RequestMapping("/groupManageSave")
	public @ResponseBody
	Object groupManageSave(DictServiceGroupDto  dictServiceGroupDto,WebRequest request, ModelMap model) throws Exception{
		Map<String, Integer> map=new HashMap<String, Integer>();
		try{
			int returnBack=externalDataService.groupManageSave(dictServiceGroupDto);
			map.put("pointOut", returnBack);
		}catch(Exception e){
			map.put("pointOut", 2);
			throw new RuntimeException(e);
		}
		return map;
	}
	/**
	 * 接口分组删除方法
	 * @version 1.0, 2014/9/22 10:33
	 * @author wangxiaomin
	 */
	@RequestMapping("/groupManageDelete")
	public @ResponseBody
	Object groupManageDelete(String strs,ModelMap model) throws Exception{
		try{
			Integer inte=externalDataService.groupManageDelete(strs);
			model.put("pointOut", inte);
		}catch(Exception e){
			model.put("pointOut", 2);
			throw new RuntimeException(e);
		}
		return model;
	}
	/**
	 * 接口分组修改时检索出数据方法
	 * @version 1.0, 2014/9/22 10:33
	 * @author wangxiaomin
	 */
	@RequestMapping("/groupManageUpdate")
	public @ResponseBody
	Object groupManageUpdate(Integer  groupSn,ModelMap model) throws Exception{
		DictServiceGroup dictServiceGroup=new DictServiceGroup ();
		try{
			 dictServiceGroup=externalDataService.groupManageUpdate(groupSn);
			model.put("pointOut", dictServiceGroup);
		}catch(Exception e){
			model.put("pointOut", dictServiceGroup);
			throw new RuntimeException(e);
		}
		return model;
	}
	/**
	 * 接口分组修改方法
	 * @version 1.0, 2014/9/22 13:36
	 * @author wangxiaomin
	 */
	@RequestMapping("/updateGroupManage")
	public @ResponseBody
	Object updateGroupManage(DictServiceGroupDto  dictServiceGroupDto,ModelMap model) throws Exception{
		Map<String, Integer> map=new HashMap<String, Integer>();
		try{
			int returnBack=externalDataService.updateGroupManage(dictServiceGroupDto);
			map.put("pointOut", returnBack);
		}catch(Exception e){
			map.put("pointOut", 2);
			throw new RuntimeException(e);
		}
		return map;
	}
	/**
	 * 页面保存方法
	 * @version 1.0, 2014/9/9 17:38
	 * @author wangxiaomin
	 */
	@RequestMapping("/externalDataServeSave")
	public @ResponseBody
	Object externalDataServeSave(String sqlEtlTextC,String serviceName,String serviceType,String serviceUrl,String serviceGroup,
			String dataSourceSn,String description,String opMode,String dataEncode,String resultComposit,
			WebRequest request, ModelMap model) throws Exception{
		String[] strB=request.getParameterValues("strB[]");
		String[] strC=request.getParameterValues("strC[]");
		try{
			externalDataService.externalDataServeSave(sqlEtlTextC,strB,strC,serviceName,serviceType,serviceUrl,
					serviceGroup, dataSourceSn,description,opMode, dataEncode, resultComposit);
			model.put("pointOut", 0);
		}catch(Exception e){
			model.put("pointOut", 1);
			logger.error("新增保存记录失败："+e.getMessage());
			throw new RuntimeException(e);
		}
		return model;
	}
	/**
	 * 页面删除方法
	 * @version 1.0, 2014/9/10 16:30
	 * @author wangxiaomin
	 */
	@RequestMapping("/externalDataServeDelete")
	public @ResponseBody
	Object externalDataServeDelete(String serviceDefinitionSn,ModelMap model) throws Exception{
		try{
			externalDataService.externalDataServeDelete(serviceDefinitionSn);
			model.put("pointOut", 0);
		}catch(Exception e){
			model.put("pointOut", 1);
			throw new RuntimeException(e);
		}
		return model;
	}
	/**
	 * 页面修改方法
	 * @version 1.0, 2014/9/11 14:31
	 * @author wangxiaomin
	 */
	@RequestMapping("/externalDataServeUpdate")
	public @ResponseBody
	Object externalDataServeUpdate(String serviceDefinitionSn,String sqlEtlTextC,String serviceName,String serviceType,String serviceUrl,String serviceGroup,
			String dataSourceSn,String description,String opMode,String dataEncode,String resultComposit,
			WebRequest request, ModelMap model) throws Exception{
		String[] strB=request.getParameterValues("strB[]");
		String[] strC=request.getParameterValues("strC[]");
		try{
			externalDataService.externalDataServeUpdate(serviceDefinitionSn,sqlEtlTextC,strB,strC,serviceName,serviceType,serviceUrl,
					serviceGroup, dataSourceSn,description,opMode, dataEncode, resultComposit);
			model.put("pointOut", 0);
		}catch(Exception e){
			model.put("pointOut", 1);
			throw new RuntimeException(e);
		}
		return model;
	}
}
