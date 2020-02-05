package com.xworkz.bar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.bar.app.BarImpl;

public class TesterBar {
	public static void main(String[] args) {
		try {
			String xmlConfigPath = "resources/spring.xml";

			ApplicationContext spring = new ClassPathXmlApplicationContext(xmlConfigPath);
			BarImpl refOfBarImpl1 = spring.getBean("barImpl", BarImpl.class);
			BarImpl refOfBarImpl2 = spring.getBean("barImpl2", BarImpl.class);
			BarImpl refOfBarImpl3 = spring.getBean("barImpl3", BarImpl.class);
			refOfBarImpl1.kuduka();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
