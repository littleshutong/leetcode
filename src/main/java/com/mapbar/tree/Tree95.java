package com.mapbar.tree;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Tree95 {

    public static void main(String[] args) {
        Tree95 tree95 = new Tree95();
        List<TreeNode> treeNodes = tree95.generateTrees(3);
    }

    public List<TreeNode> generateTrees(int n) {
        if(n < 1) {
            return new ArrayList<>();
        }
        return helper(1, n);
    }

    // 构造左右子树
    private List<TreeNode> helper(int start, int end) {
        List<TreeNode> list = new ArrayList<>();
        if(start > end) {
            list.add(null);
            return list;
        }
        for(int i = start; i <= end; i++) {
            List<TreeNode> left = helper(start, i - 1);
            List<TreeNode> right = helper(i + 1, end);

            // 固定左孩子，遍历右孩子
            for(TreeNode l : left) {
                for(TreeNode r : right) {
                    TreeNode root = new TreeNode(i);
                    root.left = l;
                    root.right = r;
                    list.add(root);
                }
            }
        }
        return list;
    }
}
