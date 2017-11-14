package problems.datastructureproblems;

import java.util.Scanner;
import java.util.Stack;

/*This is a Java Program to Check for balanced parenthesis by using Stacks. 
 * Parenthesis matching is commonly used for evaluating arithmetic expressions and in editors for validating syntax.
Here is the source code of the Java Program to check for balanced parenthesis by using stacks.
 The Java program is successfully compiled and run on a Windows system. The program output is also shown below.*/

public class BalancedParenthesis {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

	       
	        /* Accepting expression */
           /* System.out.println("Enter expression");
	        String exp = scan.next();   */

        String inputOne = "(3+5(5+5(5+5)5+5)*5)";
        String inputTwo = "(3+5(5+5(5+5)5+5";
        String inputThree = "(())";
        String exp = inputThree;

        startMatchhing(exp);


    }

    private static void startMatchhing(String exp) {
		 
		/* Creating Stack */
        Stack<Integer> stk = new Stack<Integer>();
        System.out.println("Parenthesis Matching Test\n");

        int len = exp.length();
        System.out.println("\nMatches and Mismatches:\n");

        for (int i = 0; i < len; i++) {
            char ch = exp.charAt(i);
            if (ch == '(')
                stk.push(i);
            else if (ch == ')') {
                try {
                    int p = stk.pop() + 1;
                    System.out.println("')' at index " + (i + 1) + " matched with '(' at index " + p);
                } catch (Exception e) {
                    System.out.println("')' at index " + (i + 1) + " is unmatched");
                }
            }
        }
        while (!stk.isEmpty())
            System.out.println("'(' at index " + (stk.pop() + 1) + " is unmatched");

    }

}
