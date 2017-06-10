package unit15;

import util.BasicGenerator;
import util.Generator;

public class CountedObject {

	private static long counter = 0;
	private final long id = counter++;
	
	public long id() {
		return id;
	}
	
	@Override
	public String toString() {
		return "CountedObject " + id;
	}
	
	public static void main(String[] args) {
		Generator<CountedObject> gen = new BasicGenerator<>(CountedObject.class);

		for(int i = 0; i < 15; ++i) {
			System.out.println(gen.next());
		}
	}
	
}
