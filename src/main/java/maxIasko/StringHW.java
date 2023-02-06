package maxIasko;

import java.util.Arrays;
import static java.lang.Character.isDigit;

public class StringHW {

    // 1. Написать алгоритм StringToNumbers, который принимает строку, и возвращает массив чисел:
    // Test Data:“1, 2, 3, 4, 5” → {1, 2, 3, 4, 5}(Без форматирования и с форматированием)
    public static int[] stringToNumbers1(String s) {
        String[] stringArray = s.split(", ");
        int[] intArray = new int[stringArray.length];

        if (!s.trim().isEmpty()) {
            for (int i = 0; i < stringArray.length; i++) {
                intArray[i] = Integer.parseInt(stringArray[i]);
            }

            return intArray;
        }

        return new int[0];
    }

    public static int[] stringToNumbers2(String s) {
        return s.chars()
                .filter(Character::isDigit)
                .map(Character::getNumericValue)
                .toArray();
    }

    //    2. Написать 4 алгоритма StringToLetters, StringToLettersAndSpaces, StringToNumbers, StringToNumbersAndSpaces
    //    следуя примеру на сайте: https://allcalc.ru/node/2030
    //    Каждый алгоритм принимает строку, и удаляет ненужные символы:
    public static String stringToLetters(String s) {
        char[] allowedChar = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        char[] charArray = s.toCharArray();
        StringBuilder builder = new StringBuilder();
        if (!s.trim().isEmpty()) {
            for (int i = 0; i < charArray.length; i++) {
                for (int j = 0; j < allowedChar.length; j++) {
                    if (charArray[i] == allowedChar[j]) {
                        builder.append(charArray[i]);
                    }
                }
            }

            return builder.toString();
        }

        return "";
    }

    public static String stringToLettersAndSpaces(String s) {
        char[] allowedCharAndSpaces = " abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        char[] charArray = s.toCharArray();
        StringBuilder builder = new StringBuilder();
        if (!s.isEmpty()) {
            for (int i = 0; i < charArray.length; i++) {
                for (int j = 0; j < allowedCharAndSpaces.length; j++) {
                    if (charArray[i] == allowedCharAndSpaces[j]) {
                        builder.append(charArray[i]);
                    }
                }
            }

            return builder.toString();
        }

        return "";
    }

    public static String stringToNumbersAndSpaces(String s) {
        char[] charArray = s.toCharArray();
        StringBuilder builder = new StringBuilder();
        if (!s.isEmpty()) {
            for (int i = 0; i < charArray.length; i++) {
                if (isDigit(charArray[i]) || charArray[i] == ' ') {
                    builder.append(charArray[i]);
                }
            }

            return builder.toString();
        }

        return "";
    }

    //    3. Write a method that returns string argument n times separated by comma,
    //    and number of characters in new string “abc”, 5 → “abc, abc, abc, abc, abc”, 19
    public static String stringNTimes(String s, int repeat) {
        StringBuilder builder = new StringBuilder();
        if (!s.isEmpty() && repeat > 0) {
            for (int i = 1; i < repeat; i++) {
                builder.append(s).append(", ");
            }

            return builder.append(s).toString();
        }

        return "";
    }

    //   4.Find if the passed string is a natural number “1” → true “1.1” → false “a” → false "0123456789" → false
    public static boolean isNaturalNumber(String s) {
        if (s.trim().length() == 1) {

            return Character.isDigit(s.charAt(0));
        }

        return false;
    }

    //   5.	Write a method that takes a string and returns a string made of the last 3 characters
    //   and the first 3 characters of the passed string, if the argument string is longer than 5 characters
    //   or the method returns a string containing the first char repeated number of chars times
    public static String repeatCharacters(String s) {
        String s1 = stringToLetters(s);
        StringBuilder builder = new StringBuilder();
        if (!s.isEmpty() && s1.length() > 0) {
            if (s1.length() <= 6) {

                return builder.append(String.valueOf(s1.charAt(0)).repeat(s1.length())).toString();
            }

            return s1.substring(0, 3).concat(s1.substring(s1.length() - 3));
        }

        return "";
    }

    public static String isEven(int[] digitArray) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < digitArray.length; i++) {
            if (digitArray[i] % 2 == 0) {
                builder.append(digitArray[i]);
            }
        }

        return builder.toString();
    }

    //   6.	A method should return a string with a length of 10, on even indexes should
    //   be even digits (ascending order) on odd indexes should be letters (ascending order)
    public static String digitsAndLetters(String digit, String letter) {
        if (digit == null || digit.length() == 0 || letter == null || letter.length() == 0) return "";

        StringBuilder builder = new StringBuilder();

        char[] d = stringToLetters(letter).toCharArray();
        Arrays.sort(d);

        int[] n = (stringToNumbers1(digit));
        Arrays.sort(n);
        n = stringToNumbers2(isEven(n));

        if (n.length >= 5 && d.length >= 5) {
            for (int i = 0; i < 5; i++) {
                builder.append(d[i]).append(n[i]);
            }

            return builder.toString();
        }

        return "";
    }
}


