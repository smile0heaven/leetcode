package com.example.kqc.leetcode;

import java.util.Arrays;

/**
 * Created by yq
 * Date  on : 2018/8/6
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 * <p>
 * 说明：
 * <p>
 * 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
 * <p>
 * 示例 1:
 * <p>
 * 输入: [2,2,1]
 * 输出: 1
 * 示例 2:
 * <p>
 * 输入: [4,1,2,1,2]
 * 输出: 4
 */
public class Class5 {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i = i + 2) {
            if (i == nums.length - 1) return nums[nums.length - 1];
            if (nums[i] != nums[i + 1]) {
                return nums[i];
            }
        }
        return nums[nums.length - 1];

    }

    public int singleNumber1(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length; i = i + 1) {
            res ^= nums[i];
        }
        return res;

    }
}
