package basics.comparator;

import java.util.Comparator;

/**
 * Created by Ashutosh on 9/11/2016.
 */
public class NameComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee e1, Employee e2) {

        int returnValueString = e1.getName().compareTo(e2.getName());
        System.out.println("returnValueString : " + returnValueString);

        //if a -ve return value appears  obj2 is bigger than obj1
        //if a +ve return value appears obj1 is bigger than obj2
        //zero return value obj1 and obj2 both are same
        return returnValueString;
    }
}
