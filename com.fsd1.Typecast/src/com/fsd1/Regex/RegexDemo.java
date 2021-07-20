/**
 * 
 */
package com.fsd1.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author shail
 *
 */
public class RegexDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String pattern = "[a-z]+";
		String check = "Regular Expressions";
		
		//Compile this pattern and give it to matcher class.
		Pattern p = Pattern.compile(pattern);
		Matcher c = p.matcher(check);
		
		while(c.find())
				System.out.println(check.substring(c.start(),c.end()));
		
		
	}

}
