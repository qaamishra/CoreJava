package problems.simple;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicatesWithInteger {


    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        for (int i = 0; i < 5; i++) {
            list.add(i);
        }


        System.out.println("My List : " + list);
        System.out.println("\nHere are the duplicate elements from list : " + findDuplicates(list));
    }

    public static Set<Integer> findDuplicates(List<Integer> listContainingDuplicates) {

        final Set<Integer> duplicates = new HashSet<Integer>();
        final Set<Integer> uniques = new HashSet<Integer>();

        for (int yourInt : listContainingDuplicates) {
            //set will not add dublicate so,if one set doesnt adds the dublicate ,catch it in another set and u get all the dublicates
            if (!uniques.add(yourInt)) {
                duplicates.add(yourInt);
            }
        }
        return duplicates;
    }

}

