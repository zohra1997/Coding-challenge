package ca.jrvs.challenge;

import java.util.HashMap;
import java.util.Stack;

public class ValidParenthesis {
    /**
     *
     * @param s
     * @return true if all parenthesis are closed in order
     */
    public static boolean isValid(String s) {
        HashMap<Character, Character> myMap = new HashMap<>();
        myMap.put('(',')');
        myMap.put('{','}');
        myMap.put('[',']');
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length();i++ ) {
            char current = s.charAt(i);
            if (myMap.containsKey(current)){
                stack.push(current);
            }
            else {
                // Peek == open brackets
                char peek = stack.peek();
                if ((current == ')' && peek!='(')||(current== '}' && peek!='{')|| (current== ']' && peek!='[')){
                    return false;
                }
                stack.pop();
            }

       }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("()([]){}{"));
    }
}