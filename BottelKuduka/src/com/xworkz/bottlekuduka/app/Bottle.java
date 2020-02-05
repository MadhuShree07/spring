package com.xworkz.bottlekuduka.app;

public class Bottle {

	private String type;
	private double size;

	public Bottle(String type, double size) {
		super();
		this.type = type;
		this.size = size;
		System.out.println(type);
		System.out.println(size);
		System.out.println("created\t" + this.getClass().getSimpleName());
	}


	public Bottle() {
		System.out.println("created\t"+ this.getClass().getSimpleName());
	}

	public void store(String what) {
		System.out.println("invoked"+what);
	}
	
	
	@Override
	public String toString() {
		return "Bottle [type=" + type + ", size=" + size + "]";
	}
	
}