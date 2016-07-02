package eric.leetcode;

/**
 * Given a string S, find the longest palindromic substring in S. You may assume that the maximum length of S is 1000, and there exists one unique longest palindromic substring.
 * https://leetcode.com/problems/longest-palindromic-substring/
 */
public class LongestPalindrome {

	public static void main(String[] args) {
		System.out.println(new LongestPalindrome().longestPalindrome("aaaabaaa"));
	}
	
	public String longestPalindrome(String s) {
		if (s == null || s.length() == 0) {
			return s;
		}
		if (s.length() == 1) {
			return s;
		}
		char[] charArray = s.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			String result = this.compare(s.substring(i));
			if (result != "" && result.length() > 1) {
				return result;
			}
		}
		return null;
	}
	
	private String compare(String s) {
		if (s.length() <= 1) {
			return s;
		}
		char[] charArray = s.toCharArray();
		char first = charArray[0];
		char latest = charArray[charArray.length - 1];
		if (first == latest) {
			if (charArray.length == 2) {
				return String.valueOf(first) + String.valueOf(latest);
			}
			if (charArray.length == 3) {
				return String.valueOf(first) + compare(s.substring(1, 2)) + String.valueOf(latest);
			}
			return first + compare(s.substring(1, s.length() - 1)) + latest;
		} else {
			return compare(s.substring(0, s.length() - 1));
		}
	}
}
