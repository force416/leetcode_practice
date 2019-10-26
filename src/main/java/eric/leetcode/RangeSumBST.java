package eric.leetcode;

/**
 * https://leetcode.com/problems/range-sum-of-bst/
 */
public class RangeSumBST {
    public int rangeSumBST(TreeNode root, int L, int R) {
        if (root == null)
            return 0;
        //Node is within L, R range!
        if (root.val >= L && root.val <= R) {
            int leftSum = rangeSumBST(root.left, L, R);
            int rightSum = rangeSumBST(root.right, L, R);
            return root.val + leftSum + rightSum;
            //Node is too small, let's go right to get a larger node!
        } else if (root.val < L)
            return rangeSumBST(root.right, L, R);
        //Node is too large, let's go left to get a smaller node!
        return rangeSumBST(root.left, L, R);
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
