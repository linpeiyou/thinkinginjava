package unit15;

class Generic<T> {}

public class ArrayOfGeneric {
	
	static final int SIZE = 100;
	static Generic<Integer>[] gia;
	
	public static void main(String[] args) {
		// 编译可通过，运行则ClassCastException
		//gia = (Generic<Integer>[]) new Object[SIZE];
		gia = (Generic<Integer>[]) new Generic[SIZE];
		System.out.println(gia.getClass().getSimpleName());
		
		gia[0] = new Generic<>();
	}

}
