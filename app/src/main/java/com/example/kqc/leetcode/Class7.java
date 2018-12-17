package com.example.kqc.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yq
 * Date  on : 2018/8/7
 * 给定一个非负整数组成的非空数组，在该数的基础上加一，返回一个新的数组。

 最高位数字存放在数组的首位， 数组中每个元素只存储一个数字。

 你可以假设除了整数 0 之外，这个整数不会以零开头。

 示例 1:

 输入: [1,2,3]
 输出: [1,2,4]
 解释: 输入数组表示数字 123。
 示例 2:

 输入: [4,3,2,1]
 输出: [4,3,2,2]
 解释: 输入数组表示数字 4321。
 */
public class Class7 {
    public static void main(String args[]) {
        int num[] = {11,2,1};
        int num1[] = plusOne2(num);
        for (int i = 0; i < num1.length; i++) {
            System.out.print(num1[i]+",");
        }

    }

    public static int[] plusOne(int[] digits) {
        List<Integer> res = new ArrayList<>();
        Long num = 0L;
        Long n = 1L;
        for (int i = digits.length - 1; i >= 0; i--) {
            num = num + digits[i] * n;
            System.out.print(num);
            n = n * ((int) Math.pow(10, String.valueOf(digits[i]).length()));
        }
        num = num + 1;
        n = (long) Math.pow(10, String.valueOf(num).length() - 1);
        while (n >= 1) {
            int m = (int) (num / n);
            res.add(m);
            num = num - n * m;
            n = n / 10;
        }
        int nums[] = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            nums[i] = res.get(i);
        }
        return nums;

    }

    public static int[] plusOne1(int[] digits) {
        List<Integer> res = new ArrayList<>();
        if (digits[digits.length - 1] == 9) {
            int n = digits.length - 1;
            while (digits[n] == 9 && n != 0) {
                digits[n] = 0;
                n--;
            }
            digits[n] = digits[n] + 1;
        }else{
            digits[digits.length - 1]=digits[digits.length - 1]+1;
        }
        for (int i = 0; i < digits.length; i++) {
            long n = (long) Math.pow(10, String.valueOf(digits[i]).length() - 1);
            long num = digits[i];
            while (n >= 1) {
                int m = (int) (num / n);
                res.add(m);
                num = num - n * m;
                n = n / 10;
            }
        }
        int nums[] = new int[res.size()];
        for (int i = 0; i<res.size(); i++) {
            nums[i] = res.get(i);
        }
        return nums;


    }

    public static  int[] plusOne2(int[] digits) {
        boolean add = true;
        int len = digits.length;
        for (int i = len - 1; i > -1; i--) {
            if (digits[i] == 9 ) {
                digits[i] = 0;
            } else {
                digits[i] += 1;
                return digits;
            }
        }

        int[] newArray = new int[len + 1];
        newArray[0] = 1;
        return newArray;
    }
}
