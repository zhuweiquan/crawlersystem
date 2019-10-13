package aproject.acrawler.model.dto;

/**
 * 网站信息实体类
 */
public class Website {
    private int id;
    private String name;
    private String url;
    private String createTime;
    private String updateTime;

    public Website(int id, String name, String url) {
        this.id = id;
        this.name = name;
        this.url = url;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
}
