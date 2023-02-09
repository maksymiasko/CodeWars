package nataliiaOliver;

public class HW10_2 {

    /**
     * Написать 4 алгоритма StringToLetters, StringToLettersAndSpaces, StringToNumbers,
     * StringToNumbersAndSpaces следуя примеру на сайте: https://allcalc.ru/node/2030
     * Каждый алгоритм принимает строку,  и удаляет ненужные символы:
     */

    /*
    HW10_2_1 StingToLetters
     */

    public String StringToLetters(String str) {
        String result = "";
        if (str != null
                && !str.isEmpty()
                && str.trim().length() > 0) {
            for (int i =0; i < str.length(); i++) {
                if (str.charAt(i) >= 65 && str.charAt(i) <= 90
                        || str.charAt(i) >= 97 && str.charAt(i) <= 122) {
                    result = result + str.charAt(i);
                }
            }
        }

        return result;
    }

    /*
    HW10_2_2 StingToLettersAndSpaces
     */

    public String StringToLettersAndSpaces(String str) {
        String result = "";
        if (str != null
                && !str.isEmpty()
                && str.trim().length() > 0) {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) >= 65 && str.charAt(i) <= 90
                        || str.charAt(i) >= 97 && str.charAt(i) <= 122
                        || str.charAt(i) == 32) {
                    result = result + str.charAt(i);
                }
            }
        }

        return result;
    }

    /*
    HW10_2_3 StingToNumbers
     */

    public String StringToNumbers_V1(String str) {
        String result = "";
        if (str != null
                && !str.isEmpty()
                && str.trim().length() > 0) {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) > 47 && str.charAt(i) < 58) {
                    result = result + str.charAt(i);
                }
            }
        }

        return result;
    }

    public String StringToNumbers_V2(String str) {
        String result = "";
        if (str != null
                && !str.isEmpty()
                && str.trim().length() > 0) {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '1' || str.charAt(i) == '2'
                        || str.charAt(i) == '3' || str.charAt(i) == '4'
                        || str.charAt(i) == '5' || str.charAt(i) == '6'
                        || str.charAt(i) == '7' || str.charAt(i) == '8'
                        || str.charAt(i) == '9' || str.charAt(i) == '0') {
                    result = result + str.charAt(i);
                }
            }
        }

        return result;
    }

    /*
    HW10_2_4 StingToNumbersAndSpaces
     */

    public String StringToNumbersAndSpaces_V1(String str) {
        String result = "";
        if (str != null
                && !str.isEmpty()
                && str.trim().length() > 0) {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) > 47
                        && str.charAt(i) < 58
                        || str.charAt(i) == 32) {
                    result = result + str.charAt(i);
                }
            }
        }

        return result;
    }

    public String StringToNumbersAndSpaces_V2(String str) {
        String result = "";
        if (str != null
                && !str.isEmpty()
                && str.trim().length() > 0) {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '1' || str.charAt(i) == '2'
                        || str.charAt(i) == '3' || str.charAt(i) == '4'
                        || str.charAt(i) == '5' || str.charAt(i) == '6'
                        || str.charAt(i) == '7' || str.charAt(i) == '8'
                        || str.charAt(i) == '9' || str.charAt(i) == '0'
                        || str.charAt(i) == ' ') {
                    result = result + str.charAt(i);
                }
            }
        }

        return result;
    }
}
