package java.leetcode.easy;

public class Solution1184 {

    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int distance1 = 0;
        int total = 0;
        if (start <= destination) {
            for (int i = start; i < destination; i ++) {
                distance1 += distance[i];
            }
        } else {
            for (int i = destination; i < start; i ++) {
                distance1 += distance[i];
            }
        }

        for (int i : distance) {
            total += i;
        }

        return Math.min(distance1, total-distance1);

    }
}
