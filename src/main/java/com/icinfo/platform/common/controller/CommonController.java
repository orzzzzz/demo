package com.icinfo.platform.common.controller;

import com.icinfo.platform.common.util.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 公共controller
 */
@Controller
public class CommonController {
    /**
     * 页面跳转
     * @param path 路径
     * @param file 页面名
     * @return 页面所在路径
     */
    @RequestMapping(value = "page/{path}/{file}")
    public String page(@PathVariable("path") String path, @PathVariable("file") String file) {
        return StringUtils.assemblyString(path, "/", file);
    }

    /**
     * 页面跳转
     * @param module 模块
     * @param path 路径
     * @param file 页面名
     * @return 页面所在路径
     */
    @RequestMapping(value = "page/{module}/{path}/{file}")
    public String page(@PathVariable("module") String module, @PathVariable("path") String path, @PathVariable("file") String file) {
        return StringUtils.assemblyString(module, "/", path, "/", file);
    }
}