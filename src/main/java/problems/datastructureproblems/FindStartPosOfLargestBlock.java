package problems.datastructureproblems;

import java.util.*;

/**
 * Created by Ashutosh on 9/21/2016.
 */
public class FindStartPosOfLargestBlock {

    public static void main(String[] args) {

        String given = "aaaabbbbbbbbbccdddeefff"; //here the largest block is b and we need to find its start position

        HashMap<Character, Integer> myMap = new HashMap<>();

        //build the hasmap
        for (int i = 0; i < given.length(); i++) {

            Character eachChar = given.charAt(i);
            if (myMap.containsKey(eachChar)) {
                myMap.put(eachChar, myMap.get(eachChar) + 1);
            } else {
                myMap.put(eachChar, 1);
            }

        }

        int maxBlockCharacter = Collections.max(myMap.values());

        Character getKeyFromMap = null;
        //Iterate to get the key based on the value
        Set<Map.Entry<Character, Integer>> entryView = myMap.entrySet();
        Iterator<Map.Entry<Character, Integer>> itr = entryView.iterator();

        while (itr.hasNext()) {

            Map.Entry<Character, Integer> eView = itr.next();
            if (eView.getValue() == maxBlockCharacter) {

                getKeyFromMap = eView.getKey();
                System.out.println("maxKeyInMap : " + getKeyFromMap);
            }
        }

        //Now find the position of getKeyFromMap and print
        for (int j = 0; j <= given.length(); j++) {

            if (given.charAt(j) == getKeyFromMap) {
                System.out.println("The position is : " + j);
                break;

            }

        }

    }


}
