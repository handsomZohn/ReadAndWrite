package com.javase.string;

import org.junit.Test;

/**
 *@Description Intern ʾ������ 
 *@CreateDate 2020\5\18 0018 15:30
 *@Author zz
 *@Version 1.0
 */
public class StringInternTest {

    /**
     * �ַ��������أ�String Pool�������������ַ�����������literal strings������Щ�������ڱ���ʱ�ھ�ȷ����
     * ������ˣ�������ʹ�� String �� intern() ���������й��̽��ַ�����ӵ� String Pool �С�
     *
     * ��һ���ַ������� intern() ����ʱ����� String Pool ���Ѿ�����һ���ַ����͸��ַ���ֵ��ȣ�ʹ�� equals() ��������ȷ������
     * ��ô�ͻ᷵�� String Pool ���ַ��������ã����򣬾ͻ��� String Pool �����һ���µ��ַ�����������������ַ��������á�
     */
    @Test
    public void testStringIntern () {
        
        // ����intern��ʱ�򷵻�����
        String str01 = new String("123");
        // 
        String str02 = new String("123");

        String intern = str01.intern();

        String intern1 = str02.intern();


        // false
        boolean b = str01 == str02;

        System.out.println("======^_^======variable b value is : " + b + ", " + " current method and class name is : StringInternTest.testStringIntern()");

        // true
        boolean b1 = intern == intern1;
        
        System.out.println("======^_^======variable b1 value is : " + b1 + ", " + " current method and class name is : StringInternTest.testStringIntern()");
    }
}
