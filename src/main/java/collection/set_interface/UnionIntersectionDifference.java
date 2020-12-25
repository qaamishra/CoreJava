package collection.set_interface;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UnionIntersectionDifference {
    public static void main(String args[]) {
        Set<Integer> a = new HashSet<Integer>();
        a.addAll(Arrays.asList(1, 3, 2, 4, 8, 9, 0));
        Set<Integer> b = new HashSet<Integer>();
        b.addAll(Arrays.asList(1, 3, 7, 5, 4, 0, 7, 5));

        // To find union
        Set<Integer> union = new HashSet<>(a);
        union.addAll(b);
        System.out.print("Union of the two Set");
        System.out.println(union);

        // To find intersection
        Set<Integer> intersection = new HashSet<>(a);
        intersection.retainAll(b);
        System.out.print("Intersection of the two Set");
        System.out.println(intersection);

        // To find the symmetric difference
        Set<Integer> difference = new HashSet<>(a);
        difference.removeAll(b);
        System.out.print("Difference of the two Set");
        System.out.println(difference);
    }
}
