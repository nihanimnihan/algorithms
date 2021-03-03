package java.hackerrank;

import java.util.Scanner;

public class SolutionRegularExpressionUserName {


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }

    private static class MyRegex {
        String pattern = "^[a-zA-Z](\\w){7,29}";
    }
}
