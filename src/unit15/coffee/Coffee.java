package unit15.coffee;

public class Coffee {

	private static long counter = 0;
	private final long id = counter++;
	
	@Override
	public String toString() {
		return String.format("%-30s%3d", getClass().getSimpleName(), id);
		//return getClass().getSimpleName() + " " + id;
	}
	
}
