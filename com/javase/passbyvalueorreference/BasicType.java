package com.javase.passbyvalueorreference;

/**
 *@Description �������Ͳ�������
 *@CreateDate 2020\4\8 0008 15:39
 *@Author zz
 *@Version 1.0
 */

public class BasicType {
    public static void main(String[] args) {
        int a = 25;
        float w = 77.5f;

        valuePassTest(a, w);

        // ֵ���ݴ��ݵ�����ʵ���ݵ�һ���������Ը����Ĳ�����Ӱ��ԭ���ݣ�Ҳ�����β���ô�仯������Ӱ��ʵ�ζ�Ӧ�����ݡ�
        System.out.println("======^_^======variable a value is : " + a + ", " + " current method and class name is : BasicType.main()");

        System.out.println("======^_^======variable w value is : " + w + ", " + " current method and class name is : BasicType.main()");
    }


    public static void valuePassTest(int age, float weight){
        System.out.println("�����age��" + age);
        System.out.println("�����weight��" + weight);

        age = 33;
        weight = 87.5f;

        System.out.println("���������¸�ֵ���age��" + age);
        System.out.println("���������¸�ֵ��ĵ�weight��" + weight);
    }
}
