package collection.set_interface;

import java.util.HashSet;
import java.util.Set;

/**
 * Notes
 * 1. Doesnt allow duplicates
 * 2. Order of insertion not maintained due to hashing,use tree set if order is important
 */
public class HashSetDemo {
    public static void main(String[] args) {

        Set<Integer> hashset=new HashSet();
        hashset.add(10);
        hashset.add(10);
        hashset.add(10);
        hashset.add(40);
        hashset.add(50);
        hashset.add(60);
        hashset.add(170);

        System.out.println("Print 1" +hashset);
        System.out.println("Print 2" +hashset);
        System.out.println("Print 3" +hashset);

    }
}
