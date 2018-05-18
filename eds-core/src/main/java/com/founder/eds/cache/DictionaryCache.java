package com.founder.eds.cache;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.founder.eds.dao.DictionaryCacheDao;
import com.founder.eds.dto.DictionaryCacheDto;


/**
 * 数据字典缓存。支持定时更新功能。
 */
public class DictionaryCache
{

    private static final Logger logger = LoggerFactory.getLogger(DictionaryCache.class);

    private static Map<String, TreeMap<String, DictionaryCacheDto>> dictionaries = Collections.synchronizedMap(new HashMap<String, TreeMap<String, DictionaryCacheDto>>());

    // 通过code获取字典name
    private static Map<String, TreeMap<String, String>> dictionaryValues = Collections.synchronizedMap(new HashMap<String, TreeMap<String, String>>());

    @Autowired
    private DictionaryCacheDao dictionaryCacheDao;

    private String csId;

    /**
     * 院感字典缓存初始化。
     */
    public void init()
    {
        try
        {
            logger.debug("对外数据服务字典缓存，正在初始化...");
            cache();
            logger.debug("对外数据服务字典缓存，初始化成功。");
        }
        catch (Exception e)
        {
            logger.error("对外数据服务字典缓存，初始化失败！");
            e.printStackTrace();
        }
    }

    /**
     * 初始化数据字典缓存
     */
    public void cache() throws Exception
    {
        logger.debug("正在查询字典...");

        List<DictionaryCacheDto> dictionaryCacheDtos = new ArrayList<DictionaryCacheDto>();

        dictionaryCacheDtos = dictionaryCacheDao.selectDictionaries();

        logger.debug("正在缓存字典...");
        TreeMap<String, String> data = null;
        TreeMap<String, DictionaryCacheDto> fullCacheData = null;

        for (Iterator<DictionaryCacheDto> iterator = dictionaryCacheDtos.iterator(); iterator.hasNext();)
        {
            DictionaryCacheDto dictionaryCacheDto = iterator.next();
            String csCode = dictionaryCacheDto.getCsCode();

            if (dictionaries.containsKey(csCode))
            {
                dictionaryValues.get(csCode).put(
                        dictionaryCacheDto.getCvCode(),
                        dictionaryCacheDto.getCvValue());

                dictionaries.get(csCode).put(dictionaryCacheDto.getCvCode(),
                        dictionaryCacheDto);
            }
            else
            {
                data = new TreeMap<String, String>();
                data.put(dictionaryCacheDto.getCvCode(),
                        dictionaryCacheDto.getCvValue());
                dictionaryValues.put(csCode, data);

                fullCacheData = new TreeMap<String, DictionaryCacheDto>();
                fullCacheData.put(dictionaryCacheDto.getCvCode(),
                        dictionaryCacheDto);
                dictionaries.put(csCode, fullCacheData);
            }
        }
    }

    /**
     * 获取某个domain字典信息，内容不可修改！ （通过code获取字典中单行记录对象）
     * 
     * @param domain
     * @return
     */
    public static Map<String, DictionaryCacheDto> getDtoDictionary(String domain)
    {
        TreeMap<String, DictionaryCacheDto> map = dictionaries.get(domain);
        if (map == null)
        {
            return null;
        }
        else
        {
            return Collections.unmodifiableMap(map);
        }
    }

    /**
     * 获取某个domain字典信息，内容不可修改！ （获取字典中所有domain下对象）
     * 
     * @param domain
     * @return
     */
    public static Collection<DictionaryCacheDto> getCollectionDictionaries(
            String domain)
    {
        TreeMap<String, DictionaryCacheDto> map = dictionaries.get(domain);
        if (map == null)
        {
            return null;
        }
        else
        {
            return Collections.unmodifiableMap(map).values();
        }
    }

    /**
     * 获取某个domain字典信息，内容不可修改！ （获取字典中所有domain下code对应value值）
     * 
     * @param domain
     * @return
     */
    public static Map<String, String> getValueDictionary(String domain)
    {
        TreeMap<String, String> map = dictionaryValues.get(domain);
        if (map == null)
        {
            return null;
        }
        else
        {
            return Collections.unmodifiableMap(map);
        }
    }

    /**
     * 获取某个domain字典信息克隆
     * 
     * @param
     * @return
     */
    @SuppressWarnings("unchecked")
    public static Map<String, DictionaryCacheDto> getDictionaryClone(
            String domain)
    {
        TreeMap<String, DictionaryCacheDto> map = dictionaries.get(domain);
        if (map == null)
        {
            return null;
        }
        else
        {
            return (Map<String, DictionaryCacheDto>) map.clone();
        }
    }
    
    /**
     * code 转 name
     * @param type
     * @param code
     * @return
     */
    public String name(String type,String code){
	    return getValueDictionary(type).get(code);
	}

    public String getCsId()
    {
        return csId;
    }

    public void setCsId(String csId)
    {
        this.csId = csId;
    }

}
