package unit11;

import java.util.Collection;
import java.util.Iterator;

public class InterfaceVsIterator {

	public static <T> void display(Iterator<T> iter) {
		while(iter.hasNext()) {
			T t = iter.next();
			System.out.println(t);
		}
	}
	
	public static <T> void display(Collection<T> coll) {
		for(T t : coll) {
			System.out.println(t);
		}
	}
	
}
