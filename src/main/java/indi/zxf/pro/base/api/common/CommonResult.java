package indi.zxf.pro.base.api.common;

/**
 * 数据统一封装类
 *
 * @author zhouxiaofa
 * @date 2022/11/22 18:26
 */
public class CommonResult {

    private CommonResult() {

    }

    /**
     * 定义统一封装数据格式(code + message + object)
     **/
    public static <O> Wrapper<O> wrap(int code, String message, O o) {
        return new Wrapper(code, message, o);
    }

    /**
     * 定义统一封装数据格式(code + message)
     **/
    public static <O> Wrapper<O> wrap(int code, String message) {
        return wrap(code, message, null);
    }

    /**
     * 定义统一封装数据格式(code)
     **/
    public static <O> Wrapper<O> wrap(int code) {
        return wrap(code, null);
    }

    /**
     * 定义统一封装数据格式(wrapper)
     */
    public static <O> O unwrap(Wrapper<O> wrapper) {
        return wrapper.getData();
    }

    /**
     * 定义统一返回数据格式[正确格式](code + message)
     **/
    public static <O> Wrapper<O> ok() {
        return new Wrapper();
    }

    /**
     * 定义统一返回数据格式[正确格式](code + message + object)
     **/
    public static <O> Wrapper<O> ok(O o) {
        return new Wrapper(200, "操作成功", o);
    }

    /**
     * 定义统一返回数据格式[错误格式](code + message)
     **/
    public static <O> Wrapper<O> error(int errorCode, String message) {
        return new Wrapper(errorCode, message);
    }
}
