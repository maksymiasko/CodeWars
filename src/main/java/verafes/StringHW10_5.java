package verafes;

public class StringHW10_5 {
    /* task 5. Write a method that returns a string made of the last 3 characters
    and the first 3 characters of the passed string, if the argument string is longer than 5 characters.
    Otherwise, the method returns a string containing the first char repeated number of chars times.
    */
    public String getLast3First3(String str) {
        if (str != null && !str.isEmpty()) {
            int n = str.length();
            if (n > 5) {

                return str.substring(str.length() - 3) + str.substring(0, 3);
            }

            return String.valueOf(str.charAt(0)).repeat(n);
        }

        return "String is null or empty";
    }
}
