package com.founder.eds.web;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.seasar.doma.jdbc.SelectOptions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;

import com.founder.eds.core.Constants;
import com.founder.eds.dto.PagingDto;
import com.founder.eds.dto.DefaultUserDetails;



public abstract class AbstractController
{
    protected static Logger logger = LoggerFactory.getLogger(AbstractController.class);
    private static final int PAGE_COUNT = Constants.PAGE_DISPLAY_COUNT;
    
    DefaultUserDetails userDetails;
    
    protected ModelAndView includeTemplate(Map<String, ?> model, String fragment)
    {
    	userDetails = (DefaultUserDetails) SecurityContextHolder
				.getContext().getAuthentication().getPrincipal();
    	
        ModelAndView mav = new ModelAndView("template", model);
        ModelMap mm = mav.getModelMap();
        mm.addAttribute("copyright", Constants.VERSION_NO_COPYRIGHT);
        mm.addAttribute("frag_content", fragment);
        mm.addAttribute("username", userDetails.getRealName());
        return mav;
    }
    
    protected ModelAndView includeTemplate2(Map<String, ?> model, String fragment)
    {
        ModelAndView mav = new ModelAndView("monitor/favorites", model);
        ModelMap mm = mav.getModelMap();
        mm.addAttribute("frag_content", fragment);
        mm.addAttribute("ward_select","common/wardSelect");
        return mav;
    }
    public SelectOptions getSelectOptions(PagingDto opts)
  	{
  		int jumpToPage = opts.getJumpToPage() == null ? 1 : opts.getJumpToPage();
  		int offset = (jumpToPage - 1) * PAGE_COUNT;
  		SelectOptions options = SelectOptions.get().offset(offset).limit(PAGE_COUNT).count();

  		return options;
  	}
    
    public SelectOptions getSelectOptionsForDataTables(int start, int length)
    {
    	SelectOptions options = SelectOptions.get().offset(start).limit(length).count();
    	return options;
    }
    
    public PagingDto pageSetting(PagingDto cond,SelectOptions options){
    	if(cond.getJumpToPage() == null)
			cond.setCurrentPage(1);
		else
			cond.setCurrentPage(cond.getJumpToPage());
		cond.setJumpToPage(0);
		int size = (int) options.getCount();
		cond.setTotalSize(size);
		if(size % PAGE_COUNT == 0)
			cond.setTotalPage(size / PAGE_COUNT);
		else
			cond.setTotalPage(size / PAGE_COUNT + 1);
		return cond;
    }
    /**
     * 
     * @param data
     * @param partition
     * @param keys
     * @return
     */
    public static Map<String, List<List<Object>>> convertMultiObject(List<Map<String, Object>> data, String partition, String[] keys)
    {
        if(data == null || partition == null || keys == null || keys.length == 0)
            return null;
        
        int cc = keys.length;
        Map<String, List<List<Object>>> result = new HashMap<String, List<List<Object>>>();
        List<List<Object>> obj = new ArrayList<List<Object>>();
        Map<String, Object> row = null;
        Object pValue = null;
        for(int i = 0; i < data.size(); i ++)
        {
            row = data.get(i);
            pValue = row.get(partition);
            if(pValue == null)
            {
                logger.warn("partition value is null. Data : {}", row);
                continue;
            }
            obj = result.get(pValue);
            if(obj == null)
            {
                obj = new ArrayList<List<Object>>();
                result.put(pValue.toString(), obj);
            }
            List<Object> item = new ArrayList<Object>(cc);
            obj.add(item);
            for(String key : keys)
            {
                item.add(row.get(key));
            }
        }
        return result;
    }
    public int calculateMedian(List<Map<String, Object>> data, String keyName)
    {
        int result = 0;
        int size = data == null ? 0 : data.size();
        if(size == 0)
            return result;
        
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Map<String, Object> row = null;
        Object value = null;
        for(int i = 0; i < size; i ++)
        {
            row = data.get(i);
            value = (row == null ? "" : row.get(keyName));
            arr.add(Integer.parseInt(value.toString()));
        }
        Collections.sort(arr);
        int mi = size / 2;
        if(size % 2 == 0)
        {
            result = (arr.get(mi - 1) + arr.get(mi)) / 2;
        }
        else
        {
            result = arr.get(mi) ;
        }
        
        return result;
    }
}
