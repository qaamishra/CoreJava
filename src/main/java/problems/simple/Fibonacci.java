package problems.simple;

class Fibonacci {

    public static void main(String args[]) {

        int num = 10;

        System.out.println("*****Fibonacci Series*****");

        int f1 = 0, f2 = 1, f3;

        System.out.print(f1 + " " + f2);

        for (int i = 1; i <= num; i++) {

            f3 = f1 + f2;
            System.out.print(" " + f3 + " ");

            f1 = f2;

            f2 = f3;

        }

    }

}