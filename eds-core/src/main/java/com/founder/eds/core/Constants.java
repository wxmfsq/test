package com.founder.eds.core;

import com.founder.eds.core.AppSettings;

/**
 * 糖尿病常量类。 注意get方法格式必须如下： public 返回类型 get常量字符串() { return 常量字符串; }
 * 
 * @version 1.0
 */
public class Constants
{
    public static final int PAGE_DISPLAY_COUNT = Integer.parseInt(AppSettings.getConfig("PAGE_DISPLAY_COUNT"));

    // 版权信息
    public static final String VERSION_NO_COPYRIGHT = AppSettings.getConfig("VERSION_NO_COPYRIGHT");

    // 接口类型
    public static final String ST001 = AppSettings.getConfig("ST001");

    // 操作方式
    public static final String ST002 = AppSettings.getConfig("ST002");

    // 数据编码
    public static final String ST003 = AppSettings.getConfig("ST003");

    // 基本数据类型
    public static final String ST004 = AppSettings.getConfig("ST004");

    // 返回值结构
    public static final String ST005 = AppSettings.getConfig("ST005");

    // 数据库类型
    public static final String ST006 = AppSettings.getConfig("ST006");

    // DELETE_FLAG非默认0
    public static final String DELETE_FLAG_NONDEFAULT = AppSettings.getConfig("DELETE_FLAG_NONDEFAULT");

    // UPDATE_COUNT默认1
    public static final String UPDATE_COUNT_DEFAULT = AppSettings.getConfig("UPDATE_COUNT_DEFAULT");

    // 查询删除操作标识
    public static final int OPER_FLAG_DELETE = 1;

    // 查询未删除操作标识
    public static final int OPER_FLAG_UNDELETE = 0;
    
    public static final String PRIVILEGE_TYPE_GROUP = "1";
    
    public static final String PRIVILEGE_TYPE_SINGLE = "0";
    
    public static final String JOB_CATEGORY_MANAGER = "1";

    public String getSt001()
    {
        return ST001;
    }
}
