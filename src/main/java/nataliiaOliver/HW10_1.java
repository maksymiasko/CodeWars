package nataliiaOliver;

public class HW10_1 {

    /**
     * Написать алгоритм StringToNumbers, который принимает строку, и возвращает массив чисел:
     * Test Data:
     * “1, 2, 3, 4, 5” → {1, 2, 3, 4, 5}
     * (Без форматирования и с форматированием)
     */

    public int[] stringToNumbers(String str) {
        if (str != null
        && !str.isEmpty()
        && str.trim().length() > 0) {
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) > 47 && str.charAt(i) < 58) {
                    count++;
                }
            }

            int[] result = new int[count];
            count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) > 47 && str.charAt(i) < 58) {
                    result[count] = Integer.parseInt(Character.toString(str.charAt(i)));
                    count++;
                }
            }

            return result;
        }

        return new int[] {};
    }
}
