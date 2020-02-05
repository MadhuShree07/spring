package com.xworkz.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Internet {

	private int speed;
	@Value("airtel")
	private String provider;

	public Internet(@Value("${internet.speed}") int speed) {
		System.out.println("created\t" + this.getClass().getName());
		System.out.println("invoked speed" + speed);
		this.speed = speed;
	}

	public void setProvider(String provider) {
		System.out.println("invoked set provider" + provider);
		this.provider = provider;
	}

	public String getProvider() {
		System.out.println("invoked get provider" + provider);
		return provider;
	}

	public int getSpeed() {
		System.out.println("invoked get speed" + speed);
		return speed;
	}
}
