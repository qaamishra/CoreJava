package problems.datastructureproblems;

/**
 * Created by Ashutosh on 9/11/2016.
 */

//find the missing numbers in an array which is in order
public class FindMissingNumbers {

    public static void main(String[] args) {

        int[] myArray = {5, 9, 10, 11, 12, 13, 16};
        findMissingNumbers(myArray);

    }


    static void findMissingNumbers(int[] myArray) {

        // I want to iterate all the int array once..so iterate till length
        for (int i = 0; i < myArray.length - 1; i++) {

            //int i being the first cursor to point the int array which starts from 0
            //int j being the second cursor which starts from i+1.
            int j = i + 1;
            //myArray={5,9,10,11,12,13,16};
            //  pos   {0,1,2,3,4,5,6,7,8}
            //NextValid should be value in array[0] lets say 5 +1 ,array[0]+1
            //And thiskeyword Next valid should match with array[1]
            int nextValid = myArray[i] + 1;

            if (myArray[j] == nextValid) {

                //do nothing
            }
            //if it does not match with array[1] ,print all the values in between
            else {
                for (int printValues = nextValid; printValues < myArray[j]; printValues++) {

                    System.out.println("missing value " + printValues);

                }


            }


        }

    }
}
