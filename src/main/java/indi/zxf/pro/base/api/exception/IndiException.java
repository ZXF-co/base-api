package indi.zxf.pro.base.api.exception;

/**
 * 自定义异常定义类
 *
 * @author zhouxiaofa
 * @date 2022/11/22 18:34
 */
public class IndiException extends ExceptionDef {

    private static final long serialVersionUID = 3L;
    protected int code;

    public IndiException(String message, Throwable cause, int code) {
        super(message, cause);
        this.code = code;
    }

    public IndiException(String message, Throwable cause) {
        super(message, cause);
    }

    public IndiException(String message, int code) {
        super(message);
        this.code = code;
    }

    public IndiException(Throwable cause, int code) {
        super(cause);
        this.code = code;
    }

    public IndiException(String message) {
        super(message);
    }

    public IndiException(Throwable cause) {
        super(cause);
    }

    public IndiException(int code, String message, Object... args) {
        super(String.format(message, args));
        this.code = code;
    }
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
