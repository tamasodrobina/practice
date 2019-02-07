package pack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Run {
	private Rental rental = new Rental();
	private int maxDay=3;
	private int maxSpace=5;

	public void run() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		

		try {
			while (true) {
				System.out.println("1. Rent \n" + "2. Pay \n" + "3. FreeSpace \n" + "4. Exit\n");
				String choose = br.readLine();
				int chosen = Integer.parseInt(choose);
				switch (chosen) {
				case 1:
					if (rental.listSize() < maxSpace) {
						System.out.println("Enter your name : ");
						String name = br.readLine();
						System.out.println("How many days you want: ");
						String day = br.readLine();
						if (Integer.parseInt(day) > maxDay || Integer.parseInt(day) < 1)
							System.out.println("\nWrong the number of days! ( Min: 1 max: 3 )\n");
						else {
							int ticket = (int) (Math.random() * 100 + 1);
							if (!rental.inList(ticket)) {
								rental.addList(new User(ticket, Integer.parseInt(day), name));
								System.out.println("\nYour ticket: " + ticket);
								System.out.println("The price is: " + rental.price(ticket) + " Ft\n");
							} else
								ticket = (int) (Math.random() * 100 + 1);
						}
					} else
						System.out.println("\n All space are full\n");
					break;
				case 2:
					System.out.println("Enter your ticket: ");
					String ticketString = br.readLine();
					int ticket = Integer.parseInt(ticketString);
					if (rental.inList(ticket)) {
						System.out.println("\n" + "How many days did you rent?");
						String day = br.readLine();
						if (Integer.parseInt(day) > (rental.price(ticket) / 100))
							System.out.println("The fine is:  "
									+ ((rental.price(ticket) / 100) - Integer.parseInt(day)) * 200 * -1 + " Ft\n");
						rental.removelist(Integer.parseInt(ticketString));
					} else
						System.out.println("Wrong ticket number!\n");
					break;
				case 3:
					System.out.println("Free space: " + (maxSpace - rental.listSize()) + "\n");
					break;
				case 4:
					System.out.println("Exit!");
					System.exit(0);
				case 9999:
					rental.toStringRentList();
					break;
				}
			}
		} catch (NumberFormatException e) {
			run();
			System.out.println("\nWrong format!! \n");
		}
	}
}
