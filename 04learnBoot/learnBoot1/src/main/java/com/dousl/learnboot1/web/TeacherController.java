package com.dousl.learnboot1.web;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 学习-教师管理
 *
 * @author dousl
 * @Class TeacherController
 * @Description
 * @Date 2020-01-14 9:00
 **/
@Api(tags = {"1-教师管理", "3-教学管理"})
@RestController
public class TeacherController {

    @ApiOperation(value = "xxx")
    @GetMapping("/xxx")
    public String xxx() {
        return "xxx";
    }
}
