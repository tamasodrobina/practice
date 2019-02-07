package langPeldak.kettes;

public class Pont {

	private final int x;
	private final int y;
	
	public Pont(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		
		if (!(obj instanceof Pont))
			return false;
		
		Pont other = (Pont) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
	
	
}
