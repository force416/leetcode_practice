package eric.leetcode;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/flipping-an-image/
 * <p>
 * Example 1
 * Input: [[1,1,0],[1,0,1],[0,0,0]]
 * Output: [[1,0,0],[0,1,0],[1,1,1]]
 * Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
 * Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]
 * <p>
 * Example 2
 * Input: [[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]]
 * Output: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
 * Explanation: First reverse each row: [[0,0,1,1],[1,0,0,1],[1,1,1,0],[0,1,0,1]].
 * Then invert the image: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
 */
public class FlipAndInvertImage {
    public int[][] flipAndInvertImage(int[][] A) {
        int[][] result = new int[A[0].length][A.length];
        for (int i = 0; i < A.length; i++) {
            int[] newArray = new int[A[i].length];
            for (int j = 0, k = A[i].length - 1; j < A[i].length; j++, k--) {
                newArray[j] = (A[i][k]) ^= 1;
            }
            result[i] = newArray;
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] input = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        int[][] result = new FlipAndInvertImage().flipAndInvertImage(input);
        for (int[] array : result) {
            System.out.println(Arrays.toString(array));
        }
    }
}
