package java8.streams;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class StreamOnString {

    public static void main(String[] args) {

        List<String> stringCollection = Arrays.asList("zaa", "sdc", "sss", "dse", "eee", "ddd");

        System.out.println("This will print the sorted \n ------------");
        stringCollection.stream().sorted().forEach(System.out::println);

        System.out.println("------------\n This will print simple the created string collection \n ------------");
        System.out.println(stringCollection);


        System.out.println("------------\n prints all which starts with S \n ------------");
        stringCollection.stream().filter(s -> s.startsWith("s")).forEach(System.out::println);

        System.out.println("------------\n Count all which starts with S\n ------------ ");
        long value = stringCollection.stream().filter(s -> s.startsWith("s")).count();
        System.out.println(value);

        System.out.println("------------\n no one starts with T \n ------------ ");
        boolean noneStartsWithT = stringCollection.stream().noneMatch((s) -> s.startsWith("T"));
        System.out.println(noneStartsWithT);

        System.out.println("------------\n toUpperCase \n ------------ ");
        Function<String,String> stringStringFunction= String::toUpperCase;

        Arrays.asList("a1", "a2", "b1", "c2", "c1").stream()
                .filter(s -> s.startsWith("c")).map(stringStringFunction).sorted()
                .forEach(System.out::println);

    }
}
