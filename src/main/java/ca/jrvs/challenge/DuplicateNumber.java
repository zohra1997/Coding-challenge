package ca.jrvs.challenge;

import static java.util.Arrays.sort;

public class DuplicateNumber {
    /**
     * chcek for duplicate numbers and return the first one
     * @param array
     * @return first duplicate integer from an array
     */
    public static int duplicate(int [] array){
       sort(array);
       for (int i = 0;i<array.length-1;i++){
           if (array[i]==array[i+1]){
               return array[i];
           }
       }

      return (Integer) null;
    }

    public static void main(String[] args) {
        System.out.println(duplicate(new int [] {1,3,6,7,7}));
    }
}
