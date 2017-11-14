package problems.stringproblems;

/**
 * Created by Ashutosh on 14-11-2017.
 */
public class PalindromeString {


    public static void main(String[] args) {
        String input = "MADAM";
        String reverse = "";

        //first reverse the string
        for (int i = input.length() - 1; i >= 0; i--) {

            reverse += input.charAt(i);
        }

        //Check if Reverse is equal to input
        if (reverse.equalsIgnoreCase(input)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }


}
