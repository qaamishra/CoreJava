package basics.comparable;

import java.util.Arrays;

/**
 * Created by Ashutosh on 9/11/2016.
 */
public class MainEmployee {
/*
Java Comparable interface is used to order the objects of the user-defined class.
This interface is found in java.lang package and contains only one method named compareTo(Object). It provides a single sorting sequence only, i.e.,
you can sort the elements on the basis of single data member only. For example, it may be rollno, name, age or anything else.

positive integer, if the current object is greater than the specified object.
negative integer, if the current object is less than the specified object.
zero, if the current object is equal to the specified object.

 */
    public static void main(String[] args) {

        //Object compare and sort
        Employee e1 = new Employee(124, "Ashutosh", 1000);
        Employee e2 = new Employee(122, "Ram", 2000);
        Employee e3 = new Employee(123, "Matt", 3000);
        Employee e4 = new Employee(119, "Brown", 2400);


        Employee[] emp = new Employee[4]; //remember compare to method
        emp[0] = e1;
        emp[1] = e2;
        emp[2] = e3;
        emp[3] = e4;

        //Arrays.sort(emp);
        System.out.println("Sorted by ID using Comparable Interface by implementing compareTo ");
        for (Employee e : emp) {

            System.out.println(e.getId());


        }


    }
}
