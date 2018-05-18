package com.founder.eds.util;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.commons.configuration.reloading.FileChangedReloadingStrategy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.PropertyPlaceholderHelper.PlaceholderResolver;

/**
 * 配置属性文件帮助类，支持动态修改属性值。
 * 
 */
@Component
public class PropertiesUtils
{

    private static final Logger logger = LoggerFactory.getLogger(PropertiesUtils.class);

    private static final String BATCH_DYNIMIC_CONFIG_FILE = "setting.properties";

    private static PropertiesConfiguration propertiesConfiguration = new PropertiesConfiguration();

    private static final String SYSTEM_ENVIRONMENT_VARIABLE = "ext.prop.dir";

    // 毫秒计时，默认一分钟
    private static long refreshDelay = 60000;

    static
    {
        try
        {
            init();
            logger.debug("{}加载成功。", BATCH_DYNIMIC_CONFIG_FILE);
        }
        catch (ConfigurationException e)
        {
            logger.error("初始化配置文件：{}失败。 ", BATCH_DYNIMIC_CONFIG_FILE);
            e.printStackTrace();
        }
    }

    private PropertiesUtils()
    {
    }

    private static void init() throws ConfigurationException
    {
        // propertiesConfiguration.load(Thread.currentThread().getContextClassLoader().getResource(
        // BATCH_DYNIMIC_CONFIG_FILE).getFile());
        String configPath = BATCH_DYNIMIC_CONFIG_FILE;

        SystemPropertyResolver sysHolderResolver = new SystemPropertyResolver();
        String sysPath = sysHolderResolver.resolvePlaceholder(SYSTEM_ENVIRONMENT_VARIABLE);

        if (!StringUtils.isEmpty(sysPath))
        {
            configPath = sysPath + "/" + configPath;
        }

        propertiesConfiguration.load(configPath);
        FileChangedReloadingStrategy fileChangedReloadingStrategy = new FileChangedReloadingStrategy();
        fileChangedReloadingStrategy.setRefreshDelay(refreshDelay);
        propertiesConfiguration.setReloadingStrategy(fileChangedReloadingStrategy);
    }

    /**
     * 从属性文件中获取键对应的值
     * 
     * @param key
     * @return value
     */
    public static String getValue(String key)
    {
        String value = propertiesConfiguration.getString(key);
        if (value == null)
        {
            logger.error("{}中{}对应的值不存在!", BATCH_DYNIMIC_CONFIG_FILE, key);
        }
        return value;
    }

    private static class SystemPropertyResolver implements PlaceholderResolver
    {
        public SystemPropertyResolver()
        {

        }

        public String resolvePlaceholder(String placeholderName)
        {
            try
            {
                String propVal = System.getProperty(placeholderName);
                if (propVal == null)
                {
                    propVal = System.getenv(placeholderName);
                }
                return propVal;
            }
            catch (Throwable ex)
            {
                logger.error("Could not resolve placeholder '"
                    + placeholderName + "' as system property: " + ex);
                return null;
            }
        }
    }
}
