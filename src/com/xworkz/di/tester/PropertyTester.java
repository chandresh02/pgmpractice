package com.xworkz.di.tester;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.di.component.Application;

public class PropertyTester {
	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("resources/datasource.xml");
		String[] beanNames = container.getBeanDefinitionNames();
		System.out.println(Arrays.toString(beanNames));

		Application application = container.getBean(Application.class);
		System.out.println("application name is::" + application.getAppName());

	}

}
