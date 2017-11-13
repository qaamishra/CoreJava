package problems.datastructureproblems;

/*
 * Given a list of integers, print the largest and second largest elements.

You may assume that all values are integers.
Treat each element as distinct, duplicate values are not merged.
If there are not enough elements to calculate a value, print "?"
for each such value.

For example:
-------------------------------
    Input:
    [1, 2, 3]

    Output:
    3
    2
-------------------------------

-------------------------------
    Input:
    [1]

    Output:
    1
    ?
-------------------------------
 * 
 * 
 * 
 * /*Complete the function below.*/
 

  /*  static void func(int[] items) {

        int largest = 0;
        int secondlargest = 0;
        int[] newStoreItem=items;
        if (newStoreItem.length==1){
            secondlargest=newStoreItem[0];
             System.out.println(secondlargest);
             System.out.println("?");   
            System.exit(0);
            
        }
        
        int arr[] = new int[newStoreItem.length];
        
         for (int i = 0; i < arr.length; i++) {
            arr[i] = items[i];
             
             
             
            if (largest < arr[i]) {
                secondlargest = largest;
                largest = arr[i];
            }
            if (secondlargest < arr[i] && largest != arr[i])
                secondlargest = arr[i];
        }
        System.out.println(largest);
        System.out.println(secondlargest);

    }
 */

import java.util.Scanner;

class SecondLargest {
    public static void main(String[] args) {
        int secondlargest = 0;
        int largest = 0;
        Scanner items = new Scanner(System.in);
        System.out.println("Enter array values: ");
        int arr[] = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = items.nextInt();
            if (largest < arr[i]) {
                secondlargest = largest;
                largest = arr[i];
            }
            if (secondlargest < arr[i] && largest != arr[i])
                secondlargest = arr[i];
        }
        System.out.println("Second Largest number is: " + secondlargest);
        System.exit(0);
    }
}