package com.xworkz.di.tester;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DataSourceSelecTester {
	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("resources/datasourceselect.xml");
		int beanCount = container.getBeanDefinitionCount();

		System.out.println("beancount is::" + beanCount);
		DataSource datasource = container.getBean(DataSource.class);
		System.out.println(datasource);
		try {
			Connection connection = datasource.getConnection();
			String syntax = "select * from gym_table";
		PreparedStatement pstmt = connection.prepareStatement(syntax);
			System.out.println("platform created");
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				int id = rs.getInt("GYM_ID");
				String name = rs.getString(2);
				String location = rs.getString(3);
				String type = rs.getString(4);
				double membership = rs.getDouble(5);
				// System.out.println(id + " " + name + " " + location + " " +
				// type + " " + membership);
				System.out.println("id::" + id + " " + "name::" + name + " " + "location::" + location + " " + "type::"
						+ type + " " + "membership::" + membership);
			}

			System.out.println("connection \t" + connection);

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
