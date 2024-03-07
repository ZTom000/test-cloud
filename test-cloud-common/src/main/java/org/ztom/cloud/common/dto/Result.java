package org.ztom.cloud.common.dto;

import org.ztom.cloud.common.constent.ErrorCode;
import org.ztom.cloud.common.constent.ErrorMsg;

/**
 * @Description TODO
 * @Author 翟涛
 * @Version 1.0
 * @Date 2024/2/28 13:51
 */
public class Result<T> extends BaseEntity{
    private Integer code;
    private String msg;
    private T data;
    public Result() {

    }
    public Result(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static <T>Result<T> success() {
        return (Result<T>) success(ErrorCode.SUCCESS, ErrorMsg.SUCCESS, null);
    }

    // 返回成功码以及成功信息以及数据
    public static <T>Result<T> success(T data) {
        return success(ErrorCode.SUCCESS, ErrorMsg.SUCCESS, data);
    }

    public static <T>Result<T> success(Integer code, String msg, T data) {
        return new Result(code, msg, data);
    }

    public static <T>Result<T> fail() { return new Result(ErrorCode.SYSTEM_ERROR, ErrorMsg.SYSTEM_ERROR, null); }

    public static <T>Result<T> fail(Integer code, String msg) {
        return fail(code, msg, null);
    }

    // 返回错误信息
    public static <T>Result<T> fail(Integer code, String msg, T data) {
        return new Result(code, msg, data);
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
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
}
