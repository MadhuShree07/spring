package com.xworkz.farmerland.app;

public class Farmer {

	private String name;
	private int acres;
	private String location;
	private String cropType;
	private Land land;

	public Farmer() {
		System.out.println("created\n" + this.getClass().getSimpleName());
	}

	public void setName(String name) {
		System.out.println(name);
		this.name = name;
	}

	public void setAcres(int acres) {
		System.out.println(acres);
		this.acres = acres;
	}

	public void setLocation(String location) {
		System.out.println(location);
		this.location = location;
	}

	public void setCropType(String cropType) {
		System.out.println(cropType);
		this.cropType = cropType;
	}

	public void setLand(Land land) {
		System.out.println(land);
		this.land = land;
	}

	public void farming() {
		System.out.println("invoked farming");
		this.land.yield("wheat");
	}

	@Override
	public String toString() {
		return "Farmer [name=" + name + ", acres=" + acres + ", location=" + location + ", cropType=" + cropType
				+ ", land=" + land + "]";
	}

}
