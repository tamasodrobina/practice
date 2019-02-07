package munkas;

public class Alkalmazott2 {
	private String nev;
	private int alapFiz;
	private int nyelvek;
	
	public Alkalmazott2(String p_nev, int alapFiz, int nyelvek) {
		super();
		this.nev = p_nev;
		this.alapFiz = alapFiz;
		this.nyelvek = nyelvek;
	}
	
	public int fizetes() {
		return this.alapFiz + potlek();
	}
	
	public int potlek() {
		return this.nyelvek * 4000;
	}
	
	public String toString() {
		return this.nev + ", " + fizetes();
	}
	
	public boolean tobbetkeresE(Alkalmazott2 masik) {
		return this.fizetes() > masik.fizetes();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nev == null) ? 0 : nev.hashCode());
		result = prime * result + nyelvek;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (obj instanceof Alkalmazott2) {
			Alkalmazott2 a = (Alkalmazott2)obj;
			if (this.nev != null)
				return this.nev.equals(a.nev) && this.nyelvek == a.nyelvek;
		}
		return false;
	}
	
}
