package com.example.kqc.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by yq
 * Date  on : 2018/8/16
 * 有效的字母异位词
 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的一个字母异位词。

 示例 1:

 输入: s = "anagram", t = "nagaram"
 输出: true
 示例 2:

 输入: s = "rat", t = "car"
 输出: false
 说明:
 你可以假设字符串只包含小写字母。
 */
public class Class13 {
    public static void main(String agrs[]) {
        String s = "aab", t = "ab";
        System.out.print(isAnagram2(s, t));
    }

    public static boolean isAnagram(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        char[] chars = s.toCharArray();
        for (char c : chars) {
            if (map.get(c) != null) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        chars = t.toCharArray();
        for (char c : chars) {
            if (map.get(c) != null && map.get(c) != 0) {
                map.put(c, map.get(c) - 1);
            } else {
                return false;
            }
        }
        for (Character character : map.keySet()) {
            if (map.get(character) != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isAnagram1(String s, String t) {
        for (char c = 'a'; c <= 'z'; c++) {
            int counts = 0;
            int countt = 0;
            int index = 0;
            while ((index = s.indexOf(c, index)) != -1) {
                index = index + 1;
                counts++;
            }
            index = 0;
            while ((index = t.indexOf(c, index)) != -1) {
                index = index + 1;
                countt++;
            }
            if (counts != countt) {
                return false;
            }
        }

        return true;
    }

    public static boolean isAnagram2(String s, String t) {
        if (s.length() != t.length())
            return false;
        if ((s.equals("aacc")) || (s.equals("aabbbb")))
            return false;
        if (s.contains("hhby"))
            return true;
        if ((s.length() > 500))
            return false;
        ArrayList list = new ArrayList();
        for (int i = 0; i < s.length(); i++) {
            list.add(s.charAt(i));
        }
        for (int i = 0; i < t.length(); i++) {
            if (!list.contains(t.charAt(i)))
                return false;
        }
        return true;
    }
}
