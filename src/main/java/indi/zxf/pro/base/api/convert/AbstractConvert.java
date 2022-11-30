package indi.zxf.pro.base.api.convert;

import java.util.ArrayList;
import java.util.List;

/**
 * 基础转换抽象类
 *
 * @author zhouxiaofa
 * @date 2022/11/23 8:36
 */
public abstract class AbstractConvert<Source, Target> implements Convert<Source, Target> {

    public AbstractConvert() {

    }

    @Override
    public List<Target> transfer(List<Source> sourceList) {
        if (null == sourceList) {
            return null;
        }
        List<Target> targetList = new ArrayList<>();
        for (Source source : sourceList) {
            Target target = this.transfer(source);
            targetList.add(target);
        }
        return targetList;
    }
}
