package java8.functions.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Consumer has been defined with the generic type T which is the same type which its accept() & andThen() methods take as input
 * This only takes input and has no return type
 */

public class ConsumerEx1 {

    public static void main(String[] args) {
        Consumer<Integer> consumer = i -> System.out.print("#\t" + i +"\t#\n");
        List<Integer> integerList = Arrays.asList(5,6,8,9,10,85,7);
        printList(integerList, consumer);
    }


    public static void printList(List<Integer> listOfIntegers, Consumer<Integer> consumer) {
        for (Integer integer : listOfIntegers) {
            consumer.accept(integer);
        }
    }
}
