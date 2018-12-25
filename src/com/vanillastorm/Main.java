package com.vanillastorm;

import com.vanillastorm.arrays.ShuffleAnArray;
import com.vanillastorm.lists.ArrayToNode;
import com.vanillastorm.lists.ListNode;
import com.vanillastorm.trees.ArrayToTree;
import com.vanillastorm.trees.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        int[] array = new int[]{1, 2, 3, 4, 5};
        int[] array2 = new int[]{6, 5, 8};

        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        ListNode l = ArrayToNode.arrayToNode(array);
        ListNode l2 = ArrayToNode.arrayToNode(array2);

        TreeNode binaryTree = ArrayToTree.arrayToTree(array);
        TreeNode binaryTree2 = ArrayToTree.arrayToTree(array2);
    }

}
