package com.vanillastorm;

import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        int[] array = new int[]{1, 2, 2, 1};
        int[] array2 = new int[]{2, 2};

        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        ListNode l = arrayToNode(array);
        ListNode l2 = arrayToNode(array2);

        System.out.println(l);
    }

    public static ListNode arrayToNode (int[] array) {
        ListNode result = new ListNode(array[0]);
        ListNode marker = result;

        for (int i = 1; i < array.length; i++) {
            ListNode newNode = new ListNode(array[i]);
            marker.next = newNode;
            marker = marker.next;
        }

        return result;
    }

    public static ListNode partition(ListNode head, int x) {

        if (head == null) return null;

        ListNode firs = new ListNode(0);
        ListNode smaller = firs;
        ListNode firstBig = null;
        ListNode bigger = null;

        while (head != null) {
            if (head.val >= x) {
                ListNode newNode = new ListNode(head.val);
                if (bigger == null) {
                    firstBig = newNode;
                    bigger = firstBig;
                    smaller.next = bigger;
                } else {
                    bigger.next = newNode;
                    bigger = newNode;
                }
                head = head.next;
            } else {
                ListNode newNode = new ListNode(head.val);

                if (smaller == firs) {
                    firs.next = newNode;
                } else {
                    smaller.next = newNode;
                }
                smaller = newNode;
                newNode.next = firstBig;
                head = head.next;
            }
        }

        return firs.next;
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;

        ListNode markerA = headA;
        ListNode markerB = headB;

        while (markerA != null) {
            while (markerB != null) {
                if (markerA.val == markerB.val) {
                    ListNode markerC = markerA;
                    return markerC;
                }
                markerB = markerB.next;
            }
            markerA = markerA.next;
            markerB = headB;
        }
        return null;
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> result = new ArrayList();
        int[] resultInCaseZero = new int[result.size()];

        if (nums1.length == 0 || nums2.length == 0) {
            return resultInCaseZero;
        }

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i = 0;
        int j = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] > nums2[j]) {
                j++;
                if (j >= nums2.length) break;
            }

            if (nums1[i] < nums2[j]) {
                i++;
                if (i >= nums1.length) break;
            }

            if (nums1[i] == nums2[j]) {
                result.add(nums1[i]);
                i++;
                j++;
            }
        }

        int[] newResult = new int[result.size()];
        for (int k = 0; k < newResult.length; k++) {
            newResult[k] = result.get(k);
        }

        return newResult;

    }

    public static int[] unionOfTwoArrays(int[] array1, int[] array2) {
        int[] result = new int[array1.length + array2.length];
        int resultIndex = 0;
        int firstArrayIndex = 0;
        int secondArrayIndex = 0;

        while (resultIndex < result.length) {
            if (firstArrayIndex < array1.length && secondArrayIndex < array2.length) {
                if (array1[firstArrayIndex] < array2[secondArrayIndex]) {
                    result[resultIndex] = array1[firstArrayIndex];
                    firstArrayIndex++;
                    resultIndex++;
                } else {
                    result[resultIndex] = array2[secondArrayIndex];
                    secondArrayIndex++;
                    resultIndex++;
                }
            } else if (firstArrayIndex == array1.length && resultIndex < result.length) {
                result[resultIndex] = array2[secondArrayIndex];
                secondArrayIndex++;
                resultIndex++;
            } else {
                result[resultIndex] = array1[firstArrayIndex];
                firstArrayIndex++;
                resultIndex++;
            }

        }

        return result;
    }

    public static int[] fibonacci(int amount) {
        int[] fibonacci = new int[amount];
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for (int i = 2; i < amount; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        return fibonacci;
    }

    public static ListNode findHead(ListNode list) {
        ListNode head = list;

        ListNode newHead = new ListNode(5);
        newHead.next = head;

        list = newHead;

        while (list != null) {
            System.out.print(list.val + " -> ");
            list = list.next;
        }
        System.out.println("null");

        return newHead;
    }

    public static ListNode insertSort(ListNode list) {
        if (list == null) {
            return list;
        }

        ListNode fakeHead = new ListNode(0);
        fakeHead.next = list;

        while (list != null && list.next != null) {
            if (list.val > list.next.val) {
                ListNode marker = list.next;
                ListNode markerPrev = fakeHead;

                while (markerPrev.next.val < marker.val) {
                    markerPrev = markerPrev.next;
                }

                list.next = marker.next;
                marker.next = markerPrev.next;
                markerPrev.next = marker;

            } else {
                list = list.next;
            }
        }
        return fakeHead.next;
    }

    public static int[] bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

    public static int[] insertionSort(int[] array) {
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j >= 0; j--) {
                if (array[i] < array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                    i--;
                }
            }
        }
        return array;
    }

    public static int[] selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        return array;
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        List result = new ArrayList<>();

        if (matrix.length == 0) {
            return result;
        }

        int rowLenght = matrix.length;
        int columnLength = matrix[0].length;

        int amountOfElements = rowLenght * columnLength;

        int stepCounter = 1;
        int rowIndex = 0;
        int columnIndex = 0;
        int leftmostIndexInColumns = 0;
        int upmostIndexInRows = 0;
        int directionMarker = 0;

        result.add(matrix[0][0]);

        while (stepCounter < amountOfElements) {
            switch (directionMarker) {
                case 0:
                    if (stepCounter == amountOfElements) {
                        break;
                    }
                    columnIndex++;
                    while (columnIndex < columnLength) {
                        result.add(matrix[rowIndex][columnIndex]);
                        columnIndex++;
                        stepCounter++;
                    }
                    columnIndex--;
                    upmostIndexInRows++;
                    directionMarker = 1;

                case 1:
                    if (stepCounter == amountOfElements) {
                        break;
                    }
                    rowIndex++;
                    while (rowIndex < rowLenght) {
                        result.add(matrix[rowIndex][columnIndex]);
                        rowIndex++;
                        stepCounter++;
                    }
                    rowIndex--;
                    columnLength--;
                    directionMarker = 2;

                case 2:
                    if (stepCounter == amountOfElements) {
                        break;
                    }
                    columnIndex--;
                    while (columnIndex >= leftmostIndexInColumns) {
                        result.add(matrix[rowIndex][columnIndex]);
                        columnIndex--;
                        stepCounter++;
                    }
                    columnIndex++;
                    //leftmostIndexInColumns++;
                    rowLenght--;
                    directionMarker = 3;

                case 3:
                    if (stepCounter == amountOfElements) {
                        break;
                    }
                    rowIndex--;
                    while (rowIndex >= upmostIndexInRows) {
                        result.add(matrix[rowIndex][columnIndex]);
                        rowIndex--;
                        stepCounter++;
                    }
                    rowIndex++;
                    leftmostIndexInColumns++;
                    directionMarker = 0;
            }
        }
        return result;
    }

    public static int[][] transpose(int[][] A) {
        int[][] B = new int[A[0].length][A.length];
        for (int row = 0; row < A[0].length; row++) {
            for (int column = 0; column < A.length; column++) {
                B[row][column] = A[column][row];
            }
        }
        return B;
    }

    public static void printMatrix(int n, int m) {
        int[][] matrix = new int[n][m];
        int counter = 0;
        for (int row = 0; row < n; row++) {
            for (int column = 0; column < m; column++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }

    public static ListNode mergeTwoSortedNodes(ListNode l1, ListNode l2) {
        if (l2 == null) return l1;
        if (l1 == null) return l2;

        while (l2 != null) {
            l1 = insertElementInNode(l1, l2.val);
            l2 = l2.next;
        }

        return l1;
    }

    public static ListNode insertElementInNode(ListNode l, int val) {
        if (l == null) {
            return new ListNode(val);
        }

        if (l.val > val) {
            ListNode newNode = new ListNode(val);
            newNode.next = l;
            return newNode;
        }

        ListNode mark = l;
        if (mark.val < val) {
            while (mark != null) {
                if (mark.val <= val && mark.next == null || mark.val <= val && mark.next.val > val) {
                    ListNode nextMark = mark.next;
                    ListNode newNode = new ListNode(val);
                    mark.next = newNode;
                    newNode.next = nextMark;
                    return l;
                } else {
                    mark = mark.next;
                }
            }
        }

        return l;
    }

    public static ListNode reverseList(ListNode myList) {
        if (myList == null) {
            return myList;
        }

        ListNode head = myList;
        ListNode prev = null;
        ListNode next = head.next;

        while (head != null) {
            head.next = prev;
            prev = head;
            head = next;
            if (head != null) {
                next = head.next;
            }
        }
        return prev;
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode oldNode = result;

        int reminder = 0;
        int sum = 0;

        while (l1 != null || l2 != null) {
            ListNode newNode = new ListNode(0);

            int val1 = (l1 != null) ? l1.val : 0;
            int val2 = (l2 != null) ? l2.val : 0;

            sum = val1 + val2 + reminder;
            reminder = sum / 10;
            sum %= 10;

            newNode.val = sum;

            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;

            oldNode.next = newNode;
            oldNode = newNode;
        }

        if (reminder > 0) {
            ListNode reminderNode = new ListNode(reminder);
            oldNode.next = reminderNode;
        }

        return result.next;
    }

    public static void printList(ListNode l) {
        while (l != null) {
            System.out.print(l.val + " -> ");
            l = l.next;
        }
        System.out.println("null");
    }

    public static void recurPrintList(ListNode l) {
        if (l == null) {
            return;
        }
        System.out.println(l.val);
        recurPrintList(l.next);
    }

    public static LinkedList numberToNode(ListNode x) {
        LinkedList<Integer> linkedListNumber = new LinkedList<>();
        while (x.val != 0) {
            linkedListNumber.add(x.val % 10);
            x.val /= 10;
        }
        return linkedListNumber;
    }

    public static int romanToInt(String s) {
        int number = 0;
        s += 'O';
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'C' && s.charAt(i + 1) == 'M') {
                number += 900;
                i += 2;
            }
            if (s.charAt(i) == 'M') {
                number += 1000;
            }
            if (s.charAt(i) == 'D') {
                number += 500;
            }

            if (s.charAt(i) == 'C' && s.charAt(i + 1) == 'D') {
                number += 400;
                i += 2;
            }
            if (s.charAt(i) == 'C') {
                number += 100;
            }
            if (s.charAt(i) == 'X' && s.charAt(i + 1) == 'C') {
                number += 90;
                i += 2;
            }
            if (s.charAt(i) == 'X' && s.charAt(i + 1) == 'L') {
                number += 40;
                i += 2;
            }
            if (s.charAt(i) == 'L') {
                number += 50;
            }
            if (s.charAt(i) == 'I' && s.charAt(i + 1) == 'X') {
                number += 9;
                i += 2;
            }
            if (s.charAt(i) == 'I' && s.charAt(i + 1) == 'V') {
                number += 4;
                i += 2;
            }
            if (s.charAt(i) == 'X') {
                number += 10;
            }
            if (s.charAt(i) == 'V') {
                number += 5;
            }
            if (s.charAt(i) == 'I') {
                number += 1;
            }
            if (s.charAt(i) == 'O') {
                return number;
            }
        }
        return number;
    }

    public static int romeMap(String line) {
        Map<Character, Integer> romeInteger = new HashMap<Character, Integer>();
        romeInteger.put('M', 1000);
        romeInteger.put('D', 500);
        romeInteger.put('C', 100);
        romeInteger.put('L', 50);
        romeInteger.put('X', 10);
        romeInteger.put('V', 5);
        romeInteger.put('I', 1);
        romeInteger.put('O', 0);

        int resultNumber = 0;
        int i = 0;
        line += "O";

        while (i < line.length()) {
            if (line.charAt(i) == 'O') {
                return resultNumber;
            }

            if (line.charAt(i) == 'I' && romeInteger.get(line.charAt(i + 1)) > romeInteger.get(line.charAt(i))) {
                resultNumber -= 1;
                i++;
            }

            if (line.charAt(i) == 'X' && romeInteger.get(line.charAt(i + 1)) > romeInteger.get(line.charAt(i))) {
                resultNumber -= 10;
                i++;
            }

            if (line.charAt(i) == 'C' && romeInteger.get(line.charAt(i + 1)) > romeInteger.get(line.charAt(i))) {
                resultNumber -= 100;
                i++;
            }

            if (romeInteger.containsKey(line.charAt(i))) {
                resultNumber += romeInteger.get(line.charAt(i));
                i++;
            }
        }
        return resultNumber;
    }

    public static int reverse(int x) {
        int resultNumber = 0;
        int size = 0;
        int cur = x;

        while (cur != 0) {
            cur = cur / 10;
            size++;
        }

        int[] numbers = new int[size];
        for (int i = size - 1; i >= 0; i--) {
            numbers[i] = x % 10;
            x /= 10;
        }

        for (int i = 0; i < size; i++) {
            resultNumber += numbers[i] * Math.pow(10, i);
        }

        return resultNumber;
    }

    public static String findSubString(String line) {

        int i = 0;
        int currentMax = 0;
        int max = 0;
        String subLine = "";
        int[] counters = new int[26];

        while (i < line.length()) {
            if (currentMax > max) {
                max = currentMax;
            }

            if (counters[line.charAt(i) - 'a'] == 0) {
                currentMax++;
                subLine += line.charAt(i);
                counters[line.charAt(i) - 'a']++;
                i++;
            } else {
                counters = new int[26];
                subLine = "";
                currentMax = 0;
                counters[line.charAt(i) - 'a'] = 0;
                subLine += line.charAt(i);
                i++;
            }
        }
        return subLine;
    }

    public static boolean judgeCircle(String moves) {

        int verticalCounter = 0;
        int horizontalCounter = 0;

        for (int i = 0; i < moves.length(); i++) {

            if (moves.charAt(i) == 'U') {
                verticalCounter++;
            }
            if (moves.charAt(i) == 'D') {
                verticalCounter--;
            }
            if (moves.charAt(i) == 'L') {
                horizontalCounter++;
            }
            if (moves.charAt(i) == 'R') {
                horizontalCounter--;
            }
        }

        if (verticalCounter == 0 && horizontalCounter == 0) {
            return true;
        } else return false;
    }

    public static void binarySearch(int numberToFind, int[] array) {
        int lower = 0, higher = array.length, mid;
        while (lower < higher) {
            mid = (lower + higher) / 2;
            System.out.println(mid);
            if (numberToFind == array[mid]) {
                System.out.println("your number " + numberToFind + " is in array[" + array[mid] + "]");
                break;
            } else {
                if (numberToFind <= array[mid]) {
                    higher = mid;
                } else {
                    lower = mid;
                }
            }
        }
    }

    public static void absentNumberBidloCode(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[0] == 1) {
                System.out.println("absent number is 0");
                break;
            }

            if ((array[i] + array[i + 1]) % 2 == 0) {
                System.out.println("absent number is " + (array[i] + array[i + 1]) / 2);
                break;
            }
            if (array[i + 1] == array.length - 1) {
                System.out.println("absent number is " + array.length);
                break;
            }
        }
    }

    public static String lostNumber(int[] array) {
        int lower = 0;
        int higher = array.length;
        int mid;

        if (array[0] != 0) {
            return "lost number is 0";
        }

        if (array[array.length - 1] != array.length) {
            return "lost number is " + array.length;
        }

        while (lower != higher - 1) {
            mid = (lower + higher) / 2;

            if (array[mid] > mid) {
                higher = mid;
            } else {
                lower = mid;
            }
        }
        return "lost number is " + (array[lower] + array[higher]) / 2;
    }

    public static int[] rotate(int[] nums, int k) {
        int[] rotatedArray = new int[nums.length];
        k = k % nums.length;
        for (int i = 0; i < k; i++) {
            rotatedArray[i] = nums[nums.length - k + i];
        }
        for (int j = k; j < rotatedArray.length; j++) {
            rotatedArray[j] = nums[j - k];
        }

        return rotatedArray;
    }
}
