package com.book.alibaba.equals;

import java.util.Objects;

/**
 * @Description Object��equals���������׳���ָ���쳣��Ӧʹ�ó�����ȷ����ֵ�Ķ���������equals
 * @Author zohn
 * @Date 2020\1\7 0007 9:21
 * @Param 
 * @Return
 */
public class EqualsTest {
    public static void main(String[] args) {
        String str01 = "001";
        String str02 = null;
        // System.out.println(str01.equals(str02));// Exception in thread "main" java.lang.NullPointerException

        boolean equals = Objects.equals(str01, str02);

        System.out.println("======^_^======����equalsֵΪ: " + equals + ", " + "��ǰ���Լ�����������: EqualsTest.main()");

        // ��������Objects.equals(str01, str02) �ǱȽ�ͨ�õ�
        // �Ժ�2020.01.07��ʼ�����ֵ����д��룬��1.7�Լ����ϵģ�Ҫ��Objects.equals(str01, str02)��
    }
}
