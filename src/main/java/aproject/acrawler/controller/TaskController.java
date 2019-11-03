package aproject.acrawler.controller;

import aproject.acrawler.services.CrawlerTaskService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import aproject.acrawler.model.dto.CrawlerTask;
import aproject.acrawler.common.Result;
import aproject.acrawler.common.ResultEnum;

import java.util.List;

@Api(value = "爬虫任务管理", tags = "爬虫任务管理")
@RequestMapping(value = "/crawlerTask")
@RestController
public class TaskController {

    @Autowired
    private CrawlerTaskService crawlerTaskService;

    /**
     *  新增任务
     *
     * @return
     */
    @ApiOperation("新建任务")
//    @ApiImplicitParam(name = "name", value = "name", required = true, dataType = "String")
    @RequestMapping(value = "/addTask", method = RequestMethod.POST)
    @ResponseBody
    public Result<CrawlerTask> addTask(@RequestBody CrawlerTask task) {
        try {
            crawlerTaskService.addCrawlerTask(task);
            return new Result<>(ResultEnum.SUCCESS.getCode(), "新增成功", task);
        } catch (Exception e) {
            return new Result<>(ResultEnum.FAIL.getCode(), e.getMessage(), null);
        }
    }

    /**
     *  获取任务列表
     *
     * @return
     */
    @ApiOperation("获取任务列表")
//    @ApiImplicitParam(name = "name", value = "name", required = true, dataType = "String")
    @RequestMapping(value = "/getTaskList", method = RequestMethod.GET)
    public Result<List<CrawlerTask>> getTaskList() {
        try {
            List<CrawlerTask> data = crawlerTaskService.getTaskList();
            return new Result<>(ResultEnum.SUCCESS.getCode(), "查询任务列表成功！", data);
        } catch (Exception e) {
            return new Result<>(ResultEnum.FAIL.getCode(), e.getMessage(), null);
        }
    }

    /**
     *  删除任务
     *
     * @return
     */
    @ApiOperation("删除任务")
//    @ApiImplicitParam(name = "name", value = "name", required = true, dataType = "String")
    @RequestMapping(value = "/deleteTask/{taskId}", method = RequestMethod.GET)
    public Result<String> deleteTask(@PathVariable String taskId) {
        try {
            crawlerTaskService.deleteCrawlerTask(taskId);
            return new Result<>(ResultEnum.SUCCESS.getCode(), "删除任务成功！", taskId);
        } catch (Exception e) {
            return new Result<>(ResultEnum.FAIL.getCode(), e.getMessage(), null);
        }
    }

    /**
     *  更新任务
     *
     * @return
     */
    @ApiOperation("更新任务")
//    @ApiImplicitParam(name = "name", value = "name", required = true, dataType = "String")
    @RequestMapping(value = "/updateTask", method = RequestMethod.POST)
    public Result<String> updateTask(@RequestBody CrawlerTask task) {
        try {
            crawlerTaskService.updateCrawlerTask(task);
            return new Result<>(ResultEnum.SUCCESS.getCode(), "更新任务成功！", "");
        } catch (Exception e) {
            return new Result<>(ResultEnum.FAIL.getCode(), e.getMessage(), null);
        }
    }
}
