package maxIasko;

/*
https://www.codewars.com/kata/5b077ebdaf15be5c7f000077/train/java
Given a non-negative integer, 3 for example, return a string with a murmur: "1 sheep...2 sheep...3 sheep...".
Input will always be valid, i.e. no negative integers
    return IntStream.rangeClosed(1,num)
            .mapToObj(i->i+" sheep...")
            .collect(Collectors.joining());
 */
public class CountSheepNotSleep {

    public static String countingSheep(int num) {
        //Add your code here
        String out = "";
        for (int i = 1; i <= num; i++) {
            out += i + " sheep...";
        }
        return out;
    }
}

