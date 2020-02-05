package com.xworkz.nailpolish.app;

public class NailPolish {

	public 	NailPolish() {
		System.out.println("created\t" + this.getClass().getSimpleName());
	}

	public void applyingNailPolish(String name) {
		try {
			System.out.println("invoked applying nail polish");
			System.out.println("applying nailpolish " + name);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
