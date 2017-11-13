package problems.simple;

public class ReverseInteger {

    public static void main(String[] args) {

        int input = 1210;


        int reversedNum = 0;
        int remainder = 0;
        while (input > 0) {

            remainder = input % 10;
            //modulo operation finds the remainder after division of one number by another (sometimes called modulus).
            //Here is finds first remainder so for first time 1215=>5 ,121=>1,12=>2,1=>1
            reversedNum = (reversedNum * 10) + (remainder);
            input = input / 10;   //Storing thiskeyword in int so after decimal value will be trimmed.
        }
        System.out.println(reversedNum);
    }

}
