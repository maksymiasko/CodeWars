package verafes;

import java.util.stream.Stream;

/*
    https://www.codewars.com/kata/52761ee4cffbc69732000738/train/java
    Description
    Middle Earth is about to go to war. The forces of good will have many battles with the forces of evil.
    Different races will certainly be involved. Each race has a certain worth when battling against others.
    On the side of good we have the following races, with their associated worth:
        Hobbits: 1, Men: 2, Elves: 3, Dwarves: 3, Eagles: 4, Wizards: 10
    On the side of evil we have:
        Orcs: 1, Men: 2, Wargs: 2, Goblins: 2, Uruk Hai: 3, Trolls: 5, Wizards: 10
    Although weather, location, supplies and valor play a part in any battle, if you add up the worth of the side of good
    and compare it with the worth of the side of evil, the side with the larger worth will tend to win.
    Thus, given the count of each of the races on the side of good, followed by the count of each of the races
    on the side of evil, determine which side wins.
    Input:
    The function will be given two parameters. Each parameter will be a string of multiple integers separated
    by a single space. Each string will contain the count of each race on the side of good and evil.
    The first parameter will contain the count of each race on the side of good in the following order:
        Hobbits, Men, Elves, Dwarves, Eagles, Wizards.
    The second parameter will contain the count of each race on the side of evil in the following order:
        Orcs, Men, Wargs, Goblins, Uruk Hai, Trolls, Wizards.
    All values are non-negative integers.
    The resulting sum of the worth for each side will not exceed the limit of a 32-bit integer.
    Output:
    Return "Battle Result: Good triumphs over Evil" if good wins,
    "Battle Result: Evil eradicates all trace of Good" if evil wins,
    or "Battle Result: No victor on this battle field" if it ends in a tie.
     */
public class GoodVsEvil {

    public static String battle(String goodAmounts, String evilAmounts) {
        //races with their associated worth
        int[] goodWorth = {1, 2, 3, 3, 4, 10};
        int[] evilWorth = {1, 2, 2, 2, 3, 5, 10};

        // getting array of numbers from given String
        String[] goodArr = goodAmounts.split(" ");
        String[] evilArr = evilAmounts.split(" ");

        int sumGood = 0;
        int sumEvil = 0;

        // sum of the worth
        for (int i = 0; i < goodArr.length; i++) {
            sumGood += Integer.parseInt(goodArr[i]) * goodWorth[i];
        }
        for (int j = 0; j < evilArr.length; j++) {
            sumEvil += Integer.parseInt(evilArr[j]) * evilWorth[j];
        }

        if (sumGood > sumEvil) {

            return "Battle Result: Good triumphs over Evil";}

        else if (sumGood < sumEvil) {

            return "Battle Result: Evil eradicates all trace of Good";
        }

        else {

            return "Battle Result: No victor on this battle field";
        }
    }
}
