package problems.filereading;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TotalChars {


    public static void main(String[] args) {
        File file = new File("ABC.txt");

        if (file.exists()) {

            System.out.println("Total Characters=" + getCharacterCount(file));
        } else {
            System.out.println("File does not exists!");
        }
    }

    private static int getCharacterCount(File file) {
        FileReader fr = null;
        int charCount = 0;

        try {
            fr = new FileReader(file);
            while (fr.read() > -1) {
                charCount++;
            }

        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (null != fr)
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
        return charCount;
    }
}
