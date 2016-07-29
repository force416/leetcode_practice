package eric.leetcode;

/**
 * Given an array nums, write a function to move all 0's to the end of it while
 * maintaining the relative order of the non-zero elements. For example, given
 * nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].
 * 
 * https://leetcode.com/problems/move-zeroes/
 */
public class MoveZeroes {

	public static void main(String[] args) {
		int[] nums = {0, 1, 0, 3, 12};
		new MoveZeroes().moveZeroes(nums);
		for (int i : nums) {
			System.out.println(i);
		}
	}

	public void moveZeroes(int[] nums) {
		int[] result = new int[nums.length];
		int cnt = 0;
		for (int num : nums) {
			if (num != 0) {
				result[cnt] = num;
				cnt++;
			}
		}
		for (int i=0; i<nums.length; i++) {
				nums[i] = result[i];
		}
	}
}
