package verafes;

public class StringHW10_3 {

    /* HomeWork10. String methods
    * Task 3. Write a method that returns string argument n times
    * separated by comma, and number of characters in new string (without spaces)
    * Test data: “abc”, 5 → “abc, abc, abc, abc, abc”, 19
     */
    public String StringNTimes (String str, int n) {

        if (!str.trim().isEmpty() && !str.trim().isBlank()) {
            if (n > 0) {
                String myStr = (str.trim() + ", ").repeat(n);

                return myStr + myStr.substring(0, myStr.length() - 2)
                        .replace(" ", "")
                        .length();
            }

            return "Number cannot be 0 or negative";
        }

        return "String is empty or blank";
    }
}
