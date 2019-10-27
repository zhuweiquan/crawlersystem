package aproject.acrawler.services;

import aproject.acrawler.model.dto.Website;

import java.util.List;

public interface WebsiteManagementService {

    public List<Website> getWebsiteList();

    public void addWebsite(Website website);
}
