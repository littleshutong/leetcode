package com.mapbar.misc;

import java.util.ArrayList;
import java.util.List;
import com.mapbar.tree.TreeNode;

public class BinaryTreePaths257 {

    /**
     * 利用字符串，不需要回溯
     * @param root
     * @return
     */
    public List<String> binaryTreePaths2(TreeNode root) {
        List<String> ans = new ArrayList<>();
        dfs2(root, "", ans);
        return ans;
    }

    private void dfs2(TreeNode node, String path, List<String> ans) {
        if(node == null) {
            return ;
        }
        StringBuilder sb = new StringBuilder(path);
        sb.append(node.val);
        if(node.left == null && node.right == null) {
            ans.add(sb.toString());
            return;
        } else {
            sb.append("->");
            dfs2(node.left, sb.toString(), ans);
            dfs2(node.right, sb.toString(), ans);
        }
    }

    /**
     * 自己实现，缺点需要回溯
     * @param root
     * @return
     */
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        if(root == null) {
            return ans;
        }
        dfs(root, new ArrayList<>(), ans);
        return ans;
    }

    private void dfs(TreeNode root, List<Integer> temp, List<String> ans) {
        temp.add(root.val);
        if(root.left == null && root.right == null) {
            StringBuilder sb = new StringBuilder();
            for(int t : temp) {
                sb.append(t).append("->");
            }
            if(sb.length() > 0) {
                sb.delete(sb.length() - 2, sb.length());
            }
            ans.add(sb.toString());
            return ;
        }
        if(root.left != null) {
            dfs(root.left, temp, ans);
            temp.remove(temp.size() - 1);
        }
        if(root.right != null) {
            dfs(root.right, temp, ans);
            temp.remove(temp.size() - 1);
        }
    }
}
