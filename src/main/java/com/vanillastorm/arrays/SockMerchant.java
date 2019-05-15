package com.vanillastorm.arrays;

import java.util.Arrays;

public class SockMerchant {
    public static int socks(int n, int[] ar) {
        Arrays.sort(ar);
        int pairs = 0;
        int sock = 1;
        while (sock < n) {
            int sameSockCOunter = 1;
            boolean step = false;
            while (sock < n && ar[sock] == ar[sock - 1]) {
                sameSockCOunter++;
                sock++;
                step = true;
            }
            if (step) {
                pairs += sameSockCOunter / 2;
            } else {
                sock++;
            }

        }
        return pairs;
    }

    public static void main(String[] args) {
        System.out.println(socks(10, new int[]{1, 1, 3, 1, 2, 1, 3, 3, 3, 3}));
    }
}


//  1, 1, 1, 2, 2, 3