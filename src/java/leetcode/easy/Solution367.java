package java.leetcode.easy;

public class Solution367 {

    // 367. Valid Perfect Square
    public boolean isPerfectSquare(int num) {
        if (num < 2) return true;

        long left = 2, right = num/2, piv = (left + right) / 2;

        while (left <= right) {

            if (piv * piv == num) {
                return true;
            }
            if (piv * piv > num) {
                right = piv - 1;
                piv = (left + right) / 2;
            } else if (piv * piv < num) {
                left = piv + 1;
                piv = (left + right) / 2;
            }
        }
        return false;
    }
}
