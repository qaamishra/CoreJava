package basics.serialization;

public class Employee implements java.io.Serializable {
    public String name;
    public String address;
    //public int transient SSN;
    public int number;

    public void mailCheck() {
        System.out.println("Mailing a check to " + name
                + " " + address);
    }
}
 
