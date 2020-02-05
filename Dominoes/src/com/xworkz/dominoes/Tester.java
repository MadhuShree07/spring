package com.xworkz.dominoes;

import com.xworkz.dominoes.app.Reception;

public class Tester {

	public static void main(String[] args) {
		try {
			Reception reception = new Reception();
			reception.receiveOrder(10);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
