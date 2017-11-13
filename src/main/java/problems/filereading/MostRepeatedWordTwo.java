package problems.filereading;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MostRepeatedWordTwo {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("LongLineABC.txt");
        Scanner sc = new Scanner(file);

        String line = sc.nextLine();

        String[] words = line.split(" ");

        Map<String, Integer> words_count = new HashMap<String, Integer>();


        for (final String word : words) {
            Integer qty = words_count.get(word);
            if (qty == null) {
                qty = 1;
            } else {
                qty = qty + 1;
            }

            words_count.put(word, qty);
        }

        String bestWord = null;
        int maxQty = 0;
        for (final String word : words_count.keySet()) {
            if (words_count.get(word) > maxQty) {
                maxQty = words_count.get(word);
                bestWord = word;
            }
        }
        System.out.println("Word:");
        System.out.println(Integer.toString(maxQty) + " " + bestWord);

        Map<String, Integer> wordsNoCase = new HashMap<String, Integer>();
        for (final String word : words_count.keySet()) {
            Integer qty = wordsNoCase.get(word.toLowerCase());
            if (qty == null) {
                qty = words_count.get(word);
            } else {
                qty += words_count.get(word);
            }
            wordsNoCase.put(word.toLowerCase(), qty);
        }
        words_count = wordsNoCase;

        String bestWordD = null;
        int maxQtyY = 0;
        for (final String word : words_count.keySet()) {
            if (words_count.get(word) > maxQtyY) {
                maxQtyY = words_count.get(word);
                bestWordD = word;
            }
        }
        System.out.println("Word:");
        System.out.println(Integer.toString(maxQty) + " " + bestWord);

    }


}

	





