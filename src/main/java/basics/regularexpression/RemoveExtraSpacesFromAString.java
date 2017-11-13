package basics.regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Ashutosh on 9/21/2016.
 */
public class RemoveExtraSpacesFromAString {


    public static void main(String[] args) {
        String givenString = "  Remove    extra   spaces from thiskeyword String   ";

        //theEasyWay(givenString);
        theSecondWay(givenString);
    }


    private static void theEasyWay(String givenString) {

        givenString = givenString.replaceAll("\\s+", " ");

        System.out.println(givenString);

        System.out.println(givenString.trim());
    }

    private static void theSecondWay(String givenString) {

        Pattern pattern = Pattern.compile("\\w+");//http://regexr.com/ --> cheat sheet
        Matcher match = pattern.matcher(givenString);
        String toBePrinted = "";

        while (match.find()) {

            String matchedValue = match.group();
            toBePrinted = toBePrinted + " " + matchedValue;

        }
        System.out.println("Final String:\n" + toBePrinted.trim());

    }

}
