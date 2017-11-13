package problems.filereading;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LongestLine {


    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("LongLineABC.txt");

        if (file.exists()) {

            System.out.println("file exists");
        } else {
            System.out.println("File does not exists!");
        }

        Scanner input = new Scanner(file);
        int maxLength = -1;
        String longLine = null;


        while (input.hasNextLine()) {

            String currentLine = input.nextLine();
            if (currentLine.length() > maxLength) {
                maxLength = currentLine.length();
                longLine = currentLine;
            }


        }
        System.out.println("Longest Line is  : " + longLine);

    }


}
