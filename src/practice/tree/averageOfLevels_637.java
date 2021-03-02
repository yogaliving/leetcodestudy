package practice.tree;

import java.util.ArrayList;
import java.util.List;

public class averageOfLevels_637 {
    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
    List<Integer> counts = new ArrayList<Integer>();
    List<Double> sums = new ArrayList<Double>();
    List<Double> averages = new ArrayList<Double>();
    public List<Double> averageOfLevels(TreeNode root) {
        if (root==null) return null;
        averageOfLevels1(0,root);
        int size = sums.size();
        for (int i = 0; i < size; i++) {
            averages.add(sums.get(i) / counts.get(i));
        }
        return averages;
    }

    public void averageOfLevels1(int index,TreeNode root) {
        if (root==null) return ;
        if (counts.size()>index) {
            counts.set(index,counts.get(index)+ 1);
            sums.set(index,sums.get(index)+ 1.0*root.val);
        }
        else {
            counts.add(1);
            sums.add(1.0*root.val);
        }
        averageOfLevels1(index+1,root.left);
        averageOfLevels1(index+1,root.right);
    }

}
