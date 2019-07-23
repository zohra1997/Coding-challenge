package ca.jrvs.challenge;

public class MaxMinValues {

    public static String function (int [] nums){
        int min = nums [0];
        int max = nums[0];
        for (int i=0; i<nums.length; i++){
          if (nums[i]<min){
              min = nums[i];
          }
          if (nums[i]>max){
              max = nums[i];
          }
        }
     return "MIN: "+min+" MAX: "+max;

    }

    public static void main(String[] args) {
        System.out.println(function(new int [] {9,9,8,17,6,12 ,1,8,90}));
    }
}
