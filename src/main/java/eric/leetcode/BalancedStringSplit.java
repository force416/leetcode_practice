package eric.leetcode;

import java.util.Stack;

/**
 * https://leetcode.com/problems/split-a-string-in-balanced-strings/
 * <p>
 * example1
 * Input: s = "RLRRLLRLRL"
 * Output: 4
 * Explanation: s can be split into "RL", "RRLL", "RL", "RL", each substring contains same number of 'L' and 'R'.
 * <p>
 * example2
 * Input: s = "RLLLLRRRLR"
 * Output: 3
 * Explanation: s can be split into "RL", "LLLRRR", "LR", each substring contains same number of 'L' and 'R'.
 * <p>
 * example3
 * Input: s = "LLLLRRRR"
 * Output: 1
 * Explanation: s can be split into "LLLLRRRR".
 */
public class BalancedStringSplit {
    public int run(String s) {
        Stack<Character> stack = new Stack<>();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (stack.isEmpty()) {
                count++;
                stack.add(c);
                continue;
            }
            if (stack.peek() != c) stack.pop();
            else stack.add(c);
        }
        return count;
    }

    public static void main(String[] args) {
        BalancedStringSplit instance = new BalancedStringSplit();
        int count = instance.run("RLRRLLRLRL");
        int count2 = instance.run("RLLLLRRRLR");
        int count3 = instance.run("LLLLRRRR");

        System.out.println(count);
        System.out.println(count2);
        System.out.println(count3);
    }
}
