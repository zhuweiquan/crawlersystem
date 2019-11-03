package aproject.acrawler.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import aproject.acrawler.dao.CrawlerTaskMapper;
import aproject.acrawler.model.dto.CrawlerTask;
import aproject.acrawler.services.CrawlerTaskService;

import java.util.List;
import java.util.UUID;

@Service
public class CrawlerTaskServiceImpl implements CrawlerTaskService{

    @Autowired
    private CrawlerTaskMapper crawlerTaskMapper;

    @Override
    public List<CrawlerTask> getTaskList() {
        return crawlerTaskMapper.queryCrawlerTaskList();
    }

    @Override
    public void addCrawlerTask(CrawlerTask crawlerTask) {
        // UUID生成id值
        String id = UUID.randomUUID().toString().replaceAll("-","");
        crawlerTask.setId(id);
        crawlerTaskMapper.insert(crawlerTask);
    }

    @Override
    public void deleteCrawlerTask(String taskId) {
        crawlerTaskMapper.delete(taskId);
    }

    @Override
    public void updateCrawlerTask(CrawlerTask crawlerTask){

        crawlerTaskMapper.update(crawlerTask);
    }
}
