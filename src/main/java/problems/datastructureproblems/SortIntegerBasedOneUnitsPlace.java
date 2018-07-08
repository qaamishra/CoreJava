package problems.datastructureproblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortIntegerBasedOneUnitsPlace {

    public static void main(String[] args) {

        List<Integer> values = new ArrayList<>();
        values.add(4583);
        values.add(4594);
        values.add(4566);
        values.add(4549);
        values.add(4572);

        Collections.sort(values);
        PrintList(values,"Simple Sort  Collections.sort(values) ");
        Collections.sort(values, Collections.reverseOrder());
        PrintList(values,"Reverse Sort : Collections.sort(values, Collections.reverseOrder()) ");


        Collections.sort(values, new MyComparatorForUnitsPlaceOfInteger());
        PrintList(values,"Sort based on last digit ,only units place");

        Collections.sort(values, new MyComparatorForUnitsAndTensPlaceOfInteger());
        PrintList(values,"Sort based on last digit ,units and Tens place");
    }

    public static void PrintList(List<Integer> list,String textToPrint) {

        System.out.println("######"+textToPrint+"######");
        for (int value : list) {

            System.out.println(value);
        }
        System.out.println("----------------------------------------------------------");
    }

}

class MyComparatorForUnitsPlaceOfInteger implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return o1%10 > o2%10 ? 1 : -1;
    }

}

class MyComparatorForUnitsAndTensPlaceOfInteger implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return o1%100 > o2%100 ? 1 : -1;
    }

}