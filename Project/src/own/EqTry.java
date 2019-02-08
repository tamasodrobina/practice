package own;

public class EqTry {
	


	public static void main(String[] args) throws CloneNotSupportedException {
		Eq eq1=new Eq(3,4);
		
		Eq eq2= new Eq(3, 4);
		Eq eq3=new Eq(3,4);
		
		Eq eq4= new Eq(3, 5);
		
		System.out.println("X: " + eq1.toString());
		System.out.println("Y: " + eq2.toString());
		System.out.println("Z: " + eq3.toString());
		System.out.println("A: " + eq4.toString());
		System.out.println();
		System.out.println("x.equals(x)");
		System.out.println(eq1.equals(eq1));
		System.out.println();
		System.out.println("x.equals(y)");
		
		System.out.println(eq2.equals(eq1));
		
		System.out.println("\ntransitive");
		
		System.out.println(eq1.equals(eq2) + " "+ eq2.equals(eq3) + " "+ eq1.equals(eq3));
		System.out.println("\nx.equals(a)");
		System.out.println(eq1.equals(eq4));
		System.out.println();
		
		
		//Hiba ha nem implementálja a cloneable osztályt 
		Eq eq5 = null;
		try {
			eq5=(Eq) eq1.clone();
			System.out.println("Eq5 clone Eq1 : ");
			System.out.println(eq5.toString());
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		
		eq1=null;
		
		
		
		
		
		
		
		
		
		
		
		
		

		

	}

	

}
