package alexandrChg;

    /* 8kyu
     * https://www.codewars.com/kata/582cb0224e56e068d800003c/train/java
     *
     * Nathan loves cycling.
     * Because Nathan knows it is important to stay hydrated, he drinks 0.5 litres of water per hour of cycling.
     * You get given the time in hours and you need to return the number of litres Nathan will drink, rounded to the smallest value.
     */

public class KeepHydrated  {

    public int Liters(double time)  {

        return (int) (time / 2);
    }
}
