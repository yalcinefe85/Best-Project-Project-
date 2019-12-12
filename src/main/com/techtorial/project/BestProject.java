package main.com.techtorial.project;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BestProject {

    /**
     * Count letters in a given string, this time use more advanced data types (like
     * Map/HashMap). Please exclude special characters like ',' '.' '!' '?' etc
     *
     * @param word
     * @return Map
     */
    public static Map<Character, Integer> countLetters(String word) {

        Map<Character, Integer> lettercounter = new HashMap();

        for (int i=0; i<word.length();i++){

            char ch=word.charAt(i);

            if (Character.isAlphabetic(ch)||Character.isDigit(ch)) {

                if (lettercounter.containsKey(word.charAt(i))) {

                    int count = lettercounter.get(ch);

                    lettercounter.put(ch, ++count);

                } else {

                    lettercounter.put(ch, 1);
                }
            }
        }

        return lettercounter;
    }

    /**
     * Get only unique letters from given string
     * Please use Map data type to achieve the goal
     * 
     * @param word
     * @return List<Character>
     */
    public static List<Character> uniqueLetters(String word) {
        Map<Character, Integer> uniqueMap = new HashMap();
        List<Character> unique3 = new ArrayList();

        return unique3;
    }

    /**
     * Every sentence should be separated and stored as an index of a given ArrayList
     * return list of maps:
     * Map should take 2 parameters and it indicates the position of every word in a given sentence.
     * You should have as many maps as many sentences in a given example are.
     * Store all you maps in a single List
     * 
     * @param sentence
     * @return
     */
    public static List<Map<String, Integer>> complicatedDtaTypes(String sentence) {
        List<Map<String, Integer>> listOfMaps = new ArrayList();


        return listOfMaps;
    }

}