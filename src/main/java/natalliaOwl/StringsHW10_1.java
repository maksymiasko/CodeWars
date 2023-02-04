package natalliaOwl;

public class StringsHW10_1 {

    /**
     * Написать алгоритм StringToNumbers, который принимает строку, и возвращает массив чисел:
     * Test Data:
     * “1, 2, 3, 4, 5” → {1, 2, 3, 4, 5}
     * (Без форматирования и с форматированием)
     */

    public static int[] convertStringToNumbers(String str) {

        if (str.trim() != null && !str.trim().isEmpty()) {

            String[] stringArray = str.split(", ");
            int[] numberArray = new int[stringArray.length];

            for (int i = 0; i < stringArray.length; i++){
                numberArray[i] = Integer.parseInt(stringArray[i]);
            }

            return numberArray;
        }

        return new int[]{};
    }
}
