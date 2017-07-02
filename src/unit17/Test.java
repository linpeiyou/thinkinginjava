package unit17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class HasStr {
	String s;
	public HasStr(String s) {
		this.s = s;
	}
	public String getS() { return s; }
	public void setS(String s) { this.s = s; }
	@Override
	public String toString() {
		return s;
	}
}

public class Test {
	
	public static void main(String[] args) {
		
		Set<String>[] sets = new HashSet[3];
		
		sets[0] = new HashSet<>();
		sets[2] = new HashSet<>();
		
		for(Set<String> set : sets) {
			if(set != null) {
				for(String s : set) {
					
				}
			}
		}
		
	}
	
}


















