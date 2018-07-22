package java8.methodreference;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ConstructorMethodReference {

    public static void main(String[] args) {

        //ArrayList::new is Constructor method reference
        List<Integer> list=IntStream.range(5,25).boxed().collect(Collectors.toCollection(ArrayList::new));

        list.forEach(System.out::println);
    }
}
