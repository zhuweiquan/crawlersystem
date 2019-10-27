package aproject.acrawler.model.dto;

public class CrawlerTask {
    private String id;
    private String target_id;
    private String in_url;
    private String storage_table;
    private String pattern;
    private String name;
    private String description;
    private String data_type;
    private String start_time;
    private String end_time;
    private String createTime;
    private String updateTime;
    private int count;
    private int duplicate_num;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTarget_id() {
        return target_id;
    }

    public void setTarget_id(String target_id) {
        this.target_id = target_id;
    }

    public String getIn_url() {
        return in_url;
    }

    public void setIn_url(String in_url) {
        this.in_url = in_url;
    }

    public String getStorage_table() {
        return storage_table;
    }

    public void setStorage_table(String storage_table) {
        this.storage_table = storage_table;
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

    public String getData_type() {
        return data_type;
    }

    public void setData_type(String data_type) {
        this.data_type = data_type;
    }

    public String getStart_time() {
        return start_time;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    public String getEnd_time() {
        return end_time;
    }

    public void setEnd_time(String end_time) {
        this.end_time = end_time;
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

    public int getDuplicate_num() {
        return duplicate_num;
    }

    public void setDuplicate_num(int duplicate_num) {
        this.duplicate_num = duplicate_num;
    }
}
