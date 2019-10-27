package aproject.acrawler.model.dto;

/**
 * 网站目录 模型类
 * 数据库对应表 -- a_crawler_website_catalog
 * create time : 2019/10/27
 * author : zhuweiquan
 * @param <T>
 */
public class WebsiteCatalog {
    private String id;
    private String website_id;
    private String name;
    private String url;
    private String createTime;
    private String updateTime;
    private String tabs;
    private String description;

    public WebsiteCatalog() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getWebsite_id() {
        return website_id;
    }

    public void setWebsite_id(String website_id) {
        this.website_id = website_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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
