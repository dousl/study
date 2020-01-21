package com.dousl.learn.boot2.service.impl;

import com.dousl.learn.boot2.dao.mapper.LearnSpringboot2Mapper;
import com.dousl.learn.boot2.domain.LearnSpringboot2;
import com.dousl.learn.boot2.service.TestMybatisPlusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 测试mybatisPlus
 *
 * @author dousl
 * @Class TestMybatisPlusServiceImpl
 * @Description
 * @Date 2020-01-20 14:16
 **/
@Service
public class TestMybatisPlusServiceImpl implements TestMybatisPlusService {

    @Autowired
    private LearnSpringboot2Mapper learnSpringboot2Mapper;

    @Override
    public List<LearnSpringboot2> selectList() {
        List<LearnSpringboot2> list= learnSpringboot2Mapper.selectList(null);
        list.forEach(System.out::println);
        return list;
    }
}
