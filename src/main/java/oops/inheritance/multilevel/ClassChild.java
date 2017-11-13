package oops.inheritance.multilevel;

/**
 * Created by Ashutosh on 12-11-2017.
 */
public class ClassChild extends ClassParent {

    public void childMethod() {
        System.out.println("Am a childMethod ,I have a house in Pune plus above all");
    }

    public static void main(String[] args) {
        ClassChild classChild = new ClassChild();

        classChild.grandParentMethod();//Inherited
        classChild.parentMethod();//Inherited
        classChild.childMethod();
    }
}
