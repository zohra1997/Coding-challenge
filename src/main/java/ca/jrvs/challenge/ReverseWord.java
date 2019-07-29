package ca.jrvs.challenge;

import java.util.ArrayList;

public class ReverseWord {
    public static String reverseWords(String text) {
        String[] words = text.split(" ");
        ArrayList<String> reversed = new ArrayList<>();
        for (int i = words.length-1;i >=0;i--){
           reversed.add(words[i]);

        }
        return String.join(" ", reversed);
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("hello how are you"));
    }
}
