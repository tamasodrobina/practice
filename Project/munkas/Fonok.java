package munkas;

public class Fonok extends Alkalmazott {
	
	private int beosztDb;

	public Fonok(String nev, int alapFiz, int nyelvek, int a) {
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
