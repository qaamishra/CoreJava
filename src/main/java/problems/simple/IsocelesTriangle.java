package problems.simple;

public class IsocelesTriangle {

    public static void main(String[] args) {

        //i=horizontal (row)
        //k=spaces
        //j=star
        //S=sapce

        for (int horizontal = 1; horizontal < 10; horizontal += 2)

        {
            for (int spaces = 0; spaces < (4 - horizontal / 2); spaces++) {
                //System.out.print("S"); //no new line
                System.out.print(" ");//space
            }
            for (int star = 0; star < horizontal; star++) {
                System.out.print("*"); //no new line
            }
            System.out.println(""); //new line
        }
    }//main


}//class
/*
    |S|S|S|S|*
	|S|S|S|*|*|*
	|S|S|*|*|*|*|*
	|S|*|*|*|*|*|*|*|
	|*|*|*|*|*|*|*|*|*|
*
*/
