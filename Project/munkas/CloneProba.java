package munkas;

public class CloneProba {

	public static void main(String[] args) {
		
		AlkalmazottClon a1 = new AlkalmazottClon("B�la", 100000, 1);
		AlkalmazottClon a2;
		try {
			a2 = (AlkalmazottClon)a1.clone();
			System.out.println(a1 == a2);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		FonokClon b1 = new FonokClon("B�la", 100000, 1, 1);
		FonokClon b2;
		try {
			b2 = (FonokClon)b1.clone();	//Az �s clone-t �gy �rtam meg, hogy lesz�rmazott nem haszn�lhatja.
			System.out.println(b1 == b2);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		/* Az �r�k�lt clone protected, teh�t nem l�that�
		Alkalmazott c1 = new Alkalmazott("B�la", 100000, 1);
		Alkalmazott c2;
		try {
			c2 = (Alkalmazott)c1.clone();
			System.out.println(c1 == c2);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}*/

	}

}
