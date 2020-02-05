package com.xworkz.bottlekuduka;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.bottlekuduka.app.Bottle;

public class Tester {

	public static void main(String[] args) {
		try {
			String xmlConfigPath = "resources/spring.xml";

			ConfigurableApplicationContext spring = new ClassPathXmlApplicationContext(xmlConfigPath);
			Bottle refOfBottle = spring.getBean(Bottle.class);
		
			refOfBottle.store("water");
			spring.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
