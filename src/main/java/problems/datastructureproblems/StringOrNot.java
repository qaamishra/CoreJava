package problems.datastructureproblems;

/*
 * 
Fill in the function body

Given a list of strings, loop through each value and print it if it is an
integer, or ? if it is not.

You may assume that the list has at least one element, and that integer
values are not large (do not need more than 16 bits to represent).

For example:
-------------------------------
    Input:
    ["1", "2", "3"]

    Output:
    1
    2
    3
-------------------------------

-------------------------------
    Input:
    ["1", "x", "3"]

    Output:
    1
    ?
    3
-------------------------------

-------------------------------
    Input:
    ["1", "2.3", "4"]

    Output:
    1
    ?
    4
 * 
 * */
public class StringOrNot {

    public static void main(String[] args) {

        StringOrNot s = new StringOrNot();
        String[] items = {"1", "2", "x", "4"};

        String[] nitems = items;
        for (int i = 0; i <= nitems.length - 1; i++) {
            String s1 = nitems[i];
            if (isInteger(s1)) {
                System.out.println(s1);
            } else {
                System.out.println("?");
            }


        }

    }

    public static boolean isInteger(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
