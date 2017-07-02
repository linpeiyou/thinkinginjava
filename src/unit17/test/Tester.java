package unit17.test;

import java.util.List;

public class Tester<C> {

	public static int fieldWidth = 8;
	public static TestParam[] defaultParams = TestParam.array(
			10, 5000, 100, 5000, 1000, 5000, 10000, 5000);
	
	protected C 			container;
	private String 			headline = "";
	private List<Test<C>> 	tests;
	
	private static int 		sizeWidth = 5;
	private static String	sizeField = "%" + sizeWidth + "s";
	private TestParam[] 	paramList = defaultParams;
	
	public Tester(C container, List<Test<C>> tests) {
		this.container = container;
		this.tests = tests;
		if(container != null) {
			headline = container.getClass().getSimpleName();
		}
	}
	
	private void displayHeader() {
		// Calculate width and pad with '-':
		int width = fieldWidth * tests.size() + sizeWidth;
		int dashLength = width - headline.length() - 1;
		StringBuilder sb = new StringBuilder(width);
		for(int i = 0; i < dashLength / 2; ++i) {
			sb.append('-');
		}
		sb.append(' ');
		sb.append(headline);
		sb.append(' ');
		for(int i = 0; i < dashLength / 2; ++i) {
			sb.append('-');
		}
		System.out.println(sb.toString());
		// Print column headers:
		System.out.format(sizeField, "size");
		for(Test test : tests) {
			System.out.format(stringField(), test.name);
		}
		System.out.println();
	}
	
	// Run the tests for this container:
	public void timedTest() {
	}
	
	public Tester(C container, List<Test<C>> tests, TestParam[] params) {
		this(container, tests);
		this.paramList = params;
	}
	
	// Generic methods for convenience:
	public static <C> void run(C container, List<Test<C>> tests) {
	}
	
	public static <C> void run(C container, List<Test<C>> tests, TestParam[] params) {
		
	}
	
	public void setHeadline(String headline) {
		this.headline = headline;
	}
	
	// Override this to modify pre-test initialization:
	protected C initialize(int size) {
		return container;
	}
	
	private static String stringField() {
		return "%" + fieldWidth + "s";
	}
	
	private static String numberField() {
		return "%" + fieldWidth + "d";
	}
	
}


























