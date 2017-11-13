package problems.datastructureproblems;

/**
 * Created by Ashutosh on 12-11-2017.
 */

/**
 * The goal is to check whether array A can be sorted into increasing order by performing at most swap operation
 * for ex
 * A[0]=1
 * A[1]=5
 * A[2]=3
 * A[3]=3
 * A[4]=7
 * <p/>
 * After exchanging the values A[1] and A[3] we obtain and array [1,3,3,5,7] which is sorted in increasing order
 * <p/>
 * If array is already sorted the function should return true
 */
public class TellIfArrayCanBeSortedInOneSwap {

    public static void main(String[] args) {
        //int[] A={1,3,5,3,4};
        int[] A={1,5,3,3,7};

        System.out.println(function(A));
    }
    private static boolean function(int[] data) {

        //Find the biggest number and also its index
        int max = data[0], maxIndex = 0;

        //find the maximum element in the array with index
        for (int i = 0; i < data.length; i++) {
            if (data[i] > max) {
                max = data[i];
                maxIndex = i;
            }
        }

        //check whether all the elements before max are less than it
        // if not you need more swaps to sort so simply return false
        for (int j = 0; j < maxIndex; j++) {
            if (data[j] > max)
                return false;
        }


        //check what is next smallest element from the maxIndex + 1 position
        for (int j = maxIndex + 1; j < data.length - 1; j++) {
            //(max > data[j]) compare the max with its immediate next value and Maz should be bigger
            //data[j + 1] < data[j] Second next[j+1] is less than the next of max then
            //If any of the above become true return false !
            if (!(max > data[j] && data[j + 1] < data[j]))
                return false;
        }

        return true;
    }
}
