package problems.stringproblems;

/**
 * Created by Ashutosh on 14-11-2017.
 */
public class RemoveExtraSpacesFromAString {

    public static void main(String[] args) {
        String input = "hello , 123    Iam going java            !";

        String[] myStrings = input.split("\\s+");//whitespace
        for (String word : myStrings) {

            System.out.print(word + " ");
        }
    }
}
