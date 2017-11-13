package oops.inheritance.hierarchial;

/**
 * Created by Ashutosh on 12-11-2017.
 */
public class ClassChildA extends ClassParent {

    public void childMethod() {
        System.out.println("Am a childMethod ,I have a house in Pune-West** plus above all");
    }

    public static void main(String[] args) {
        ClassChildA classChild = new ClassChildA();


        classChild.parentMethod();//Inherited
        classChild.childMethod();
    }
}
