package com.xworkz.nailpolish;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.nailpolish.app.NailPolish;

public class NailPolishTester {

public static void main(String[] args) {
	// TODO Auto-generated method stub
	try {
		String xmlConfigPath="resources/spring.xml";
		
		ApplicationContext spring = new ClassPathXmlApplicationContext(xmlConfigPath);
		NailPolish refOfNailPolish=spring.getBean(NailPolish.class);
		
		refOfNailPolish.applyingNailPolish("madhu");
		
	}catch(Exception e) {
		e.printStackTrace();
	}
}
}

