package problems.filereading;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class LineCharWord {

    //Good
    //Q1: Find total number of lines in file

    //Q2: Find total number characters in file

    // Also total number of words

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("ABC.txt");
        Scanner in = new Scanner(file);
        int words = 0;
        int lines = 0;
        int chars = 0;
        while (in.hasNextLine()) {
            lines++;
            String line = in.nextLine();
            chars += line.length();
            words += new StringTokenizer(line, " ").countTokens();
        }
        System.out.println("lines" + lines);
        System.out.println("chars" + chars);
        System.out.println("words" + words);

    }
}
