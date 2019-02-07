package munkas;

public class FonokClon extends AlkalmazottClon {
	
	private int beosztDb;

	public FonokClon(String nev, int alapFiz, int nyelvek, int a) {
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
