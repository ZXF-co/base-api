package indi.zxf.pro.base.api.mapper;

import indi.zxf.pro.base.api.entity.BusinessObject;
import indi.zxf.pro.base.api.query.AbstractQuery;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 数据访问类
 *
 * @author zhouxiaofa
 * @date 2022/11/29 21:16
 */
@Repository
public interface AbstractMapper<Entity extends BusinessObject> {

    /**
     * 根据主键ID查询数据
     *
     * @param       id-->数据主键ID
     * @return      查询到的数据
     */
    Entity findById(String id);

    /**
     * 创建数据
     *
     * @param       entity-->待创建数据
     */
    void insert(Entity entity);

    /**
     * 更新数据
     *
     * @param       entity-->待更新数据
     */
    void update(Entity entity);

    /**
     * 根据主键ID删除数据
     *
     * @param       id-->数据主键ID
     */
    void delete(String id);

    /**
     * 根据条件查询数据
     *
     * @param       condition-->查询条件
     * @return      查询到的数据
     */
    Entity findByCondition(AbstractQuery condition);

    /**
     * 根据条件查询数据列表
     *
     * @param       condition-->查询条件
     * @return      查询到的数据列表
     */
    List<Entity> findListByCondition(AbstractQuery condition);

    /**
     * 查询数据列表
     *
     * @return      查询到的数据列表
     */
    List<Entity> findAll();
}
