package ca.jrvs.challenge;

import static java.util.Arrays.sort;

public class DublicateContain {
    /**
     * Returns true if an int array contains duplicate values
     * @param nums
     * @return boolean
     */
    public static  boolean containsDuplicate(int[] nums) {
        sort (nums);
        for (int i =0;i<nums.length-1;i++){
            if (nums[i]==nums[i+1])
                return true ;
        }
        return false;
    }
}
