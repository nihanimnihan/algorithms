package java.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class Solution1 {

    public int[] twoSum(int[] nums, int target) {

        int[] output = {0, 0};
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i< nums.length; i++) {
            if (map.containsKey(target-nums[i])) {
                output[0] = map.get(target-nums[i]);
                output[1] = i;
            }
            map.put(nums[i], i);
        }
        return output;
    }
}
