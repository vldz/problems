package com.vanillastorm.trees;

/**
 *   Given an array, convert it to a binary tree.
 */

public class ArrayToTree {
    public static TreeNode arrayToTree(int [] array) {
        TreeNode myTree = new TreeNode(array[0]);
        for (int i = 1; i < array.length; i++) {
            AddLeaf.addLeaf(myTree, array[i]);
        }
        return myTree;
    }

    public static void main(String[] args) {
        int [] array = {6, 4, 8, 3, 5, 7, 9};
        System.out.println(arrayToTree(array));
    }
}
