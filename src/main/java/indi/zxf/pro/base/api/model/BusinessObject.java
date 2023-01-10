package indi.zxf.pro.base.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 数据持久化逻辑模型定义
 *
 * @author zhouxiaofa
 * @date 2022/12/26 23:10
 **/
public interface BusinessObject extends BaseEntity, BaseObject {

    /**
     * 获取是否已经创建
     *
     * @return      是否已经创建
     */
    boolean getIsInserted();

    /**
     * 设置是否已经创建
     *
     * @param       inserted-->是否已经创建
     */
    void setIsInserted(boolean inserted);

    /**
     * 获取是否已经更新
     *
     * @return      是否已经更新
     */
    boolean getIsUpdated();

    /**
     * 设置是否已经更新
     *
     * @param       isUpdated-->是否已经更新
     */
    void setIsUpdated(boolean isUpdated);

    /**
     * 获取是否已经删除
     *
     * @return      是否已经删除
     */
    boolean getIsDeleted();

    /**
     * 设置是否已经删除
     *
     * @param       isDeleted-->是否已经删除
     */
    void setIsDeleted(boolean isDeleted);

    /**
     * 获取当前版本
     *
     * @return      当前版本
     */
    int getRevision();

    /**
     * 设置当前版本
     *
     * @param       revision-->当前版本
     */
    void setRevision(int revision);

    /**
     * 获取下一版本
     *
     * @return      下一版本
     */
    int getNextRevision();

    /**
     * 获取实例
     *
     * @return      实例
     */
    @JsonIgnore
    Object getPersistentObject();
}
