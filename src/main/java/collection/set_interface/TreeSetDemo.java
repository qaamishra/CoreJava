package collection.set_interface;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {

        Set<Integer> hashset=new TreeSet<>();
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
