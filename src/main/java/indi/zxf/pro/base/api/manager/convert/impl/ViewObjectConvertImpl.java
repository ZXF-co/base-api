package indi.zxf.pro.base.api.manager.convert.impl;

import indi.zxf.pro.base.api.manager.convert.ViewObjectConvert;
import indi.zxf.pro.base.api.model.impl.BusinessObjectImpl;
import indi.zxf.pro.base.api.model.impl.ViewObjectImpl;

/**
 * BO-->VO转换实现抽象类
 *
 * @author zhouxiaofa
 * @date 2022/11/22 17:45
 */
public abstract class ViewObjectConvertImpl<BO extends BusinessObjectImpl, VO extends ViewObjectImpl> extends AbstractConvert<BO, VO> implements ViewObjectConvert<BO, VO> {

    public ViewObjectConvertImpl() {

    }
}
