package eric.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Intersect {

	public static void main(String[] args) {
		
	}
	
	public int[] intersect(int[] nums1, int[] nums2) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for (int i: nums1) {
			int cnt = map.get(i) == null ? 0 : map.get(i);
			map.put(i, cnt + 1);
		}
		
		List<Integer> result = new ArrayList<Integer>();
		for (int j : nums2) {
			if (map.get(j) != null) {
				result.add(j);
				int cnt = map.get(j);
				map.put(j, (cnt -1) == 0 ? null : cnt -1);
			}
		}
		int[] resultArray = new int[result.size()];
		for (int i=0; i<result.size(); i++) {
			resultArray[i] = result.get(i);
		}
		return resultArray;
	}
	
}
