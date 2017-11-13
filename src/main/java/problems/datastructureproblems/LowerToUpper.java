package problems.datastructureproblems;

import java.io.IOException;

/**
 * Created by Ashutosh on 05-07-2017.
 */
public class LowerToUpper {
    static String myString;
    static int length;

    public static void main(String args[]) throws IOException {

        myString = "ToMaTo";
        length = myString.length();
        changeCase();
    }

    public static void changeCase() {
        char c;
        String finalString = "";
        for (int i = 0; i < length; i++) {
            c = myString.charAt(i);

            if (c >= 65 && c <= 90)
                finalString += (char) (c + 32);
            else if (c >= 97 && c <= 122)
                finalString += (char) (c - 32);
            else
                finalString += c;


        }
        System.out.println("\n Original : " + myString);
        System.out.println("Changed : " + finalString);
    }
}
