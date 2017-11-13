package oops.encapsulation;

/**
 * Created by Ashutosh on 12-11-2017.
 */
public class EncapsulationTest {

    public static void main(String[] args) {

        EncapsulatedClass encapsulatedClass = new EncapsulatedClass();
        encapsulatedClass.setAge(5);
        System.out.println(encapsulatedClass.getAge());

        encapsulatedClass.setIdNum(556767);
        System.out.println(encapsulatedClass.getIdNum());

        encapsulatedClass.setName("Programmer");
        System.out.println(encapsulatedClass.getName());

    }
}
