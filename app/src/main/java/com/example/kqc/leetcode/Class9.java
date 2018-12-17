package com.example.kqc.leetcode;

import java.util.Arrays;

/**
 * Created by yq
 * Date  on : 2018/8/8
 * 两数之和
 * 给定一个整数数组和一个目标值，找出数组中和为目标值的两个数。
 * <p>
 * 你可以假设每个输入只对应一种答案，且同样的元素不能被重复利用。
 * <p>
 * 示例:
 * <p>
 * 给定 nums = [2, 7, 11, 15], target = 9
 * <p>
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 */
public class Class9 {
    public static void main(String args[]) {
        int num[] = {0,0};
        int result[] = twoSum1(num, 0);
        System.out.print(num[result[0]] + num[result[1]]);

    }

    public static int[] twoSum(int[] nums, int target) {
        int result[] = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = j;
                    result[1] = i;
                    break;
                }
            }
            if (result[0] != 0) {
                break;
            }
        }
        return result;

    }

    public static int[] twoSum1(int[] nums, int target) {
        int[] res = new int[2];
        if (nums == null || nums.length < 2)
            return res;

        int max = nums[0];
        int min = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i])
                max = nums[i];
            if (min > nums[i])
                min = nums[i];
        }

        int[] index = new int[max - min + 1];
        target = target;
        int other = 0;
        for (int i = 0; i < nums.length; i++) {
            other = target - nums[i];
            if (other < min || other > max) {
                continue;
            }
            if (index[other - min] > 0) {
                res[0] = index[other - min] - 1;
                res[1] = i;
                return res;
            }
            index[nums[i] - min] = i + 1;
        }
        return res;
    }

    public static int[] twoSum2(int[] nums, int target) {
        int[] result = new int[2];
        int[] copyNums = new int[nums.length];
        for (int i = 0; i < nums.length; i++)
            copyNums[i] = nums[i];
        Arrays.sort(copyNums);
        int i = 0;
        int n = i + 1;
        while (i < copyNums.length - 1 && n < copyNums.length) {
            if (copyNums[i] + copyNums[n] == target) {
                result[0] = copyNums[i];
                result[1] = copyNums[n];
                break;
            } else if (copyNums[i] + copyNums[n] > target) {
                i--;
            } else if (copyNums[i] + copyNums[n] < target) {
                i++;
                n++;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if (result[0] == nums[j]) {
                result[0] = j;
                break;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if (result[1] == nums[j]&&j!=result[0]) {
                result[1] = j;
                break;
            }
        }

        return result;
    }
}
