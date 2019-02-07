package pack;


import java.util.ArrayList;

public class Box {
	private int rentPrice=100;
	private int maxDay=3;
	private int maxSpace=5;
	private Customer customer;
	
	

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

	 void removelist(int number) {
		int i = 0;
		for (Customer cutomer : boxList) {
				if (cutomer.getTicket() == number) {
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

	int price(int ticket) {
		for (Customer customer : boxList) {
			if (customer.getTicket() == ticket) {
				return customer.getDays() * rentPrice;
			}
		}
		return 0;

	}

	int fine(int ticket, int endDay) {
		if(customer.getDays()<endDay)
		return (endDay-customer.getDays())*rentPrice*3;
		else 
			return 0;
	}


	 
}
