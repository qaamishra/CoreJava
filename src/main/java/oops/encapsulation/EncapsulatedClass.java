package oops.encapsulation;

/**
 * Created by Ashutosh on 12-11-2017.
 */
public class EncapsulatedClass {

    //hiding the variables
    private String name;
    private int idNum;
    private int age;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getIdNum() {
        return idNum;
    }

    public void setAge(int newAge) {
        age = newAge;
    }

    public void setName(String newName) {
        name = newName;
    }

    public void setIdNum(int newId) {
        idNum = newId;
    }

}
