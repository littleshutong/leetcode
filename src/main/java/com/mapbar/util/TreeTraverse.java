package com.mapbar.util;

import com.mapbar.tree.TreeNode;

public class TreeTraverse {

    public void inOrderTraverse(TreeNode root) {
        if(root == null) {
            return;
        }
        inOrderTraverse(root.left);
        operator(root);
        inOrderTraverse(root.right);
    }

    private void operator(TreeNode root) {
        System.out.println(root.val);
    }
}
