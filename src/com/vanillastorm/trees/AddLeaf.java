package com.vanillastorm.trees;

public class AddLeaf {
    public static TreeNode addLeaf (TreeNode current, int valueToAdd) {
        if (current == null) {
            TreeNode newLeaf = new TreeNode(valueToAdd);
            return newLeaf;
        }

        if (valueToAdd < current.val) {
            current.left = addLeaf(current.left, valueToAdd);
        } else if (valueToAdd > current.val) {
            current.right = addLeaf(current.right, valueToAdd);
        } else {
            return current;
        }

        return current;
    }
}
