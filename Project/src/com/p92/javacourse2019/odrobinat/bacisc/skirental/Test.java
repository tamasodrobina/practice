package com.p92.javacourse2019.odrobinat.bacisc.skirental;

public class Test {

	
	public static void main(String[] args) {
		Box box=new Box();
		
		
		box.addList(new Customer(1234, 2, "Géze"));
	
		
		
		
		
		Rental rental=new Rental();
		
		rental.rent(1, "GÉza", 2);
		 
		rental.box.toStringBoxList();
		
		System.out.println(rental.box.listSize());
	}
}
