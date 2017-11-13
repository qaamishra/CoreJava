package basics.string;

/**
 * Created by Ashutosh on 25-Aug-16.
 * Please contact mishra.techie@gmail.com with your queries
 */
public class WideningPrimitiveConversion {


    public static void main(String[] args) {
        System.out.print("Y" + "O");
        System.out.print('P' + 'Q');

        System.out.println("\n\n==============================================");

        System.out.print("Y" + "O");
        System.out.print('P');
        System.out.print('Q');

        //Explanation: This will now print �YOLO� instead of �YO7679�. It is because the widening primitive conversion happens only when �+� operator is present.

        System.out.println("\n\n==============================================");


        //System.out.print('PQR'); //Error single quote is understood as character so it expects only one char in the single quote
    }

}
