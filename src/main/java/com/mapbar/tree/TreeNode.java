package com.mapbar.tree;

import com.mapbar.Constants;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode(int x) { val = x; }

    @Override
    public String toString() {
        return val + Constants.BLANK;
    }
}
