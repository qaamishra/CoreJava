package problems.simple;

/*Write a program to find whether given no. is Armstrong or not. Example :
Input - 153 Output - 1^3 + 5^3 + 3^3 = 153, so it is Armstrong no. */
class Armstrong {
    public static void main(String args[]) {
        int num = 153;

        int n = num; //use to check at last time

        int check = 0, remainder;

        while (num > 0) {
            remainder = num % 10;
            //modulo operation finds the remainder after division of one number by another (sometimes called modulus).
            //Here is finds first remainder so for first time 1251=>1 ,125=>5,12=>2,1=>1
            //check = check + (int)Math.pow(remainder,3);
            check = check + (remainder * remainder * remainder);
            num = num / 10;
        }
        if (check == n)
            System.out.println(n + " is an Armstrong Number");
        else
            System.out.println(n + " is not a Armstrong Number");
    }

}
