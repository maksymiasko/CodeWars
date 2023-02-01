package alexandrChg;

    /*
     * Beginner Series #2 Clock
     * https://www.codewars.com/kata/55f9bca8ecaa9eac7100004a/train/java
     *
     * Clock shows h hours, m minutes and s seconds after midnight.
     * Your task is to write a function which returns the time since midnight in milliseconds.
     */

public class BeginnerSeries2Clock {

    public static int Past(int h, int m, int s) {
        int hToMs = h * 60 * 60 * 1000;
        int mToMs = m * 60 * 1000;
        int sToMs = s * 1000;

        return (hToMs + mToMs + sToMs);
    }
}
