package problems.datastructureproblems;

/**
 * Created by Ashutosh on 12-11-2017.
 */

/**
 * A positive integer N is given ,the goal is to find he highest power of 2 that divides N,
 * Given integer N=24,the answer is 3,because 2^3 =8 is the highest power of 2 that divides N
 */
public class MathPower {


    public static int solution(int N) {

        int power = 0;

        do {
            power++;
        } while (N % Math.pow(2, power) == 0);

        return power-1;
    }

    public static void main(String[] args) {
        System.out.println(solution(24));
    }

}
