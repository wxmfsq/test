package com.founder.eds.util;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtils
{
    private static final Object EMPTY_STRING = "";

    // 声明值域转换map
    private static final Map<Object, String> conversionMap;

    /**
     * 构造值域转换map
     */
    static
    {
        conversionMap = new HashMap<Object, String>();
    }

    /**
     * 通过消息中传来的值转换成CDS中需要的值
     * 
     * @param valueOfMessage
     *            消息中传来的需转换值
     * @return 转换后的值
     */
    public static String getConversionValue(Object valueOfMessage)
    {
        return conversionMap.get(valueOfMessage);
    }

    /**
     * 判断一个字符串是否是空
     * 
     * @param value
     * @return
     */
    public static boolean isEmpty(String value)
    {
        if (value == null || EMPTY_STRING.equals(value))
            return true;
        else
            return false;
    }

    /**
     * 将给定字符串中的${}包围的变量使用给定的映射表替换
     * 
     * @param template
     *            需要替换的原始字符串
     * @param prop
     *            用于替换的映射列表
     * @return 替换后的字符串
     */
    public static String evaluate(String template, Properties prop)
    {
        Pattern pattern = Pattern.compile("\\$\\{(.+?)\\}");
        Matcher matcher = pattern.matcher(template);

        StringBuilder builder = new StringBuilder();
        int i = 0;
        while (matcher.find())
        {
            String replacement = (String) prop.get(matcher.group(1));
            builder.append(template.substring(i, matcher.start()));
            if (replacement == null)
                builder.append(matcher.group(0));
            else
                builder.append(replacement);
            i = matcher.end();
        }
        builder.append(template.substring(i, template.length()));
        return builder.toString();
    }

    /**
     * 类型转换(字符串转换小数型)
     * 
     * @param 需要转换的字符串
     * @return 转换完成的小数
     */
    public static BigDecimal strToBigDecimal(String str, String pe)
    {
        BigDecimal bigDecimal = null;
        try
        {
            if (!StringUtils.isEmpty(str))
            {
                bigDecimal = new BigDecimal(str);
            }
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
            throw new RuntimeException(pe + "=" + str + "字符串转换小数型error");
        }
        return bigDecimal;
    }

    /**
     * 类型转换(字符串转换长整型)
     * 
     * @param 需要转换的字符串
     * @return 转换完成的整数
     */
    public static long strToLong(String str)
    {
        long l = 0;

        if (!StringUtils.isEmpty(str))
        {
            l = Long.parseLong(str);
        }

        return l;
    }

    /**
     * 验证多个字符串是否都不为空
     * 
     * @param strings
     *            字符串集合
     * @return 是否都不为空标识
     */
    public static boolean isNotNullAll(String... strings)
    {
        boolean isNotNullAll = true;

        if (strings == null)
        {
            return false;
        }

        for (int i = 0; i < strings.length; i++)
        {
            if (StringUtils.isEmpty(strings[i]))
            {
                isNotNullAll = false;
                break;
            }
        }

        return isNotNullAll;
    }

    /**
     * 验证多个字符串是否都为空
     * 
     * @param strings
     *            字符串集合
     * @return 是否都为空标识
     */
    public static boolean isNullAll(String... strings)
    {
        boolean isNullAll = true;

        if (strings == null)
        {
            return true;
        }

        for (int i = 0; i < strings.length; i++)
        {
            if (!StringUtils.isEmpty(strings[i]))
            {
                isNullAll = false;
                break;
            }
        }

        return isNullAll;
    }

    /**
     * 将BigDecimal转换成String
     * 
     * @param csId
     * @return
     */
    public static String BigDecimalToStr(BigDecimal csId)
    {
        String str = null;
        try
        {
            if (csId != null)
            {
                str = csId.toString();
            }
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
        return str;

    }

    /**
     * 将对象为null并转换成字符串形式情况时，返回空
     * 
     * @param str
     *            待转换字符串
     * @return 返回的空值
     */
    public static String nullToEmpty(String str)
    {
        if ("null".equals(str))
        {
            str = "";
        }

        return str;
    }

    /**
     * 将对象不为空的字符串转化成double
     * 
     * @param version
     *            带转化的字符串
     * @return
     */
    public static Double strToDouble(String version)
    {
        Double str = null;
        try
        {
            if (version != null)
            {
                str = new Double(version);
            }
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
        return str;
    }

    /**
     * 判断字符串是否为数字
     * 
     * @param number
     * @return
     */
    public static boolean isNumber(String number)
    {
        if (number.matches("\\d+.?\\d*"))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    /**
     * 去掉字符串的前后空格
     * 
     * @param String
     * @return
     */
    public static String stringTrim(String srcStr)
    {
        String desStr = null;
        if (isEmpty(srcStr))
        {
            desStr = srcStr;
        }
        else
        {
            desStr = srcStr.trim();
        }
        return desStr;
    }

    public static String subStr(String str, int len)
    {
        String strPlus = "...";
        String resStr = "";

        if (str != null && str.length() != 0)
        {
            resStr = str.substring(0, len) + strPlus;
        }

        return resStr;
    }
}
