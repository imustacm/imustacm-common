package cn.imustacm.common.domain;


import cn.imustacm.common.enums.ErrorCodeEnum;
import lombok.Data;

/**
 * 统一返回封装类
 *
 * @author liandong
 * Date: 2019/07/27
 */
@Data
public class Resp<T> {
    private int code;
    private String msg;
    private T data;

    public Resp() {

    }

    public Resp(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Resp(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public Resp(ErrorCodeEnum codeEnum) {
        this.code = codeEnum.getCode();
        this.msg = codeEnum.getMsg();
    }

    public Resp(ErrorCodeEnum codeEnum, String msg) {
        this.code = codeEnum.getCode();
        this.msg = msg;
    }

    public Resp(ErrorCodeEnum codeEnum, T data) {
        this.code = codeEnum.getCode();
        this.msg = codeEnum.getMsg();
        this.data = data;
    }

    public static Resp ok() {
        return new Resp(ErrorCodeEnum.OK);
    }

    public static Resp fail() {
        return new Resp(ErrorCodeEnum.FAIL);
    }

    public static Resp okOrFail(boolean flag) {
        return flag ? ok() : fail();
    }

    public static <T> Resp<T> okOrFail(boolean flag, T data) {
        return flag ? ok(data) : fail();
    }

    public static <T> Resp<T> ok(T data) {
        return new Resp<T>(ErrorCodeEnum.OK, data);
    }

    public static Resp paramErr(String msg) {
        return new Resp(ErrorCodeEnum.BIZ_PARAM_ERR, msg);
    }

    public static Resp serviceErr(String msg) {
        return new Resp(ErrorCodeEnum.BIZ_FAIL, msg);
    }

    public static Resp fail(ErrorCodeEnum err) {
        return new Resp(err);
    }
}
