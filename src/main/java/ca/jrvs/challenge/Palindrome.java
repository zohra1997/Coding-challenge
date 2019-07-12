package ca.jrvs.challenge;

import java.util.List;

public class Palindrome {
    public static boolean isPalindrome (String text){
        char[] characters = text.toLowerCase().replace(" ","").toCharArray();
        char [] reverseChar = new char [characters.length];
        int j =0;
        for (int i = characters.length-1; i>=0;i--){
            reverseChar[j]=characters[i];
            j++;
        }

       for (int i = 0; i<characters.length; i++){
           if (!(reverseChar[i]==characters[i]))
               return false;
       }
        return true;

    }
    public static void main(String[] args) {
        System.out.println(isPalindrome("sanas "));
    }
}
