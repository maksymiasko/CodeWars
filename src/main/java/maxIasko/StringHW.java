package maxIasko;

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
                builder.append(s).
                        append(", ");
            }

            return builder.append(s).toString();
        }

        return "";
    }
}


