package indi.zxf.pro.base.api.common;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;

/**
 * 数据统一封装子类
 *
 * @author zhouxiaofa
 * @date 2022/11/22 18:23
 */
public class Wrapper<T> implements Serializable {

    private static final long serialVersionUID = 1L;
    public static final int SUCCESS_CODE = 200;
    public static final String SUCCESS_MESSAGE = "操作成功";
    private String result;
    private int code;
    private String message;
    private T data;

    Wrapper() {
        this(200, "操作成功");
    }

    Wrapper(int code, String message) {
        this(code, message, null);
    }

    Wrapper(int code, String message, T data) {
        this.code(code).message(message).result(data);
    }

    public int getCode() {
        return this.code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getResult() {
        return this.code == 200 ? "success" : "fault";
    }

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }

    private Wrapper<T> code(int code) {
        this.setCode(code);
        return this;
    }

    private Wrapper<T> message(String message) {
        this.setMessage(message);
        return this;
    }

    public Wrapper<T> result(T data) {
        this.setData(data);
        return this;
    }

    @JsonIgnore
    public boolean success() {
        return 200 == this.code;
    }

    @JsonIgnore
    public boolean error() {
        return !this.success();
    }
}
