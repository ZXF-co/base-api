package indi.zxf.pro.base.api.inter;

/**
 * 策略模式接口定义
 *
 * @author zhouxiaofa
 * @date 2022/12/15 18:29
 **/
public interface BaseStrategy<T> {

    /**
     * 获取类型
     *
     * @return      获取到的类型
     */
    public String type();

    /**
     * 获取指定<T>类型
     *
     * @return      获取到的指定<T>类型
     */
    public T getType();
}
