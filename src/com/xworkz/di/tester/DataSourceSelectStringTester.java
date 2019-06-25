package com.xworkz.di.tester;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DataSourceSelectStringTester {
	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("resources/datasourceselect.xml");
		int beanCount = container.getBeanDefinitionCount();

		System.out.println("beancount is::" + beanCount);
		DataSource datasource = container.getBean(DataSource.class);
		System.out.println(datasource);
		try {
			Connection connection = datasource.getConnection();
			String syntax = "select * from gym_table where GYM_Location=?";
			Scanner sc=new Scanner(System.in);
			System.out.println("enter GYM_Location");
			String str=sc.nextLine();
			java.sql.PreparedStatement pstmt = connection.prepareStatement(syntax);
       ////////set value for place holder before execution//////////////
		    pstmt.setString(1,str);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				int id=rs.getInt(1);
				String name = rs.getString(2);
		//		String location = rs.getString(3);
				String type = rs.getString(4);
				double membership = rs.getDouble(5);
				 System.out.println(id + " " + name + " " +
				 type + " " + membership);
		//		System.out.println("name::" + name + " " + "location::" + location + " " + "type::"
		//				+ type + " " + "membership::" + membership);
			}

			System.out.println("connection \t" + connection);

		} catch (SQLException e) {
			e.printStackTrace();
		}
}
}
