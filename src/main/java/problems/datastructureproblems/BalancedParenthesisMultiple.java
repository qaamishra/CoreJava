package problems.datastructureproblems;

import java.util.Stack;

/*This is a Java Program to Check for balanced parenthesis by using Stacks. 
 * Parenthesis matching is commonly used for evaluating arithmetic expressions and in editors for validating syntax.
Here is the source code of the Java Program to check for balanced parenthesis by using stacks.
 The Java program is successfully compiled and run on a Windows system. The program output is also shown below.*/

public class BalancedParenthesisMultiple {

    public static void main(String args[]) {

        System.out.println(balancedParenthensies("{(a,b)}"));
        System.out.println(balancedParenthensies("{(a},b)"));
        System.out.println(balancedParenthensies("{)(a,b}"));
    }

    public static boolean balancedParenthensies(String s) {
        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '[' || c == '(' || c == '{') {

                stack.push(c);

            } else if (c == ']') {
                if (stack.isEmpty())
                    return false;
                if (stack.pop() != '[')
                    return false;

            } else if (c == ')') {
                if (stack.isEmpty())
                    return false;
                if (stack.pop() != '(')
                    return false;

            } else if (c == '}') {
                if (stack.isEmpty())
                    return false;
                if (stack.pop() != '{')
                    return false;
            }

        }
        return stack.isEmpty();
    }

}
