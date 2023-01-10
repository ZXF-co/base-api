package indi.zxf.pro.base.api.manager.convert;

import indi.zxf.pro.base.api.model.impl.BusinessObjectImpl;
import indi.zxf.pro.base.api.model.impl.DataTransferObjectImpl;

/**
 * 数据传输模型转换器定义
 *
 * @author zhouxiaofa
 * @date 2022/11/22 17:36
 */
public interface DataTransferObjectConvert<DTO extends DataTransferObjectImpl, BO extends BusinessObjectImpl> extends Convert<DTO, BO> {
}
