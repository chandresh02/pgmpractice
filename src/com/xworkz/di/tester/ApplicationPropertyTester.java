package com.xworkz.di.tester;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.di.component.ApplicationTotal;

public class ApplicationPropertyTester {
	public static void main(String[] args) {

		ApplicationContext container = new ClassPathXmlApplicationContext("resources/datasource.xml");
		String[] beanNames = container.getBeanDefinitionNames();
		System.out.println(Arrays.toString(beanNames));

		int beanCount = container.getBeanDefinitionCount();
		System.out.println("beancount is::" + beanCount);

		ApplicationTotal applicationtotal = container.getBean(ApplicationTotal.class);
		System.out.println("application name is::" + applicationtotal.getName());
		System.out.println("application version is::" + applicationtotal.getVersion());
		System.out.println("application type is::" + applicationtotal.getType());
		System.out.println("appplication activation is::" + applicationtotal.isActive());

	}

}
