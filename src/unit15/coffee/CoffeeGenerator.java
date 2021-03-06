package unit15.coffee;

import java.util.Iterator;
import java.util.Random;

import javax.management.RuntimeErrorException;

import util.Generator;

public class CoffeeGenerator implements Generator<Coffee>, Iterable<Coffee> {

	private Class[] types = { Latte.class, Mocha.class, Cappuccino.class,
			Americano.class, Breve.class
	};
	private static Random rand = new Random(47);
	
	public CoffeeGenerator() {}
	
	// For iteration:
	private int size = 0;
	
	public CoffeeGenerator(int sz) {
		size = sz;
	}
	
	@Override
	public Iterator<Coffee> iterator() {
		return new CoffeeIterator();
	}

	@Override
	public Coffee next() {
		try {
			return (Coffee) types[rand.nextInt(types.length)].newInstance();
			
			// Report programmer errors at run time:
		} catch (InstantiationException | IllegalAccessException e) {
			throw new RuntimeException(e);
		}
	}
	
	
	class CoffeeIterator implements Iterator<Coffee> {
		
		private int count = size;

		@Override
		public boolean hasNext() {
			return count > 0;
		}
		@Override
		public Coffee next() {
			--count;
			return CoffeeGenerator.this.next();
		}
	}
	
	public static void main(String[] args) {
		CoffeeGenerator gen = new CoffeeGenerator();
		for(int i = 0; i < 5; ++i) {
			System.out.println(gen.next());
		}
		System.out.println("--------------------------------------");
		for(Coffee coffee : new CoffeeGenerator(6)) {
			System.out.println(coffee);
		}
	}

}












