package com.example.kqc.leetcode;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by yq
 * Date  on : 2018/8/15
 * 字符串中的第一个唯一字符
 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。

 案例:

 s = "leetcode"
 返回 0.

 s = "loveleetcode",
 返回 2.
 */
public class Class12 {
    public static void main(String agrs[]) {
        String s = "loveleetcode";
        System.out.print(firstUniqChar1(s) + "");
    }

    public static int firstUniqChar(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            int j = 0;
            for (j = 0; j < chars.length; j++) {
                if (chars[i] == chars[j] && i != j) {
                    break;
                }
            }
            if (j == chars.length) {
                return i;
            }
        }
        return -1;
    }

    public static int firstUniqChar1(String s) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (map.get(chars[i]) != null) {
                map.put(chars[i], -1);
            } else {
                map.put(chars[i], i);
            }
        }
        for (Character character : map.keySet()) {
            if (map.get(character) != -1) {
                return map.get(character);
            }
        }

        return -1;
    }

    public static int firstUniqChar2(String s) {
        int result = -1;
        for (char c = 'a'; c <= 'z'; c++) {
            int index = s.indexOf(c);
            if (index != -1 && index == s.lastIndexOf(c)) {
                result = result != -1 ? Math.min(result, index) : index;
             }
        }
        return result;
    }
}
