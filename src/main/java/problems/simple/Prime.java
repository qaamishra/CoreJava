package problems.simple;

import java.util.Scanner;

/**
 * Prime number in Java: Prime number is a number that is greater than 1 and divided by 1 or itself.
 * Prime numbers can't be divided by other numbers than itself or 1.
 * For example 2, 3, 5, 7, 11, 13, 17.... are the prime numbers.
 * Note: 0 and 1 are not prime numbers.
 * The 2 is the only even prime number because all the other even numbers can be divided by 2.
 */
public class Prime {
//num should be divisible by 1 and itself

    private static Scanner scanner;

    public static void main(String[] args) {

        scanner = new Scanner(System.in);
        System.out.println("enter a no 2 check if it is prime or not");
        int num = scanner.nextInt();
        int flag = 0;

        for (int d = 2; d < num; d++) {
            if (num % d == 0) {
                flag = 1;
                break;


            }

        }
        if (flag == 0)
            System.out.println("prime no");
        else
            System.out.println("not prime");


    }


}
