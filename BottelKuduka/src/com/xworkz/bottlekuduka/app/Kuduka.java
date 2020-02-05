package com.xworkz.bottlekuduka.app;

public class Kuduka {

	private String name;
	private Bottle bottle;

	public Kuduka() {
		System.out.println("created\n" + this.getClass().getSimpleName());
	}

	public void setName(String name) {
		System.out.println(name);
		this.name = name;
	}

	public void setBottle(Bottle bottle) {
		System.out.println(bottle);
		this.bottle = bottle;
	}

	public void drinking() {
		System.out.println("invoked drinking");
		this.bottle.store("water");
	}

	public void initIt() throws Exception {
		System.out.println("init method aftr properties are set:"+name );
	}
	
	public void cleanUp() throws Exception {
		System.out.println("spring container is destroy:");
	}
	

	@Override
	public String toString() {
		return "Kuduka [name=" + name + ", bottle=" + bottle + "]";
	}

}
