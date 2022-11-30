package indi.zxf.pro.base.api.convert;

import indi.zxf.pro.base.api.entity.BusinessObject;
import indi.zxf.pro.base.api.entity.DataTransferObject;

/**
 * DTO-->BO转换实现抽象类
 *
 * @author zhouxiaofa
 * @date 2022/11/22 15:46
 */
public abstract class AbstractDtoConvert<DTO extends DataTransferObject, BO extends BusinessObject> extends AbstractConvert<DTO, BO> implements DataTransferObjectConvert<DTO, BO> {

    public AbstractDtoConvert() {

    }
}
