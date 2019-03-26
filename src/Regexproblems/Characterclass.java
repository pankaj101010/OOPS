package Regexproblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Characterclass {
	public static void main(String[] args) {
		Pattern p=Pattern.compile("[^\\W]");
		String a="a7b@ z#9d";
		Matcher m=p.matcher(a);
		while(m.find())
		{
			System.out.println(m.start()+"...."+m.group() );
		}
	}
}
/* Character classes */

//  \s : any space character
//  \S: opposite of \s can be also written as ^\s any character other than space
//  \w : Any word character
//  \W : Any non word character ( Special Character 
//  \d :Any digit character [0-9]
//  \D :Any non digit character [^0-9]
//   .  : Any Character

