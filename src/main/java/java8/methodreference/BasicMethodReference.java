package java8.methodreference;

import java.util.Arrays;
import java.util.List;

/**
 * A method reference is used to call methods by there names. Symbol :: (double colon)
 * Can be used to call below
 * Static Methods
 * Instance Methods
 * Constructors using new operator
 * https://docs.oracle.com/javase/tutorial/java/javaOO/methodreferences.html
 */
public class BasicMethodReference  {

    public static void main(String[] args) {

        List names= Arrays.asList("a","b","c","d");
        names.forEach(System.out::println);

    }


}

