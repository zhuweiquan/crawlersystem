package aproject.acrawler.controller;

import aproject.acrawler.common.Result;
import aproject.acrawler.common.ResultEnum;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiImplicitParam;
import org.springframework.web.bind.annotation.*;




/**
 * 测试
 */
@RestController
@RequestMapping(value = "/first")
@Api(value = "第一个接口", tags = "first blood")
public class HelloController {

    /**
     * 项目第一个API
     *
     * @param name
     * @return
     */
    @ApiOperation("项目第一个API")
    @ApiImplicitParam(name = "name", value = "name", required = true, dataType = "String")
    @RequestMapping(value = "/hello/{name}", method = RequestMethod.GET)
    public Result<String> hello(@PathVariable String name) {
        String res = String.format("Welcome to A PROJECT, %s!", name);
        return new Result<>(ResultEnum.SUCCESS.getCode(), "ok", res);
    }

}
