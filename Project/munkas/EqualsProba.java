package munkas;

public class EqualsProba {
	
	public static void main(String[] args) {

		pelda1();

		pelda2();
		
		pelda3();
		
		pelda4();
	}
	
	private static void pelda1() {
		System.out.println("Példa 1: ");
		String a = new String("alma");
		String b = new String("alma");
		System.out.println("alma"=="alma"); //optimalizálás
		System.out.println(a==b);
		System.out.println(a.equals(b));		
	}
	
	private static void pelda2() {
		System.out.println("Példa 2:");
		Alkalmazott c = new Alkalmazott("aa", 1, 1);
		Alkalmazott d = new Alkalmazott("aa", 1, 1);
		System.out.println(c==d);
		System.out.println(c.equals(d));				
	}
	
	private static void pelda3() {
		System.out.println("Példa 3:");
		Alkalmazott[] alk = new Alkalmazott[10];
		for (int j = 0; j < 10; j++) {
			int fiz = 100000 + (int)(400000*Math.random());
			alk[j] = new Alkalmazott("nev" + j, fiz, 0);
		}
		for (Alkalmazott a : alk) {
			System.out.println(a);
		}
		
		Fonok keresett = new Fonok("nev3", 0, 0, 5);
		System.out.println("Keresett: " + keresett);
		for (int j = 0; j < 10; j++) {
			if (keresett.equals(alk[j]))
				System.out.println("Megtaláltam: " + alk[j]);
		}
	}
	
	private static void pelda4() {
		System.out.println("Példa 4:");
		Alkalmazott2[] alk = new Alkalmazott2[10];
		for (int j = 0; j < 10; j++) {
			int fiz = 100000 + (int)(400000*Math.random());
			alk[j] = new Alkalmazott2("nev" + j, fiz, 0);
		}
		for (Alkalmazott2 a : alk) {
			System.out.println(a);
		}
		
		Fonok2 keresett = new Fonok2("nev3", 0, 0, 5);
		System.out.println("Keresett: " + keresett);
		for (int j = 0; j < 10; j++) {
			if (keresett.equals(alk[j]))
				System.out.println("Megtaláltam: " + alk[j]);
		}
	}
}