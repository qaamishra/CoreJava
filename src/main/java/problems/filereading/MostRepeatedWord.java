package problems.filereading;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MostRepeatedWord {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("LongLineABC.txt");
        Scanner sc = new Scanner(file);


        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            Map<String, Integer> words_count = new HashMap<String, Integer>();

            //read your line (you will have to determine if this line should be split or is equations
            //also just noticed that the trailing '!' would need to be removed

            String[] words = line.split(" ");
            for (int i = 0; i < words.length; i++) {
                String s = words[i];
                if (words_count.keySet().contains(s)) {
                    Integer count = words_count.get(s) + 1;
                    words_count.put(s, count);
                } else
                    words_count.put(s, 1);

            }

            Integer frequency = null;
            String mostFrequent = null;
            for (String s : words_count.keySet()) {
                Integer i = words_count.get(s);
                if (frequency == null)
                    frequency = i;
                if (i > frequency) {
                    frequency = i;
                    mostFrequent = s;
                }
            }

            System.out.println("The word " + mostFrequent + " occurred " + frequency + " times");
        }
    }


}

	





