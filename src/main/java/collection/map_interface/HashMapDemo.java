package collection.map_interface;

import java.util.*;
import java.util.stream.Collectors;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        map.put("Name","QAAMISHRA");
        map.put("Role","QA TEST AUTOMATION");
        map.put("Skill-1","JAVA");
        map.put("Skill-2","BDD");
        map.put("Skill-3","Selenium");
        map.put("Skill-4","Spring");

        System.out.println(map);

        Set<String> skillsKey=map.keySet().stream().filter(s->s.contains("Skill")).collect(Collectors.toSet());
        System.out.println("Skill are : ");
        for (String myKey:skillsKey) {
            System.out.println(map.get(myKey));
        }


        List<String> mapKeys = new ArrayList(map.keySet());
        System.out.println("mapKeys "+mapKeys);
        List<Integer> mapValues = new ArrayList(map.values());
        System.out.println("mapValues "+mapValues);


    }
}
