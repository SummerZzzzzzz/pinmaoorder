package com.softtron.pinmaoserver.configs;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableAutoConfiguration
@ComponentScan(basePackages= {"com.softtron"})
@PropertySource(value= {"classpath:mybatis.properties"})
@ImportResource(locations= {"classpath:spring.xml"})
@MapperScan("com.softtron.pinmaoorder.daos")
@EnableScheduling//开启定时任务
@EnableAsync//开启方法异步
public class Init {
	public static void main(String[] args) {
		SpringApplication.run(Init.class, args);
	}
}
