package problems.simple;

import java.util.Scanner;


/*
 * Logic : suppose u gave number as 5. I will set that as max and start with i=1 till i=5.
 * and then keep on multiplying with next incremented number till maz is reached.
 * num=5 (we need faactorial of 5)
 * i=1x2x3x4x5 will take place.
 * 
 * */
public class Factorial {

    private static Scanner scanner;

    public void factorial(int num) {
        int i = 1;
        int result = 1;
        while (i <= num) {
            result = result * i;
            i++;
        }

        System.out.println("The factorial is " + result);

    }

    public static void main(String[] args) {

        scanner = new Scanner(System.in);

        System.out.println("Enter a number to find factorial of it :");

        int num = scanner.nextInt();

        Factorial se = new Factorial();
        se.factorial(num);

    }
}
