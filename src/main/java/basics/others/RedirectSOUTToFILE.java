package basics.others;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;


public class RedirectSOUTToFILE {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("SystemOutPrintLn.txt");
        FileOutputStream fis = new FileOutputStream(file);
        PrintStream out = new PrintStream(fis);

        System.setOut(out);

        System.out.println("Hello1");
        System.out.println("printed in file");


    }
}
