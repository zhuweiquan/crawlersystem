package aproject.acrawler.controller;

import aproject.acrawler.model.dto.FoodMaterial;
import aproject.acrawler.services.FoodMaterialService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiImplicitParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Api(value = "食材管理", tags = "食材管理")
@RequestMapping(value = "/material")
@RestController
public class FoodMaterialManageController {

    @Autowired
    private FoodMaterialService foodMaterialService;

    /**
     * 获取食材列表
     *
     * @return
     */
    @ApiOperation("获取食材列表")
//    @ApiImplicitParam(name = "name", value = "name", required = true, dataType = "String")
    @RequestMapping(value = "/getMaterialList", method = RequestMethod.GET)
    @ResponseBody
    public List<FoodMaterial> getMaterialList() {
        List<FoodMaterial> data = foodMaterialService.getFoodMaterialList();
        return data;
    }
}
