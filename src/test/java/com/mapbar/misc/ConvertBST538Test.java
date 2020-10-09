package com.mapbar.misc;

import com.mapbar.tree.TreeNode;
import com.mapbar.util.TreeTraverse;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConvertBST538Test {

    private ConvertBST538 convertBST538 = new ConvertBST538();
    private TreeTraverse treeTraverse = new TreeTraverse();

    @Test
    public void convertBST() {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(2);
        root.right = new TreeNode(13);
        convertBST538.convertBST(root);
        treeTraverse.inOrderTraverse(root);
    }
}