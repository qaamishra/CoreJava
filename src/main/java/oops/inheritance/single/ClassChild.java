package oops.inheritance.single;

/**
 * Created by Ashutosh on 12-11-2017.
 */
public class ClassChild extends ClassParent {

    public void childMethod() {
        System.out.println("Am a childMethod ,I have a house in Pune ");
    }

    public static void main(String[] args) {
        ClassChild classChild = new ClassChild();

        classChild.parentMethod();//Inheriting
        classChild.childMethod();
    }
}
