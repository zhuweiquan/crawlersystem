package aproject.acrawler.common;

/**
 * 结果返回码
 * create time : 2019/10/27
 * author : zhuweiquan
 */
public enum ResultEnum {

    FAIL(-1,"失败"),
    SUCCESS(0,"成功"),
    USER_NOT_EXIST(1,"用户不存在"),
    USER_IS_EXISTS(2,"用户已存在"),
    DATA_IS_NULL(3,"数据为空");

    private Integer code;
    private String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
