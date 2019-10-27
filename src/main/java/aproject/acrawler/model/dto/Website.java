package aproject.acrawler.model.dto;

/**
 * 网站信息实体类
 */
public class Website {
    private String id;
    private String name;
    private String url;
    private String createTime;
    private String updateTime;
    private String tabs;
    private String description;

    public Website(){

    }

    public Website(String id, String name, String url) {
        this.id = id;
        this.name = name;
        this.url = url;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCreateTime() {
        return createTime;
    }

    public String getName() {
        return name;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public String getUrl() {
        return url;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTabs() {
        return tabs;
    }

    public void setTabs(String tabs) {
        this.tabs = tabs;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
