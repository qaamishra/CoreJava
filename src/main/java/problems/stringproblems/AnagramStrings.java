package problems.stringproblems;

import java.util.Arrays;

/**
 * Created by Ashutosh on 11-Aug-16.
 * Please contact mishra.techie@gmail.com with your queries
 */
public class AnagramStrings {

    public static void main(String[] args) {

        AnagramStrings anagramStrings = new AnagramStrings();
        System.out.println(anagramStrings.isAnagrams("insect", "incest"));

        System.out.println(anagramStrings.isAnagrams("madam curie", "radium came"));
        System.out.println(anagramStrings.isAnagrams("Madam curie", "radiUm came")); //caps and non caps

        System.out.println(anagramStrings.isAnagrams("silent", "listen"));

        System.out.println(anagramStrings.isAnagrams("anna madrigal", "aman andagirl"));
        System.out.println(anagramStrings.isAnagrams("anna madrigal", "a man and a girl"));//Different spaces

        System.out.println(anagramStrings.isAnagrams("Mother In Law", "Hitler Woman"));
        System.out.println(anagramStrings.isAnagrams("DORMITORY", "Dirty Room"));


    }

    public boolean isAnagrams(String s1, String s2) {


        char[] ch1 = s1.toLowerCase().replaceAll("\\s", "").toCharArray();
        char[] ch2 = s2.toLowerCase().replaceAll("\\s", "").toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        return Arrays.equals(ch1, ch2);
    }
}
