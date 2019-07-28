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
    OK("OK", ""),
    FAIL("FAIL", "操作失败"),
    BIZ_FAIL("BIZ_FAIL", "业务处理失败"),
    BIZ_PARAM_ERR("BIZ_PARAM_ERR", "请求参数错误"),
    FORBIDDEN("FORBIDDEN", "没有权限"),
    SERVER_ERR("SERVER_ERR", "系统繁忙，请稍后再试");



    private String code;
    private String msg;


}
