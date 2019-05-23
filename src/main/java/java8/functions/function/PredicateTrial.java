package java8.functions.function;

import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Predicate;

public class PredicateTrial {

    public static void main(String[] args) {

        Function<String,String> stringStringFunction= String::toUpperCase;
        Predicate<String> stringPredicate=s->s.startsWith("c");

        Arrays.asList("a1", "a2", "b1", "c2", "c1").stream()
                .filter(stringPredicate)
                .map(stringStringFunction)
                .sorted()
                .forEach(System.out::println);
    }
}
