package basics.regularexpression;

/**
 * Created by Ashutosh on 9/17/2016.
 */
public class FindSumFromMixedCharInputTwo {

    public static void main(String[] args) {

        String myString = "abcgd150jfhfdj150mfk1";

        sumOfAllTheIntegers(myString);
        sumOfAllTheIntegerGroup(myString);


    }

    private static void sumOfAllTheIntegerGroup(String myString) {

        int group = 0;
        int finalValue = 0;
        for (int i = 0; i < myString.length(); i++) {

            boolean isIt = isItADigit(myString.charAt(i));

            if (isIt == true) {

                //Keep on forming a group
                group = (group * 10) + Character.getNumericValue(myString.charAt(i));
            } else {//once the next index is a char and not a digit put it in final value and empty the group
                finalValue = finalValue + group;
                group = 0;
            }

        }
        //finalValue=finalValue+group;

        System.out.println(finalValue);

    }

    private static boolean isItADigit(char c) {

        return Character.isDigit(c);

    }

    static void sumOfAllTheIntegers(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                sum = sum + Character.getNumericValue(s.charAt(i));
            }
        }
        System.out.println(sum);
    }
}
