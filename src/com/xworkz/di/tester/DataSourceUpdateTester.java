package com.xworkz.di.tester;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DataSourceUpdateTester {
	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("resources/datasourceupdate.xml");
		int beanCount = container.getBeanDefinitionCount();

		System.out.println("beancount is::" + beanCount);
		DataSource datasource = container.getBean(DataSource.class);
		System.out.println(datasource);
		try {
			Connection connection = datasource.getConnection();
			String syntax = "update gym_table set GYM_NAME='busygym' where GYM_TYPE='male'";
			Statement statement = connection.createStatement();
			// statement.execute(syntax); //return type boolean
			int rowupdated = statement.executeUpdate(syntax); //return type int 
			System.out.println(" total row updated::" + rowupdated);
			System.out.println("connection \t" + connection);

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
