package ca.jrvs.challenge;

import java.util.regex.Pattern;

public class DigitCheck {
    /**
     * Checks of the String contains only digits
     * @param text
     * @return boolean
     */
    public static Boolean DigitsOnly(String text){
      Pattern pattern = Pattern.compile(".*[^0-9].*");
      return !pattern.matcher(text).matches();
}

    public static void main(String[] args) {
        System.out.println(DigitsOnly("123"));
    }
}
