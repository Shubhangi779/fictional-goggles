package com.infy.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.infy.model.EmployeeDto;

@Configuration
public class DatabaseConnectivity {
    
	/*
	 * static Connection connection = null;
	 * 
	 * public static Connection getConnetions() { try {
	 * Class.forName("com.mysql.jdbc.Driver"); connection =
	 * DriverManager.getConnection("jdbc:mysql://localhost:3306/EmployeeDB","root",
	 * "root"); }catch(Exception e) { System.out.println(e.getMessage()); } return
	 * connection; }
	 */
	
	@Bean
	public DriverManagerDataSource getDataSource() {

		DriverManagerDataSource connection = new DriverManagerDataSource();
		connection.setDriverClassName("com.mysql.jdbc.Driver");
		connection.setUrl("jdbc:mysql://localhost:3306/EmployeeDB");
		connection.setUsername("root");
		connection.setPassword("");

		return connection;
	}
			
}

