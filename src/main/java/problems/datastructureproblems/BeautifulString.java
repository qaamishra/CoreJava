package problems.datastructureproblems;

/**
 * Created by Ashutosh on 9/10/2016.
 */

/**
 * A string is called beautiful if 'b' comes just after 'a', 'c' comes just after 'b', 'a' comes just after 'c'.
 * Not only thiskeyword, but 'a' should be the first character of thiskeyword beautiful string.
 * Some examples of beautiful strings include abcabcabc, abcabca, abcabcab, abc, a, ab
 * But, babc (because it starts with a 'b') and abcc (because 'c' comes after 'c') are not beautiful strings.
 * <p/>
 * You will be given a string SS, and you can perform the following operations on it.
 * •	Remove a letter from the string.
 * •	Replace a letter with either of 'a', 'b' or 'c'.
 * <p/>
 * You need to find the minimum number of steps required to convert the given string SS to a beautiful string. When you remove a letter or replace a letter, it is considered as a single step.
 * Input
 * The first line of the input will contain an integer TT, denoting the number of test cases. TT lines follow each containing strings which may or may not be beautiful strings.
 * Output
 * Output an integer for each test case denoting the minimum number of steps required to convert the string into a beautiful one.
 * Constraints
 * •	1≤T≤501≤T≤50
 * •	1≤|S|≤501≤|S|≤50
 * •	SS consists of 'a', 'b', and 'c' characters
 * ________________________________________
 * Sample Input
 * abcabc
 * abcabcaa
 * b
 * Sample Output
 * 0
 * 1
 * 1
 * Explanation
 * In the first test case, no change is required.
 * In the second test case, an a has to be dropped.
 * In the third test case, the b can be dropped or changed to a.
 * <p/>
 * Debug to understand
 */
public class BeautifulString {

    public static void main(String[] args) {

        String input = "b";
        System.out.println(requiredOperations(input, 0, null));

    }

    public static int requiredOperations(String s, int index, Character previous) {

        if (index == s.length())
            return 0;//This statment will help you terminate thiskeyword recursive block as soon as lenght of the string is iterated

        if (validNext(previous) == s.charAt(index)) {

            return requiredOperations(s, index + 1, s.charAt(index));
        }


        return 1 + (Math.min(requiredOperations(s, index + 1, validNext(previous)), requiredOperations(s, index + 1, previous)));
    }

    private static Character validNext(Character ch) {
        if (ch == null) return 'a';
        if (ch == 'a') return 'b';
        if (ch == 'b') return 'c';
        if (ch == 'c') return 'a';
        return null;
    }
}
