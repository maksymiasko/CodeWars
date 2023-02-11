package natalliaOwl;

public class StringToNumbers_1 {

    /**
     * Написать алгоритм StringToNumbers, который принимает строку, и возвращает массив чисел:
     * Test Data:
     * “1, 2, 3, 4, 5” → {1, 2, 3, 4, 5}
     * (Без форматирования и с форматированием)
     */

    // С форматированием
    public static int[] convertStringToNumbers(String str) {

        if (str.trim() != null && !str.trim().isEmpty()) {

            String[] stringArray = str.split(", ");
            int[] numberArray = new int[stringArray.length];

            for (int i = 0; i < stringArray.length; i++) {
                    numberArray[i] = Integer.parseInt(stringArray[i]);
            }

            return numberArray;
        }

        return new int[]{};
    }


    // Без форматирования
    public int[] convertStringToNumbers_2(String str) {

        if (str != null && !str.trim().isEmpty()) {

            int length = 0;

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) >=48 && str.charAt(i) <= 57) {
                    length++;
                }
            }

            int[] numberArray = new int[length];
            int count = 0;

            for (int i = 0; i < str.length(); i++ ) {
                if (str.charAt(i) >=48 && str.charAt(i) <= 57) {
                    numberArray[count] = Character.getNumericValue(str.charAt(i));
                    count++;
                }
            }

            return numberArray;
        }

        return new int[]{};
    }
}
