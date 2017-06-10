package unit15;

public class GenericArray<T> {

	private T[] array;
	
	public GenericArray(int sz) {
		array = (T[]) new Object[sz];
	}
	
}
