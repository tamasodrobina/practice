package pack;

import java.util.ArrayList;

public class Rental {

	private ArrayList<User> rentalList = new ArrayList<User>();

	public void addList(User user) {

		rentalList.add(user);

	}

	public ArrayList<User> getRentlist() {
		return rentalList;
	}

	public void toStringRentList() {
		for (User user : rentalList) {
			System.out.println(user.toString());
		}

	}

	public int listSize() {
		return rentalList.size();
	}

	public void removelist(int number) {
		int i = 0;

		if (rentalList.isEmpty())
			System.out.println("All space are free!");
		else {
			for (User user : rentalList) {
				if (user.getTicket() == number) {
					rentalList.remove(i);
					System.out.println("Your box is open.\n");
					break;
				}

				else
					i++;
			}
		}
	}

	public boolean inList(int ticket) {
		boolean result = false;
		for (User user : rentalList) {
			if (user.getTicket() == ticket)
				result = true;
		}
		return result;
	}

	public int price(int ticket) {
		for (User user : rentalList) {
			if (user.getTicket() == ticket) {
				return user.getDays() * 100;
			}
		}
		return 0;

	}

}
