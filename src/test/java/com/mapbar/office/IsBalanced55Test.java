package com.mapbar.office;

import com.mapbar.tree.TreeNode;
import com.mapbar.util.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class IsBalanced55Test {


    @Test
    public void isBalanced() {
        IsBalanced55 isBalanced55 = new IsBalanced55();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(2);
        Assert.assertFalse(isBalanced55.isBalanced(root));
        isBalanced55 = new IsBalanced55();
        root.right = new TreeNode(3);
        Assert.assertTrue(isBalanced55.isBalanced(root));

        root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(3);
        root.left.left.left = new TreeNode(4);
        root.left.left.right = new TreeNode(4);
        isBalanced55 = new IsBalanced55();
        Assert.assertFalse(isBalanced55.isBalanced(root));
        isBalanced55 = new IsBalanced55();
        Assert.assertTrue(isBalanced55.isBalanced(null));

        isBalanced55 = new IsBalanced55();
        root = new TreeNode(1);
        root.left = new TreeNode(1);
        Assert.assertTrue(isBalanced55.isBalanced(root));

        isBalanced55 = new IsBalanced55();
        root = new TreeNode(1);
        root.right = new TreeNode(1);
        Assert.assertTrue(isBalanced55.isBalanced(root));
    }
}