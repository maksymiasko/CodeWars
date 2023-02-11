package verafes;

public class StringHW10_4 {

    /* 4. Algorithm checks if the passed string is a natural number. For example,
    *  “1” → true
    *  “1.1” → false
    *  “a” → false
    *  "0123456789" → false
    * */

    public boolean isNaturalNumber(String str) {
        if (str != null && !str.isEmpty()) {

            if (!str.startsWith("0")) {

                for (int i = 0; i < str.length(); i++) {
                    if (!Character.isDigit(str.charAt(i))) {

                        return false;
                    }
                }

                return true;
            }
        }

        return false;
    }
}
