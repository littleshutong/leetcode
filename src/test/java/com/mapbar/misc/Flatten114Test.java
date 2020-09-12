package com.mapbar.misc;

import com.mapbar.tree.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class Flatten114Test {

    private Flatten114 flatten114 = new Flatten114();

    @Test
    public void flatten() {

        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(3);
        flatten114.dfs(treeNode);
    }
}