package java.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class Solution1431 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> b = new ArrayList();

        int max = candies[0];
        for (int i:candies) {
            max = Math.max(max,i);
        }
        for (int i: candies) {
            b.add(i + extraCandies >= max);
        }
        return b;
    }
}
