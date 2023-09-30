package hashtable;

import java.util.HashMap;

public class SubarraySum {

    /**
     * Given an array of integers nums and a target integer target, write a method called subarraySum that finds
     * the indices of a contiguous subarray in nums that add up to the target sum using a hash table (HashMap).
     * Your function should take two arguments:
     * nums: an array of integers representing the input array
     * target: an integer representing the target sum
     * Your function should return a list of two integers representing the starting and ending indices of
     * the subarray that adds up to the target sum. If there is no such subarray,
     * your function should return an empty list.
     */
    public static int[] findSubarraySum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] subarray = new int[2];
        int currentSum = 0;

        for(int i = 0; i<nums.length; i++) {
            currentSum = currentSum + nums[i];
            if(map.containsKey(currentSum - target)){
                subarray[0] = map.get(currentSum-target);
                subarray[1] = i;
                break;
            }
            map.put(currentSum, i);
        }
        return subarray; //TODO
    }
}
