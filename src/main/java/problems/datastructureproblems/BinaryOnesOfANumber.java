package problems.datastructureproblems;

/**
 * Created by Ashutosh on 12-11-2017.
 */

/**
 * Given A=3 and B=7 ,the function should return 3, because the inary representation of 21 is 10101 and it contains 3 bits
 */
public class BinaryOnesOfANumber {

    public int solution(int a, int b) {
        int multiplicationValue = a * b;
        int bitCount;

        bitCount=Integer.bitCount(multiplicationValue);

        return bitCount;

    }

    public static void main(String[] args) {
        BinaryOnesOfANumber binaryOnesOfANumber=new BinaryOnesOfANumber();
        System.out.println(binaryOnesOfANumber.solution(3,7));
    }
}
