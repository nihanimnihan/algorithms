package java.leetcode.easy;

import java.util.Arrays;

public class Solution1170_2 {

    public int[] numSmallerByFrequency(String[] queries, String[] words) {

        int[] result = new int[queries.length];

        int[] q = new int[queries.length];
        int[] w = new int[words.length];

        for (int i = 0; i < q.length; i++) {
            q[i] = findFrequency(queries[i]);
        }
        for (int i = 0; i < w.length; i++) {
            w[i] = findFrequency(words[i]);
        }
        Arrays.sort(w);

        for (int i = 0; i < q.length; i++) {
            int cnt = 0;
            for (int j = 0; j < w.length; j++) {
                if (q[i] < w[j]) {
                    cnt++;
                }
            }
            result[i] = cnt;
        }

        return result;
    }

    private int findFrequency(String s) {
        int count = 1;
        char[] c = s.toCharArray();
        char smallest = s.charAt(0);
        //Arrays.sort(c);
        for (int i = 1; i< s.length(); i++) {
            char cur = s.charAt(i);
            if (cur < smallest) {
                smallest = s.charAt(i);
                count = 1;
            } else if (cur == smallest){
                count++;
            }
        }
        return count;

    }
}
