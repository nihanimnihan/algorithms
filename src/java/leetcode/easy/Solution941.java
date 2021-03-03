package java.leetcode.easy;

public class Solution941 {

    // 941. Valid Mountain Array
    public boolean validMountainArray(int[] arr) {

        if (arr == null || arr.length < 3) {
            return false;
        }
        boolean increasing = arr[1] > arr[0];
        if (!increasing) {
            return false;
        }
        for (int i = 1; i < arr.length; i ++) {
            if (arr[i] == arr[i-1]) {
                return false;
            }
            if (increasing) {
                if (arr[i] < arr[i-1]) {
                    increasing = false;
                }
            }
            else {
                if (arr[i] > arr[i-1]) {
                    return false;
                }
            }
        }
        return !increasing;
    }
}
