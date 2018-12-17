package com.example.kqc.leetcode;

/**
 * Created by yq
 * Date  on : 2018/8/8
 *  移动零
 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。

 示例:

 输入: [0,1,0,3,12]
 输出: [1,3,12,0,0]
 说明:

 必须在原数组上操作，不能拷贝额外的数组。
 尽量减少操作次数。
 */
public class Class8 {
    public static void main(String args[]) {
        int num[] = {0, 1, 0, 3, 12};
        moveZeroes(num);
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + ",");
        }

    }

    public static void moveZeroes(int[] nums) {
        int n = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[i - n] = nums[i];
            } else {
                n++;
            }
        }
        int len = nums.length-1;
        for (int i = 0; i < n; i++) {
            nums[len - i] = 0;
        }

    }
}
