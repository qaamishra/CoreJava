package problems.simple;

/*
Given the following array, create a method that will take an int number as a parameter 
and then try to match that value with the numbers in the array.  
If any of the values match, print �Number exists� to the console.  
If none of the values match, print �Number does not exist�.
int[] array = {11, 5 ,1, 22,15 };

*/


public class MatchNumberInArray {

    public static void main(String[] args) {

        //Input your number here
        int numberToFind = 12;


        int[] myarray = {11, 5, 1, 22, 15};
        boolean resut;
        resut = matchMyNumber(numberToFind, myarray);
        System.out.println("Number exist  ? : " + resut);
    }

    private static Boolean matchMyNumber(int numberToFind, int[] myarray) {

        Boolean numberExist = false;
        for (int num : myarray) {

            if (num == numberToFind) {
                numberExist = true;

            }

        }
        return numberExist;


    }
}
