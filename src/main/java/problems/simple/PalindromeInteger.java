package problems.simple;

class PalindromeInteger {

    public static void main(String args[]) {

        int num = 123321;

        int n = num; //used at last time check

        int reverse = 0, remainder;

        while (num > 0) {

            remainder = num % 10;
            reverse = reverse * 10 + remainder;
            num = num / 10;

        }

        System.out.println("reverse :" + reverse);
        if (reverse == n)

            System.out.println(n + " is a Palindrome Number");

        else

            System.out.println(n + " is not a Palindrome Number");

    }

}