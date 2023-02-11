package nataliiaOliver;

public class HW10_4 {

    /**
     * Find if the passed string is a natural number
     * “1” → true
     * “1.1” → false
     * “a” → false
     * "0123456789" → false
     */

    public boolean isNaturalNumber_V1(String str) {
        if(str == null || str.length() == 0 || str.startsWith("0")) {

            return false;
        } else {
            for (char c : str.toCharArray()) {
                if (!Character.isDigit(c)) {

                    return false;
                }
            }
        }

        return true;
    }

    public boolean isNaturalNumber_V2(String str) {
        if (str == null || str.length() == 0 || str.startsWith("0")) {

            return false;
        }
        return str.chars().allMatch(Character::isDigit);
    }

    public boolean isNaturalNumber_V3(String str) {
        if (str == null || str.length() == 0 || str.startsWith("0")) {

            return false;
        }
        try {
            Integer.parseInt(str);

            return true;
        } catch (NumberFormatException exception) {

            return false;
        }
    }
}




