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
		return obj instanceof CanonicalMapping &&
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

		
	}
}
















