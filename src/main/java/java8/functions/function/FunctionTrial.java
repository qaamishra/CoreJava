package java8.functions.function;

import java.util.Arrays;
import java.util.function.Function;

public class FunctionTrial {
    public static void main(String[] args) {

        Function<String,String> stringStringFunction= String::toUpperCase;

        Arrays.asList("a1", "a2", "b1", "c2", "c1").stream()
                .filter(s -> s.startsWith("c")).map(stringStringFunction).sorted()
                .forEach(System.out::println);
    }
}
