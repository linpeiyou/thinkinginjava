package unit13;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegularExpression {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String str;
		
		System.out.print("input string: ");
		String inputStr = in.nextLine();
		
		for(;;) {
			System.out.print("input regular expression: ");
			if((str = in.nextLine()).equals("end")) {
				return;
			}
			
			System.out.println("Regular expression: \"" + str + "\"");
			Pattern pattern = Pattern.compile(str);
			Matcher matcher = pattern.matcher(inputStr);
			
			while(matcher.find()) {
				System.out.println("Match \"" + matcher.group() + "\" at positions "
						+ matcher.start() + "-" + (matcher.end() - 1)); 
			}
			
		}
		
	}

}
