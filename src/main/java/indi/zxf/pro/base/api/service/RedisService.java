package indi.zxf.pro.base.api.service;

import java.util.List;

/**
 * Redis服务类定义类
 *
 * @author zhouxiaofa
 * @date 2022/12/12 9:59
 **/
public interface RedisService {

    /**
     * 保存属性(key+value)
     *
     * @param       key-->键
     * @param       value-->值
     */
    void set(String key, Object value);

    /**
     * 保存属性(key+value+time)
     *
     * @param       key-->键
     * @param       value-->值
     * @param       time-->时间
     */
    void set(String key, Object value, long time);

    /**
     * 通过key获取属性
     *
     * @param       key-->键
     * @return      key对应属性值
     */
    Object get(String key);

    /**
     * 通过key删除属性
     *
     * @param       key-->键
     * @return      是否成功删除
     */
    Boolean del(String key);

    /**
     * 通过List<key>批量删除属性
     *
     * @param       keys-->键列表
     * @return      成功删除数量
     */
    Long del(List<String> keys);

    /**
     * 对key设置过期时间
     *
     * @param       key-->键
     * @param       time-->过期时间
     * @return      是否成功设置过期时间
     */
    Boolean expire(String key, long time);

    /**
     * 获取key过期时间
     *
     * @param       key-->键
     * @return      过期时间
     */
    Long getExpire(String key);

    /**
     * 判断是否含有指定属性
     *
     * @param       key-->键
     * @return      是否含有指定属性
     */
    Boolean hasKey(String key);


}
