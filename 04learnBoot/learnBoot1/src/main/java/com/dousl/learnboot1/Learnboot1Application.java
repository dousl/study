package com.dousl.learnboot1;

import com.dousl.learnboot1.domain.FooProperties;
import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.bind.Bindable;
import org.springframework.boot.context.properties.bind.Binder;
import org.springframework.context.ApplicationContext;

/**
 * 启动类
 * @author dousl
 */
@EnableSwagger2Doc
@SpringBootApplication
public class Learnboot1Application {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Learnboot1Application.class, args);
		/*Binder binder = Binder.get(context.getEnvironment());
		FooProperties foo = binder.bind("com.dousl-space", Bindable.of(FooProperties.class)).get();
		System.out.println(foo.getFoo());*/
	}

}
