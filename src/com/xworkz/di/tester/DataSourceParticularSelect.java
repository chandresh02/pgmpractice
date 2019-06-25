package com.xworkz.di.tester;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DataSourceParticularSelect {
	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("resources/datasourceselect.xml");
		int beanCount = container.getBeanDefinitionCount();

		System.out.println("beancount is::" + beanCount);
		DataSource datasource = container.getBean(DataSource.class);
		System.out.println(datasource);
		try {
			Connection connection = datasource.getConnection();
			String syntax = "select * from gym_table where GYM_ID=?";
			Scanner sc=new Scanner(System.in);
			System.out.println("enter GYM_ID");
			int id=sc.nextInt();
			java.sql.PreparedStatement pstmt = connection.prepareStatement(syntax);
       ////////set value for place holder before execution//////////////
			pstmt.setInt(1,id);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				String name = rs.getString(2);
				String location = rs.getString(3);
				String type = rs.getString(4);
				double membership = rs.getDouble(5);
				// System.out.println(id + " " + name + " " + location + " " +
				// type + " " + membership);
				System.out.println("name::" + name + " " + "location::" + location + " " + "type::"
						+ type + " " + "membership::" + membership);
			}

			System.out.println("connection \t" + connection);

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
