package basics.comparator;

/**
 * Created by Ashutosh on 9/11/2016.
 */
public class Employee {

    private int id;
    private String name;
    private int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;

    }

    public int getId() {

        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
//https://www.mkyong.com/java/java-object-sorting-example-comparable-and-comparator/

}


