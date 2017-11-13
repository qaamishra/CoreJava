package problems.datastructureproblems;

/**
 * Created by Ashutosh on 9/11/2016.
 */
public class FindPairWhoseSumIsEqualToK {

    public static void main(String[] args) {

        int[] myInts = {1, 5, 2, 6, 3, 4, 5, 8, 9, 2};
        int sum = 4;

        findPairs(myInts, sum);
    }

    private static void findPairs(int[] myInts, int sum) {

        for (int i = 0; i < myInts.length - 1; i++) {

            //int i being the first cursor starts from array[0] iterate till length-1
            //int j being th e second cursor starts from array[j] iterate till length
            for (int j = i + 1; j < myInts.length; j++) {

                int calSum = myInts[i] + myInts[j];
                if (calSum == sum) {

                    System.out.println("{ " + myInts[i] + " , " + myInts[j] + " }");
                }

            }

        }


    }

}
