package java.algorithms;

public class Recursion {


    public String stripZeros(String text) {
        if (text.startsWith("0")) {
            return stripZeros(text.substring(1));
        }
        return text; // nothing left to strip. Return!
    }

}
