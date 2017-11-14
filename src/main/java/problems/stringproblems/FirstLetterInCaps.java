package problems.stringproblems;

/**
 * Created by Ashutosh on 14-11-2017.
 */
public class FirstLetterInCaps {

    public static void main(String[] args) {
        //Given a String "hello java", print the words as "Hello Java"
        String input = "hello , 123    Iam going java";

        String[] myStrings = input.split("\\s+");//whitespace
        for (String word : myStrings) {

            System.out.print(firstLetterCapital(word) + " ");
        }

    }

    public static String firstLetterCapital(String word) {

        return word.substring(0, 1).toUpperCase() + word.substring(1);

    }
}
