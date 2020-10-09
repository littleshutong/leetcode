package com.mapbar.misc;

import com.mapbar.tree.TreeNode;
import com.mapbar.util.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SumOfLeftLeaves404Test {

    private SumOfLeftLeaves404 sumOfLeftLeaves404 = new SumOfLeftLeaves404();

    @Test
    public void sumOfLeftLeaves() {
        TreeNode treeNode = new TreeNode(3);
        treeNode.left = new TreeNode(9);
        treeNode.right = new TreeNode(20);
        treeNode.right.left = new TreeNode(15);
        treeNode.right.right = new TreeNode(7);
        Assert.assertEquals(24, sumOfLeftLeaves404.sumOfLeftLeaves(treeNode));
    }
}