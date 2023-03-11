package verafes;

public class ReversedStrings {
    /** Reversed Strings 8kyu
     * https://www.codewars.com/kata/5168bb5dfe9a00b126000018/train/java
     * Complete the solution so that it reverses the string passed into it.
     * 'world'  =>  'dlrow'
     * 'word'   =>  'drow'
     */
    public static String reversedString(String str) {
        String resStr = "";
        char ch;
        for (int i=str.length()-1; i>=0; i--){
            ch = str.charAt(i);
            resStr += ch;
        }
        return resStr;
    }
}
