package anastasiayy;

public class CW_SimpleStringCharacters {

    public static int[] Solve(String word) {

        if (!word.isEmpty()) {

            char[] charArray = word.toCharArray();
            int countUpperCase = 0;
            int countLowerCase = 0;
            int countNumbers = 0;
            int countSpecial = 0;

            for (char c : charArray) {
                if (c >= 65 && c <= 90) {
                    countUpperCase++;
                } else if (c >= 97 && c <= 122) {
                    countLowerCase++;
                } else if (c >= 48 && c <= 57) {
                    countNumbers++;
                } else {
                    countSpecial++;
                }
            }

            return new int[]{countUpperCase, countLowerCase, countNumbers, countSpecial};
        }

        return new int[]{};
    }
}
