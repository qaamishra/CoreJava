package basics.comparator.simple_example;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class Intcomparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        if(o1<o2) return 1;//if(o1<o2) return 1; //if(o1%10>o2%10) return 1;//if(o1%100>o2%100) return 1;
        return -1;
    }

    @Override
    public Comparator<Integer> reversed() {
        return null;
    }

    @Override
    public Comparator<Integer> thenComparing(Comparator<? super Integer> other) {
        return null;
    }

    @Override
    public <U> Comparator<Integer> thenComparing(Function<? super Integer, ? extends U> keyExtractor, Comparator<? super U> keyComparator) {
        return null;
    }

    @Override
    public <U extends Comparable<? super U>> Comparator<Integer> thenComparing(Function<? super Integer, ? extends U> keyExtractor) {
        return null;
    }

    @Override
    public Comparator<Integer> thenComparingInt(ToIntFunction<? super Integer> keyExtractor) {
        return null;
    }

    @Override
    public Comparator<Integer> thenComparingLong(ToLongFunction<? super Integer> keyExtractor) {
        return null;
    }

    @Override
    public Comparator<Integer> thenComparingDouble(ToDoubleFunction<? super Integer> keyExtractor) {
        return null;
    }
}
