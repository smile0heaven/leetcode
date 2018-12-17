package com.example.kqc.leetcode;


import java.util.ArrayList;
import java.util.List;

//  Created by yq
//  Date  on : 2018/8/1
//  从排序数组中删除重复项
//
// 给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
//
// 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。 你可以想象内部操作如下:
//
// // nums 是以“引用”方式传递的。也就是说，不对实参做任何拷贝
// int len = removeDuplicates(nums);
//
// // 在函数里修改输入数组对于调用者是可见的。
// // 根据你的函数返回的长度, 它会打印出数组中该长度范围内的所有元素。
// for (int i = 0; i < len; i++) {
// print(nums[i]);
// }
//
public class Class1 {

    public static void main(String[] args) {
         int[] nums = {1, 2, 3, 4, 5};

        int len = removeDuplicates(nums);
        for (int i = 0; i < len; i++) {
            System.out.print((nums[i]));
        }
    }
    public static int removeDuplicates(int[] nums) {
        int lenght = 1;
        int s = 1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = s; j < nums.length; j++) {
                if (nums[i] < nums[j]) {
                    s = j + 1;
                    nums[i + 1] = nums[j];
                    lenght++;
                    break;
                }
            }
            if (i < nums.length - 1 && nums[i] > nums[i + 1]) {
                break;
            }
        }
        return lenght;
    }
}
