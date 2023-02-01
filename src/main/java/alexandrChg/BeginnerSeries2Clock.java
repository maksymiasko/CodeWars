package alexandrChg;

public class BeginnerSeries2Clock {

    public static int Past(int h, int m, int s) {
        int hToMs = h * 60 * 60 * 1000;
        int mToMs = m * 60 * 1000;
        int sToMs = s * 1000;

        return (hToMs + mToMs + sToMs);
    }
}
