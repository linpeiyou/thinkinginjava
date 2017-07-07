package unit16;

import util.CountingGenerator;

interface IA {}
interface IB {}

class SA implements IA {}

class A extends SA implements IB, ITest {
	public static class B {}
	public interface IA {}
	static class C {}
	public class D {}
	class E {}
}

public class ClassTest {

	public static void main(String[] args) {
		for(Class<?> clazz : A.class.getClasses()) {
			System.out.println(clazz.getSimpleName());
		}
	}
	
}
