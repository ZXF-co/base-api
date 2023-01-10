package indi.zxf.pro.base.api.manager.convert;

import indi.zxf.pro.base.api.model.impl.BusinessObjectImpl;
import indi.zxf.pro.base.api.model.impl.ViewObjectImpl;

/**
 * 数据展示模型转换器定义
 *
 * @author zhouxiaofa
 * @date 2022/11/22 15:47
 */
public interface ViewObjectConvert<BO extends BusinessObjectImpl, VO extends ViewObjectImpl> extends Convert<BO, VO> {
}
