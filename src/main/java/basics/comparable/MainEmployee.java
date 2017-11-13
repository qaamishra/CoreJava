package basics.comparable;

import java.util.Arrays;

/**
 * Created by Ashutosh on 9/11/2016.
 */
public class MainEmployee {

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

        Arrays.sort(emp);
        System.out.println("Sorted by ID using Comparable Interface by implementing compareTo ");
        for (Employee e : emp) {

            System.out.println(e.getId());


        }


    }
}
