package indi.zxf.pro.base.api.service;

import indi.zxf.pro.base.api.entity.BusinessObject;
import indi.zxf.pro.base.api.exception.IndiException;
import indi.zxf.pro.base.api.mapper.AbstractMapper;
import org.apache.commons.lang3.StringUtils;

import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * 基础服务抽象类
 *
 * @author zhouxiaofa
 * @date 2022/11/29 21:06
 */
public abstract class AbstractService<Entity extends BusinessObject> implements Service<Entity> {

    protected AbstractMapper<Entity> dataManager;

    public AbstractService(AbstractMapper<Entity> dataManager) {
        this.dataManager = dataManager;
    }

    @Override
    public Entity findById(String id) {
        return dataManager.findById(id);
    }

    @Override
    public Entity insert(Entity entity) {
        if (null == entity) {
            throw new IndiException("The Entity is null, can not to create!");
        }
        // 设置主键ID
        if (StringUtils.isBlank(entity.getId())) {
            entity.setId(UUID.randomUUID().toString());
        }
        // 设置创建时间和更新时间
        if (null == entity.getCreateDate()) {
            entity.setCreateDate(new Date());
        }
        if (null == entity.getUpdateDate()) {
            entity.setUpdateDate(new Date());
        }
        dataManager.insert(entity);
        return dataManager.findById(entity.getId());
    }

    @Override
    public Entity update(Entity entity) {
        Entity queryEntity = dataManager.findById(entity.getId());
        if (null == queryEntity) {
            throw new IndiException("The Entity with given id: " + entity.getId() + " does not exists, can not to update!");
        }
        if (null == entity.getUpdateDate()) {
            entity.setUpdateDate(new Date());
        }
        dataManager.update(entity);
        return dataManager.findById(entity.getId());
    }

    @Override
    public void delete(String id) {
        Entity queryEntity = dataManager.findById(id);
        if (null == queryEntity) {
            throw new IndiException("The Entity with given id: " + id + " does not exists, can not to delete!");
        }
        dataManager.delete(id);
    }

    @Override
    public List<Entity> findAll() {
        return dataManager.findAll();
    }
}
