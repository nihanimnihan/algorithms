package java.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SolutionArray1DPart2List {

    public static boolean canWin(int leap, int[] game) {
        return isSolvable(leap, game, 0);
    }
    private static boolean isSolvable(int m, int[] arr, int i) {
        if (i < 0 || arr[i] == 1) return false;
        if ((i == arr.length - 1) || i + m > arr.length - 1) return true;

        arr[i] = 1;
        return isSolvable(m, arr, i + 1) || isSolvable(m, arr, i - 1) || isSolvable(m, arr, i + m);
    }

    public static void main(String[] args) {
        System.out.println( (canWin(4, new int [] {0,0,0,1,1,1})) ? "YES" : "NO" );

    }
}
