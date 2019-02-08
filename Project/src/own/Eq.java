package own;

public class Eq implements Cloneable {
	
	
	@Override
	public String toString() {
		return "Eq [x=" + x + ", y=" + y + "]";
	}
	public Eq(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	private int x;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	private int y;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
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
		Eq other = (Eq) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Eq eq = (Eq) super.clone();
		if(eq.getClass() != Eq.class )
			throw new CloneNotSupportedException();
		eq.setX(this.x);
		eq.setY(this.y);
		return eq;
		
	}
	
	
	
	

}
