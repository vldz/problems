package com.vanillastorm;

import com.vanillastorm.lists.ArrayToNode;
import com.vanillastorm.lists.ListNode;
import com.vanillastorm.trees.ArrayToTree;
import com.vanillastorm.trees.HeightOfBinaryTree;
import com.vanillastorm.trees.TreeNode;

public class Main {

    public static void main(String[] args) {

        int[] array = new int[]{6, 5, 8, 7};
        int[] array2 = new int[]{2, 2};

        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        ListNode l = ArrayToNode.arrayToNode(array);
        ListNode l2 = ArrayToNode.arrayToNode(array2);

        TreeNode binaryTree = ArrayToTree.arrayToTree(array);

        System.out.println(HeightOfBinaryTree.minDepth(binaryTree));
    }
}
