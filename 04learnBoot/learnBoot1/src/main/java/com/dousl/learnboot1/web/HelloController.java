package com.dousl.learnboot1.web;

import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dousl
 * @Class HelloController
 * @Description
 * @Date 2020-01-10 14:09
 **/
@RestController
@Api(tags = "0-helloworld")
public class HelloController {
    @Value("${book.name}")
    private String bookName;

    @Value("${book.desc}")
    private String desc;

    @RequestMapping("/hello")
    public String index() {
        return desc;
    }
}
