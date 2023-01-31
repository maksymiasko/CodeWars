package verafes;

import java.util.Arrays;

public class StringMethods2 {

    /*   Homework 10 - the second homework on strings
    *    1. Написать алгоритм StringMethods, который принимает строку, и возвращает массив чисел:
    *    Test Data: “1, 2, 3, 4, 5” → {1, 2, 3, 4, 5} */

    // 1.1. algorithm for converting numeric string (which contains numbers only),
    // but doesn't work with alphanumeric strings
    public static int[] stringToNumbersArray(String str) {

        if (!str.trim().isEmpty() && !str.trim().isBlank()) {

            String[] strArr = str.replace(",", " ")
                    .replace("  ", " ")
                    .split(" ");
            System.out.println(Arrays.toString(strArr));
            int[] numArr = new int[strArr.length];

            for (int i = 0; i < strArr.length; i++) {
                try {
                    numArr[i] = Integer.parseInt(strArr[i]);
                } catch (NumberFormatException e) {
                    System.out.println("not number");;
                }
            }

            return numArr;
        }

        return new int[]{-1};
    }

    // 1.2. algorithm for converting string with one-digit numbers only
    public int[] stringToNumsArray (String str) {


        int[] numArr = str.chars()
                .filter(Character::isDigit)
                .map(Character::getNumericValue)
                .toArray();

        return numArr;
    }

    /* 2. Написать 4 алгоритма StringToLetters, StringToLettersAndSpaces, StringToNumbers, StringToNumbersAndSpaces
     * следуя примеру на сайте: https://allcalc.ru/node/2030
     * Каждый алгоритм принимает строку,  и удаляет ненужные символы:  */

    // 2.1. algorithm for filtering letters only in string
    public String StringToLetters (String str) {

        if (!str.isEmpty()) {

            return str.replaceAll("[^a-zA-Z]", "");
        }

        return "String is empty";
    }

    // 2.2. algorithm for filtering letters and spaces in string
    public String StringToLettersWithSpaces (String str) {

        if (!str.isEmpty()) {

            return str.replaceAll("[^a-zA-Z ]", "");
        }

        return "String is empty or blank";
    }

    // 2.3. algorithm for filtering numbers only in string
    public String StringToNumbers (String str) {

        if (!str.isEmpty()) {
            return str.replaceAll("[^\\d]", "");
        }

        return "String is empty or blank";
    }

    // 2.4. algorithm for filtering numbers and spaces in string
    public String StringToNumbersWithSpaces (String str) {

        if (!str.isEmpty()) {

            return str.replaceAll("[^0-9 ]", "");
        }

        return "String is empty";
    }
}
