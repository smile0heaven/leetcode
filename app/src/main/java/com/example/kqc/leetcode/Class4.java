package com.example.kqc.leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by yq
 * Date  on : 2018/8/3
 * 给定一个整数数组，判断是否存在重复元素。

 如果任何值在数组中出现至少两次，函数返回 true。如果数组中每个元素都不相同，则返回 false。

 示例 1:

 输入: [1,2,3,1]
 输出: true
 示例 2:

 输入: [1,2,3,4]
 输出: false
 示例 3:

 输入: [1,1,1,3,3,4,3,2,4,2]
 输出: true
 */
public class Class4 {
    public boolean containsDuplicate(int[] nums) {
        if (nums.length == 0 || nums.length == 1) return false;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }

            }
        }
        return false;
    }
    public boolean containsDuplicate1(int[] nums) {
        if(nums.length==0||nums.length==1) return false;
        Arrays.sort(nums);
        int len=nums.length-1;
        for(int i=0;i<len;i++){
            if(nums[i]==nums[i+1]){
                return true;
            }
        }

        return false;
    }
}
