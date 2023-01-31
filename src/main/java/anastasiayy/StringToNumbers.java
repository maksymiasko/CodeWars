package anastasiayy;

public class StringToNumbers {

    /**
     * Написать алгоритм StringToNumbers, который принимает строку, и возвращает массив чисел:
     * Test Data:
     * “1, 2, 3, 4, 5” → {1, 2, 3, 4, 5}
     * (Без форматирования и с форматированием)
     */

    public static int[] convertStringToNumbers(String text) {

        if (text != null && !text.trim().isEmpty()) {

            String[] arr = text.split(", ");

            int[] intArray = new int[arr.length];

            for (int i = 0; i < arr.length; i++) {
                intArray[i] = Integer.parseInt(arr[i]);
            }

            return intArray;
        }

        return new int[]{};
    }
}
