package com.dousl.learnboot1.web;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 学习-学生管理
 *
 * @author dousl
 * @Class StudentController
 * @Description
 * @Date 2020-01-14 9:00
 **/
@Api(tags = {"2-学生管理"})
@RestController
public class StudentController {
    @ApiOperation(value = "获取学生清单",tags = "3-教学管理")
    @GetMapping("/list")
    public String bbb() {
        return "bbb";
    }

    @ApiOperation("获取教某个学生的老师清单")
    @GetMapping("/his-teachers")
    public String ccc() {
        return "ccc";
    }

    @ApiOperation("创建一个学生")
    @PostMapping("/aaa")
    public String aaa() {
        return "aaa";
    }
}
