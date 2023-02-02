package AnzhelikaBaa;

public class StringHw {
    /**
     * 10.1 Написать алгоритм StringToNumbers, который принимает строку, и возвращает массив чисел:
     * Test Data: “1, 2, 3, 4, 5” → {1, 2, 3, 4, 5} (Без форматирования и с форматированием)
     */

    public static int[] stringToNumbers(String a) {

        String[] stringArray = a.split(", ");

        int[] arr = new int[stringArray.length];

        if (!a.trim().isEmpty() && !a.trim().isBlank()) {

            for (int i = 0; i < stringArray.length; i++) {

                arr[i] = Integer.parseInt(stringArray[i]);
            }

            return arr;
        }

        return new int[]{};
    }

    public static int[] stringToNumbers2(String a) {

        int[] numArr = a.chars()
                .filter(Character::isDigit)
                .map(Character::getNumericValue)
                .toArray();

        return numArr;
    }

    /** 2.
     * Написать 4 алгоритма StringToLetters, StringToLettersAndSpaces, StringToNumbers,
     * StringToNumbersAndSpaces следуя примеру на сайте: https://allcalc.ru/node/2030
     * Каждый алгоритм принимает строку,  и удаляет ненужные символы:
     */

    public static String StringToLetters(String str) {
        char[] charArray = str.toCharArray();
        StringBuilder builder = new StringBuilder();

        if (!str.trim().isEmpty()) {
            for (int i = 0; i < charArray.length; i++) {
                char ch = charArray[i];
                if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                    builder.append(ch);
                }
            }

            return builder.toString();
        }

        return "";
    }

    public static String StringToLettersAndSpaces(String str) {
        char[] charArray = str.toCharArray();
        StringBuilder builder = new StringBuilder();

        if (!str.isEmpty()) {
            for (int i = 0; i < charArray.length; i++) {
                char ch = charArray[i];
                if ((Character.isLetter(str.charAt(i))) || (str.charAt(i) == ' ')) {
                    builder.append(ch);
                }
            }

            return builder.toString();
        }

        return "";
    }
}


