package basics.comparator.simple_example;


import edu.emory.mathcs.backport.java.util.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestIntComparator {
    public static void main(String[] args) {

        List<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(10,19,71,78,95,42,63,58,42,69,81));

        Collections.sort(list,new IntComparator());

        System.out.println(list);
    }
}
