package maxIasko;

/*
https://www.codewars.com/kata/54edbc7200b811e956000556/train/java
Consider an array/list of sheep where some sheep may be missing from their place.
We need a function that counts the number of sheep present in the array (true means present).
 */
public class CounterSheep {

    public int countSheeps(Boolean[] arrayOfSheeps) {
        int sheeps = 0;
        if (arrayOfSheeps != null) {
            for (int i = 0; i < arrayOfSheeps.length; i++) {
                if (arrayOfSheeps[i]) {
                    sheeps++;
                }
            }
        }
        return sheeps;
    }
}

