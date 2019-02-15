package newpackage;

public class Try {

	public static void main(String[] args) {
		
		
		Box box1  = new Box(12, "small", 3);
		Box box2 = new Box(11, "small", 2);
		Box box3 = new Box(11, "small", 2);
		Box box4 = new Box(11, "small", 2);
		Box box5 = new Box(11, "small", 2);
		
		
		Rental rental= new Rental();
		
		
		rental.rent(box1);
	
		rental.rent(box2);
		rental.rent(box3);
		rental.rent(box4);
		rental.rent(box5);

		rental.kiir();
		System.out.println(rental.rentSize());
		rental.price(11);
		
		rental.pay(2, 11);
		rental.pay(5, 12);
		

		


	}

}
