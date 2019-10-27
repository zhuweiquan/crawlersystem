package aproject.acrawler.common;

import java.util.List;

public interface AprojectBaseDao<T> {

    T findInstanceById(String id);

    List<T> findListById(String id);

    void insert(T t);

    void delete(String id);

    void update(T t);

    /**
     * 批量插入方法
     */
    void batchInsert(List<T> list);
}
