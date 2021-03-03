package java.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class Solution1512 {

    class Solution {

        public int numIdenticalPairs(int[] nums) {
            int goodPairs = 0;

            Map<Integer, Integer> map = new HashMap<>();

            for (int i: nums) {
                if (map.containsKey(i)) {
                    map.put(i, map.get(i) + 1);
                } else {
                    map.put(i ,1);
                }
            }
            for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
                goodPairs += (entry.getValue() * (entry.getValue()-1)) / 2;
            }

            return goodPairs;
        }
    }
}
