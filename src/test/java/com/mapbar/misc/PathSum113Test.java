package com.mapbar.misc;

import com.mapbar.tree.TreeNode;
import com.mapbar.util.PrintUtil;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class PathSum113Test {

    private PathSum113 pathSum113 = new PathSum113();

    @Test
    public void pathSum() {
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(2);
        List<List<Integer>> lists = pathSum113.pathSum(treeNode, 3);
        for(List<Integer> list : lists) {
            System.out.println(PrintUtil.printList(list));
        }

    }
}