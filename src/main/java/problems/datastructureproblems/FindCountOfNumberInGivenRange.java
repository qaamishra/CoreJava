package problems.datastructureproblems;

public class FindCountOfNumberInGivenRange {
    public static void main(String[] args) {

        int max = 50;
        int numberToCheck = 4;
        int count = 0;

        for (int i = 1; i <= max; i++) {

            String num = Integer.toString(i);
            String toCheck = Integer.toString(numberToCheck);
            count += findTheNeededChar(num, toCheck);

        }

        System.out.println(numberToCheck+" has coccured "+count+"  times in the range of 1 to "+max);

    }

    private static int findTheNeededChar(String num, String toCheck) {

        int count = 0;

        char c = toCheck.charAt(0);

        for (int i = 0; i < num.length(); i++) {

            if ((num.charAt(i)) == c) {
                count++;

            }
        }

        return count;
    }
}
