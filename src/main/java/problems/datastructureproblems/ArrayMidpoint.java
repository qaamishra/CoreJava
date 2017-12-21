package problems.datastructureproblems;

//Program was asked in Pramati
//Find the element in the array such that the sum of right side element is equal to sum of left side element
//-3,3,8,-4,2,2 here the ans is 8 ,{-3+3}=0 and {-4+2+2}=0 and 8 is the midpoint whose sum at left is 0 and right is 0

import java.util.HashMap;
import java.util.Map;

public class ArrayMidpoint {
    static int values[] = {-3, 3, 8, -4, 2, 2};
    //static int values[] = {-3, 3,2,-2,8, -4, 2, 2};
    //static int values[] = {-3, 3,2,-2, 10,12,8, -4, 2, 2};


    static int SumOfGivenArray = 0;

    public static void main(String[] args) {

        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i] + " ");
            SumOfGivenArray += values[i];
        }
        System.out.println("\nSumOfGivenArray  " + SumOfGivenArray);

        findMidPoint(values);
    }

    public static void findMidPoint(int[] arr) {

        int sumOfLeftHalf = 0;
        int sumOfRightHalf = 0;
        Map<Integer, Integer> storeMidpoint = new HashMap<>();
        boolean minPointFound = false;
        for (int i = 1; i < arr.length - 1; i++) { // O(arr.length)
            sumOfLeftHalf += arr[i - 1];
            sumOfRightHalf = SumOfGivenArray - arr[i] - sumOfLeftHalf;
            if (sumOfRightHalf == sumOfLeftHalf) {
                storeMidpoint.put(arr[i], i);
                minPointFound = true;
            } else {
                if (storeMidpoint == null) {
                    minPointFound = false;
                }
            }
        }
        if (minPointFound) {
            System.out.println("Midpoints are {MidPoint=Positions}  " + storeMidpoint.toString());
        } else {
            System.out.println("No Midpoint found");
        }

    }
}





