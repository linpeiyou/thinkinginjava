package unit15;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

class Person {}
class Pet {}

public class Test {

	static void f(Map<Person, List<? extends Pet>> petPeople) {
		System.out.println("haha");
	}
	
	static <K, V> Map<K, V> map() {
		return new HashMap<K, V>();
	}
	
	public static void main(String[] args) {
		
		f(Test.map());
	}
	
}
