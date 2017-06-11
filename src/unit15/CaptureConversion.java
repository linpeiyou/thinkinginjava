package unit15;

public class CaptureConversion {

	static <T> void f1(Holder<T> holder) {
		T t = holder.get();
		System.out.println(t.getClass().getSimpleName());
	}
	
	static <T> void f2(Holder<?> holder) {
		f1(holder);
	}
	
	public static void main(String[] args) {
		Holder holder = new Holder<String>("haha");
	
		f2(holder);
		f1(holder);		// Produces warningsx
	}
	
}
