package ca.jrvs.challenge;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;

public class twoSum {
    public static int[] function(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] res = new int[2];
        for (int i = 0; i < nums.length; ++i) {
            if (map.containsKey(target - nums[i])) {
                res[0] = i;
                res[1] = map.get(target - nums[i]);
                 break;
            }
            map.put(nums[i], i);
        }
        return res;
    }


    public static void main(String[] args) {
        int [] result = function(new int[]{2,7,11,5,4},9);
        System.out.println(Arrays.toString(result));
    }
}