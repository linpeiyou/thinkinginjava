package unit15;

import java.util.ArrayList;
import java.util.List;

public class GenericWriting {

	static <T> void writeExactly(List<T> list, T item) {
	}
	
	static List<Apple> apples = new ArrayList<>();
	static List<Fruit> fruits = new ArrayList<>();
	
	static void f1() {
		writeExactly(apples, new Apple());
		writeExactly(fruits, new Apple());
	}
	
	static <T> void writeWithWildcard(List<? super T> list, T item) {
		list.add(item);
	}
	
	static void f2() {
		writeWithWildcard(apples, new Apple());
		writeWithWildcard(fruits, new Apple());
	}
	
	public static void main(String[] args) {
		f1();
		f2();
	}
	
}
