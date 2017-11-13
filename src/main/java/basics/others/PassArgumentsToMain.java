package basics.others;

/**
 * Created by Ashutosh on 12-11-2017.
 */
public class PassArgumentsToMain {

    public static void main(String[] args) {

        String one = args[0];
        String two = args[1];
        int n = Integer.parseInt(args[2]);
        float f = Float.parseFloat(args[3]);

        System.out.println("Args1\t" + one + "\nArgs2\t" + two + "\nintvalue\t" + n + "\nFloat value\t" + f);
    }
}

