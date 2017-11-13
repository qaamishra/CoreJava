package problems.datastructureproblems;

import java.util.Scanner;

/**
 * Created by Ashutosh on 10/18/2016.
 */
public class FizzBuzz {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int start = s.nextInt();
        int end = s.nextInt();
        findfix(start, end);
    }

    private static void findfix(int start, int end) {

        for (int i = start; i <= end; i++) {


            if (String.valueOf(i).length() > 1) {

                String val = String.valueOf(i);
                int c1 = Character.getNumericValue(val.charAt(0));
                int c2 = Character.getNumericValue(val.charAt(1));

                if (c1 == c2) {
                }
            }
        }
    }
}