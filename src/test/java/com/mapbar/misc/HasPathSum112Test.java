package com.mapbar.misc;

import com.mapbar.tree.TreeNode;
import com.mapbar.util.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class HasPathSum112Test {

    private HasPathSum112 hasPathSum112 = new HasPathSum112();
    @Test
    public void hasPathSum() {
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        Assert.assertTrue(hasPathSum112.hasPathSum(treeNode, 3));

        treeNode = new TreeNode(5);
        treeNode.left = new TreeNode(4);
        treeNode.right = new TreeNode(8);
        treeNode.left.left = new TreeNode(11);
        treeNode.left.left.left = new TreeNode(7);
        treeNode.left.left.right = new TreeNode(2);
        treeNode.right.left = new TreeNode(13);
        treeNode.right.right = new TreeNode(4);
        treeNode.right.right.right = new TreeNode(1);
        Assert.assertTrue(hasPathSum112.hasPathSum(treeNode, 22));
        Assert.assertTrue(hasPathSum112.hasPathSum(treeNode, 27));
        Assert.assertTrue(hasPathSum112.hasPathSum(treeNode, 26));
        Assert.assertTrue(hasPathSum112.hasPathSum(treeNode, 18));
        Assert.assertFalse(hasPathSum112.hasPathSum(treeNode, 9));
    }
}