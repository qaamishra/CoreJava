package collection.map_interface;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapIterationDemo {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Name", "QAAMISHRA");
        map.put("Role", "QA TEST");
        map.put("Skill-1", "JAVA");
        map.put("Skill-2", "BDD");
        map.put("Skill-3", "Selenium");
        map.put("Skill-4", "Spring");

        System.out.println(map);
        System.out.println("\n========================\n");

        // using for-each loop for iteration over Map.entrySet()
        for (Map.Entry<String, String> entry : map.entrySet())
            System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue());

        System.out.println("\n========================\n");

        //Iterator on entrySet : you can remove entry from the map when a specific key is found using itr.remove() in this approach
        Iterator<Map.Entry<String, String>> itr = map.entrySet().iterator();
        while (itr.hasNext()) {
            Map.Entry<String, String> entry = itr.next();
            System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue());
        }
        System.out.println("\n========================\n");
        //Java8 ForEach
        // forEach(action) method to iterate map
        map.forEach((k, v) -> System.out.println("Key = " + k + ", Value = " + v));

    }

    /*
    |K,     V           |Map.Entry<String,String> entry |  map.entrySet()
    |"Name","QAAMISHRA" |Map.Entry<String,String> entry|
    |"Role","QA TEST"   |Map.Entry<String,String> entry|
    |"Skill-1","JAVA"   |Map.Entry<String,String> entry|
    |"Skill-2","BDD"    |Map.Entry<String,String> entry|
    |"Skill-3","Selenium"|Map.Entry<String,String> entry|
    |"Skill-4","Spring" |Map.Entry<String,String> entry|
     */



}
