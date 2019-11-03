package aproject.acrawler.dao;

import aproject.acrawler.common.AprojectBaseDao;
import aproject.acrawler.model.dto.CrawlerTask;
import java.util.List;

/**
 * 爬虫任务 映射dao   -- a_crawler_task
 * create time : 2019/10/27
 * author : zhuweiquan
 */
public interface CrawlerTaskMapper extends AprojectBaseDao<CrawlerTask> {

    /**
     * 查询爬虫任务列表
     */
    List<CrawlerTask> queryCrawlerTaskList();

}
