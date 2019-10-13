package aproject.acrawler.controller;

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
    public String hello(@PathVariable String name) {
        return String.format("Welcome to A PROJECT, %s!", name);
    }
}
