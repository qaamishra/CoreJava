package problems.datastructureproblems;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class FindDuplicateCharacters {

    public static void main(String args[]) {
        printDuplicateCharacters("Programming");
        printDuplicateCharacters("Combination");
        printDuplicateCharacters("Java");
    }

    /*
     * Find all duplicate characters in a String and print each of them.
     */
    public static void printDuplicateCharacters(String word) {
        char[] characters = word.toCharArray();

        // build HashMap with character and number of times they appear in String
        Map<Character, Integer> charMap = new HashMap<Character, Integer>();


        //So a new hash map is build here charMap[key,value] with nothing inside.
        //Consider the word "Java"
        //1st Iteration : if (charMap.containsKey("J"))  -as hash map is null,it doesnt contain goes to else ,
        //and puts the value as charMap["J",1]
        //again else charMap["A",1]
        //again else charMap["V",1]
        //Now again A comes ,its already present in map,if part will be executed.
        //charMap["A",2]
        //charMap[key,value]
        //Final map will look like
        //charMap["J",1]
        //charMap["A",2]
        //charMap["V",1]
        //Then we print and we get J :1time,A:2times ,V: 1time 

        for (Character ch : characters) {
            if (charMap.containsKey(ch)) {

                charMap.put(ch, charMap.get(ch) + 1);

            } else {

                charMap.put(ch, 1);
            }
        }

        // Iterate through HashMap to print all duplicate characters of String

        Set<Map.Entry<Character, Integer>> entrySet = charMap.entrySet();

        System.out.printf("List of duplicate characters in String '%s' %n", word);
        for (Map.Entry<Character, Integer> entry : entrySet) {
            if (entry.getValue() > 1) {
                System.out.printf("%s : %d %n", entry.getKey(), entry.getValue());
            }
        }
    }

}
