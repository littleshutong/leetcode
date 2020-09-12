package com.mapbar.tree;

import com.mapbar.util.PrintUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Tree94 {

    public static void main(String[] args) {
        Tree94 tree94 = new Tree94();
        TreeNode root = tree94.bulid();
        // 方法一 递归中序遍历
        List<Integer> ans = tree94.inorderTraversal(root);
        System.out.println(PrintUtil.printList(ans).equals("4,2,5,1,6,3"));
        // 方法二 栈的中序遍历
        ans = tree94.inorderTraversalByStack(root);
        System.out.println(PrintUtil.printList(ans).equals("4,2,5,1,6,3"));
        // 方法二 栈的前序遍历
        ans = tree94.preorderTraversalByStack(root);
        System.out.println(PrintUtil.printList(ans).equals("1,2,4,5,3,6"));
        // 方法三 莫里斯遍历
        ans = tree94.inorderTraversalByMelis(root);
        System.out.println(PrintUtil.printList(ans).equals("4,2,5,1,6,3"));
    }

    /**
     * 基于莫里斯方法
     * @param root
     * @return
     */
    private List<Integer> inorderTraversalByMelis(TreeNode root) {
        List<Integer> order = new ArrayList<>();
        TreeNode curr = root;
        TreeNode pre = null;
        while(curr != null) {
            if(curr.left == null) {
                order.add(curr.val);
                curr = curr.right;
            } else {
                pre = curr.left;
                // 找左子树的最右侧节点
                while(pre.right != null) {
                    pre = pre.right;
                }
                // 将最右的节点连接到curr上。
                pre.right = curr;
                TreeNode temp = curr;
                curr = curr.left;
                temp.left = null;
            }
        }
        return order;
    }

    /**
     * 基于栈的前序遍历
     * @param root
     * @return
     */
    private List<Integer> preorderTraversalByStack(TreeNode root) {
        List<Integer> order = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;
        while(curr != null || !stack.isEmpty()) {
            while(curr != null) {
                stack.push(curr);
                order.add(curr.val);
                curr = curr.left;
            }
            curr = stack.pop();
            curr = curr.right;
        }
        return order;
    }

    /**
     * 基于栈的中序遍历
     * @param root
     * @return
     */
    private List<Integer> inorderTraversalByStack(TreeNode root) {
        List<Integer> order = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;
        while(curr != null || !stack.isEmpty()) {
            while(curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            order.add(curr.val);
            curr = curr.right;
        }
        return order;
    }

    /**
     * 构造数信息
     *            1
     *       2         3
     *    4    5    6
     *
     *  前序遍历结果为：1,2,4,5,3,6
     *  中序遍历结果为：4,2,5,1,6,3
     *  后续遍历结果为：4,5,2,6,3,1
     * @return
     */
    public TreeNode bulid() {
        TreeNode root = new TreeNode(1);
        // 第一层
        TreeNode left11 = new TreeNode(2);
        TreeNode rigth11 = new TreeNode(3);
        root.left = left11;
        root.right = rigth11;
        // 第二层前一个节点
        TreeNode left21 = new TreeNode(4);
        TreeNode right22 = new TreeNode(5);
        // 第二层后一个节点
        TreeNode left23 = new TreeNode(6);
        left11.left = left21;
        left11.right = right22;
        rigth11.left = left23;
        return root;
    }

    /**
     * 方法一 递归中序遍历
     * @param root
     * @return
     */
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        backTrack(root, ans);
        return ans;
    }

    /**
     * 递归方法
     * @param root
     * @param ans
     */
    public void backTrack(TreeNode root, List<Integer> ans) {
        if(root != null) {
            backTrack(root.left, ans);
            ans.add(root.val);
            backTrack(root.right, ans);
        }
    }
}
