package basics.iostreams;

import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderExample {

    public static void main(String[] args) throws IOException {

        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        System.out.println("enter a int");
        //int a = inputStreamReader.read();//The read() method of an InputStream returns an int which contains the byte value of the byte read.
        //you need to perform bytes to char
        char a = (char)inputStreamReader.read();
        System.out.println("you have entered"+a);




    }
}
