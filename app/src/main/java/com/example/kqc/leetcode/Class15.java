package com.example.kqc.leetcode;

/**
 * Created by yq
 * Date  on : 2018/8/17
 * 字符串转整数（atoi）
 * 实现 atoi，将字符串转为整数。
 * <p>
 * 在找到第一个非空字符之前，需要移除掉字符串中的空格字符。如果第一个非空字符是正号或负号，选取该符号，并将其与后面尽可能多的连续的数字组合起来，这部分字符即为整数的值。如果第一个非空字符是数字，则直接将其与之后连续的数字字符组合起来，形成整数。
 * <p>
 * 字符串可以在形成整数的字符后面包括多余的字符，这些字符可以被忽略，它们对于函数没有影响。
 * <p>
 * 当字符串中的第一个非空字符序列不是个有效的整数；或字符串为空；或字符串仅包含空白字符时，则不进行转换。
 * <p>
 * 若函数不能执行有效的转换，返回 0。
 * <p>
 * 说明：
 * <p>
 * 假设我们的环境只能存储 32 位有符号整数，其数值范围是 [−231,  231 − 1]。如果数值超过可表示的范围，则返回  INT_MAX (231 − 1) 或 INT_MIN (−231) 。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "42"
 * 输出: 42
 */
public class Class15 {
    public static void main(String agrs[]) {
        String s = "   -42";
        System.out.print(myAtoi(s));
    }

    public static int myAtoi(String str) {
        int num = 0;
        str = str.trim();
        int i = 0;
        if (str.charAt(0) == '-' && (str.charAt(1) >= '0' && str.charAt(1) <= '9')) {

            for (i = 1; i < str.toCharArray().length; i++) {
                if (!(str.charAt(i) >= '0' && str.charAt(i) <= '9')) {
                    str = str.substring(0, i);
                    num = Integer.parseInt(str);
//                    num = -num;
                    break;
                }


            }
        } else if ((str.charAt(0) >= '0' && str.charAt(0) <= '9')) {
            int j = 0;
            for (j = 0; j < str.toCharArray().length; j++) {
                if (!(str.charAt(j) >= '0' && str.charAt(j) <= '9')) {
                    break;
                }
                str = str.substring(0,j);
                num = Integer.parseInt(str);
            }
        }
        return num;


    }
}
