package com.xworkz.dominoes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.dominoes.app.Reception;

public class SpringTester {

	public static void main(String[] agrs) {
		
		try {
			String metaInfo="resources/context.xml";
			
			ApplicationContext spring = new ClassPathXmlApplicationContext(metaInfo);
			Reception refOfReception=spring.getBean(Reception.class);
			
			refOfReception.receiveOrder(20);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
