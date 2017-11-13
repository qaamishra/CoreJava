package problems.datastructureproblems;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Ashutosh Mishra on 8/10/2016.
 */
public class GivenIntArrayFindSumOfX {

    /*Given an array A[] and a number x, check for pair in A[] with sum as x
    * */

    public static void main(String[] args) {

        //int group[]={2,3,4,5,6,8,7};
        int group[] = {2, 5, 4, 7};
        int mySum = 9;
        printPairsUsingSet(group, mySum);


    }

    public static void printPairsUsingSet(int[] numbers, int n) {
        if (numbers.length < 2) {
            return;
        }
        Set set = new HashSet(numbers.length);

        for (int value : numbers) {
            int target = n - value;

            // if target number is not in set then add
            if (!set.contains(target)) {
                set.add(value);
            } else {
                //System.out.printf("(%d, %d) %n", value, target);
                System.out.println("(" + value + " , " + target + ")");
            }
        }
        //7 6 5 4 3 1 2
        //2,3,4,5,6,8,7
    }
}
