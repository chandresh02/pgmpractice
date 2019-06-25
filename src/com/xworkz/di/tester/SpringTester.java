package com.xworkz.di.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.di.component.Librarian;
import com.xworkz.di.component.Library;

public class SpringTester {
	public static void main(String[] args) {

		String path = "resources/spring.xml";
		ApplicationContext container = new ClassPathXmlApplicationContext(path);

		int beanCount = container.getBeanDefinitionCount();

		System.out.println("beancount is::" + beanCount);
		Library library = container.getBean(Library.class);
		library.issueBook("old book");
		
		Librarian librarian = container.getBean(Librarian.class);

	}

}
