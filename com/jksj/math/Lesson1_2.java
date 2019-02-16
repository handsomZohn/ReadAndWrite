package com.jksj.math;

import java.math.BigInteger;

public class Lesson1_2 {


    public static void main(String[] args) {

        int num = 53;
        int m = 1;
        System.out.println(String.format(" ���� %d �Ķ����������� %d λ�� %d", num, m, Lesson1_2.leftShift(num, m)));   // ����������λ
        System.out.println(String.format(" ���� %d �Ķ����������� %d λ�� %d", num, m, Lesson1_2.rightShift(num, m)));   // ����������λ

        System.out.println();

        m = 3;
        System.out.println(String.format(" ���� %d �Ķ����������� %d λ�� %d", num, m, Lesson1_2.leftShift(num, m)));   // ����������λ
        System.out.println(String.format(" ���� %d �Ķ����������� %d λ�� %d", num, m, Lesson1_2.rightShift(num, m)));   // ����������λ

    }


    /**
     * @param num- �ȴ���λ��ʮ������, m- �����Ƶ�λ��
     * @return int- ��λ���ʮ������
     * @Description: ������λ
     */
    public static int leftShift(int num, int m) {
        return num << m;
    }

    /**
     * @param num- �ȴ���λ��ʮ������, m- �����Ƶ�λ��
     * @return int- ��λ���ʮ������
     * @Description: ������λ
     */
    public static int rightShift(int num, int m) {
        return num >>> m;
    }

}

