package com.mapbar.misc;

import com.mapbar.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class ConvertBST538 {

    private int sum = 0;
    /**
     * 反中序遍历
     * @param root
     * @return
     */
    public TreeNode convertBST2(TreeNode root) {
        if(root == null) {
            return null;
        }
        convertBST2(root.right);
        sum += root.val;
        root.val = sum;
        convertBST2(root.left);
        return root;
    }

    /**
     * 常规思路
     * @param root
     * @return
     */
    public TreeNode convertBST(TreeNode root) {
        List<TreeNode> head = new ArrayList<>();
        dfs(head, root);
        int sum = 0;
        for(int i = head.size() - 1; i > -1; i--) {
            head.get(i).val += sum;
            sum = head.get(i).val;
        }
        return root;
    }

    private void dfs(List<TreeNode> head, TreeNode node) {
        if(node == null) {
            return ;
        }
        dfs(head, node.left);
        head.add(node);
        dfs(head, node.right);
    }
}
