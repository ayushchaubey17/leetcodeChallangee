package com.problems;

import java.util.Arrays;

public class march_01 {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int [] arr = {1,2,4,0,2,1};
     int ans[] =   sol.applyOperations(arr);
        System.out.println(Arrays.toString(ans));


    }
}


class Solution {
    public int[] applyOperations(int[] nums) {

        for(int i=0;i<nums.length-1;i++)
            if(nums[i]== nums[i+1]){
                nums[i]= 2*nums[i];
                nums[i+1]=0;
            }

        int count =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!= 0){
                int temp = nums[i];
                nums[i]= nums[count];
                nums[count++] = temp;
            }
        }

        return nums;
    }
}