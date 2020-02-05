package com.xworkz.mall.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.mall.dao.MallDAO;
import com.xworkz.mall.entity.MallEntity;

public class SpringTester {
	public static void main(String[] args) {

		try {

			ApplicationContext spring = new ClassPathXmlApplicationContext("resources/spring.xml");
			MallDAO refOfTravelAgencyDao = spring.getBean(MallDAO.class);
			refOfTravelAgencyDao.save(new MallEntity("OrianMall", 56, 5, "SandalFactory"));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
