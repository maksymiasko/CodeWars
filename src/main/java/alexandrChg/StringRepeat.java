package alexandrChg;

public class StringRepeat {

    public static String repeatStr(final int repeat, final String string) {
        StringBuilder sb = new StringBuilder("");

        for (int i = 1; i <= repeat; i++) {
            sb.append(string);
        }
        String retStr = sb.toString();

        return retStr;
    }
}
