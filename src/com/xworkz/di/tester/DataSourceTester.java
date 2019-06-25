package com.xworkz.di.tester;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DataSourceTester {
	 

	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("resources/datasource.xml");
		int beanCount = container.getBeanDefinitionCount();

		System.out.println("beancount is::" + beanCount);
		DataSource datasource = container.getBean(DataSource.class);
		System.out.println(datasource);
		try {
			Connection connection = datasource.getConnection();
			String syntax = "insert into gym_table values(8,'post','sasaram','male',222.34)";
			Statement statement = connection.createStatement();
			statement.execute(syntax);
			System.out.println("connection \t" + connection);

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
