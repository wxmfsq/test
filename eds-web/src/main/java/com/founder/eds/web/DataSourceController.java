package com.founder.eds.web;

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
import com.founder.eds.dto.DataSourceDto;
import com.founder.eds.dto.DictionaryCacheDto;
import com.founder.eds.entity.DataSource;
import com.founder.eds.service.monitor.ExternalDataService;
import com.founder.eds.web.util.TermCache;

/**
 * 数据源管理Controller
 * @version 1.0, 2014/9/12 09:40:00
 * @author wangxiaomin
 */
@Controller
@RequestMapping("/externalDataServe")
public class DataSourceController extends AbstractController implements ApplicationContextAware{

	@Override
	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		// TODO Auto-generated method stub
		
	}
	@Autowired
	private ExternalDataService   externalDataService;
	
	/**
	 * 数据源管理
	 * @version  1.0, 2014/9/12 09:40:00
	 * @author wangxiaomin
	 */
	@RequestMapping("/DataSourceList")
	public ModelAndView DataSourceList( DataSourceDto cond,WebRequest request, ModelMap model){
		SelectOptions selectOptions = getSelectOptions(cond);
		TermCache codeToName = new TermCache();
		//检索显示数据
		List<DataSourceDto> dataSource=externalDataService.selectDataSource(cond, selectOptions);
		pageSetting(cond, selectOptions);
		// 获取类型名称
		Collection<DictionaryCacheDto> databaseTypeName = DictionaryCache.getCollectionDictionaries(Constants.ST006);
		model.addAttribute("dataSourcelist", dataSource);
		model.addAttribute("dataSourceSearch", cond);
		model.addAttribute("codeToName", codeToName);
		model.addAttribute("databaseTypeName", databaseTypeName);
		return  includeTemplate(model, "externalDataServe/DataSourceList");
	}
	/**
	 * 数据源新增保存
	 * @version  1.0, 2014/9/15 09:40:00
	 * @author wangxiaomin
	 */
	@RequestMapping("/dataSourceSave")
	public @ResponseBody
	Object dataSourceSave( DataSourceDto dataSourceSearch,WebRequest request, ModelMap model){
		Map<String, Integer> map=new HashMap<String, Integer>();
		try{
			externalDataService.dataSourceSave(dataSourceSearch);
			map.put("pointOut", 0);
		}catch(Exception e){
			map.put("pointOut", 1);
		}
		
		return map;
	}
	/**
	 * 数据源新增保存删除
	 * @version  1.0, 2014/9/16 15:40:00
	 * @author wangxiaomin
	 */
	@RequestMapping("/dataSourceDelete")
	public @ResponseBody
	Object dataSourceDelete( String  strs,WebRequest request, ModelMap model){
		Map<String, Integer> map=new HashMap<String, Integer>();
		try{
			externalDataService.dataSourceDelete(strs);
			map.put("pointOut", 0);
		}catch(Exception e){
			map.put("pointOut", 1);
		}
		return map;
	}
	/**
	 * 数据源新增修改时加载数据
	 * @version  1.0, 2014/9/16 16:19:00
	 * @author wangxiaomin
	 */
	@RequestMapping("/dataSourceUpdate")
	public @ResponseBody
	Object dataSourceUpdate( Integer  dataSourceSn,WebRequest request, ModelMap model){
		DataSourceDto dataSource=new DataSourceDto();
		try{
			dataSource=externalDataService.selectDataSourceId(dataSourceSn);
			model.put("pointOut", dataSource);
		}catch(Exception e){
			model.put("pointOut", dataSource);
		}
		return model;
	}
	/**
	 * 数据源新增修改保存
	 * @version  1.0, 2014/9/16 15:40:00
	 * @author wangxiaomin
	 */
	@RequestMapping("/UpdateDataSource")
	public @ResponseBody
	Object UpdateDataSource( DataSourceDto  dataSourceSearch,WebRequest request, ModelMap model){
		Map<String, Integer> map=new HashMap<String, Integer>();
		try{
			externalDataService.UpdateDataSource(dataSourceSearch);
			map.put("pointOut", 0);
		}catch(Exception e){
			map.put("pointOut", 1);
		}
		return map;
	}
}
