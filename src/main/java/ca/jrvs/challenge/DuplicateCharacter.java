package ca.jrvs.challenge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DuplicateCharacter {
    public static void main(String[] args) {
        System.out.println(duplicate("hello dear hope you are good!!"));
    }

    /**
     * construct a hash map
     * check for dulicate characters
     * @param text
     * @return array of duplicate characters
     */
    public static List<Character> duplicate (String text){
        HashMap<Character,Integer> map = new HashMap<>();
        char [] charArray = text.toCharArray();
        List<Character> duplicateChars = new ArrayList<>();
        for (char c: charArray){
            if(map.containsKey(c)){
                int count = map.get(c);
                map.put(c,++count);
            }
            else
            {
                map.put(c,1);
            }
        }
        for (char c: map.keySet()){
            if (map.get(c)>1){
                duplicateChars.add(c);
            }
        }
        return duplicateChars;
    }
}
