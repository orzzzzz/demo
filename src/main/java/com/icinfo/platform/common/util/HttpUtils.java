package com.icinfo.platform.common.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * http请求工具类
 */
public class HttpUtils {
    /**
     * 判断是否为ajax异步请求
     *
     * @param request 请求
     * @return 判断结果 是：true, 否：false
     * @throws Exception
     */
    public static boolean isAjax(HttpServletRequest request) throws Exception {
        //判断是否为异步请求，非异步请求直接进入error页面
        return (request.getHeader("accept").indexOf("application/json") > -1)
                || (request.getHeader("X-Request-With") != null
                && request.getHeader("X-Request-With").indexOf("XMLHttpRequest") > -1);
    }

    /**
     * 异步请求异常处理
     *
     * @param response   请求响应
     * @param errorInfo  错误信息
     * @param httpStatus http状态码
     * @throws Exception
     */
    public static void writeError(HttpServletResponse response, String errorInfo, int httpStatus) throws Exception {
        PrintWriter writer = null;
        try {
            //设置响应字符集
            response.setContentType("text/html; charset=utf-8");
            //设置http响应状态码
            response.setStatus(httpStatus);
            writer = response.getWriter();
            writer.write(errorInfo);
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                writer.close();
            }
        }
    }
}
