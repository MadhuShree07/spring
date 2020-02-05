package com.xworkz.spring;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DBConnection {
	@Value("${db.connection.url}")
	private String url;
	@Value("${db.connection.username}")
	private String username;
	@Value("${db.connection.password}")
	private String password;
	@Value("${db.connection.driver}")
	private String driver;

	private Connection connection;
	private Statement stmt;

	public DBConnection() {
		System.out.println("created\t" + this.getClass().getSimpleName());
	}

	@PostConstruct
	public void initResource() {
		String query = "insert into airpot.states values(3,'abc',89)";
		try {
			System.out.println("init the resources");
			System.out.println("url" + this.url);
			System.out.println("username" + this.username);
			System.out.println("password" + this.password);
			System.out.println("driver" + this.driver);
			Class.forName(this.driver);
			this.connection = DriverManager.getConnection(this.url, this.username, this.password);
			System.out.println("Resources connection is created" + this.connection);
			connection.setAutoCommit(false);
			stmt = connection.createStatement();
			stmt.execute(query);
			connection.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void operation() {
		System.out.println("invoked operation");
		try {
			System.out.println(this.connection.isClosed());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@PreDestroy
	public void closeResources() {
		System.out.println("invoked close resources");
		try {
			this.connection.close();
			System.out.println("resources is closed");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}