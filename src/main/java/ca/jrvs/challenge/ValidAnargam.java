package ca.jrvs.challenge;

import java.util.Arrays;

public class ValidAnargam {
    /**
     *
     * @param word
     * @param anaragam
     * @return true if anaragam
     */
    public static boolean Anargam (String word, String anaragam){
        if(word.length()!=anaragam.length()) {
            return false;
        }
        char [] wordChar = word.toLowerCase().toCharArray();
        char [] anargamChar = anaragam.toLowerCase().toCharArray();
        Arrays.sort(wordChar);
        Arrays.sort(anargamChar);
        return Arrays.equals(wordChar,anargamChar);

    }

    public static void main(String[] args) {
        System.out.println(Anargam("hello","holle"));
    }
}
