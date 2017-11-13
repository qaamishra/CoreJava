package exception;

/**
 * Created by Ashutosh on 12-11-2017.
 */
public class PipedException {

    public static void main(String args[]) {
        int number;
        try {
            // number = Integer.parseInt("0");//ArithmeticException
            number = Integer.parseInt("Hello"); //NumberFormatException
            if (99 % number == 0)
                System.out.println(number + " is a factor of 99");
        } catch (NumberFormatException | ArithmeticException ex) {
            System.out.println("Exception encountered " + ex);
        }
    }
}
