package java.leetcode.easy;

public class Solution69 {

    // 69. Sqrt(x)

    private int mySqrt(int x) {
        if (x < 2) return x;

        int left = (int)Math.pow(Math.E, 0.5 * Math.log(x));
        int right = left + 1;

        return (long)right * right > x ? left : right;
    }
}
