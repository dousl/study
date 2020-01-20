package com.dousl.learn.boot2.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dousl.learn.boot2.domain.LearnSpringboot2;

/**
 * @author dousl
 * @date 2020-01-17
 */
public interface LearnSpringboot2Mapper extends BaseMapper<LearnSpringboot2> {
    int deleteByPrimaryKey(Long pkId);

    LearnSpringboot2 selectByPrimaryKey(Long pkId);

    int updateByPrimaryKey(LearnSpringboot2 record);
}