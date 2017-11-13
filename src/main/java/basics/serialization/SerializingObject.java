package basics.serialization;

import java.io.*;


public class SerializingObject {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please enter File name : ");

        String file = in.readLine();

        System.out.print("Enter extention : ");

        String ext = in.readLine();

        String filename = file + "." + ext;

        File f = new File(filename);

        try {

            ObjectOutput ObjOut = new ObjectOutputStream(new FileOutputStream(f));

            ObjOut.writeObject(f);

            ObjOut.close();

            System.out.println(
                    "Serializing an Object Creation completed successfully.");

        } catch (IOException e) {

            System.out.println(e.getMessage());

        }

    }

}
 

