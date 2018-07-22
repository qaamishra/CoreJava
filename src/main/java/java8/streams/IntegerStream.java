package java8.streams;

import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;

public class IntegerStream {
    public static void main(String[] args) {

        //Numbers divisible by 2
        IntStream.range(2, 20).boxed().forEach(i -> {
            if (i % 2 == 0) System.out.print(i + " ");
        });

        System.out.println("\n-------------");
        IntStream.of(1, 2, 3).boxed().forEach(val -> System.out.print(val + " "));

        System.out.println("\n-------------");
        //rangeClosed function includes the ending int, while range excludes it.
        IntStream.rangeClosed(2, 20).boxed().forEach(i -> {
            if (i % 2 == 0) System.out.print(i + " ");
        });

        System.out.println("\n-------------");
        //iterate(2, i -> i + 2) 2 is the Start value ,function  2 ,2+2=4 ,4+2=6, 6+2=8
        IntStream.iterate(2, i -> i + 2).limit(10).forEach(i -> System.out.print(i + " "));

        System.out.println("\n-------------");
        IntStream.generate(() -> ThreadLocalRandom.current().nextInt(10)).limit(3).forEach(i -> System.out.print(i + " "));

        System.out.println("\n-------------");
        IntStream.range(0, 10).average().ifPresent(System.out::println);

        System.out.println("\n-------------");
        IntStream.builder().add(1).add(3).add(5).add(7)
                .build().average().ifPresent(System.out::println);
    }
}
