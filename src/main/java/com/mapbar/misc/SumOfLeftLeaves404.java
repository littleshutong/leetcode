package com.mapbar.misc;

import com.mapbar.tree.TreeNode;

public class SumOfLeftLeaves404 {

    private int sum = 0;
    public int sumOfLeftLeaves(TreeNode root) {
        dfs(root, false);
        return sum;
    }

    private void dfs(TreeNode node, boolean isLeftLeaves) {
        if(node == null) {
            return ;
        }
        if(node.left == null && node.right == null) {
            if(isLeftLeaves) {
                sum += node.val;
            }
        }
        dfs(node.left, true);
        dfs(node.right, false);
    }
}
