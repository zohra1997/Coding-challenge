package ca.jrvs.challenge;

import java.util.Arrays;

public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int j=0;
        for (int i = 0;i<nums.length;i++){
            if (nums [i]!=val){
                nums[j]= nums[i];
                j++;

            }
        }

        return j;
    }

    public static void main(String[] args) {
        System.out.println(removeElement((new int []{1,2,3,5,6,4,1,1}),1));
    }
}
