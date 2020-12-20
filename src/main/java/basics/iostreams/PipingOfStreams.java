package basics.iostreams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PipingOfStreams {
    public static void main(String args[]) throws IOException
    {
        //char c;
        String c;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//Piping

        System.out.println("Enter characters . 'q' to quit.");

        // read Characters

        do
        {
            //c = (char) br.read();
            c = String.valueOf(br.read());
            System.out.println(c.toCharArray());
        }while(c != "q");
    }
}
