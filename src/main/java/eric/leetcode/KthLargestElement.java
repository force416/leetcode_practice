package eric.leetcode;

import java.util.Arrays;

/**
 * Find the kth largest element in an unsorted array. Note that it is the kth largest element in the sorted order, not the kth distinct element.
	For example,
	Given [3,2,1,5,6,4] and k = 2, return 5.
	https://leetcode.com/problems/kth-largest-element-in-an-array/
 *
 */
public class KthLargestElement {

	public static void main(String[] args) {
		System.out.println(new KthLargestElement().process(new int[]{3,2,1,5,6,4}, 1));
	}
	
	public int process(int[] nums, int k) {
		Arrays.sort(nums);
		return nums[nums.length-k];
	}
}
