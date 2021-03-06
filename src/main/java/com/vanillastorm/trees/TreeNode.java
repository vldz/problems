package com.vanillastorm.trees;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }

    @Override
    public String toString() {
        return "[val: " + this.val + ", " + "l: " + this.left + ", " + "r: " + this.right + "]";
    }
}

