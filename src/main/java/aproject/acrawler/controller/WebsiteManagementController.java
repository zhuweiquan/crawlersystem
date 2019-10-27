package aproject.acrawler.controller;

import aproject.acrawler.services.WebsiteManagementService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import aproject.acrawler.model.dto.Website;
import aproject.acrawler.common.Result;
import aproject.acrawler.common.ResultEnum;

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
    public Result<List<Website>> getMaterialList() {
        try {
            List<Website> data = websiteManagementService.getWebsiteList();
            return new Result<>(ResultEnum.SUCCESS.getCode(), "获取网站列表成功", data);
        } catch (Exception e) {
            return new Result<>(ResultEnum.FAIL.getCode(), e.getMessage(), null);
        }
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
    public Result<Website> addWebsite(@RequestBody Website website) {
        try {
            websiteManagementService.addWebsite(website);
            return new Result<>(ResultEnum.SUCCESS.getCode(), "新增成功", website);
        } catch (Exception e) {
            return new Result<>(ResultEnum.FAIL.getCode(), e.getMessage(), null);
        }
    }


}
