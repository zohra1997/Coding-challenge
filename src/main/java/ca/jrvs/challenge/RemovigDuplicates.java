package ca.jrvs.challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemovigDuplicates {
    /**
     * Use sets to get unique elements of an array
     * @param nums
     * @return length of unique elements
     */
    public static int functionApi (Integer  [] nums){
        Set<Integer> targetSet = new HashSet<Integer>(Arrays.asList(nums));
        System.out.println(targetSet);
        return targetSet.size();
    }

    /**
     * uses loops to find unique characters in an array
     * @param nums
     * @return count of unique elements in an array
     */
    public static  int function (int [] nums ){
        int count = 1;
        ArrayList<Integer> uniques = new ArrayList<>();
      for (int i=0;i<nums.length-1;i++){
          if (nums[i]!=nums[i+1]){
              uniques.add( nums[i]);
              ++count;
          }
      }
        System.out.println(uniques);
      return count;
    }

    public static void main(String[] args) {
        System.out.println(functionApi(new Integer [] {1,2,2,3,3,4,4,5,6,6,6,6,6,7,7,7}));
        System.out.println(function(new int [] {1,2,2,3,3,4,4,5,6,6,6,6}));
    }
}
