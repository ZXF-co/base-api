package indi.zxf.pro.base.api.model.impl;

import indi.zxf.pro.base.api.model.BusinessObject;

import java.util.Date;

/**
 * 数据持久化逻辑模型实现
 *
 * @author zhouxiaofa
 * @date 2022/11/22 15:45
 */
public abstract class BusinessObjectImpl implements BusinessObject {

    /**
     * 主键ID
     */
    protected String id;
    /**
     * 创建人ID
     */
    private String createUserId;
    /**
     * 更新人ID
     */
    private String updateUserId;
    /**
     * 创建人姓名
     */
    private String createUserName;
    /**
     * 更新人姓名
     */
    private String updateUserName;
    /**
     * 创建时间(默认当前日期)
     */
    private Date createDate;
    /**
     * 更新时间(默认当前时间, 更新后为更新时时间)
     */
    private Date updateDate;
    /**
     * 是否更新
     */
    private boolean isInserted;
    /**
     * 是否删除
     */
    private boolean isUpdated;
    /**
     * 是否删除
     */
    private boolean isDeleted;
    /**
     * 版本号(默认初始版本号 = 1)
     */
    private int revision = 1;

    public BusinessObjectImpl() {

    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String getCreateUserId() {
        return createUserId;
    }

    @Override
    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
    }

    @Override
    public String getUpdateUserId() {
        return updateUserId;
    }

    @Override
    public void setUpdateUserId(String updateUserId) {
        this.updateUserId = updateUserId;
    }

    @Override
    public String getCreateUserName() {
        return createUserName;
    }

    @Override
    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName;
    }

    @Override
    public String getUpdateUserName() {
        return updateUserName;
    }

    @Override
    public void setUpdateUserName(String updateUserName) {
        this.updateUserName = updateUserName;
    }

    @Override
    public Date getCreateDate() {
        return createDate;
    }

    @Override
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Override
    public Date getUpdateDate() {
        return updateDate;
    }

    @Override
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    @Override
    public boolean getIsInserted() {
        return isInserted;
    }

    @Override
    public void setIsInserted(boolean isInserted) {
        isInserted = isInserted;
    }

    @Override
    public boolean getIsUpdated() {
        return isUpdated;
    }

    @Override
    public void setIsUpdated(boolean isUpdated) {
        isUpdated = isUpdated;
    }

    @Override
    public boolean getIsDeleted() {
        return isDeleted;
    }

    @Override
    public void setIsDeleted(boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    @Override
    public int getRevision() {
        return revision;
    }

    @Override
    public void setRevision(int revision) {
        this.revision = revision;
    }

    @Override
    public int getNextRevision() {
        return this.revision + 1;
    }
}
