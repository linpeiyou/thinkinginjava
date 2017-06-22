package unit17;

import java.util.LinkedHashSet;
import java.util.Set;

import util.Generator;

class Government implements Generator<String> {
	String[] foundation = ("strange women lying in ponds "
			+ "distributing swords is no basis for a system of "
			+ "government").split(" ");
	private int index;
	@Override
	public String next() {
		return foundation[index++ % foundation.length];
	}
}

public class CollectionDataTest {

	public static void main(String[] args) {
		Set<String> set = new LinkedHashSet<>(new CollectionData<>(new Government(), 15));

		set.addAll(CollectionData.list(new Government(), 15));
		
		System.out.println(set);
	}
	
}
