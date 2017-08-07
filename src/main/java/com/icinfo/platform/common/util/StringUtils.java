package com.icinfo.platform.common.util;

/**
 * 字符串工具集
 */
public class StringUtils extends org.apache.commons.lang3.StringUtils {
    /**
     * 连接多个字符串
     *
     * @param strParam 待连接字符串
     * @return 字符串
     */
    public static String assemblyString(String... strParam) {
        StringBuffer stringBuffer = new StringBuffer();
        String[] var = strParam;
        int var1 = strParam.length;

        for (int var2 = 0; var2 < var1; var2++) {
            String str = var[var2];
            stringBuffer.append(str);
        }
        return stringBuffer.toString();
    }
}
