//no direct way to reverse a string. But can append into StringBuilder
//make into char and loop backwards

package javacode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class reversestring {

	public static void main(String[] args) {
		System.out.println(reversestring("myvalue"));
	}
	
	/*Can use StringBuilder instead of immutable newstr
	 * it will be StringBuilder out = new StringBuilder();
	 * out.append(....
	 * or out.apprnd(str)
	 * out.reverse()  -- stringbuilder can be used to reverse
	 */
	public static String reversestring(String str)
	{	
		char[] chr = str.toCharArray();
		String newstr = "";
		
		for(int i=chr.length-1; i>=0; i--)
		{
			newstr = newstr + chr[i];
		}
				
		return newstr;
	}
}
