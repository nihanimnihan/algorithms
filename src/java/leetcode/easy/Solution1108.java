package java.leetcode.easy;

public class Solution1108 {

    public String defangIPaddr(String address) {

        StringBuilder sb = new StringBuilder();

        for(Character c: address.toCharArray()) {
            sb.append(c == '.' ? "[.]" : c);
        }
        return sb.toString();

    }
}
