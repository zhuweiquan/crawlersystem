package aproject.acrawler.services.impl;


import aproject.acrawler.dao.WebsiteMapper;
import aproject.acrawler.model.dto.Website;
import aproject.acrawler.services.WebsiteManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class WebsiteManagementServiceImpl implements WebsiteManagementService {

    @Autowired
    private WebsiteMapper websiteMapper;

    @Override
    public List<Website> getWebsiteList() {
        return websiteMapper.queryWebsiteList();
    }

    @Override
    public void addWebsite(Website website) {
        // UUID生成id值
        String id = UUID.randomUUID().toString().replaceAll("-","");
        website.setId(id);
        websiteMapper.insert(website);
    }
}
