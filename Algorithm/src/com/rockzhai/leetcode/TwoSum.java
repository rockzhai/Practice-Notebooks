package com.rockzhai.leetcode;

import java.util.HashMap;

public class TwoSum {
    /**
     * Two Sum
     *
     * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
     *
     * You may assume that each input would have exactly one solution, and you may not use the same element twice.
     *
     * Example:
     *
     * Given nums = [2, 7, 11, 15], target = 9,
     *
     * Because nums[0] + nums[1] = 2 + 7 = 9,
     * return [0, 1].
     * **/
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            HashMap<Integer,Integer> hashMap = new HashMap();
            int [] result = new int[2];
            for (int i =0;i<nums.length;i++){
                hashMap.put(nums[i],i);
            }
            for (int i=0;i<nums.length;i++){
                int searchedIndex = target-nums[i];
                if (hashMap.containsKey(searchedIndex)&&hashMap.get(searchedIndex)!=i){
                    int index = hashMap.get(searchedIndex);
                    if (index<i){
                        result[0] = index;
                        result[1] = i;
                    }else {
                        result[1] = index;
                        result[0] = i;
                    }
                }
            }
            return result;
        }
    }
}
