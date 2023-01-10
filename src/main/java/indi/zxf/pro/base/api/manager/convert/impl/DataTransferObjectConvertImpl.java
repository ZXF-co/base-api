package indi.zxf.pro.base.api.manager.convert.impl;

import indi.zxf.pro.base.api.manager.convert.DataTransferObjectConvert;
import indi.zxf.pro.base.api.model.impl.BusinessObjectImpl;
import indi.zxf.pro.base.api.model.impl.DataTransferObjectImpl;

/**
 * 数据传输模型转换器实现
 *
 * @author zhouxiaofa
 * @date 2022/11/22 15:46
 */
public abstract class DataTransferObjectConvertImpl<DTO extends DataTransferObjectImpl, BO extends BusinessObjectImpl> extends AbstractConvert<DTO, BO> implements DataTransferObjectConvert<DTO, BO> {

    public DataTransferObjectConvertImpl() {

    }
}
