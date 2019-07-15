package ca.jrvs.challenge;

import java.util.regex.Pattern;

public class DigitCheck {
    public static Boolean DigitsOnly(String text){
      Pattern pattern = Pattern.compile(".*[^0-9].*");
      return !pattern.matcher(text).matches();
}

    public static void main(String[] args) {
        System.out.println(DigitsOnly("123"));
    }
}
