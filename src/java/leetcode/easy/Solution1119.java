package java.leetcode.easy;

public class Solution1119 {

    public String removeVowels(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c: s.toCharArray()) {
            if ("aeuoi".indexOf(c) == -1) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
