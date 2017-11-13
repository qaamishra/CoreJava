package problems.simple;

public class ReverseAString {


    public static void main(String[] args) {

        String rev = "Ashutosh";
        for (int i = rev.length() - 1; i >= 0; i--) {
            System.out.print(rev.charAt(i));//no new line
        }
    }
}
