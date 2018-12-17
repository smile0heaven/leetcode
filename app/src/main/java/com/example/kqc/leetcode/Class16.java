package com.example.kqc.leetcode;

import junit.framework.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by yq
 * Date  on : 2018/8/20
 */
public class Class16 {
    test mTest;
    hah mHah;
    String s;

    public static void main(String agrs[]) {
        String s = "   -42";
        Class16 class16 = new Class16();
        hah mHah = new hah("22");
        s = "1232";
        class16.myAtoi();
        mHah.name = "2333";
        s = "2333";

//        hah mHah1 = new hah("2222");
        class16.myAtoi();

    }

    public int numIslands(char[][] grid) {
        int res = 0;
        boolean[][] read = new boolean[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (!read[i][j] && grid[i][j] == '1') {
                    findIsland(grid, i, j, read);
                    res++;
                }
            }
        }
        return res;
    }

    public void findIsland(char[][] grid, int i, int j, boolean[][] read) {
        if (i < 0 || j < 0) return;
        if (i >= grid.length || j >= grid[0].length) return;
        if (grid[i][j] == 0 || read[i][j]) return;
        read[i][j] = false;
        findIsland(grid, i - 1, j, read);
        findIsland(grid, i + 1, j, read);
        findIsland(grid, i, j - 1, read);
        findIsland(grid, i, j + 1, read);
    }


    public void myAtoi() {
        if (mTest == null) {
            mTest = new test() {
                @Override
                public void p() {
                    System.out.println(s);
                }
            };
            mTest.p();
        } else {
            mTest.p();
        }
    }

    public int openLock(String[] deadends, String target) {
        char[] init = "0000".toCharArray();
        char[] tar = target.toCharArray();
        int length = 0;
        for (int i = 0; i < init.length - 1; i++) {
            while (tar[i] != init[i]) {
                if (init[i] < tar[i])
                    init[i] = init[i]++;
                else
                    init[i] = init[i]++;

                while (Arrays.asList(deadends).contains(init.toString())) {
                    init[i + 1] = init[i + 1]++;
                    if (init[i + 1] == '9') {

                    }
                    length++;
                }
                length++;
            }
        }
        return 1;
    }

    public static class hah {
        String name = "21";

        public hah(String name) {
            this.name = name;
        }
    }

    public interface test {
        //        public void p() {
//            System.out.print();
//        }
        public void p();

    }
}
