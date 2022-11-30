package indi.zxf.pro.base.api.query;

/**
 * 基础查询抽象类
 *
 * @author zhouxiaofa
 * @date 2022/11/29 21:24
 */
public abstract class AbstractQuery implements Query{

    private String id;

    public AbstractQuery() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
