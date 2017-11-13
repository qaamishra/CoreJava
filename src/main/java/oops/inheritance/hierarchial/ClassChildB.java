package oops.inheritance.hierarchial;

/**
 * Created by Ashutosh on 12-11-2017.
 */
public class ClassChildB extends ClassParent {

    public void childMethod() {
        System.out.println("Am a childMethod ,I have a house in Pune-East** plus above all");
    }

    public static void main(String[] args) {
        ClassChildB classChild = new ClassChildB();


        classChild.parentMethod();//Inherited
        classChild.childMethod();
    }
}
