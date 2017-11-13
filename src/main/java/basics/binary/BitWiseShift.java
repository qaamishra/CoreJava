package basics.binary;

/**
 * Created by Ashutosh on 12-11-2017.
 */

/**
 * A bit shift moves each digit in a set of bits left or right. The last bit in the direction of the shift is lost, and a 00 bit is inserted on the other end.

 0010 << 1  →  0100
 1011 >> 1  →  0101
 Bit shifts take number of times to shift as the right argument:

 1010110 << 2  →  1011000
 1011010 >> 3  →  0001011
 A single left shift multiplies a binary number by 2:

 0010 << 1  →  0100

 0010 is 2
 0100 is 4
 Two left shifts multiplies by 4. Three left shifts multiplies by 8.

 And similarly, shifting right divides by 2, throwing out any remainders.
 */

public class BitWiseShift {

    public static void main(String args[])  {
        int x = -4;
        System.out.println(Integer.toBinaryString(x));
        System.out.println(x>>1);

        int y = 4;
        System.out.println(Integer.toBinaryString(y));
        System.out.println(y>>1);
    }
}
