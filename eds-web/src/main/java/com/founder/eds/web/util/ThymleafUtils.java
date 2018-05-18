package com.founder.eds.web.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.founder.eds.cache.DictionaryCache;

public class ThymleafUtils {

	private DictionaryCache cache;
	public String name(String type,String code){
	    return cache.getValueDictionary(type).get(code.trim());
	}
	
	public List<String> stringToList(String listStr){
		List<String> list =  new ArrayList<String>();
		String[] listStrArray = listStr.split(",");
		for(String s :listStrArray){
			if(s!=null&&(!"".equals(s)))list.add(s);
		}
		return list;
	}
	
	public Set<String> stringToSet(String setStr){
		Set<String> set =  new HashSet<String>();
		String[] setStrArray = setStr.split(",");
		for(String s :setStrArray){
			if(s!=null&&(!"".equals(s)))set.add(s);
		}
		return set;
	}
	
	public Map<String,String> stringToMap(String keyStr,String valueStr){
		Map<String,String> map =  new HashMap<String,String>();
		String[] keyStrArray = keyStr.split(",");
		String[] valueStrArray = valueStr.split(",");
		for(int i=0;i<keyStrArray.length;i++){
			if(keyStrArray.length == valueStrArray.length){
				if((!"".endsWith(keyStrArray[i]))&&(!"".endsWith(valueStrArray[i]))){
					map.put(keyStrArray[i], valueStrArray[i]);
				}
			}
		}
		return map;
	}
}
