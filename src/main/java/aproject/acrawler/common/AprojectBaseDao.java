package aproject.acrawler.common;

import java.util.List;

/**
 * DAO通用增删改查方法
 * 所有的Mapper都需要继承此接口
 * create time : 2019/10/27
 * author : zhuweiquan
 * @param <T>
 */
public interface AprojectBaseDao<T> {

    T findInstanceById(String id);

    List<T> findListByIds(List<String> ids);

    void insert(T t);

    void delete(String id);

    void update(T t);

    /**
     * 批量插入方法
     */
    void batchInsert(List<T> list);

    /**
     * 批量删除方法
     */
    void batchDelete(List<String> ids);
}
