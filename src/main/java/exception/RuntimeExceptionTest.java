package exception;

/**
 * Created by Ashutosh on 12-11-2017.
 */
public class RuntimeExceptionTest {
    public static void main(String[] args) {


        try {
            System.out.println("Hello");
            int a = 6 / 0;

        } catch (RuntimeException ex) {

            throw new RuntimeException("my message");
            //System.out.println("Did you observe the message");

        }
    }
}
