package eric.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/unique-morse-code-words/
 * <p>
 * Example:
 * Input: words = ["gin", "zen", "gig", "msg"]
 * Output: 2
 * Explanation:
 * The transformation of each word is:
 * "gin" -> "--...-."
 * "zen" -> "--...-."
 * "gig" -> "--...--."
 * "msg" -> "--...--."
 * <p>
 * There are 2 different transformations, "--...-." and "--...--.".
 */
public class UniqueMorse {
    private final static String[] morseArray = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};

    public int uniqueMorseRepresentations(String[] words) {
        Set<String> set = new HashSet<>();

        for (String word : words) {
            StringBuilder builder = new StringBuilder();
            char[] charArray = word.toCharArray();
            for (int i = 0; i < charArray.length; i++) {
                String charMorse = morseArray[charArray[i] - 'a'];
                builder.append(charMorse);
            }

            set.add(builder.toString());
        }

        return set.size();
    }

    public static void main(String[] args) {
        System.out.println(new UniqueMorse().uniqueMorseRepresentations(new String[]{"gin", "zen", "gig", "msg"}));
    }
}
