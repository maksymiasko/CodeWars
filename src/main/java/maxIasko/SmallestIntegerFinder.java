package maxIasko;

/*
https://www.codewars.com/kata/55a2d7ebe362935a210000b2/train/java
Given an array of integers your solution should find the smallest integer.
return IntStream.of(args).min().getAsInt();
 */
public class SmallestIntegerFinder {

    public static int findSmallestInt(int[] args) {

        int min = args[0];
        for (int i = 1; i < args.length; i++) {
            if (args[i] < min) {
                min = args[i];
            }
        }
        return min;
    }
}
