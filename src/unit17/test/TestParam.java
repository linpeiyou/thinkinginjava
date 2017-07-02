package unit17.test;

public class TestParam {
	
	public final int size;
	public final int loops;
	
	public TestParam(int size, int loops) {
		this.size = size;
		this.loops = loops;
	}
	
	// Create an array of TestParam from a varargs sequence:
	public static TestParam[] array(int... values) {
		int size = values.length / 2;
		TestParam[] params = new TestParam[size];
		for(int i = 0; i < size; ++i) {
			params[i] = new TestParam(values[i*2], values[i*2+1]);
		}
		return params;
	}
	
	// Convert a String array to TestParam array:
	public static TestParam[] array(String[] values) {
		int size = values.length / 2;
		TestParam[] params = new TestParam[size];
		for(int i = 0; i < size; ++i) {
			params[i] = new TestParam(Integer.valueOf(values[i*2]), 
					Integer.valueOf(values[i*2+1]));
		}
		return params;
	}

}











