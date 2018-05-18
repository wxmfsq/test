package com.founder.eds.web.util;

import java.util.Map;
import com.founder.eds.cache.DictionaryCache;



public class TermCache {
	private DictionaryCache cache;
	public String name(String type,String code){
	    return cache.getValueDictionary(type).get(code);
	}
	
	public Map<String,String> getDictionaryMap(String type){
		return cache.getValueDictionary(type);
	}
	
}
