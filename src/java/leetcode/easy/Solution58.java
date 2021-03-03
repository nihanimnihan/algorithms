package java.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

public class Solution58 {

    // 58. Length of Last Word
    public static void main(String[] args) {

        String s = "a ";

        System.out.println(s.trim().length() - s.trim().lastIndexOf(" ") - 1);

        Set<Character> set = new HashSet<>();

        for(char c: s.toCharArray()) {
            if (set.contains(c)) {
                set.remove(c);
            } else {
                set.add(c);
            }
        }
        System.out.println(set.size());
    }
}
