package com.xworkz.farmerland;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.farmerland.app.Land;

public class Tester {

	public static void main(String[] args) {
		try {
			String xmlConfigPath = "resources/spring.xml";

			ApplicationContext spring = new ClassPathXmlApplicationContext(xmlConfigPath);
			Land refOfLand = spring.getBean(Land.class);
			refOfLand.yield("wheat");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
