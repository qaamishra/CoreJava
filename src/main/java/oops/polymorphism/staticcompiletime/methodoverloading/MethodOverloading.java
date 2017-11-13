package oops.polymorphism.staticcompiletime.methodoverloading;

/**
 * Created by Ashutosh on 12-11-2017.
 */
public class MethodOverloading {

    public int max(int x, int y) {

        int max;
        if (x > y) {
            max = x;
            System.out.println("x is Big :From Int");
        } else {
            max = y;
            System.out.println("Y is Big:From Int");
        }


        return max;

    }

    public double max(double x, double y) {

        double max;
        if (x > y) {
            max = x;
            System.out.println("x is Big:From double");
        } else {
            max = y;
            System.out.println("y is Big:From double");
        }


        return max;

    }

    public static void main(String[] args) {

        MethodOverloading methodOverloading = new MethodOverloading();
        methodOverloading.max(10, 23.5);
        methodOverloading.max(10, 23);
        methodOverloading.max(10.56, 23.25);

    }
}
