package basics.regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Ashutosh on 9/13/2016.
 */

//Given a string which consist of integer values in between ,identify add and print the sum
//e.g abcgd12jfhfdj16mfk8  so print 12+12+8
public class FindSumFromMixedCharInput {

    public static void main(String[] args) {

        String myString = "abcgd10jfhfdj10mfk1";
        sumOfAllTheIntegers(myString);
        sumOfAllTheIntegerGroup(myString);

    }

    public static void sumOfAllTheIntegers(String myString) {

        Pattern pattern = Pattern.compile("\\d");//http://regexr.com/ --> cheat sheet
        Matcher match = pattern.matcher(myString);
        int sum = 0;

        while (match.find()) {


            String matchedValue = match.group();
            sum = sum + Integer.parseInt(matchedValue);

        }
        System.out.println("sumOfAllTheIntegers " + sum);
    }

    public static void sumOfAllTheIntegerGroup(String myString) {

        Pattern pattern = Pattern.compile("\\d+");//http://regexr.com/ --> cheat sheet
        Matcher match = pattern.matcher(myString);
        int sum = 0;

        while (match.find()) {


            String matchedValue = match.group();
            sum = sum + Integer.parseInt(matchedValue);

        }
        System.out.println("sumOfAllTheIntegerGroup : " + sum);
    }
}
