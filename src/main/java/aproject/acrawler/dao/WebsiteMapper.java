package aproject.acrawler.dao;

import aproject.acrawler.common.AprojectBaseDao;
import aproject.acrawler.model.dto.Website;

import java.util.List;

public interface WebsiteMapper extends AprojectBaseDao<Website> {

    List<Website> queryWebsiteList();
}
