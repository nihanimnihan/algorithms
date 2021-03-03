package java.leetcode.easy;

public class Solution1672 {
    public int maximumWealth(int[][] accounts) {

        int max = 0;
        for (int[] account: accounts) {
            int total = 0;
            for (int acc: account) {
                total += acc;
            }
            max = Math.max(max, total);
        }
        return max;
    }
}
