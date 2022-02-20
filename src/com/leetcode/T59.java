package com.leetcode;

/**
 * 59. 螺旋矩阵 II
 * 给你一个正整数 n ，生成一个包含 1 到 n2 所有元素，且元素按顺时针顺序螺旋排列的 n x n 正方形矩阵 matrix 。
 */
public class T59 {

    // 官方解题 模拟（屎）
    class Solution {
        public int[][] generateMatrix(int n) {
            int maxNum = n * n;
            int curNum = 1;
            int[][] maxtrix = new int[n][n];
            int row = 0, column = 0;
            int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};  //右下左上
            int directionIndex = 0;
            while (curNum <= maxNum) {
                maxtrix[row][column] = curNum;
                int nextRow = row + directions[directionIndex][0], nextColumn = column + directions[directionIndex][1];
                if (nextRow < 0 || nextRow >= n || nextColumn < 0 || nextColumn >= n || maxtrix[nextRow][nextColumn] != 0) {
                    directionIndex = (directionIndex + 1) % 4;
                }
                row = row + directions[directionIndex][0];
                column = column + directions[directionIndex][1];
            }
            return maxtrix;
        }


    }

    // 模拟
    class Solution1 {
        public int[][] generateMatrix(int n) {
            int top = 0, bottom = n - 1, left = 0, right = n - 1;
            int[][] maxtrix = new int[n][n];
            int k = 1;
            while (k <= n * n) {
                for (int i = left; i <= right; ++i, ++k) maxtrix[top][i] = k;
                ++top;
                for (int i = top; i <= bottom; ++i, ++k) maxtrix[i][right] = k;
                --right;
                for (int i = right; i >= left; --i, ++k) maxtrix[bottom][i] = k;
                --bottom;
                for (int i = bottom; i >= top; --i, ++k) maxtrix[i][left] = k;
                ++left;
            }
            return maxtrix;
        }
    }

    // 按层模拟
    class Solution2 {
        public int[][] generateMatrix(int n) {
            int num = 1;
            int[][] matrix = new int[n][n];
            int left = 0, right = n - 1, top = 0, bottom = n - 1;
            while (left <= right && top <= bottom) {
                for (int column = left; column <= right; column++) {
                    matrix[top][column] = num;
                    num++;
                }
                for (int row = top + 1; row <= bottom; row++) {
                    matrix[row][right] = num;
                    num++;
                }
                if (left < right && top < bottom) {
                    for (int column = right - 1; column > left; column--) {
                        matrix[bottom][column] = num;
                        num++;
                    }
                    for (int row = bottom; row > top; row--) {
                        matrix[row][left] = num;
                        num++;
                    }
                }
                left++;
                right--;
                top++;
                bottom--;
            }
            return matrix;
        }
    }
}



