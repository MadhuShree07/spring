package com.xworkz.farmerland.app;

public class Land {

	private String type;
	private double price;
	private boolean profit;

	public Land(String type, double price, boolean profit) {
		super();
		System.out.println("created\t" + this.getClass().getSimpleName());
		System.out.println(type);
		System.out.println(price);
		System.out.println(profit);
		this.type = type;
		this.price = price;
		this.profit = profit;
	}

	public Land() {
		System.out.println("created\t");
	}

	public void yield(String yieldIs) {
		System.out.println("invoked" + yieldIs);
	}

	@Override
	public String toString() {
		return "Land [type=" + type + ", price=" + price + ", profit=" + profit + "]";
	}

}
