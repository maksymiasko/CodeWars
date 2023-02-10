package nataliiaOliver;

public class HW10_3 {

    /**
     * Write a method that returns string argument n times separated by comma, and number of characters in new string
     * (without spaces)
     * “abc”, 5 → “abc, abc, abc, abc, abc”, 19
     */

    public String stringRepeatNTimes(String str, int n) {
        final StringBuilder sb = new StringBuilder();
        if (str != null
                && !str.isEmpty()
                && str.trim().length() > 0 && n > 0) {

            for (int i = 0; i < n; i++) {
                sb.append(str).append(", ");

            }

            return sb.toString()
                    + sb.substring(0, sb.toString().length() - 2).replace(" ", "").length();
        }

        return "";
    }
}
