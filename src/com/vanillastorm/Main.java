package com.vanillastorm;

import com.vanillastorm.arrays.SumofEvenNumbersAfterQueries;
import com.vanillastorm.lists.ArrayToNode;
import com.vanillastorm.lists.ListNode;
import com.vanillastorm.other.StringToMap;
import com.vanillastorm.trees.ArrayToTree;
import com.vanillastorm.trees.TreeNode;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] array = new int[]{1, 2, 3, 4};
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

        int x = 55;

//        while (x != 0) {
//            System.out.println(x);
//            x = x>>1;
//        }
    }
}

