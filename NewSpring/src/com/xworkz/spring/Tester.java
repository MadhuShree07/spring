package com.xworkz.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {

	public static void main(String[] args) {
		try {
			ApplicationContext container = new ClassPathXmlApplicationContext("resources/spring.xml");
			Internet ref = container.getBean(Internet.class);
			ref.getProvider();
			ref.getSpeed();
			DBConnection refOfDBConnection = container.getBean(DBConnection.class);
			refOfDBConnection.operation();
			ClassPathXmlApplicationContext castingToImpl = (ClassPathXmlApplicationContext) container;
			castingToImpl.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}