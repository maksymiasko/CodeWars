package verafes;

import java.util.Random;

public class StringHW10_6 {
    /**
     * Task 6. Write a  method should return a string with a length of 10,
     * on even indexes should be even digits (ascending order)
     * on odd indexes should be letters (ascending order)
     */

    public static String generateStringOf10DigitsAndLetters() {
        int[] evenDigits = {0, 2, 4, 6, 8};
        char[] upperLetters = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
                'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T',
                'U', 'V', 'W', 'X', 'Y', 'Z'};
        char[] lowerLetters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
                'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't',
                'u', 'v', 'w', 'x', 'y', 'z'};
        Random random = new Random();
        StringBuilder strBuilder = new StringBuilder();

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                strBuilder.append(evenDigits[i / 2]);
            } else {
                if (random.nextBoolean()) {
                    strBuilder.append(upperLetters[i / 2]);
                } else {
                    strBuilder.append(lowerLetters[i / 2]);
                }
            }
        }

        return strBuilder.toString();
    }

}
