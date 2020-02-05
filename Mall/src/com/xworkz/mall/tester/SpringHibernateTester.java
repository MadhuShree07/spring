package com.xworkz.mall.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHibernateTester {

	public static void main(String args[]) {
		ApplicationContext container = new ClassPathXmlApplicationContext("resources/spring.xml");
	}
}
