package eric.leetcode;

/**
 * https://leetcode.com/problems/to-lower-case/
 */
public class Lowercase {
    private static final int A_ASCII = 65;
    private static final int Z_ASCII = 90;
    private static final int UPPER_TO_LOWER_DIFF = 32;

    public String toLowerCase(String str) {
        char[] arr = str.toCharArray();
        char[] result = new char[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= A_ASCII && arr[i] <= Z_ASCII) {
                result[i] = (char) (arr[i] + UPPER_TO_LOWER_DIFF);
            } else {
                result[i] = arr[i];
            }
        }

        return new String(result);
    }

    public static void main(String[] args) {
        System.out.println(new Lowercase().toLowerCase("HELLO WORLD!!"));
    }
}
