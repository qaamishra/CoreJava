package problems.simple;

import java.util.Scanner;

public class LoopPerfect {


    private static Scanner scanner;

    public static void main(String[] args) {

        scanner = new Scanner(System.in);
        System.out.println("Enter a range to list perfect numbers :");
        int range = scanner.nextInt();
        //Enter 6

        for (int num = 1; num <= range; num++) {
            int sum = 0;
            for (int z = 1; z <= num; z++) {
                if (num % z == 0)
                    sum = sum + z;

            }
            if (sum == (2 * num))
                System.out.println(num + " is a perfect number");

        }
    }
}
