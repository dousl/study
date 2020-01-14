package com.dousl.learnboot1.domain;

import lombok.*;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author dousl
 * @Class FooProperties
 * @Description
 * @Date 2020-01-13 11:00
 **/
@Setter
@Getter
@ToString
@Data
@ConfigurationProperties(prefix = "com.dousl-space")
public class FooProperties {
    private String foo;
}
