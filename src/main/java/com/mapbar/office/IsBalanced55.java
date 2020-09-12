package com.mapbar.office;

import com.mapbar.tree.TreeNode;

public class IsBalanced55 {

    private boolean flag = true;

    public boolean isBalanced(TreeNode root) {
        depth(root);
        return flag;
    }

    private int depth(TreeNode node) {
        if(!flag) {
            return 0;
        }
        if(node == null) {
            return 0;
        }
        int l = depth(node.left);
        int r = depth(node.right);
        if(Math.abs(r - l) > 1) {
            flag = false;
        }
        return Math.max(r, l) + 1;
    }
}
