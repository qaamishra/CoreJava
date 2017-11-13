package problems.datastructureproblems;


/*
 * Algorithm

To get all the permutations, we will first take out the first char from String and permute the remaining chars.
If String = �ABC�
First char = A and remaining chars permutations are BC and CB.
Now we can insert first char in the available positions in the permutations.
BC -> ABC, BAC, BCA
CB -> ACB, CAB, CBA
*/


public class PermutationOfString {

    public static boolean[] used;

    public static void main(String[] args) {

        PermutationOfString.permute("ABC");
    }

    public static void permute(String input) {
        int inputLength = input.length();

        StringBuffer outputString = new StringBuffer();
        char[] in = input.toCharArray();
        used = new boolean[inputLength];
        doPermute(in, outputString, used, inputLength, 0);

    }

    public static void doPermute(char[] in, StringBuffer outputString,
                                 boolean[] used, int inputlength, int level) {
        int length = inputlength;
        if (level == length) {
            System.out.println(outputString.toString());
            return;
        }

        for (int i = 0; i < length; ++i) {

            if (used[i]) continue;

            outputString.append(in[i]);
            used[i] = true;

            doPermute(in, outputString, used, length, level + 1);
            used[i] = false;
            outputString.setLength(outputString.length() - 1);
        }
    }


}
