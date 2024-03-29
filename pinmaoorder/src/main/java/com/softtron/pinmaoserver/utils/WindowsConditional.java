package com.softtron.pinmaoserver.utils;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class WindowsConditional implements Condition {

	@Override
	public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata metadata) {
		// 获取ioc使用的beanFactory
		ConfigurableListableBeanFactory beanFactory = conditionContext.getBeanFactory();
		// 获取类加载器
		ClassLoader classLoader = conditionContext.getClassLoader();
		// 获取当前环境信息
		Environment environment = conditionContext.getEnvironment();
		// 获取bean定义的注册类
		BeanDefinitionRegistry registry = conditionContext.getRegistry();

		// 获得当前系统名
		String property = environment.getProperty("os.name");
		// 包含Windows则说明是windows系统，返回true
		if (property.contains("Linux")) {
			return true;
		}
		return false;
	}

}
