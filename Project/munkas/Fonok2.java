package munkas;

public class Fonok2 extends Alkalmazott2 {
	
	private int beosztDb;

	public Fonok2(String nev, int alapFiz, int nyelvek, int a) {
		super(nev, alapFiz, nyelvek);
		this.beosztDb = a;
	}
	
	@Override
	public int potlek() {
		return super.potlek() + this.beosztDb * 2000;
	}
	
	public int getBeosztDb() {
		return this.beosztDb;
	}
}
