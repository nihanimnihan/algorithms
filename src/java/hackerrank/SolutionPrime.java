package java.hackerrank;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

public class SolutionPrime {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        BigInteger number = scanner.nextBigInteger();
        System.out.println(number.isProbablePrime(100) ? "prime" : "not prime");
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
