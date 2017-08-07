package com.icinfo.platform.common.bean;

import java.io.Serializable;

/**
 * ajax响应
 */
public class AjaxResponse<T> implements Serializable {

    private static final long serialVersionUID = 762534467928803566L;

    /**
     * 成功状态码
     */
    public static final String STATUS_SUCCESS = "200";

    /**
     * 操作成功
     */
    public static final String MSG_SUCCESS = "操作成功";

    /**
     * 失败状态码
     */
    public static final String STATUS_ERROR = "100";

    /**
     * 操作失败
     */
    public static final String MSG_ERROR = "操作失败";

    /**
     * 状态码
     */
    private String status;

    /**
     * 状态码消息
     */
    private String msg;

    /**
     * 子状态码
     */
    private String subStatus;

    /**
     * 子状态码消息
     */
    private String subMsg;

    /**
     * 业务数据
     */
    private T data;

    public AjaxResponse() {
    }

    /**
     * 自定义构造函数，适用操作成功的场景
     *
     * @param data 业务数据
     */
    public AjaxResponse(T data) {
        this.status = STATUS_SUCCESS;
        this.msg = MSG_SUCCESS;
        this.data = data;
    }

    /**
     * 自定义构造函数，适用操作失败的场景
     *
     * @param subStatus 子状态码
     * @param subMsg    子状态码消息
     */
    public AjaxResponse(String subStatus, String subMsg) {
        this.status = STATUS_ERROR;
        this.msg = MSG_ERROR;
        this.subStatus = subStatus;
        this.subMsg = subMsg;
    }

    /**
     * 设置成功
     *
     * @param t 业务数据
     */
    public void success(T t) {
        this.status = STATUS_SUCCESS;
        this.status = MSG_SUCCESS;
        this.data = t;
    }

    /**
     * 设置失败
     *
     * @param subStatus 子状态码
     * @param subMsg    子状态码消息
     */
    public void failure(String subStatus, String subMsg) {
        this.status = STATUS_ERROR;
        this.msg = MSG_ERROR;
        this.setSubStatus(subStatus);
        this.setSubMsg(subMsg);
    }

    /**
     * 判断是否为成功状态
     *
     * @return 成功true，失败false
     */
    public boolean ok() {
        return STATUS_SUCCESS.equals(this.status);
    }

    /**
     * 获取状态码信息
     *
     * @return 状态信息
     */
    public String statusInfo() {
        return this.getStatus() + ":" + this.getMsg();
    }

    /**
     * 获取错误子状态信息
     *
     * @return 子状态信息
     */
    public String subStatusInfo() {
        return this.getSubStatus() + ":" + this.getSubMsg();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getSubStatus() {
        return subStatus;
    }

    public void setSubStatus(String subStatus) {
        this.subStatus = subStatus;
    }

    public String getSubMsg() {
        return subMsg;
    }

    public void setSubMsg(String subMsg) {
        this.subMsg = subMsg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
