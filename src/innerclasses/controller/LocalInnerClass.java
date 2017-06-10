package innerclasses.controller;

interface Counter {
	int next();
}

public class LocalInnerClass {

	private int count = 0;
	
	Counter getCounter(String name) {
		class LocalCounter implements Counter {
			public LocalCounter() {
				System.out.println(LocalCounter.class.getName());
			}
			@Override
			public int next() {
				return 1;
			}
		}
		return new LocalCounter();
	}
	
	Counter getCounter2(String name) {
		System.out.println(new Counter() {
			@Override
			public int next() {
				return 0;
			}
		}.getClass().getName());
		
		return new Counter() {
			@Override
			public int next() {
				return count++;
			}
		};
	}
	
	public static void main(String[] args) {
		
		LocalInnerClass lic = new LocalInnerClass();
		
		System.out.println(Counter.class.getName());
		lic.getCounter("111");
		lic.getCounter2("111");
		System.out.println(LocalInnerClass.class.getName());
	}


}













