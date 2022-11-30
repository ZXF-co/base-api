package indi.zxf.pro.base.api.entity;

import java.util.Date;

/**
 * BO基类
 *
 * @author zhouxiaofa
 * @date 2022/11/22 15:45
 */
public abstract class BusinessObject {

    /**
     * 主键ID
     */
    private String id;
    /**
     * 创建人ID
     */
    private String createUserId;
    /**
     * 修改人ID
     */
    private String updateUserId;
    /**
     * 创建人姓名
     */
    private String createUserName;
    /**
     * 修改人姓名
     */
    private String updateUserName;
    /**
     * 创建时间(默认当前日期)
     */
    private Date createDate;
    /**
     * 修改时间(默认当前时间,修改后为修改时时间)
     */
    private Date updateDate;
    /**
     * 是否删除
     */
    private boolean isDeleted;
    /**
     * 版本号(默认初始版本号=1)
     */
    private int revision = 1;

    public BusinessObject() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
    }

    public String getUpdateUserId() {
        return updateUserId;
    }

    public void setUpdateUserId(String updateUserId) {
        this.updateUserId = updateUserId;
    }

    public String getCreateUserName() {
        return createUserName;
    }

    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName;
    }

    public String getUpdateUserName() {
        return updateUserName;
    }

    public void setUpdateUserName(String updateUserName) {
        this.updateUserName = updateUserName;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public int getRevision() {
        return revision;
    }

    public void setRevision(int revision) {
        this.revision = revision;
    }

    /**
     * 获取下一版本号
     */
    public int getNextRevision() {
        return this.revision + 1;
    }
}
