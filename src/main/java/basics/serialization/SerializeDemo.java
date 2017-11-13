package basics.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeDemo {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.name = "Mac";
        e.address = "Delhi";
        //e.SSN = 5245;
        e.number = 113;
        try {
            FileOutputStream fileOut =
                    new FileOutputStream("stu.ser");
            ObjectOutputStream out =
                    new ObjectOutputStream(fileOut);
            out.writeObject(e);
            System.out.println("obj serialized");
            out.close();
            fileOut.close();
        } catch (IOException i) {
            i.printStackTrace();
        }
    }
}
 
