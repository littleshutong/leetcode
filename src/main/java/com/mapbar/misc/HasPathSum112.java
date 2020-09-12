package com.mapbar.misc;

import com.mapbar.tree.TreeNode;

public class HasPathSum112 {

    public boolean hasPathSum(TreeNode root, int target) {
        if(root == null) {
            return false;
        }
        if(root.left == null && root.right == null) {
            return root.val == target;
        }
        return hasPathSum(root.left, target - root.val) || hasPathSum(root.right, target - root.val);
    }

}
