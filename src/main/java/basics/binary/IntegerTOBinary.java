package basics.binary;

/**
 * Created by Ashutosh on 12-11-2017.
 */
public class IntegerTOBinary {
    public static void main(String[] args) {

        String binaryIntAsStr;

        for(int i=0;i<=30;i++){
            binaryIntAsStr= Integer.toBinaryString(i);
            System.out.println("Number "+i+ " --> "  +binaryIntAsStr + "  \t count of bits -->   "+Integer.bitCount(i));

        }
        //Integer.bitCount(i) will tell total number ones on the binary number

    }
}
