package unit17.test;

/**
 * Framework for performing timed tests of containers.
 * 
 * @author peige
 *
 * @param <C>
 */
public abstract class Test<C> {

	String name;
	
	public Test(String name) {
		this.name = name;
	}
	
	abstract int test(C container, TestParam tp);
}
