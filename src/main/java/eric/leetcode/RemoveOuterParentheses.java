package eric.leetcode;

import java.util.Stack;

/**
 * https://leetcode.com/problems/remove-outermost-parentheses/
 *
 * example 1
 * Input: "(()())(())"
 * Output: "()()()"
 * Explanation:
 * The input string is "(()())(())", with primitive decomposition "(()())" + "(())".
 * After removing outer parentheses of each part, this is "()()" + "()" = "()()()".
 *
 * example 2
 * Input: "(()())(())(()(()))"
 * Output: "()()()()(())"
 * Explanation:
 * The input string is "(()())(())(()(()))", with primitive decomposition "(()())" + "(())" + "(()(()))".
 * After removing outer parentheses of each part, this is "()()" + "()" + "()(())" = "()()()()(())".
 *
 * example 3
 * Input: "()()"
 * Output: ""
 * Explanation:
 * The input string is "()()", with primitive decomposition "()" + "()".
 * After removing outer parentheses of each part, this is "" + "" = "".
 */
public class RemoveOuterParentheses {

    public String removeOuterParentheses(String S) {
        char[] array = S.toCharArray();
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < array.length; i++) {
            if (stack.isEmpty()) {
                stack.add(array[i]);
            } else {
                if (stack.peek() != array[i]) {
                    stack.pop();
                    if (!stack.isEmpty()) {
                        sb.append(array[i]);
                    }
                } else {
                    sb.append(array[i]);
                    stack.add(array[i]);
                }
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        RemoveOuterParentheses r = new RemoveOuterParentheses();

        System.out.println(r.removeOuterParentheses("(()())(())"));
        System.out.println(r.removeOuterParentheses("(()())(())(()(()))"));
        System.out.println(r.removeOuterParentheses("()()"));
        System.out.println(r.removeOuterParentheses("(()(()))"));
    }
}
