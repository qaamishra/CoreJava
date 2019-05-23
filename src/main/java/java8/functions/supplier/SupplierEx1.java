package java8.functions.supplier;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntSupplier;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * A Supplier is any method which takes no arguments and returns a value. Its job is literally to supply an instance of an expected class.
 * For instance, every reference to a 'getter' method is a Supplier
 * A supplier is a method that returns some value (as in it's return value).
 * IntSupplier having one abstract method getAsInt()
 * LongSupplier having one abstract method getAsLong()
 * DoubleSupplier having one abstract method getAsDouble()
 * BooleanSupplier having one abstract method getAsBoolean()
 */
public class SupplierEx1 {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("d2", "a2", "b1", "b3", "c");

        System.out.println(SupplierTest(strings));
        IntSupplier intSupplier = () -> IntStream.of(4, 5).sum();
        System.out.println(intSupplier.getAsInt());

    }

    private static boolean SupplierTest(List<String> stringCollection) {
        Supplier<Stream<String>> streamSupplier =
                //As you can seee supplier takes no input () and only returns output of Type T
                () -> stringCollection
                        .stream()
                        .filter(s -> s.startsWith("a"));

        //Here the get method is fetching returns from supplier
        return streamSupplier.get().anyMatch(s -> true);

    }

}
