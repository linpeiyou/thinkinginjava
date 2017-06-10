package unit13;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import unit18.TextFile;

public class JGrep {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("input the pattern:");
		String pattern = in.nextLine(); 
		System.out.print("input the filename:");
		String fileName = in.nextLine();
		
		Pattern p = Pattern.compile(pattern);
		
		// Iterate through the lines of the input file:
		int index = 0;
		Matcher m = p.matcher("");
		for(String line : new TextFile(fileName)) {
			m.reset(line);
			while(m.find()) {
				System.out.println(index++ + ": " + m.group() + ": " + m.start());
			}
		}
		
		
	}
	
}
