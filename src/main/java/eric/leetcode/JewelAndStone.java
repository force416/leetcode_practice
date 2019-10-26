package eric.leetcode;

/**
 * https://leetcode.com/problems/jewels-and-stones/
 * <p>
 * example1:
 * Input: J = "aA", S = "aAAbbbb"
 * Output: 3
 * <p>
 * example2:
 * Input: J = "z", S = "ZZ"
 * Output: 0
 **/
public class JewelAndStone {
    public int numJewelsInStones(String J, String S) {
        char[] jewels = J.toCharArray();
        char[] stones = S.toCharArray();

        int count = 0;
        for (int i = 0; i < jewels.length; i++) {
            for (int j = 0; j < stones.length; j++) {
                if (jewels[i] == stones[j]) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        JewelAndStone instance = new JewelAndStone();
        int result = instance.numJewelsInStones("aA","aAAbbbb");

        System.out.println(result);
    }
}
