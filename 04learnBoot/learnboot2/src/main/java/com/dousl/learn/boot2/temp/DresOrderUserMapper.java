package com.dousl.learn.boot2.temp;

import com.dousl.learn.boot2.temp.DresOrderUser;

public interface DresOrderUserMapper {
    int deleteByPrimaryKey(String orderId);

    int insert(DresOrderUser record);

    int insertSelective(DresOrderUser record);

    DresOrderUser selectByPrimaryKey(String orderId);

    int updateByPrimaryKeySelective(DresOrderUser record);

    int updateByPrimaryKey(DresOrderUser record);
}