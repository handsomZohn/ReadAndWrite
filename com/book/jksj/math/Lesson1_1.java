package com.book.jksj.math;

import java.math.BigInteger;

public class Lesson1_1 {

    public static void main(String[] args) {

        int a = 53;
        String b = "110101";
        System.out.println(String.format(" ���� %d �Ķ������� %s", a, Lesson1_1.decimalToBinary(a))); // ��ȡʮ������ 53 �Ķ�������
        System.out.println(String.format(" ���� %s ��ʮ������ %d", b, Lesson1_1.binaryToDecimal(b))); // ��ȡ�������� 110101 ��ʮ������

        // %d ����
        // %s �ַ���
        // %f ������

    }


    /**
     * @param decimalSource
     * @return String
     * @Description: ʮ����ת���ɶ�����
     */
    public static String decimalToBinary(int decimalSource) {
        BigInteger bi = new BigInteger(String.valueOf(decimalSource)); // ת���� BigInteger ���ͣ�Ĭ����ʮ����
        return bi.toString(2); // ���� 2 ָ������ת���ɶ�����
    }

    /**
     * @param binarySource
     * @return int
     * @Description: ������ת����ʮ����
     */
    public static int binaryToDecimal(String binarySource) {
        BigInteger bi = new BigInteger(binarySource, 2);  // ת��Ϊ BigInteger ���ͣ����� 2 ָ�����Ƕ�����
        return Integer.parseInt(bi.toString());     // Ĭ��ת����ʮ����
    }


}
