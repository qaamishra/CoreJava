package problems.simple;

public class SortedArrayOrNot {


    public static void main(String[] args) {

        int[] arrayContainer = {1, 5, 6, 7, 9};


        boolean isArraySorted = checkIfArrayIsSorted(arrayContainer);

        if (isArraySorted == true) {
            System.out.println("Given Arrray is sorted");
        } else {
            System.out.println("Given Arrray is NOT sorted");
        }


    }

    private static boolean checkIfArrayIsSorted(int[] arrayContainer) {

        for (int index = 0; index < arrayContainer.length - 1; index++) {

            if (arrayContainer[index] > arrayContainer[index + 1]) {
                return false;
            }
        }
        return true;

    }


}
