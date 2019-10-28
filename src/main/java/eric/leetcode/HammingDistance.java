package eric.leetcode;

/**
 * https://leetcode.com/problems/hamming-distance/
 * <p>
 * example
 * <p>
 * Input: x = 1, y = 4
 * <p>
 * Output: 2
 * <p>
 * Explanation:
 * 1   (0 0 0 1)
 * 4   (0 1 0 0)
 *       ↑   ↑
 */
public class HammingDistance {
    public int run(int x, int y) {
        String diff = Integer.toBinaryString((x ^ y));
        int count = 0;
        for (char c : diff.toCharArray()) {
            if (c == '1') {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(new HammingDistance().run(3, 1));
    }
}
