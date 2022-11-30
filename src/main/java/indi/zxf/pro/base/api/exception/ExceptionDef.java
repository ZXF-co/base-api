package indi.zxf.pro.base.api.exception;

/**
 * 统一异常定义类
 *
 * @author zhouxiaofa
 * @date 2022/11/22 18:29
 */
public class ExceptionDef extends RuntimeException {

    private static final long serialVersionUID = 2L;

    /**
     * 异常定义(message + cause)
     *
     * @param       message-->异常信息
     * @param       cause-->异常原因
     */
    public ExceptionDef(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * 异常定义(message)
     *
     * @param       message-->异常信息
     */
    public ExceptionDef(String message) {
        super(message);
    }

    /**
     * 异常定义(cause)
     *
     * @param       cause-->异常原因
     */
    public ExceptionDef(Throwable cause) {
        super(cause);
    }
}
