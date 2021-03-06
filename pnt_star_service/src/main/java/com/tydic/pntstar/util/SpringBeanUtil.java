package com.tydic.pntstar.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public final class SpringBeanUtil implements ApplicationContextAware {

	private static ApplicationContext ctx;

	public static Object getBean(String id) {
 		if (ctx == null) {
			throw new NullPointerException("ApplicationContext is null");
		}
		return ctx.getBean(id);
	}

	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		ctx = applicationContext;
	}
	public static ApplicationContext getApplicationContext()
			throws BeansException {
		return ctx;
	}
	public static boolean containsBean(String beanId) {
		return ctx.containsBean(beanId);
	}

}
