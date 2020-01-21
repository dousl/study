package com.dousl.learn.boot2.controller;

import com.dousl.learn.boot2.domain.LearnSpringboot2;
import com.dousl.learn.boot2.service.TestMybatisPlusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 测试mybatisPlus
 *
 * @author dousl
 * @Class TestMybatisPlus
 * @Description
 * @Date 2020-01-20 14:10
 **/
@RestController()
@RequestMapping("/testMybatisPlus")
public class TestMybatisPlusController {
    @Autowired
    private TestMybatisPlusService testMybatisPlusService;

    @PostMapping("/selectList")
    public List<LearnSpringboot2> selectList() {
        return testMybatisPlusService.selectList();
    }
}
