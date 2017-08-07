package com.icinfo.platform.common.bean;

/**
 * TODO
 */
public class AjaxResult<T> {
    /**
     * 结果数据
     */
    private T data;

    /**
     * 结果标识
     */
    private boolean flag;

    /**
     * 业务编码
     */
    private int code;

    /**
     * 错误信息
     */
    private String error;

    public AjaxResult() {
    }

    public AjaxResult(T data) {
        this.data = data;
    }

    public AjaxResult(int code, String error) {
        this.code = code;
        this.error = error;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
