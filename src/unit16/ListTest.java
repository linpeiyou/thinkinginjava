package unit16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		
		Integer[] ints = { 1,2,3,4,5 };
		
		System.out.println(ints.getClass().getSimpleName());
		System.out.println(Arrays.toString(ints));
		System.out.println(ints[4]);
		
		List<Integer> list = new ArrayList<>(Arrays.asList(ints));
		list.add(6);
		list.addAll(Arrays.asList(7, 8));
		
		System.out.println(list);
		
		List<Integer> subList = list.subList(2, 4);
		
		System.out.println(subList);
		
		Collections.reverse(list);
		
		System.out.println(list);
	}
}
