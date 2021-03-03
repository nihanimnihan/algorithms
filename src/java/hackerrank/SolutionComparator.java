package java.hackerrank;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class SolutionComparator {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();

        studentList.sort(Comparator.comparing(Student::getGrade).reversed().thenComparing(Student::getGrade));
        System.out.println(studentList);

    }

    static class Student {
        private String name;
        private int grade;

       public int getGrade() {
           return grade;
       };
    }
}
