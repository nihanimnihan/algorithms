package java.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

public class Solution771 {

    public int numJewelsInStones(String jewels, String stones) {

        int result = 0;
        HashSet<Character> jewelSet = new HashSet<>();
        for (char c: jewels.toCharArray()) {
            jewelSet.add(c);
        }
        for (char c: stones.toCharArray()) {
            if (jewelSet.contains(c)) {
                result ++;
            }
        }
        return result;
    }
}
