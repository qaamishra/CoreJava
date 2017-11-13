package basics.string;

/**
 * Created by Ashutosh on 12-11-2017.
 */
public class ObjectAndLiteral {
    public static void main(String[] args) {

        String strObject = new String("Java");
        String strLiteral = "Java";
        System.out.println(strObject == strLiteral);//false

        String a = "Java";
        String b = "Java";
        System.out.println(a == b); // True

        String c = new String("Java");
        String d = new String("Java");
        System.out.println(c == d); // False


    }
}
