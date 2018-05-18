package com.founder.eds.web.util;

import java.util.Collection;

import com.founder.eds.cache.DictionaryCache;
import com.founder.eds.dto.DictionaryCacheDto;

public class CommonUtils {

	public static Collection<DictionaryCacheDto> getJargon(String csCode) {
		// 获取特定的术语字典
		Collection<DictionaryCacheDto> dictionaryList =
				DictionaryCache.getCollectionDictionaries(csCode);
		return dictionaryList;
	}

}
