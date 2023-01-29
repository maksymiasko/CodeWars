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

}
