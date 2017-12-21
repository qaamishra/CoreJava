package basics.integer;

/**
 * Created by Ashutosh Mishra on 8/10/2016.
 */
public class IntegerTest {

    public static void main(String[] args) {
        Integer I1 = 127;
        Integer I2 = 127;
        //-127 to +127 it will refer to same Integer pool after that a new object is created every time

        Integer I3 = 129;
        Integer I4 = 129;

        if (I1 == I2) {

            System.out.println("IF I1=I2");

        }
        if (I3 == I4) {

            System.out.println("IF I3=I4");

        } else {
            System.out.println("ELSE : I3!=I4");
        }


    }
}
