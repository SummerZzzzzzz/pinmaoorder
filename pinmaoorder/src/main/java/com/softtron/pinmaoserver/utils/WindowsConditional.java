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
		// ��ȡiocʹ�õ�beanFactory
		ConfigurableListableBeanFactory beanFactory = conditionContext.getBeanFactory();
		// ��ȡ�������
		ClassLoader classLoader = conditionContext.getClassLoader();
		// ��ȡ��ǰ������Ϣ
		Environment environment = conditionContext.getEnvironment();
		// ��ȡbean�����ע����
		BeanDefinitionRegistry registry = conditionContext.getRegistry();

		// ��õ�ǰϵͳ��
		String property = environment.getProperty("os.name");
		// ����Windows��˵����windowsϵͳ������true
		if (property.contains("Linux")) {
			return true;
		}
		return false;
	}

}
