package problems.simple;

public class SortedArrayOrNotRecursive {


    public static void main(String[] args) {

        int[] arrayContainer = {1, 57, 6, 7, 9};
        int lengthOfContainer = arrayContainer.length;

        //Method#1
        boolean isArraySorted = checkIfArrayIsSortedRecursive(arrayContainer, lengthOfContainer);

        if (isArraySorted == true) {
            System.out.println("Given Arrray is sorted from Method#1");
        } else {
            System.out.println("Given Arrray is NOT sorted from Method#1");
        }


        //Method#2
        boolean isArraySortedOtherWay = checkIfArrayIsSortedRecursiveOtherWay(arrayContainer, lengthOfContainer, 0);
        if (isArraySortedOtherWay == true) {
            System.out.println("Given Arrray is sorted from Method#2");
        } else {
            System.out.println("Given Arrray is NOT sorted from Method#2");
        }
    }

    private static boolean checkIfArrayIsSortedRecursive(int[] arrayContainer, int lengthOfContainer) {

        if (arrayContainer == null || lengthOfContainer < 2) {
            return true;
        } else if (arrayContainer[lengthOfContainer - 2] > arrayContainer[lengthOfContainer - 1]) {
            //Matching from back side of array. here lenght of array id 5(index : 0,1,2,3,4). So here we check index[5-2]>index[5-1] i.e index[3]>index[4]
            // In recursion length gets decreased.
            return false;
        }
        // recurse.
        return checkIfArrayIsSortedRecursive(arrayContainer, lengthOfContainer - 1);

    }

    private static boolean checkIfArrayIsSortedRecursiveOtherWay(int[] arrayContainer, int lengthOfContainer, int index) {


        if (index >= lengthOfContainer - 1) {//Handling ArrayIndex out of bound
            return true;
        } else if (arrayContainer == null || lengthOfContainer < 2) {
            return true;
        } else if (arrayContainer[index] > arrayContainer[index + 1]) {
            return false;
        }
        // recurse.
        return checkIfArrayIsSortedRecursiveOtherWay(arrayContainer, lengthOfContainer, index + 1);


    }


}
