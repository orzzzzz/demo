package com.icinfo.platform.system.service;

/**
 * Created by Administrator on 2017/8/7.
 */
public interface IUserService {
    /**
     * 用户登录
     *
     * @param userName 用户名
     * @param password 密码
     * @return 结果
     * @throws Exception 异常
     */
    String login(String userName, String password) throws Exception;
}
