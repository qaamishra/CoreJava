package java8.methodreference;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class InstanceMethodReference {

    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(40, 12,40,25,25, 800, 56, 563);

        //OptionalUse class is used to handle null values in a container
        Optional<Integer> number = integers.stream().distinct().reduce(Math::min);//Static Method reference of min which is a static method

        number.ifPresent(System.out::println);//here println is non static so Method Reference of a instance


    }
}
