package java.hackerrank;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;

public class SolutionBigDecimal {

    public static void main(String[] args) {
        String[] s = {};
        Arrays.sort(s, new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                if (o1 == null || o2 == null) {
                    return 0;
                }
                BigDecimal bdO1 = new BigDecimal(o1);
                BigDecimal bdO2 = new BigDecimal(o2);
                return bdO1.compareTo(bdO2);
            }
        });
    }
}
