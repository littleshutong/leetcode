package com.mapbar.misc;

import com.mapbar.tree.TreeNode;
import com.mapbar.util.PrintUtil;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinaryTreePaths257Test {

    private BinaryTreePaths257 binaryTreePaths257 = new BinaryTreePaths257();

    @Test
    public void binaryTreePaths() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(5);
        System.out.println(PrintUtil.printList(binaryTreePaths257.binaryTreePaths2(root)));
    }
}