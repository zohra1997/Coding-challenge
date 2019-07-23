package ca.jrvs.challenge;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemovigDuplicates {
    public static int functionApi (Integer  [] nums){
        Set<Integer> targetSet = new HashSet<Integer>(Arrays.asList(nums));
        System.out.println(targetSet);
        return targetSet.size();
    }
    public static  int function (int [] nums ){
        int count = 1;
      for (int i=0;i<nums.length-1;i++){
          if (nums[i]!=nums[i+1]){
              ++count;
          }
      }
      return count;
    }

    public static void main(String[] args) {
        System.out.println(functionApi(new Integer [] {1,2,2,3,3,4,4,5,6,6,6,6,6,7,7,7}));
        System.out.println(function(new int [] {1,2,2,3,3,4,4,5,6,6,6,6}));
    }
}
