package com.demo;

// 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，
// 每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，
// 判断数组中是否含有该整数。



// 解题思路：
//
//很明显，由于该二维数组上到下递增，左到右递增的特殊性，遍历整个矩阵进行查找不是该题目的意图所在。
// 总结规律我们可以发现：应该从矩阵的右上角或者左下角开始查找。
//以右上角为例，首先选取右上角的数字，如果该数字等于要查找的数字，则查找过程结束；如果该数字大于
//要查找的数字，则说明该列其他元素都大于要查找的数字，便可以删掉该列；如果该数字小于要查找的数字，
//则说明该行其他元素也都小于要查找的数字，便可以删掉该行。
//这样，每一次比较都可以剔除一行或者一列，进而缩小查找范围，时间复杂度为O(n)。
public class Find_2arrays {
    public boolean Find(int target,int [][] array){
        if(array==null){
            return false;
        }
        int row=array.length;
        int line=array[0].length;
        for(int i=row-1,j=0;i>=0 && j<line;){
            if (target==array[i][j]){
                System.out.println(i);
                System.out.println(j);
                return true;
            }else if(target<array[i][j]){
                i--;
            }
            else{
                j++;
            }

        }

        return false;
    }

    public static void main(String[] args) {
        Find_2arrays a=new Find_2arrays();
        int [][] array={{1,5,6}, {2,3,5},{8,8,9}};
        a.Find(3,array);
    }

}

