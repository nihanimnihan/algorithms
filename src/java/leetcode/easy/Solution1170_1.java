package java.leetcode.easy;

import java.util.Arrays;

public class Solution1170_1 {
    public static void main(String[] args) {
        String[] queries = new String[]{"bbb", "cc"};
        String[] words = new String []{"a","aa","aaa","aaaa"};
        System.out.println(Arrays.toString(numSmallerByFrequency(queries, words)));
    }
    public static int[] numSmallerByFrequency(String[] queries, String[] words) {
        int[] count = new int[12];
        for (String word : words) {
            int freq = helper(word);
            count[freq]++;
        }

        for (int i = count.length - 1; i > 0; i--) {
            count[i-1] += count[i];
        }

        int[] res = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int freq = helper(queries[i]);
            res[i] = count[freq + 1];
        }

        return res;
    }

    private static int helper(String word) {
        char smallest = word.charAt(0);
        int total = 0;
        for (int i = 0; i < word.length(); i++) {
            char cur = word.charAt(i);
            if (cur < smallest) {
                smallest = cur;
                total = 1;
            } else if (cur == smallest) {
                total++;
            } else {
                // continue
            }
        }

        return total;
    }
}
