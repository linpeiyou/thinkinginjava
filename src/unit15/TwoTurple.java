package unit15;

class Address {
	String s;
	public Address(String s) {
		this.s = s;
	}
	public void setS(String s) {
		this.s = s;
	}
	public String getS() {
		return s;
	}
	@Override
	public String toString() {
		return s;
	}
}

public class TwoTurple<A, B> {
	public final A first;
	public final B second;
	
	public TwoTurple(A first, B second) {
		this.first = first;
		this.second = second;
	}

	@Override
	public String toString() {
		return "(" + first + ", " + second + ")";
	}
	
	public static void main(String[] args) {
		TwoTurple<Address, Address> twoTurple = new TwoTurple<>(
				new Address("zhangpu"), new Address("minhou"));
		
		Address a1 = twoTurple.first;
		
		System.out.println(twoTurple);
		
		a1.setS("quanzhou");
		
		System.out.println(twoTurple);
	}
	
}


















