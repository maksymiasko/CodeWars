package alexandrChg;

    /*
     * String repeat
     * https://www.codewars.com/kata/57a0e5c372292dd76d000d7e/train/java
     *
     * Write a function that accepts an integer n and a string s as parameters, and returns a string of s repeated exactly n times.
     */

public class StringRepeat {

    public static String repeatStr(final int repeat, final String string) {
        StringBuilder sb = new StringBuilder("");

        for (int i = 1; i <= repeat; i++) {
            sb.append(string);
        }
        String retStr = sb.toString();

        return retStr;
    }
}
