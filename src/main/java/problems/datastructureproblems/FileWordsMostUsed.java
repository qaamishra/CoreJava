package problems.datastructureproblems;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * Created by Ashutosh on 9/10/2016.
 */
//Given a file which consist of sentences. Find most 5 used and 5 least used words


public class FileWordsMostUsed {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("PQR.txt");
        Scanner scanner = new Scanner(file);

        //Fill in map with count of each word
        Map<String, Integer> myMap = new HashMap<>();

        while (scanner.hasNextLine()) {

            String linecontent = scanner.nextLine();
            StringTokenizer words = new StringTokenizer(linecontent, " ");

            while (words.hasMoreTokens()) {

                String tmpWord = words.nextToken();
                if (myMap.containsKey(tmpWord)) {
                    myMap.put(tmpWord, myMap.get(tmpWord) + 1);
                } else {
                    myMap.put(tmpWord, 1);
                }
            }
        }


        //Get max and min value from Values of map.(K,Value)
        int maxValueInMap = (Collections.max(myMap.values()));
        int minValueInMap = (Collections.min(myMap.values()));

        System.out.println("maxValueInMap  " + maxValueInMap);
        System.out.println("minValueInMap  " + minValueInMap);

        Set<Map.Entry<String, Integer>> entryView = myMap.entrySet();

        Iterator<Map.Entry<String, Integer>> itr = entryView.iterator();

        while (itr.hasNext()) {

            Map.Entry<String, Integer> eView = itr.next();
            if (eView.getValue() == maxValueInMap) {

                System.out.println("maxValueInMap : " + eView.getKey());
            } else if (eView.getValue() == minValueInMap) {
                System.out.println("minValueInMap : " + eView.getKey());
            }
        }

        //Now that you got max and min ,to get Five use words Just iterate.
        List<String> mapKeys = new ArrayList(myMap.keySet());
        List<Integer> mapValues = new ArrayList(myMap.values());

        //Imp
        Collections.sort(mapValues);

        //This loop will run for 5 times only
        System.out.println("\nTop 5 most used words\n");
        Iterator<Map.Entry<String, Integer>> itr3 = entryView.iterator();
        int countTop = 0;
        while (itr3.hasNext()) {

            if (countTop >= 5) break;
            else {
                Map.Entry<String, Integer> eView2 = itr.next();
                System.out.println(eView2.getKey());
            }
            countTop++;

        }


        //Imp
        Collections.sort(mapValues, Collections.reverseOrder());
        System.out.println("\nTop 5 least used words\n");
        Iterator<Map.Entry<String, Integer>> itr2 = entryView.iterator();
        int count = 0;
        while (itr.hasNext()) {

            if (count >= 5) break;
            else {
                Map.Entry<String, Integer> eView2 = itr.next();
                System.out.println(eView2.getKey());
            }
            count++;

        }

    }
}
