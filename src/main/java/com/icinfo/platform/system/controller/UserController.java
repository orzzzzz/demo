package com.icinfo.platform.system.controller;

import com.icinfo.platform.common.bean.AjaxResponse;
import com.icinfo.platform.system.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2017/8/7.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService userService;

    /**
     * 进入登录页面
     *
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/to_login", method = RequestMethod.GET)
    public String toLogin() throws Exception {
        return "system/login";
    }

    /**
     * 用户登录
     *
     * @param userName 用户名
     * @param password 密码
     * @return 结果
     * @throws Exception 异常
     */
    @RequestMapping(value = "login", method = RequestMethod.GET)
    @ResponseBody
    public AjaxResponse login(@RequestParam(value = "userName") String userName,
                              @RequestParam(value = "password") String password) throws Exception {
        return new AjaxResponse(userService.login(userName, password));
    }
}
