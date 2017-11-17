package String;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "This is my small example string which I'm going to use for pattern matching.";
		Pattern pattern = Pattern.compile("\\w+");
		Matcher matcher = pattern.matcher(input);
		if (matcher.find()){
			System.out.println(matcher.group(0));		
		}
		else
			System.out.println("not Found");
	}

}
