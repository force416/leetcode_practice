package eric.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Given a string which contains only lowercase letters, remove duplicate letters so that every letter appear once and only once. You must make sure your result is the smallest in lexicographical order among all possible results.
	Example:
	Given "bcabc"
	Return "abc"
	Given "cbacdcbc"
	Return "acdb"
https://leetcode.com/problems/remove-duplicate-letters/
 *
 */
public class RemoveDuplicateLetters {

	public static void main(String[] args) {
		System.out.println(0-'a');
//		System.out.println(new RemoveDuplicateLetters().proce/ss("ccaaaaabbbbccc"));
	}
	
	public String process(String s) {
		char[] sarray = s.toCharArray();
		char[] resultArray = new char[0];
		Set<Character> set = new HashSet<Character>();
		
		for (char c : sarray) {
			if (set.add(c)) {
				resultArray = Arrays.copyOf(resultArray, resultArray.length + 1);
				resultArray[resultArray.length-1] = c;
			}
		}
		Arrays.sort(resultArray);
		return new String(resultArray);
	}
	
}
