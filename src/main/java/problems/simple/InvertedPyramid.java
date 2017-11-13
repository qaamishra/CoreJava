package problems.simple;

public class InvertedPyramid {


    public static void main(String[] args)

    {

        for (int i = 5; i >= 1; i--) { //for the no. of Rows-horizontal

            for (int j = 1; j <= i; j++) { //for no of columns-vertical
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
