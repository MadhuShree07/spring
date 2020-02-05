package com.xworkz.dominoes.app;

public class Reception {

	public Reception() {
		System.out.println("banaviye \t" + this.getClass().getSimpleName());

	}

	public void receiveOrder(int noOfItems) {
		try {
			System.out.println("Kariyalagide receiveOrder");
			System.out.println("no of items\t" + noOfItems);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
