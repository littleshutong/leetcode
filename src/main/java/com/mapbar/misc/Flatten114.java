package com.mapbar.misc;

import com.mapbar.tree.TreeNode;

public class Flatten114 {

    public void flatten(TreeNode root) {
        dfs(root);
    }

    public TreeNode dfs(TreeNode node) {
        if(node == null) {
            return null;
        }
        TreeNode left = dfs(node.left);
        TreeNode right = dfs(node.right);
        if(left != null && right != null) {
            TreeNode temp = right;
            node.right = left;
            while(left.right != null) {
                left = left.right;
            }
            left.right = temp;
        } else if(left != null && right == null) {
            node.right = left;
        }
        node.left = null;
        return node;
    }
}
