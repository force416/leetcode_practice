package eric.leetcode;

/**
 * Suppose a sorted array is rotated at some pivot unknown to you beforehand.
	(i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
	You are given a target value to search. If found in the array return its index, otherwise return -1.
	You may assume no duplicate exists in the array.
	
	https://leetcode.com/problems/search-in-rotated-sorted-array/
 *
 */
public class SearchArray {

	public static void main(String[] args) {
		System.out.println(new SearchArray().search(new int[]{1,3,4,5,6,7}, 4));
	}
	
	public int search(int[] nums, int target) {
		
		for (int i=0; i< nums.length; i++) {
			if (target == nums[i]) {
				return i;
			}
		}
		
		return -1;
	}
}
