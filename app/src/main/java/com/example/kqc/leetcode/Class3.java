package com.example.kqc.leetcode;

/**
 * Created by yq
 * Date  on : 2018/8/2
 */
public class Class3 {
    class Solution {
        public void rotate(int[] nums, int k) {

            if(nums==null||nums.length==0||nums.length==1||k%nums.length==0) return;
            int j=k%nums.length;
            while(j>0){
                int b=nums[nums.length-1];
                for(int i=nums.length-1;i>0;i--){
                    nums[i]=nums[i-1];
                }
                nums[0]=b;
                j--;
            }
        }
    }

    public void rotate(int[] nums, int k) {
        if(nums==null||nums.length==0||nums.length==1||k%nums.length==0) return;
        int len=nums.length;
        int j=k%nums.length;
        if(j>len/2){
            j=len-j;
            while(j>0){
                int b=nums[0];
                for(int i=0;i<len-1;i++){
                    nums[i]=nums[i+1];
                }
                nums[len-1]=b;
                j--;
            }
        }else{
            while(j>0){
                int b=nums[nums.length-1];
                for(int i=nums.length-1;i>0;i--){
                    nums[i]=nums[i-1];
                }
                nums[0]=b;
                j--;
            }
        }



    }

}
