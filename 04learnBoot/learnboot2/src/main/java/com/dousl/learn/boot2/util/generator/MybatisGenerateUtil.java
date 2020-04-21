package com.dousl.learn.boot2.util.generator;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.util.ArrayList;
import java.util.List;


/**
 * @author dousl
 * @Class MybatisGenerateUtil
 * @Description
 * @Date 2020-03-05 11:25
 **/
public class MybatisGenerateUtil {
    public static void main(String[] args) throws Exception {
        List warnings = new ArrayList();
// 根据配置文件生成相应的实体类、mapper文件
        Configuration config = new ConfigurationParser(warnings).parseConfiguration(new File("F:\\MyCode\\01ws\\01study\\04learnBoot\\learnboot2\\src\\main\\resources\\mybatis-generate-user.xml"));
        new MyBatisGenerator(config, new DefaultShellCallback(true), warnings).generate(null);
    }
}
