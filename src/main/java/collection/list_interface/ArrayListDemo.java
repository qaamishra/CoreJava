package collection.list_interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collector;

public class ArrayListDemo {

    /**
     * Notes: Reference : https://docs.oracle.com/javase/8/docs/api/index.html?java/util/Collection.html
     * 1 : The details of the growth policy are not specified beyond the fact that adding an element has constant amortized time cost.
     * 2 : Not synchronized
     * 3 :ArrayList() Constructor * Constructs an empty list with an initial capacity of ten
     * 4.List gives facility to add a element at specific position Collection doesnt give that facility
     * 5. Implemented based on dynamic array
     * 6. Insertions and deletion is costly when compared to LinkedList as insertion in between will call for reshuffle of elements
     * 7. Searching is fast as its index based
     */
    public static void main(String[] args) {

        List<Integer> arrayList =new ArrayList();

        ((ArrayList<Integer>) arrayList).ensureCapacity(20);

        //adding values
        arrayList.add(10);
        arrayList.addAll(Arrays.asList(20,30,40,50,60,80,90));
        arrayList.add(6,70);
        arrayList.addAll(9,Arrays.asList(20,21));
        System.out.println("After adding values in different ways \n"+arrayList);

        //Iterating arraylist
        System.out.println("Iterating Values");
        Iterator itr= arrayList.iterator();
        while (itr.hasNext()){
            System.out.print(itr.next()+" ");
        }

        System.out.println("\nValue at 8th index "+arrayList.get(8) );

        arrayList.remove(9);
        System.out.println("After removing values at a index 9 \n"+arrayList);

        System.out.println("sub list "+arrayList.subList(3,6));

    }

}
