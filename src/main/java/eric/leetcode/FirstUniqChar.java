package eric.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * https://leetcode.com/problems/first-unique-character-in-a-string/ Given a
 * string, find the first non-repeating character in it and return it's index.
 * If it doesn't exist, return -1.
 * 
 */
public class FirstUniqChar {

	public static void main(String[] args) {
		System.out.println(new FirstUniqChar().firstUniqChar("leetcode"));
	}

	public int firstUniqChar(String s) {
		
		char[] arr = s.toCharArray();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for (char c : arr) {
			int cnt = map.get(c) == null ? 0 : map.get(c);
			cnt++;
			map.put(c, cnt);
		}
		char r = ' ';
		int index = arr.length;
		Set<Entry<Character, Integer>> es = map.entrySet();
		for (Entry<Character, Integer> e : es) {
			if (e.getValue().intValue() == 1 && s.indexOf(e.getKey()) < index) {
				index = s.indexOf(e.getKey());
				r = e.getKey().charValue();
			}
		}
		
		return s.indexOf(r);
	}
}