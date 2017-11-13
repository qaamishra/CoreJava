package problems.datastructureproblems;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Ashutosh on 9/10/2016.
 */
public class PopularUsingCollections {

    public static void main(String[] args) {

        PopularUsingCollections p = new PopularUsingCollections();
        int arr[] = {1, 3, 2, 3, 4, 4, 4, 4};

        int famous = p.getPopularElement(arr);
        System.out.println(famous);

    }

    public int getPopularElement(int[] arrayInt) {


        HashMap<Integer, Integer> mymap = new HashMap<>();

        for (int i : arrayInt) {

            if (mymap.containsKey(i)) {
                mymap.put(i, mymap.get(i) + 1);
            } else {
                mymap.put(i, 1);
            }

        }

        System.out.println(mymap);
        int max = 0;
        int value = 0;
        for (Map.Entry<Integer, Integer> myentry : mymap.entrySet()) {

            int tmp = myentry.getValue();
            if (tmp > max) {

                max = tmp;
                value = myentry.getKey();
            }

        }

        System.out.println(value + "is the most popular");


        return max;
    }

}
