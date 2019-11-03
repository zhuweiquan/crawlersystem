package aproject.acrawler.model.dto;

/**
 * 爬虫任务 模型类
 * 数据库对应表 -- a_crawler_task
 * create time : 2019/10/27
 * author : zhuweiquan
 */
public class CrawlerTask {
    private String id;

    /**
     * 对应爬取目标实体ID （网站、网站目录）
     */
    private String targetId;

    /**
     * 初始链接
     */
    private String inUrl;

    /**
     * 存储表格
     */
    private String storageTable;

    /**
     * 匹配模板
     */
    private String pattern;
    private String name;
    private String description;
    private String dataType;
    private String startTime;
    private String endTime;
    private String createTime;
    private String updateTime;
    private int count;
    private int duplicateNum;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTargetId() {
        return targetId;
    }

    public void setTargetId(String targetId) {
        this.targetId = targetId;
    }

    public String getInUrl() {
        return inUrl;
    }

    public void setInUrl(String inUrl) {
        this.inUrl = inUrl;
    }

    public String getStorageTable() {
        return storageTable;
    }

    public void setStorageTable(String storageTable) {
        this.storageTable = storageTable;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getDuplicateNum() {
        return duplicateNum;
    }

    public void setDuplicateNum(int duplicateNum) {
        this.duplicateNum = duplicateNum;
    }
}
