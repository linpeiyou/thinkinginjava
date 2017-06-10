package unit13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReFlags {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("^java",
				Pattern.CASE_INSENSITIVE | Pattern.MULTILINE);
		Matcher m = p.matcher(
				"java has regex\nJava has regex\n"
				+ "JAVA has pretty good regular expressions\n"
				+ "Regular expressions are in Java");
		
		m.find();
		String s = m.replaceFirst(m.group().toUpperCase());
		
		System.out.println(s);
	}
	
}
