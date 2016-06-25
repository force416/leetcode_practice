package eric.leetcode;


/**
 * Write a function that takes a string as input and returns the string reversed.
	Example:
	Given s = "hello", return "olleh".
	
	https://leetcode.com/problems/reverse-string/
 *
 */
public class ReverseString {
	
	public static void main(String[] args) {
		System.out.println(new ReverseString().reverseString("Hello!!"));
		System.out.println(new ReverseString().reverseStringBySwapping("fuck you man!!"));
		System.out.println(new ReverseString().reverseVowels("fuck you man!!"));
	}
	
	/**
	 * 用迴圈反轉字串
	 * @param s
	 * @return
	 */
	public String reverseString(String s) {
		if (s == null || s.length() == 0) {
			return s;
		}
		
		StringBuilder sb = new StringBuilder();
		char[] charArray = s.toCharArray();
		for (int i = charArray.length-1; i >= 0; i--) {
			sb.append(charArray[i]);
		}
		return sb.toString();
	}
	
	/**
	 * 用交換的反轉字串
	 * @param s
	 * @return
	 */
	public String reverseStringBySwapping(String s) {
		char[] charArray = s.toCharArray();
		int i = 0;
		int j = charArray.length - 1;
		while (i < j) {
			char t = charArray[i];
			charArray[i] = charArray[j];
			charArray[j] = t;
			i++;
			j--;
		}
		return new String(charArray);
	}
	
	/**
	 * 反轉字串
	 * 只反轉母音(aeiou)的字串
	 * @param s
	 * @return 反轉後的結果
	 */
	public String reverseVowels(String s) {
		String vowels = "aeiouAEIOU";
		char[] charArray = s.toCharArray();
		int i = 0;
		int j = charArray.length - 1;
		while (i < j) {
			if (vowels.indexOf(charArray[i]) < 0) {
				i++;
				continue;
			}
			if (vowels.indexOf(charArray[j]) < 0) {
				j--;
				continue;
			}
			char t = charArray[i];
			charArray[i] = charArray[j];
			charArray[j] = t;
			i++;
			j--;
		}
		return new String(charArray);
	}
}
