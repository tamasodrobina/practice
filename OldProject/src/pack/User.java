package pack;

public class User {

	private int ticket;
	private int days;
	private String name;

	public User(int ticket, int days, String name) {
		super();
		this.ticket = ticket;
		this.days = days;
		this.name = name;

	}

	public int getDays() {
		return days;
	}

	public int getTicket() {
		return ticket;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "User name: " + name + ", days: " + days + ", ticket: " + ticket + "\n";
	}

}
