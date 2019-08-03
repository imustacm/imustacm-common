package cn.imustacm.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 错误编码枚举类
 *
 * @author liandong
 * Date: 2019/07/27
 */
@Getter
@AllArgsConstructor
public enum ErrorCodeEnum {

    /**
     * 系统类错误码
     */
    OK(0, "操作成功"),
    FAIL(101, "操作失败"),
    BIZ_FAIL(102, "业务处理失败"),
    BIZ_PARAM_ERR(103, "请求参数错误"),
    FORBIDDEN(403, "没有权限"),
    SERVER_ERR(500, "内部服务器错误"),

    /**
     * 用户服务类错误码
     */
    USER_LOGIN_STATUS(1000, "请重新登录"),
    USER_VERIFICATION_EXPIRED(1001, "验证码已过期"),
    USER_VERIFICATION_EMPTY(1002, "验证码不正确"),
    USER_VERIFICATION_ERROR(1003, "验证码不正确"),
    USER_USERNAME_EMPTY(1004, "用户名不能为空"),
    USER_USERNAME_ILLEGAL(1005, "用户名格式不合法"),
    USER_PASSWORD_EMPTY(1006, "密码不能为空"),
    USER_PASSWORD_ILLEGAL(1007, "密码格式不合法"),
    USER_REPASSWORD_EMPTY(1008, "重复密码不能为空"),
    USER_INCONSISTENT_PASSWORDS(1009, "两次密码输入不一致"),
    USER_NAME_EMPTY(1010, "姓名不能为空"),
    USER_NAME_ILLEGAL(1011, "姓名格式不合法"),
    USER_USER_EXIST(1012, "用户已经存在"),
    USER_USERINFO_ERROR(1013, "用户名或密码错误"),
    USER_EMAIL_ILLEGAL(1014, "Email格式不合法"),
    USER_EMAIL_SEND_ERROR(1015, "邮件发送失败");

    private int status;
    private String message;

}