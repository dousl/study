package com.dousl.learnboot1.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotNull;

/**
 * RESTful API
 *
 * @author dousl
 * @Class User
 * @Description
 * @Date 2020-01-13 13:52
 **/
@Data
@Getter
@Setter
@ToString
@ApiModel(value = "用户实体", description = "用户实体")
public class User {
    @ApiModelProperty(value = "用户编号",position = 1)
    private Long id;

    @NotNull
    @ApiModelProperty(value = "用户姓名",position = 2)
    private String name;

    @ApiModelProperty(value = "用户年龄",position = 3)
    private Integer age;
}
