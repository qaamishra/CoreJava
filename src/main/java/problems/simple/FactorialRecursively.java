package problems.simple;

import java.util.Scanner;


/*
 * Logic : suppose u gave number as 5. I will set that as max and start with i=1 till i=5.
 * and then keep on multiplying with next incremented number till maz is reached.
 * num=5 (we need faactorial of 5)
 * i=1x2x3x4x5 will take place.
 * 
 * */
public class FactorialRecursively {

    private static Scanner scanner;


    public int factorial(int n) {
        // base cases: fact of 0 is 1
        if (n == 0)
            return 1;
            // recursive case: multiply n by (n-1) factorial
        else
            return n * factorial(n - 1);
    }


    public static void main(String[] args) {

        scanner = new Scanner(System.in);

        System.out.println("Enter a number to find factorial of it :");

        int num = scanner.nextInt();

        FactorialRecursively se = new FactorialRecursively();
        int factorilaResult = se.factorial(num);
        System.out.println("factorilaResult " + factorilaResult);
    }
}
