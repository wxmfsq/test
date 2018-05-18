package com.founder.eds.hl7.xml;

import java.util.Date;

import com.founder.eds.hl7.util.PropertiesUtils;


public class ValueHandlerFactory
{

    private static ValueHandlerFactory _instance = null;

    private static String dtoPrefix = "";
    
    private static final String PACKAGE_DTO = "com.founder.eds.dto";

    private ValueHandlerFactory()
    {
        dtoPrefix = PACKAGE_DTO + ".";
    }

    public static ValueHandler getHandler(String type)
    {
        if (_instance == null)
            _instance = new ValueHandlerFactory();
        ValueHandler handler = _instance.getValueHandler(type);
        if (handler == null)
        {
            if (type.startsWith(dtoPrefix))
            {
                handler = _instance.getValueHandler(dtoPrefix + "*");
            }
        }

        return handler;
    }

    private ValueHandler getValueHandler(String type)
    {
        /** Modified for BUG#9223 by XuDengfeng, 2012/08/30 */
        if (String.class.getName().equals(type))
            return new StringValueHandler();
        else if (Integer.class.getName().equals(type))
            return new IntegerValueHandler();
        else if (Date.class.getName().equals(type))
            return new DateValueHandler();
        else if ((dtoPrefix + "*").equals(type))
            return new BeanValueHandler();
        else if ("hl7OrgV3.*".equals(type))
            return new BeanValueHandler();
        else
            return null;
        /** End BUG#9223 */
    }
}
