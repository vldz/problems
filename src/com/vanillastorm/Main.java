package com.vanillastorm;

import com.vanillastorm.arrays.SumofEvenNumbersAfterQueries;
import com.vanillastorm.lists.ArrayToNode;
import com.vanillastorm.lists.ListNode;
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

        int [][] queries = {{1,0}, {-3, 1}, {-4, 0}, {2, 3}};
        System.out.println(Arrays.toString(SumofEvenNumbersAfterQueries.sumEvenAfterQueries(array, queries)));


//        String s = "key=value&key=value";
//        String keyValueS[] = s.split("=");
//
//        Map<String, String> decoder = new HashMap<>();
//        for (String keyValue :
//                keyValueS) {
//            String[] entry = keyValue.split("=");
//
//            decoder.put(entry[0], entry[1]);
//        }

    }
}

