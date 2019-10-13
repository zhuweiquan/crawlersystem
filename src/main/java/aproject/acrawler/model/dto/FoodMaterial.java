package aproject.acrawler.model.dto;

public class FoodMaterial {
    private int id;
    private String name;
    private String wuxing;
    private String wuwei;
    private String gongxiao;

    public FoodMaterial(int id){
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWuxing() {
        return wuxing;
    }

    public void setWuxing(String wuxing) {
        this.wuxing = wuxing;
    }

    public String getWuwei() {
        return wuwei;
    }

    public void setWuwei(String wuwei) {
        this.wuwei = wuwei;
    }

    public String getGongxiao() {
        return gongxiao;
    }

    public void setGongxiao(String gongxiao) {
        this.gongxiao = gongxiao;
    }
}
