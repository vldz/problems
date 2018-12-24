package com.vanillastorm.trees;

/**
 *
 * Given two binary trees, checks if they are the same or not.
 *
 * Two binary trees are considered the same if they are structurally identical and the nodes have the same value.
 *
 * Example:
 *
 * Input:     1         1
 *           / \       / \
 *          2   3     2   3
 *
 *         [1,2,3],   [1,2,3]
 *
 * Output: true
 *
 */

public class SameTree {
    public static boolean isSameTree(TreeNode p, TreeNode q) {

        if (p == null || q == null) {
            return true;
        }

        if (p == null && q != null || q == null && p != null) {
            return false;
        }

        if (p.val == q.val) {
            boolean isSameLeft = isSameTree(p.left, q.left);
            boolean isSameRight = isSameTree(p.right, q.right);

            return (!isSameLeft || !isSameRight) ? false :  true;

        } else return false;


    }
}
