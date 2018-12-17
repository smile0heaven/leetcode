package com.example.kqc.leetcode;

/**
 * Created by yq
 * Date  on : 2018/8/14
 * 反转字符串
 * 编写一个函数，其作用是将输入的字符串反转过来。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "hello"
 * 输出: "olleh"
 * 示例 2:
 * <p>
 * 输入: "A man, a plan, a canal: Panama"
 * 输出: "amanaP :lanac a ,nalp a ,nam A"
 */
public class Class11 {
    public static void main(String agrs[]) {
//        String s = "A man, a plan, a canal: Panama";
//        System.out.print(reverseString1(s));
        int i = 1534236469;
        System.out.print(reverse(i) + "");
    }

    public static String reverseString(String s) {
        StringBuilder reserveS = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            reserveS = reserveS.append(s.charAt(i));

        }
        return reserveS.toString();

    }

    public static String reverseString1(String s) {
        char[] chars = s.toCharArray();
        int i = 0;
        int j = chars.length - 1;
        while (i < j) {
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
            i++;
            j--;
        }

        return new String(chars);

    }

    public static int reverse(int x) {
        boolean minus = false;
        String stringx = String.valueOf(x);
        if (stringx.startsWith("-")) {
            stringx = stringx.substring(1);
            minus = true;
        }

        char[] chars = stringx.toCharArray();
        int i = 0;
        int j = chars.length - 1;
        while (i < j) {
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
            i++;
            j--;
        }
        if (chars[0] == 0) {
            for (i = 0; i < chars.length; i++) {
                if (chars[i] != 0) {
                    stringx = new String(chars).substring(i);
                    break;
                }
            }
        } else {
            stringx = new String(chars);
        }
        long longs = Long.parseLong(stringx);
        if (longs < Math.pow(2, 32) - 1) {
            if (minus) {
                return -Integer.parseInt(stringx);
            } else {
                return Integer.parseInt(stringx);
            }
        }
        return 0;


    }

    public static int reverse1(int x) {
        int abs = Math.abs(x);
        int out = 0;
        while (abs > 0) {
            if (out > Integer.MAX_VALUE / 10) {
                return 0;
            }
            out *= 10;
            out += abs % 10;
            abs /= 10;
        }
        if (x < 0) {
            out = -out;
        }
        return out;


    }
}
