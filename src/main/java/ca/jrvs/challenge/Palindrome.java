package ca.jrvs.challenge;

import java.util.List;

public class Palindrome {
    public static boolean isPalindrome (String text){
       int length = text.length();
       for (int i = 0;i<(length/2);i++){
           if(text.charAt(i)!=text.charAt(length-i-1)){
               return false;
           }
       }
       return true;

    }
    public static void main(String[] args) {
        System.out.println(isPalindrome("amma"));
    }
}
