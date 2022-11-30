package indi.zxf.pro.base.api.convert;

import java.util.List;

/**
 * 基础转换定义
 *
 * @author zhouxiaofa
 * @date 2022/11/22 16:57
 */
public interface Convert<Source, Target> {

    /**
     * Source-->Target转换定义
     *
     * @param       source-->待转换实体
     * @return      转换后实体
     */
    Target transfer(Source source);

    /**
     * List<Source>-->List<Target>转换定义
     *
     * @param       sourceList-->待转换实体列表
     * @return      转换后实体列表
     */
    List<Target> transfer(List<Source> sourceList);
}
