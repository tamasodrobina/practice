package munkas;

public class Alkalmazott {
	private String nev;
	private int alapFiz;
	private int nyelvek;
	
	public Alkalmazott(String p_nev, int alapFiz, int nyelvek) {
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
	
	public boolean tobbetkeresE(Alkalmazott masik) {
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
		if (getClass() != obj.getClass())
			return false;
		Alkalmazott other = (Alkalmazott) obj;
		if (nev == null) {
			if (other.nev != null)
				return false;
		} else if (!nev.equals(other.nev))
			return false;
		if (nyelvek != other.nyelvek)
			return false;
		return true;
	}
	
}
