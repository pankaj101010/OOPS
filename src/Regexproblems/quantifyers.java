package Regexproblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

	/* Quantifyer classes to specify number of occurences */
	
	//a : Exactly one a
	//a+ :Atleast one a
	//a*: Any number of a including zero number of a also
	//a? :Atmost one a

public class quantifyers {
	public static void main(String[] args) {
		Pattern p=Pattern.compile("a*");
		String a="abaabaaabaaaaab";
		Matcher m=p.matcher(a);
		while(m.find())
		{
			System.out.println(m.start()+"...."+m.group());
		}
	}
}
