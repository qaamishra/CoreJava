package collection.queue_interface;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * FIFO so two relavant methods peek and poll works only on head(FIFO)
 * Notes : Read : https://docs.oracle.com/javase/8/docs/api/index.html?java/util/Collection.html
 * 1.The elements of the priority queue are ordered according to their natural ordering(lexical string)
 * 2.The head of this queue is the least element with respect to the specified ordering. If multiple elements are tied for least value, the head is one of those elements
 * 3.Not synchronized,use PriorityBlockingQueue if synchronized queue is required
 */
public class PriorityQueueDemo {

    public static void main(String[] args) {

        Queue<String> priorityQueue=new PriorityQueue();

        priorityQueue.add("P");
        priorityQueue.add("ZZ");
        priorityQueue.add("B");
        priorityQueue.add("T");
        priorityQueue.add("A");


        System.out.println(priorityQueue);

        System.out.println(priorityQueue.peek());//Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
        System.out.println(priorityQueue.poll());//Retrieves and removes the head of this queue, or returns null if this queue is empty.
        System.out.println(priorityQueue);


        priorityQueue.offer("X");
        System.out.println(priorityQueue);
    }
}
