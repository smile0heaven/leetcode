package com.example.kqc.leetcode;

/**
 * Created by yq
 * Date  on : 2018/8/10
 * 判断一个 9x9 的数独是否有效。只需要根据以下规则，验证已经填入的数字是否有效即可。

 数字 1-9 在每一行只能出现一次。
 数字 1-9 在每一列只能出现一次。
 数字 1-9 在每一个以粗实线分隔的 3x3 宫内只能出现一次。

 示例 1:

 输入:
 [
 ["5","3",".",".","7",".",".",".","."],
 ["6",".",".","1","9","5",".",".","."],
 [".","9","8",".",".",".",".","6","."],
 ["8",".",".",".","6",".",".",".","3"],
 ["4",".",".","8",".","3",".",".","1"],
 ["7",".",".",".","2",".",".",".","6"],
 [".","6",".",".",".",".","2","8","."],
 [".",".",".","4","1","9",".",".","5"],
 [".",".",".",".","8",".",".","7","9"]
 ]
 输出: true
 */
public class Class10 {
    public static void main(String agrs[]) {
//        System.out.print(isValidSudoku());
    }

    //该问题即为，查找行列块中是否有相同元素，可以声明一个与被查询的列相同大小的数组，将第一个要查询的、
//    数字插入数组中，随后把第二个数字插入数组中，数组的值可以作为数组的下标，如果相同下标的数组有值，那就是有重复的
//    对于块而言，由于双重循环，就变成把{{0,0}，{0,1}，{0,2}，{0,3}...}如何转话为块中的元素
//    可得公式为  int cubeX = 3 * (i/3) + j/3;
//    int cubeY = 3 * (i%3) + j%3;
    public static boolean isValidSudoku(char[][] board) {

        for (int i = 0; i < board.length; i++) {
            boolean[] col = new boolean[board.length];
            boolean[] row = new boolean[board.length];
            boolean[] block = new boolean[board.length];
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] != '.') {
                    if (row[board[i][j] - '1']) {
                        return false;
                    } else {
                        row[board[i][j] - '1'] = true;
                    }
                }
                if (board[j][i] != '.') {
                    if (col[board[j][i] - '1']) {
                        return false;
                    } else {
                        col[board[j][i] - '1'] = true;
                    }
                }

                int x = 3 * (i / 3) + j / 3;
                int y = 3 * (i % 3) + j % 3;
                if (board[x][y] != '.') {

                    if (block[board[x][y] - '1']) {
                        return false;
                    } else {
                        block[board[x][y] - '1'] = true;
                    }
                }
            }

        }
        return true;

    }
}
