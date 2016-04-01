package com.yubin.contants;

/**
 * Created by percent on 16/3/12.
 */
public class ResultConstants {

    public static final String CODE_SUCCESS = "000000";
    public static final String MSG_SUCCESS = "操作成功";

    public static final String CODE_FAIL = "999991";
    public static final String MSG_FAIL = "操作失败";

    public static final String CODE_NO_DATA_FOUND = "999990";
    public static final String MSG_NO_DATA_FOUND = "找不到数据";

    public static final String CODE_ERR_UNKNOW = "999999";
    public static final String MSG_ERR_UNKNOW = "服务器未知异常";

    public static final String CODE_ERR_PARAM = "999998";
    public static final String MSG_ERR_PARAM = "参数错误";

    public static final String CODE_ERR_VPARAM = "999997";
    public static final String MSG_ERR_VPARAM = "参数校验失败";

    public static final String CODE_ERR_CPARAM = "999996";
    public static final String MSG_ERR_CPARAM = "参数转换失败";

    public static final String CODE_ERR_BIZCODE = "999995";
    public static final String MSG_ERR_BIZCODE = "未找到业务处理逻辑";

    public static final String CODE_TOKEN_OVERTIME = "111111";
    public static final String MSG_TOKEN_OVERTIME = "TOKEN过期";

    public static final String CODE_ERR_REGISTER = "999994";
    public static final String MSG_ERR_REGISTER = "用户注册信息待完善";

    public static final String CODE_ERR_USER = "999993";
    public static final String MSG_ERR_USER = "获取用户信息有误";

    public static final String CODE_ERR_TRADERPWD = "999992";
    public static final String MSG_ERR_TRADERPWD = "设置交易密码时间过期";

    public static final String CODE_ERR_DECODE = "999991";
    public static final String MSG_ERR_DECODE = "解码失败";

    public static final String CODE_ERR_TIMEOUT = "999910";
    public static final String MSG_ERR_TIMEOUT = "系统超时，请稍后留意短信结果";

    // =============================================用户登陆注册相关常量==========================================
    public static final String CODE_ILLEGAL_PHONENO = "100002";
    public static final String MSG_ILLEGAL_PHONENO = "手机号码不合法";

    public static final String CODE_PHONENO_REGISTER = "100003";
    public static final String MSG_PHONENO_REGISTER = "手机号码已注册";

    public static final String CODE_ERR_VERRICODE = "100004";
    public static final String MSG_ERR_VERRICODE = "验证码验证失败";

    public static final String CODE_ERR_PASSWORD = "100005";
    public static final String MSG_ERR_PASSWORD = "登录密码不正确";

    public static final String CODE_NOTSAME_PASSWORD = "100006";
    public static final String MSG_NOTSAME_PASSWORD = "输入的密码不一致";

    public static final String CODE_PHONENO_NOT_REGISTER = "100007";
    public static final String MSG_PHONENO_NOT_REGISTER = "手机号码未注册";

    public static final String CODE_EMAIL_REGISTERED = "100008";
    public static final String MSG_EMAIL_REGISTERED = "邮箱已被注册";

    public static final String CODE_PHONENO_REGISTERED = "100009";
    public static final String MSG_PHONENO_REGISTERED = "手机已被注册";
    public static final String CODE_REGISTER_FAILED = "100010";
    public static final String MSG_REGISTER_FAILED = "注册失败";

    public static final String CODE_SMS_OVERTIME = "100011";
    public static final String MSG_SMS_OVERTIME = "短信超过次数";

    public static final String CODE_ORDER_NOTEXIST = "600072";
    public static final String MSG_ORDER_NOTEXIST = "订单号不存在";

    public static final String CODE_ORDER_EXIST = "600071";
    public static final String MSG_ORDER_EXIST = "订单号已生成,请联系管理员";

    public static final String CODE_AMOUNT_NOTENOUGH = "999989";
    public static final String MSG_AMOUNT_NOTENOUGH = "余额不足,请充值";
}
