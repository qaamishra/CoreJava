package problems.simple;

import java.util.*;

public class SortingHashMap {

    public static String Key = "Key";
    public static String Value = "Value";

    public static void main(String[] args) {

        Map<String, Integer> sortMe = new HashMap<>();
        sortMe.put("Z", 25);
        sortMe.put("G", 55);
        sortMe.put("K", 75);
        sortMe.put("D", 24);
        sortMe.put("A", 10);

        printMyMap(sortMe, "Before sorting");
        printMyMap(sortByKey(sortMe), "After sorting based on Key");//Ideally you always sort based on Key
        printMyMap(sortByValues(sortMe), "After sorting based on Value");

    }

    private static Map sortByValues(Map<String, Integer> sortMe) {
        List list = new LinkedList(sortMe.entrySet());
        // Collections.sort using comparator with compareTo as values
        Collections.sort(list, new Comparator() {
            public int compare(Object o1, Object o2) {
                return ((Comparable) ((Map.Entry) (o1)).getValue()).compareTo(((Map.Entry) (o2)).getValue());
            }
        });


        Map sortedHashMap = new LinkedHashMap();//To preserve the insertion order
        for (Iterator it = list.iterator(); it.hasNext(); ) {
            Map.Entry entry = (Map.Entry) it.next();
            sortedHashMap.put(entry.getKey(), entry.getValue());
        }
        return sortedHashMap;
    }

    private static Map sortByKey(Map<String, Integer> sortMe) {

        return new TreeMap<String, Integer>(sortMe);
    }

    private static void printMyMap(Map<String, Integer> meraMap, String msg) {

        Set<Map.Entry<String, Integer>> myView = meraMap.entrySet();
        Iterator<Map.Entry<String, Integer>> itr = myView.iterator();

        System.out.println(msg);

        while (itr.hasNext()) {
            Map.Entry<String, Integer> myEntry = itr.next();
            System.out.println(myEntry.getKey() + "-->" + myEntry.getValue());
        }
    }
}
