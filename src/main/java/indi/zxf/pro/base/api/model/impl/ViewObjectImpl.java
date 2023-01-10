package indi.zxf.pro.base.api.model.impl;

import indi.zxf.pro.base.api.model.ViewObject;

import java.util.Date;

/**
 * 数据展示逻辑模型实现
 *
 * @author zhouxiaofa
 * @date 2022/11/22 15:46
 */
public abstract class ViewObjectImpl implements ViewObject {

    /**
     * 主键ID
     */
    private String id;
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

    public ViewObjectImpl() {

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
}
