package pack;

public class Pay {
	 Box box=new Box();
	
	 void pay(int ticket) {
		if(box.inList(ticket)) 
			box.removelist(ticket);
		else
			System.out.println("Wrong ticket!");
	}

}
