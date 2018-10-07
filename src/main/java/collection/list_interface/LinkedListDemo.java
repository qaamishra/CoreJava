package collection.list_interface;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Notes:
 * 1. Implemented using Double link list
 * 2. Insertions and deletion is cheaper when compared to ArrayList as it need not require re shuffling it will simply point node to new node
 * 3. Searching is slow
 */
public class LinkedListDemo {

    public static void main(String[] args) {

        List<Integer> linkList=new LinkedList();
        linkList.addAll(Arrays.asList(20,30,40));

        ((LinkedList<Integer>) linkList).addFirst(10);
        ((LinkedList<Integer>) linkList).addLast(100);

        System.out.println(linkList);


    }
}
