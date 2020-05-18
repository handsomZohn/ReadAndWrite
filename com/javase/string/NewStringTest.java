package com.javase.string;


/**
 *@Description �漰�����������javap -verbose NewStringTest.class
 *@CreateDate 2020\5\18 0018 15:29
 *@Author zz
 *@Version 1.0
 */

public class NewStringTest {
    public static void main(String[] args) {
        String string = new String("123");
        System.out.println("======^_^======����stringֵΪ: " + string + ", " + "��ǰ���Լ�����������: NewStringTest.main()");
    }

    // Constant pool:

    // #2 = Class              #31            // java/lang/String
    // #3 = String             #32            // 123  //----------    #32�洢�ַ���������abc   #3��String Pool���ַ�������    ��ָ��#32����ַ���������

    // Code:
    // stack=3, locals=2, args_size=1
    // 0: new           #2                  // class java/lang/String ʹ��new#2�ڶ��д����ַ�������
    // 3: dup
    // 4: ldc           #3                  // String 123 ����ʹ��lcd#3��String Pool�е��ַ���������ΪString���캯���Ĳ���

    // public String(String original) {
    //     this.value = original.value;
    //     this.hash = original.hash;
    // }
    // ������String���캯����Դ�룬���Կ����ڽ�һ���ַ�����Ϊ��һ���ַ�������Ĺ��캯������ʱ����������ȫ����value��������ݣ����Ƕ���ָ��ͬһ��value���飻��
}
