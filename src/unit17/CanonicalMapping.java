package unit17;

import java.util.ArrayList;
import java.util.Collection;
import java.util.WeakHashMap;

class Element {
	private String ident;
	
	public Element(String id) {
		this.ident = id;
	}
	
	@Override
	public String toString() {
		return ident;
	}
	
	@Override
	public int hashCode() {
		return ident.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		return obj instanceof Element &&
				ident.equals(((Element) obj).ident);
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalizing " + getClass().getSimpleName() + " " + ident);
	}
}

class Key extends Element {

	public Key(String id) {
		super(id);
	}
}

class Value extends Element {

	public Value(String id) {
		super(id);
	}
}

public class CanonicalMapping {
	
	public static void main(String[] args) throws InterruptedException {
		int SIZE = 16;
		WeakHashMap<Key, Value> map = new WeakHashMap<>();
		Key[] keys = new Key[SIZE];
		for(int i = 0; i < SIZE; ++i) {
			Key key = new Key(String.valueOf(i));
			Value value = new Value(String.valueOf(i));
			if(i % 3 == 0) {
				keys[i] = key;
			}
			map.put(key, value);
		}
		System.gc();
		Thread.sleep(1000);
	}
}
















