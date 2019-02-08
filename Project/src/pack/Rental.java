package pack;

public class Rental {
	
	Box box=new Box();
	
	

	
	boolean freeSpace() {
	if(box.listSize()==box.getMaxDay()) 
		return false;
	else
			return true;
	
	
		
	}

	 void rent(int ticket, String name, int day) {
			if(day<=box.getMaxDay()) {
			Customer customer=new Customer(ticket, day, name);
			box.addList(customer);	
			box.toStringBoxList();
			System.out.println("Ticket: " + ticket + " price: "+box.price(ticket));
			}
			else
				System.out.println("Wrong days ( Max: 3 min: 1)");
	 }
	 
	 

		


}
