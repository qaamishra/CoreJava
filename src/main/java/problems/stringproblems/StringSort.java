package problems.stringproblems;

import java.util.Arrays;

/**
 * Created by Ashutosh on 14-11-2017.
 */
public class StringSort {

    public static void main(String[] args) {
        String input="zyxba";
        char[] chars=input.toCharArray();
        Arrays.sort(chars);
        System.out.println(chars);
    }
}
