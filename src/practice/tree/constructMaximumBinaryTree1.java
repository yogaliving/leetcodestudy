package practice.tree;

/**
 * 654
 */
public class constructMaximumBinaryTree1 {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if(nums.length==0) return null;
        int index = 0;
        int maxVal = nums[0];
        for (int i = 0; i < nums.length ; i++) {
            if(maxVal<nums[i]){
                maxVal = nums[i];
                index = i;
            }
        }
        TreeNode treeNode = new TreeNode(maxVal);
        int[] nums1 = new int[index];
        int[] nums2 = new int[nums.length-index-1];
        for (int i = 0; i <index; i++) {
            nums1[i] = nums[i];
        }
        for (int i = 0; i <nums.length-index-1; i++) {
            nums2[i] = nums[i+index+1];
        }
        treeNode.left = constructMaximumBinaryTree(nums1);
        treeNode.right= constructMaximumBinaryTree(nums2);

        return treeNode;
    }

    private class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
}
