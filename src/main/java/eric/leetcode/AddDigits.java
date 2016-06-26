package eric.leetcode;

/**
 * Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.
	For example:
	Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.
	https://leetcode.com/problems/add-digits/
 *
 */
public class AddDigits {

	public static void main(String[] args) {
		System.out.println(new AddDigits().addDigits(199));
	}
	
	public int addDigits(int num) {
        if (num < 10) {
            return num;
        }
        char[] charArray = String.valueOf(num).toCharArray();
        int firstNum = Integer.valueOf(String.valueOf(charArray[0])).intValue();
        int otherNum = Integer.valueOf(new String(charArray).substring(1, charArray.length)).intValue();
        return addDigits(firstNum + addDigits(otherNum));
        
        //快速解
//        return 1 + (num - 1) % 9;
    }
}
