package aproject.acrawler.dao;

import aproject.acrawler.common.AprojectBaseDao;
import aproject.acrawler.model.dto.WebsiteCatalog;
import java.util.List;

/**
 * 网站目录 映射dao   -- a_crawler_website_catalog
 * create time : 2019/10/27
 * author : zhuweiquan
 */
public interface WebsiteCatalogMapper extends AprojectBaseDao<WebsiteCatalog> {

    /**
     * 查询网站目录列表
     */
    List<WebsiteCatalog> queryWebsiteCatalogList();
}
