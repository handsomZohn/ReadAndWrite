package com.book.algorithm.sort;

/**
 * 排序·算法-插入排序
 */
public class Insertionsort {

    public static int[] insertSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            // 插入的数
            int insertVal = arr[i];
            // 被插入的位置（准备和前一个数进行比较）
            int index = i - 1;
            // 如果插入的数比被插入的数小
            while (index >= 0 && insertVal < arr[index]) {
                // 将arr[index]向后移动
                arr[index + 1] = arr[index];
                // 将index向前移动
                index--;
            }
            //  将插入的数据放在合适的位置
            arr[index+1] = insertVal;
        }
        return arr;
    }

}
