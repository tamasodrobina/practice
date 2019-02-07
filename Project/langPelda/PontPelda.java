package langPeldak;

import java.awt.Color;

public class PontPelda {

	public static void main(String[] args) {

		System.out.println("getClass()-os:");
		egyesPelda();
		System.out.println("instaceof-os");
		kettesPelda();
		System.out.println("Szinespont");
		harmasPelda();
		System.out.println("SzinesPont 2");
		negyesPelda();
	}

	private static void egyesPelda() {

		langPeldak.egyes.Pont a = new langPeldak.egyes.Pont(1,1);
		langPeldak.egyes.Pont b = new langPeldak.egyes.Pont(1,1);
		langPeldak.egyes.Pont p = new langPeldak.egyes.PontBov(1,1);
		//szimmetria
		System.out.println(a.equals(b));
		System.out.println(b.equals(a));
		//helyettesíthetõség
		System.out.println(a.equals(p));
		System.out.println(p.equals(a));
		
	}

	private static void kettesPelda() {

		langPeldak.kettes.Pont a = new langPeldak.kettes.Pont(1,1);
		langPeldak.kettes.Pont b = new langPeldak.kettes.Pont(1,1);
		langPeldak.kettes.Pont p = new langPeldak.kettes.PontBov(1,1);
		//szimmetria
		System.out.println(a.equals(b));
		System.out.println(b.equals(a));
		//helyettesíthetõség
		System.out.println(a.equals(p));
		System.out.println(p.equals(a));
		
		//ez jónak tûnik, de csak akkor ha nem lesz olyan leszármazott, amely adattaggal is bõvít
		//lásd hármas, négyes példa
		
	}

	private static void harmasPelda() {

		langPeldak.harmas.Pont a = new langPeldak.harmas.Pont(1,1);
		langPeldak.harmas.Pont b = new langPeldak.harmas.Pont(1,1);
		langPeldak.harmas.Pont p = new langPeldak.harmas.SzinesPont(1,1, Color.RED);
		//szimmetria
		System.out.println(a.equals(b));
		System.out.println(b.equals(a));
		//helyettesíthetõség és szimmetria
		System.out.println(a.equals(p));
		System.out.println(p.equals(a));
		
	}

	private static void negyesPelda() {

		langPeldak.negyes.Pont a = new langPeldak.negyes.Pont(1,1);
		langPeldak.negyes.Pont b = new langPeldak.negyes.Pont(1,1);
		langPeldak.negyes.Pont p = new langPeldak.negyes.SzinesPont(1,1, Color.RED);
		//szimmetria
		System.out.println(a.equals(b));
		System.out.println(b.equals(a));
		//helyettesíthetõség
		System.out.println(a.equals(p));
		System.out.println(p.equals(a));
		//tranzitivitás (a==p és a==p2 akkor p == p2 kellene)
		langPeldak.negyes.SzinesPont p2 = new langPeldak.negyes.SzinesPont(1, 1, Color.BLACK);
		System.out.println(a.equals(p2));
		System.out.println(p.equals(p2));
	}
	
}
