package com.javase.array;


import java.util.Arrays;

/**
 *@Description ð������ı���
 *@CreateDate 2020/4/15 22:41
 *@Author zz
 *@Version 1.0
 */
public class ��ά�������� {
    public static void main(String[] args) {

        // ��ά��������--ԭ����
        String[][] strs = {{"12", "Java"},{"25", "Ruby"},{"55", "Python"},{"30", "Golang"},{"7", "JavaScript"}};
        // �½�����
        int[] arr = new int[strs.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(strs[i][0]);
        }
        //��һ��ѭ������ȷ��һ�������κͺ������ıȽϵ�����
        for (int i = 0; i < arr.length -1 ; i++) {
            //����Ǻ͵�һ�����ıȽϵ���
            for (int j = i+1; j < arr.length; j++) {
                //����һ����ʱ�ı�������������������������ԭ��ά����ı���
                String[] temp;
                if(arr[i]<arr[j]){
                    temp =  strs[i];
                    strs[i] = strs[j];
                    strs[j] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(strs[i][0]);
        }


        // Arrays.stream(strs).
    }
}
