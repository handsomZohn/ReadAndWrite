package com.jksj.math;


import static com.jksj.math.Lesson1_1.decimalToBinary;

public class Lesson1_3 {

    public static void main(String[] args) {

        int a = 53;
        int b = 35;

        System.out.println(String.format(" ���� %d(%s) ������ %d(%s) �İ�λ���򡯽���� %d(%s)",
                a, decimalToBinary(a), b, decimalToBinary(b), Lesson1_3.or(a, b), decimalToBinary(Lesson1_3.or(a, b)))); // ��ȡʮ������ 53 �� 35 �İ�λ����

        System.out.println(String.format(" ���� %d(%s) ������ %d(%s) �İ�λ���롯����� %d(%s)",
                a, decimalToBinary(a), b, decimalToBinary(b), Lesson1_3.and(a, b), decimalToBinary(Lesson1_3.and(a, b))));  // ��ȡʮ������ 53 �� 35 �İ�λ���롱

        System.out.println(String.format(" ���� %d(%s) ������ %d(%s) �İ�λ����򡯽���� %d(%s)",
                a, decimalToBinary(a), a, decimalToBinary(a), Lesson1_3.xor(a, a), decimalToBinary(Lesson1_3.xor(a, a))));  // ��ȡʮ������ 53 �� 35 �İ�λ�����

    }




    /**
     * @Description: �����ư�λ���򡱵Ĳ���
     * @param num1- ��һ�����֣�num2- �ڶ�������
     * @return �����ư�λ���򡱵Ľ��
     */
    public static int or(int num1, int num2) {

        return (num1 | num2);

    }

    /**
     * @Description: �����ư�λ���롱�Ĳ���
     * @param num1- ��һ�����֣�num2- �ڶ�������
     * @return �����ư�λ���롱�Ľ��
     */
    public static int and(int num1, int num2) {

        return (num1 & num2);

    }

    /**

     * @Description: �����ư�λ����򡱵Ĳ���
     * @param num1- ��һ�����֣�num2- �ڶ�������
     * @return �����ư�λ����򡱵Ľ��
     */

    public static int xor(int num1, int num2) {

        return (num1 ^ num2);

    }


}

