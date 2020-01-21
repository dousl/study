package com.dousl.learn.boot2.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;
import java.util.Date;
import lombok.*;

/**
 * @author dousl
 * @date 2020-01-20
 */
@Setter
@Getter
@ToString
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("learn_springboot2")
public class LearnSpringboot2 extends Model<LearnSpringboot2> {
    /**
     * 表ID
     */
    private Long pkId;

    /**
     * 用户ID
     */
    private String userId;

    /**
     * 用户名称
     */
    private String userName;

    /**
     * 用户描述
     */
    private String userDesc;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    @Override
    protected Serializable pkVal() {
        return null;
    }
}