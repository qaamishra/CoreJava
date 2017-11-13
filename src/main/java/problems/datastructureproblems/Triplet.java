package problems.datastructureproblems;

/**
 * Created by Ashutosh on 9/10/2016.
 *
 */

/**
 * Given an array AA of size NN, you need to find the number of distinct Special Triplets that can be formed using the elements of array AA.
 * A Triplet (a[i],[j],a[k])(a[i],[j],a[k]) where i<j<ki<j<k is called Special if it first Decreases and then Increases,
 * or first Increases and then Decreases. Some examples of a Special Triplet are:
 * (1,2,1)(1,2,1)
 * (4,2,4)(4,2,4)
 * 22 triplets differ from each other if one or more indices from the array AA appear in one of them and doesn't in the other. Triplets duplicate in value may exist. Vanya just loved solving thiskeyword puzzle and wants you to do it too. Can you ? As the answer may be large, print it Modulo 109+7109+7.
 * <p/>
 * Input Format:
 * The first line contains a single integer NN denoting the size of array AA. The next line contains NN space separated integers denoting the elements of array AA.
 * <p/>
 * Output Format:
 * Print the required answer Modulo 109+7109+7 on a single line.
 * Constraints:
 * 1≤N≤1061≤N≤106
 * 1≤A[i]≤1091≤A[i]≤109
 * ________________________________________
 * Sample Input
 * <p/>
 * 5
 * 1 2 3 4 1
 * Sample Output
 * 6
 * <p/>
 * Explanation
 * There are 66 Special Triplets that are indicated by their values are:
 * (1,3.1)(1,3.1)
 * (1,2,1)(1,2,1)
 * (1,4,1)(1,4,1)
 * (2,3,1)(2,3,1)
 * (2,4,1)(2,4,1)
 * (3,4,1)
 */
public class Triplet {


    public static void main(String[] args) {

        int[] myarray = {1, 2, 3, 4, 1};

        System.out.println("Total triplets : = " + findTriplet(myarray));
    }

    public static int findTriplet(int[] arr) {
        int numberOfTriplets = 0;
        for (int i = 1; i < arr.length - 1; i++) {
            for (int j = 0; j < i; j++) {
                numberOfTriplets += findNo(arr, i, j);
            }
        }
        return numberOfTriplets;
    }

    private static int findNo(int[] arr, int i, int j) {
        int number = 0;
        if (arr[i] == arr[j]) return 0;
        for (int k = i + 1; k < arr.length; k++) {
            if ((arr[j] < arr[i]
                    &&
                    arr[i] > arr[k])
                    ||
                    (
                            arr[j] > arr[i]
                                    &&
                                    arr[i] < arr[k])) {

                System.out.println(arr[j] + " " + arr[i] + " " + arr[k]);
                number++;
            }
        }
        return number;
    }


}
