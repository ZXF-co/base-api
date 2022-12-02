package indi.zxf.pro.base.api.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.UUID;

/**
 * 生成随机ID工具类
 *
 * @author zhouxiaofa
 * @date 2022/12/2 22:37
 */
public class UUIDUtil {

    private static final Logger logger = LoggerFactory.getLogger(UUIDUtil.class);

    /**
     * 生成随机ID
     *
     * @return      随机ID
     */
    public static String randomUUID() {
        return UUID.randomUUID().toString();
    }
}
