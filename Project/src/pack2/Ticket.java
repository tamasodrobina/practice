package pack2;

public class Ticket{
	
public int generate(int value) {
		return (int) (Math.random() * (value+1) + 1);
	}

}
