package indi.zxf.pro.base.api.convert;

import indi.zxf.pro.base.api.entity.BusinessObject;
import indi.zxf.pro.base.api.entity.DataTransferObject;

/**
 * DTO-->BO转换源定义
 *
 * @author zhouxiaofa
 * @date 2022/11/22 17:36
 */
public interface DataTransferObjectConvert<DTO extends DataTransferObject, BO extends BusinessObject> extends Convert<DTO, BO> {
}
