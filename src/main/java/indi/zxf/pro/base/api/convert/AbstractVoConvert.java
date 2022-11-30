package indi.zxf.pro.base.api.convert;

import indi.zxf.pro.base.api.entity.BusinessObject;
import indi.zxf.pro.base.api.entity.ViewObject;

/**
 * BO-->VO转换实现定义
 *
 * @author zhouxiaofa
 * @date 2022/11/22 17:45
 */
public abstract class AbstractVoConvert<BO extends BusinessObject, VO extends ViewObject> extends AbstractConvert<BO, VO> implements ViewObjectConvert<BO, VO> {

    public AbstractVoConvert() {

    }
}
