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
    USER_VERIFICATION_EXPIRED(1001, "验证码无效或者验证码已过期"),
    USER_VERIFICATION_EMPTY(1002, "验证码不能为空"),
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
    USER_EMAIL_SEND_ERROR(1015, "邮件发送失败"),
    USER_EMAIL_SEND_TIME(1016, "邮件发送过于频繁"),
    USER_EMAIL_LINK_ILLEGAL(1017, "邮箱验证链接无效或者链接已过期"),
    USER_AAO_URL_ILLEGAL(1018, "与教务系统通讯失败"),
    USER_AAO_VERIFICATION_GET(1019, "验证码拉取失败"),

    PROBLEM_SUBMIT_LANGUAGE_NULL(2000, "提交的代码语言不能为空"),
    PROBLEM_SUBMIT_LANGUAGE_ERROR(2001, "提交的代码语言错误"),
    PROBLEM_SUBMIT_CODE_NULL(2002, "提交的代码不能为空"),
    PROBLEM_SUBMIT_SERVER_ERROR(2003, "判题机接口错误"),
    PROBLEM_NOT_EXIST(2004, "题目不存在"),
    PROBLEM_TESTDATA_NOT_EXIST(2005, "管理员尚未添加测试数据");

    private int code;
    private String msg;
}
