package problems.datastructureproblems;

/*
 * Given a list of test scores (as integers), return the 'result' of the test.
The 'result' is defined as the length of the longest run of strictly increasing
scores, that is - the length of the longest connected block of numbers such that
each number in that block is strictly larger than the previous number.

You may assume that all values are integers.

For example:
-------------------------------
    Input:
    [1, 7, 2, 3, 5, 4, 6]

    Return:
    3

The increasing runs of scores are [1,7], [2, 3, 5], and [4, 6].
[2, 3, 5] is the longest of these, and has length 3, so we return 3
-------------------------------

-------------------------------
    Input:
    [1, 2, 3, 4]

    Return:
    4

The entire list is an increasing run, and has length 4.
-------------------------------

-------------------------------
    Input:
    [4, 3, 2, 1]

    Return:
    1

Each element is a run on its own, so we return 1.
 * 
 * */
public class ArrayInterval {


    public static void main(String[] args) {

        int[] a = {1, 7, 2, 3, 5, 4, 6, 3, 10, 11, 12, 13};
        //int [] a={4,3,2,1};
        //int [] a={1,2,3,4};

        System.out.println("int array length : " + a.length);
        //i,k will store index of array
        int i = 0;
        int k = 1;

        // head tail will help to store values
        int head = 0;
        int tail = 0;

        while (i < a.length - 1) {  //Execute the loop till end of array

            int count = 0;

            while (a[i] < a[k]) {//as we need to break when the k or next value is less.1,7, 2is less so break

                count++;//counting on length of interval
                if (count <= 1) { //thiskeyword will simply store 1st value as head for each interval

                    head = a[i];

                }

                tail = a[k];
                i = k;//as i started with 0,now making it to next index value i.e value of k
                k++; // and k index value as k++

                //below if will help to figure out that the array has ended.
                if (k >= a.length) { //This  will print last interval value only and exit as the length has been covered.

                    System.out.println(head + "," + tail);
                    System.out.println("\nfinal length of interval : " + (count + 1));
                    System.exit(0);
                }

            }


            System.out.println(head + "," + tail); //thiskeyword will keep on printing till last minus one interval.
            i = k;
            k++;
            System.out.println("final length of interval :" + (count + 1));

        }


    }
}
