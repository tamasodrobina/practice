package newpackage;

public class Box {
	private int id;
	private String size;
	private int day;


	


	public Box(int id, String size, int day) {
		super();
		this.id = id;
		this.size = size;
		this.day= day;
	}



	public int getId() {
		return id;
	}



	public String getSize() {
		return size;
	}
	
	
	public int getDay() {
		return day;
	}



	@Override
	public String toString() {
		return "Box [id=" + id + ", size=" + size + ", day=" + day + "]";
	}


}
