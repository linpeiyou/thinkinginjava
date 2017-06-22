package unit17;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

class SetType {
	int i;
	public SetType(int n) {
		i = n;
	}
}

public class TypesForSets {

	public static void main(String[] args) {
		
		Set<SetType> set = new HashSet<>();
		
		set.add(new SetType(1));
		
	}
	
}
