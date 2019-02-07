package pack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Run {


		
	void outPut(String string) {
		System.out.println(string);
	}

	void run() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Box box = new Box();
		 Rental rental=new Rental();
		 Pay pay=new Pay();
		
		try {
			while (true) {
				
				 
				int ticket =  new Ticket().generate(box.getMaxSpace());
				outPut("1. Rent \n" + "2. Pay \n" + "3. FreeSpace \n" + "4. Exit\n");
				int chosen = Integer.parseInt(br.readLine());

				switch (chosen) {
				case 1:
						if(rental.freeSpace()) {
						outPut("Enter your name : ");
						String name = br.readLine();
						outPut("How many days you want: ");
						int startDay =Integer.parseInt(br.readLine());
						rental.rent(ticket, name, startDay);
						}
						else
							System.out.println("All space are full");
					
					break;
				case 2:
					if (box.listSize()==0) {
						outPut("\nAll space are avaiable!\n");
						break;
					}
					outPut("Enter your ticket: ");
					int ownticket = Integer.parseInt(br.readLine());
					pay.pay(ownticket);
					System.out.println("\n" + "How many days did you rent?");
					int endDay = Integer.parseInt(br.readLine());
					if(box.fine(ownticket, endDay)>0)
						System.out.println("The fine is : " + box.fine(ownticket, endDay));
					
					break;
				case 3:
					outPut("Free space: " + (box.getMaxSpace() - box.listSize()) + "\n");
					break;
				case 4:
					outPut("Exit!");
					System.exit(0);
				case 9999:
					box.getRentlist();
					break;
				}
			}
		} catch (NumberFormatException e) {
			run();
			outPut("\nWrong format!! \n");
		}
	}
}
