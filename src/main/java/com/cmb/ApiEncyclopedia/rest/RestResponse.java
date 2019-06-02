package com.cmb.ApiEncyclopedia.rest;

/**
 * Created by SENSETIME\yuanzhen on 19-5-31 下午3:49
 */
public class RestResponse<T> {

    private String code = RestEnum.SUCCESS.getCode();
    private String msg = RestEnum.SUCCESS.getMsg();
    private int total = 0;

    private T data;

    public RestResponse() {
    }

    public RestResponse(RestEnum restEnum) {
        this.code = restEnum.getCode();
        this.msg = restEnum.getMsg();
    }

    public RestResponse(T data) {
        this.data = data;
    }

    public RestResponse(String code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void setRestEnum(RestEnum restEnum){
        this.code = restEnum.getCode();
        this.msg = restEnum.getMsg();
    }
}
