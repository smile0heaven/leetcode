package com.example.kqc.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yq
 * Date  on : 2018/8/16
 * 验证回文字符串(是一个正读和反读都一样的字符串)
 * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
 * <p>
 * 说明：本题中，我们将空字符串定义为有效的回文串。
 */
public class Class14 {
    public static void main(String agrs[]) {
        String s = "0p";
        System.out.print(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        if (s == null || "".equals(s))
            return true;
        int i = 0, j = s.length() - 1;
        s = s.toLowerCase();
        char[] chars = s.toCharArray();
        while (i < j) {
            if (!(('a' <= chars[i] && chars[i] <= 'z') || ('0' <= chars[i] && chars[i] <= '9'))) {
                i++;
                continue;
            }
            if (!(('a' <= chars[j] && chars[j] <= 'z') || ('0' <= chars[j] && chars[j] <= '9'))) {
                j--;
                continue;
            }
            if (chars[i] != chars[j]) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
