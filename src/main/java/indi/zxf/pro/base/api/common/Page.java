package indi.zxf.pro.base.api.common;

import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * 数据分页类
 *
 * @author zhouxiaofa
 * @date 2022/12/12 22:08
 **/
public class Page<T> {

    /**
     * 当前页
     */
    private Integer page;
    /**
     * 每页条数
     */
    private Integer size;
    /**
     * 总页数
     */
    private Integer totalPages;
    /**
     * 总条数
     */
    private Long totalSize;
    /**
     * 分页数据
     */
    private List<T> list;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

    public Long getTotalSize() {
        return totalSize;
    }

    public void setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    /**
     * 将PageHelper分页后的list转为分页数据
     *
     * @param       list-->分页后数据
     * @param       <T>-->泛型
     * @return      分页数据
     */
    public static <T> Page<T> page(List<T> list) {
        Page<T> result = new Page<>();
        PageInfo<T> pageInfo = new PageInfo<>(list);
        result.setPage(pageInfo.getPageNum());
        result.setSize(pageInfo.getPageSize());
        result.setTotalPages(pageInfo.getPages());
        result.setTotalSize(pageInfo.getTotal());
        result.setList(pageInfo.getList());
        return result;
    }

    /**
     * 将SpringData分页后的list转为分页数据
     *
     * @param       pageInfo-->分页后数据
     * @param       <T>-->泛型
     * @return      分页数据
     */
    public static <T> Page<T> page(org.springframework.data.domain.Page<T> pageInfo) {
        Page<T> result = new Page<>();
        result.setPage(pageInfo.getNumber());
        result.setSize(pageInfo.getSize());
        result.setTotalPages(pageInfo.getTotalPages());
        result.setTotalSize(pageInfo.getTotalElements());
        result.setList(pageInfo.getContent());
        return result;
    }
}
