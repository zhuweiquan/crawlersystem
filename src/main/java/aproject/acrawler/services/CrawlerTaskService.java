package aproject.acrawler.services;


import aproject.acrawler.model.dto.CrawlerTask;

import java.util.List;

public interface CrawlerTaskService {

    /**
     * 获取任务列表
     * @return
     */
    public List<CrawlerTask> getTaskList();

    /**
     * 添加任务
     * @return
     */
    public void addCrawlerTask(CrawlerTask crawlerTask);

    /**
     * 删除任务
     * @return
     */
    public void deleteCrawlerTask(String taskId);

    /**
     * 更新任务
     * @return
     */
    public void updateCrawlerTask(CrawlerTask crawlerTask);
}
