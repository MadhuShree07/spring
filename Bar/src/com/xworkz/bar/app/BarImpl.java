package com.xworkz.bar.app;

public class BarImpl implements Bar {

	private String name;
	private int ratings;
	private double price;

	public BarImpl(String name) {
		System.out.println("created\t" + this.getClass().getSimpleName());
		System.out.println(name);
		this.name = name;
	}

	public BarImpl(int ratings) {
		System.out.println("created\t" + this.getClass().getSimpleName());
		System.out.println(ratings);
		this.ratings = ratings;
	}

	public BarImpl(double price) {
		System.out.println("created\t" + this.getClass().getSimpleName());
		System.out.println(price);
		this.price = price;

	}

	@Override
	public void kuduka() {
		System.out.println("invoked");
	}

}
