package unit17;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountedString {

	private static List<String> created = new ArrayList<>();
	private String s;
	private int id = 0;
	
	public CountedString(String str) {
		this.s = str;
		created.add(s);
		// id is the total number of instantces
		// of this string in use by CountedString
		for(String s2 : created) {
			if(s2.equals(s))
				++id;
		}
	}
	
	@Override
	public String toString() {
		return "String: " + s + " id: " + id + " hashCode(): " + hashCode();
	}
	
	@Override
	public int hashCode() {
		// The very simple approach:
		// return s.hashCode() * id:
		// Using Joshua Bloch's recipe:
		int result = 17;
		result = 37 * result + s.hashCode();
		result = 37 * result + id;
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof CountedString))
			return false;
		CountedString cs = (CountedString) obj;
		return cs == this ? true :
			cs.id == this.id && cs.s.equals(this.s);
	}
	
	public static void main(String[] args) {
		Map<CountedString, Integer> map = new HashMap<>();
		CountedString[] cs = new CountedString[5];
		for(int i = 0; i < cs.length; ++i) {
			cs[i] = new CountedString("hi");
			map.put(cs[i], i);
		}
		System.out.println(map);
		for(CountedString s : cs) {
			System.out.println("Looking up " + s);
			System.out.println(map.get(s));
		}
		
		cs[1].id = 100;
		System.out.println(map.get(cs[1]));
	}
	
}


















