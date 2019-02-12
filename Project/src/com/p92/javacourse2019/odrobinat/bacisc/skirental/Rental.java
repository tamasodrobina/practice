package com.p92.javacourse2019.odrobinat.bacisc.skirental;

public class Rental {
	
	Box box=new Box();
	
	

	
	boolean freeSpace() {
	if(box.listSize()==box.getMaxSpace()) 
		return false;
	else
			return true;
	
	
		
	}

	 void rent(int ticket, String name, int day) {
			if(day<=box.getMaxDay()) {
			Customer customer=new Customer(ticket, day, name);
			box.addList(customer);	
			System.out.println("\nTicket: " + ticket + " price: "+box.price(ticket)+ "\n");
			}
			else
				System.out.println("\nWrong days ( Max: 3 min: 1)\n");
	 }
	 
	 

		


}
