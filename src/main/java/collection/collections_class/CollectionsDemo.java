package collection.collections_class;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {

    public static void main(String[] args) {

        List<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(59,68,78,14,63,10,71));

        System.out.println("main list "+list);
        Collections.reverse(list);
        System.out.println("reverse "+list);


        Collections.sort(list);
        System.out.println("asc sort : "+list);

        Collections.sort(list,Collections.reverseOrder());
        System.out.println("desc sort "+list);

        int serach=Collections.binarySearch(list,2);
        System.out.println(serach);

        int maxValueInList = (Collections.max(list));
        System.out.println("maxValueInList "+maxValueInList);
        int minValueInList = (Collections.min(list));
        System.out.println("minValueInList "+minValueInList);


    }
}
