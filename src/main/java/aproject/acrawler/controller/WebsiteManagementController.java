package aproject.acrawler.controller;

import aproject.acrawler.services.WebsiteManagementService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import aproject.acrawler.model.dto.Website;
import aproject.acrawler.services.FoodMaterialService;

import java.util.List;

@Api(value = "网站管理", tags = "网站管理")
@RequestMapping(value = "/website")
@RestController
public class WebsiteManagementController {

    @Autowired
    private WebsiteManagementService websiteManagementService;

    /**
     * 获取食材列表
     *
     * @return
     */
    @ApiOperation("获取网站列表")
//    @ApiImplicitParam(name = "name", value = "name", required = true, dataType = "String")
    @RequestMapping(value = "/getWebsiteList", method = RequestMethod.GET)
    @ResponseBody
    public List<Website> getMaterialList() {
        List<Website> data = websiteManagementService.getWebsiteList();
        return data;
    }

    /**
     *  新增网站
     *
     * @return
     */
    @ApiOperation("新增网站信息")
//    @ApiImplicitParam(name = "name", value = "name", required = true, dataType = "String")
    @RequestMapping(value = "/addWebsite", method = RequestMethod.POST)
    @ResponseBody
    public void addWebsite(@RequestBody Website website) {
        try {
            websiteManagementService.addWebsite(website);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
