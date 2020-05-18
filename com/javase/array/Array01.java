package com.javase.array;

import java.util.Arrays;

/**
 * Created by  on 2016-09-26.
 * 2,3 ���ҹ���
 * 4,5,6 ������
 * ����1�������������Ԫ��ȫ������ŵ�[]����ʽ���� [a,d,f,g]
 * 2�����������Ԫ�ص����ֵ
 * 3���۰����
 * 4��ѡ������
 * 5��ð������
 * 6������븽�����������õ�java�Դ����򷽷���
 */
public class Array01 {
    public static void main(String[] args) {
        int[] arr = {3, 1, 45, 56, 32, 54, 56};
        int[] arr02 = {10, 13, 16, 36, 45, 78, 89, 156}; //3���õ�arr02
        //1����ӡ����[ԭ����ӡ]
        System.out.println("------yuanyangdayin---------");
        printArr(arr);
        //2����ȡ��������ֵ
        System.out.println("------max---------");
        getMax(arr);
        //3���۰���� ���������������۰���� �����±� �ǣ�
        System.out.println("------halfSearch---------");
        int halfSearch = halfSearch(arr02, 45);
        System.out.println(halfSearch);
        //4��ѡ������
        System.out.println("------selectSort---------");
        selectSort(arr);
        //5��ð������
        System.out.println("------bubbleSort---------");
        bubbleSort(arr);

        //6����java �Դ��� ����ʽ[�ײ��װ]
        System.out.println("------Arrays.sort---------");
        Arrays.sort(arr);
        printArr(arr);
    }

    /**
     * ��ӡ����
     *
     * @param arr ��������
     */
    static void printArr(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < getLength(arr); i++) {
            if (i != (getLength(arr) - 1)) {
                System.out.print(arr[i] + ",");
            } else {
                System.out.println(arr[i] + "]");
            }
        }
    }


    /**
     * ��ȡ���鵱�е����ֵ
     *
     * @param arr
     */
    static void getMax(int[] arr) {
        int max = 0;
        for (int i = 0; i < getLength(arr); i++) {
            if (arr[i] > arr[max]) max = i;
        }
        System.out.println("�����������Ԫ�����ֵ�ǣ�" + arr[max]);
    }

    /**
     * �۰����
     *
     * @param arr02 ��������
     * @param key   Ԫ��
     * @return
     */
    static int halfSearch(int arr02[], int key) {
        int min, mid, max;
        min = 0;
        max = arr02.length - 1;
        mid = (min + max) / 2;
        while (key != arr02[mid]) {
            if (key > arr02[mid]) min = mid + 1;
            if (key < arr02[mid]) max = mid - 1;
            if (min > max) return -1; //��ʾ�����ڸ�Ԫ��
            mid = (min + max) / 2;
        }
        return mid;
    }
    //���� ��һ�ַ�ʽ��ѡ������
    //getLength��arr��-1 ��ʾ�����һ��Ԫ�أ��Ͳ�����ѭ���Ƚϣ���Ϊ��ʣ��һ��
    //i = 0��j = i+1 ����ʾ������ǰ������Ԫ����ȣ��������ͬһ��Ԫ�����Ƚϵ������

    /**
     * getLength��arr��-1 ��ʾ�����һ��Ԫ�أ��Ͳ�����ѭ���Ƚϣ���Ϊ��ʣ��һ��
     * i = 0��j = i+1 ����ʾ������ǰ������Ԫ����ȣ��������ͬһ��Ԫ�����Ƚϵ������
     *
     * @param arr
     */
    static void selectSort(int[] arr) {
        for (int i = 0; i < (getLength(arr) - 1); i++) {
            for (int j = i + 1; j < getLength(arr); j++) {
                if (arr[i] > arr[j]) swap(arr, i, j);
            }
        }
        printArr(arr);
    }

    //ð������
    static void bubbleSort(int[] arr) {
        for (int x = 0; x < getLength(arr) - 1; x++) {
            for (int y = 0; y < getLength(arr) - x - 1; y++) {
                if (arr[y] > arr[y + 1]) swap(arr, y, y + 1); //����if�ж�������Ĭ�ϰ�������Ԫ�شӴ�С�����򡿵�˳������
            }
        }
        printArr(arr);
    }

    //��װ�ķ�����������ȡ ����ĳ���

    /**
     * @param arr
     * @return ����ĳ���
     */
    static int getLength(int[] arr) {
        return arr.length;
    }
    //����ʱ��Ҫ����λ�õĽ��������ǵ���λ�õķ���

    /**
     * @param arr ��������
     * @param a   �±�a
     * @param b   �±�b
     */
    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    //
}
