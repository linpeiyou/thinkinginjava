package unit17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

class StringAddress {
	private String s;
	public StringAddress(String s) {
		this.s = s;
	}
	@Override
	public String toString() {
		return super.toString() + " " + s;
	}
	public void setS(String s) {
		this.s = s;
	}
}

public class FillingLists {
	
	public static void main(String[] args) {
		StringAddress sa = new StringAddress("linpeiyou");
		List<StringAddress> list = new ArrayList<>(Collections.nCopies(4, sa));
		System.out.println(list);
		sa.setS("peyton lin");
		System.out.println(list);
		
		StringAddress sa2 = new StringAddress("haha");
		Collections.fill(list, sa2);
		System.out.println(list);
		sa2.setS("hehe");
		System.out.println(list);
	}
}
