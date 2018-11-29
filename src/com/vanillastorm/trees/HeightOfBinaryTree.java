package com.vanillastorm.trees;

/**
 * Given a binary tree, find its maximum/minimum depth.
 *
 * The maximum/minimum depth is the number of nodes along the longest/shortest path from the root node down to the nearest leaf node.
 */

public class HeightOfBinaryTree {

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = maxDepth(root.left);
        int rigth = maxDepth(root.right);

        if (left > rigth) {
            int h = 1 + rigth;
            return h;
        } else {
            int h = 1 + left;
            return h;
        }
    }

    public static int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = minDepth(root.left);
        int right = minDepth(root.right);

        if (left == 0 && right != 0) {
            return right + 1;
        }
        if (right == 0 && left != 0) {
            return left + 1;
        }

        if (left < right) {
            return  1 + left;
        } else {
            return  1 + right;
        }
    }
}
