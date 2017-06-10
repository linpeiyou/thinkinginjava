package unit11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class ReversibleArrayList<T> extends ArrayList<T> {
	
	public ReversibleArrayList(Collection<T> c) {
		super(c);
	}
	
	public Iterable<T> reversed() {
		return new Iterable<T>() {
			@Override
			public Iterator<T> iterator() {
				return new Iterator<T>() {
					int current = size() - 1;
					
					@Override
					public boolean hasNext() {
						return current > -1;
					}

					@Override
					public T next() {
						return get(current--);
					}
				};
			}
			
		}; 
	}
	
	public static void main(String[] args) {
		ReversibleArrayList<String> ral = new ReversibleArrayList<>(
				Arrays.asList("a", "bb", "ccc", "dddd"));
		
		for(String s : ral) {
			System.out.println(s);
		}
		
		System.out.println("------------------------");
		
		for(String s : ral.reversed()) {
			System.out.println(s);
		}
	}
	
}












