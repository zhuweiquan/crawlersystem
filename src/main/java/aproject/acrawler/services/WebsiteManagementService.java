package aproject.acrawler.services;

import aproject.acrawler.model.dto.Website;

import java.util.List;

public interface WebsiteManagementService {

    /**
     * 获取网站列表
     * @return
     */
    public List<Website> getWebsiteList();

    /**
     * 添加网站
     * @param website
     */
    public void addWebsite(Website website);
}
