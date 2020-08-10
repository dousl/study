package com.dousl.learn.boot2.temp;

import com.dousl.learn.boot2.temp.RmPaylimitExamine;

public interface RmPaylimitExamineMapper {
    int deleteByPrimaryKey(String id);

    int insert(RmPaylimitExamine record);

    int insertSelective(RmPaylimitExamine record);

    RmPaylimitExamine selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(RmPaylimitExamine record);

    int updateByPrimaryKey(RmPaylimitExamine record);
}