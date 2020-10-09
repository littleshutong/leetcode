package com.mapbar.tree;

public class InvertTree226 {

    public TreeNode invertTree(TreeNode root) {
        if(root == null) {
            return null;
        }
        TreeNode left = invertTree(root.left);
        TreeNode rigth = invertTree(root.right);
        root.left = rigth;
        root.right = left;
        return root;
    }
}
