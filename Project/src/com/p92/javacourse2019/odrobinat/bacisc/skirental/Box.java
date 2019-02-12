package com.p92.javacourse2019.odrobinat.bacisc.skirental;


import java.util.ArrayList;



public class Box {
	private int rentPrice=100;
	private int maxDay=3;
	private int maxSpace=5;
	
	
	

	private ArrayList<Customer> boxList = new ArrayList<Customer>();

	 void addList(Customer customer) {

		boxList.add(customer);

	}

	 ArrayList<Customer> getRentlist() {
		return boxList;
	}

	 void toStringBoxList() {
		for (Customer customer : boxList) {
			System.out.println(customer.toString());
		}

	}

	 int listSize() {
		return boxList.size();
	}

	 void removelist(int ticket) {
		int i = 0;
		for (Customer cutomer : boxList) {
				if (cutomer.getTicket() == ticket) {
					boxList.remove(i);
					System.out.println("Your box is open.\n");
					break;
				}

				else
					i++;
			}
		}


	 boolean inList(int ticket) {
		boolean result = false;
		for (Customer customer : boxList) {
			if (customer.getTicket() == ticket)
				result = true;
		}
		return result;
	}

	 public int getMaxDay() {
		return maxDay;
	}

	 int getMaxSpace() {
		return maxSpace;
	}

	int price(int day) {
		
		return day*rentPrice;

	}

	int fine(int ticket, int endDay) {
		int fineprice=0;
		
		for (Customer customer : boxList) {
			if (customer.getTicket() == ticket) {
				fineprice=(endDay-customer.getDays())*rentPrice*3;
			}
		}
		
		return fineprice;
	}


	 
}
