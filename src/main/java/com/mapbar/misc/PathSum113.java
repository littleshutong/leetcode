package com.mapbar.misc;

import com.mapbar.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class PathSum113 {

    public List<List<Integer>> pathSum(TreeNode root, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null) {
            return ans;
        }
        backtrack(new ArrayList<>(), ans, root, target);
        return ans;
    }

    private void backtrack(ArrayList<Integer> temp, List<List<Integer>> ans, TreeNode node, int val) {
        if(node == null) {
            return ;
        }
        temp.add(node.val);
        if(node.left == null && node.right == null && node.val == val) {
            ans.add(new ArrayList<>(temp));
        }
        backtrack(temp, ans, node.left, val - node.val);
        backtrack(temp, ans, node.right, val - node.val);
        temp.remove(temp.size() - 1);
    }
}
