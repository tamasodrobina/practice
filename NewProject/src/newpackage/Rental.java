package newpackage;

public class Rental {
	private int normalPrice = 100;
	private int smallPrice=60;
	private int fineMultiplicity = 3;
	private double discountMultiplicity =0.6;
	
	Storage storage= new Storage();
	
	
	public void rent (Box box) {
		if(storage.getBoxlist().size()==storage.getMaxSpace() )
			System.out.println("All space are full");
		else
			storage.addBox(box);
	}
	
	
	
	int rentSize() {
		return storage.getBoxlist().size();
	}
	
	
	public void kiir() {
		for (Box box : storage.getBoxlist()) {
			System.out.println(box.toString());
			
		}
	}


	public void price(int id) {
		int price=0;
		int day=0;
		for (Box box : storage.getBoxlist()) {
			
			if (box.getId() == id) {
				if (box.getSize().equals(Boxsize.SMALL.toString())) {
					price=smallPrice*box.getDay();
				 day=box.getDay();
				}
				else {
					price=normalPrice*box.getDay();
				 day=box.getDay();
				}
			}
			
		}
		if(day==3) {
			price= (int) (price*discountMultiplicity);
		}
		 System.out.println("The price: "  + price);

	}
	
	
	
	public void pay(int endDay, int id) {
		int index=0;
		for (Box box : storage.getBoxlist()) {
			if(box.getId()== id) {
				storage.removeBox(index);
				System.out.println("törölveS");
			}
		index++;
		}
	}
		
		
		/*int index=0;
		for (Box box : storage.getBoxlist()) {
			if (box.getId() == id) {
				if(endDay-box.getDay()>0) {
					System.out.println(" Thank you!");
				storage.removeBox(index);
				}
				else {
					System.out.println("\nThe fine: " + (endDay-box.getDay()) * normalPrice* fineMultiplicity);
					System.out.println("\nThank you!");
					storage.removeBox(index);
					
					}
				
			}
			*/
			
			
		}
			
		

	
	

