package indi.zxf.pro.base.api.convert;

import indi.zxf.pro.base.api.entity.BusinessObject;
import indi.zxf.pro.base.api.entity.ViewObject;

/**
 * BO-->VO转换源定义
 *
 * @author zhouxiaofa
 * @date 2022/11/22 15:47
 */
public interface ViewObjectConvert<BO extends BusinessObject, VO extends ViewObject> extends Convert<BO, VO> {
}
