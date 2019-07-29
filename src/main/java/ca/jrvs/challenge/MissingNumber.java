package ca.jrvs.challenge;

import static java.util.Arrays.sort;

public class MissingNumber {
    /**
     * From a sorted itn array return the missing number
     * @param nums
     * @return missing number
     */
    public static int  missingNumber (int [] nums){
        sort(nums);
        for (int i = 0; i<nums.length-1; i++) {
            if (nums[i+1]>nums[i]+1){  
                return  nums[i]+1;

            }

        }

     return 0;
    }


    public static void main(String[] args) {
        System.out.println(missingNumber(new int [] {0,2,3,5}));

    }
}
