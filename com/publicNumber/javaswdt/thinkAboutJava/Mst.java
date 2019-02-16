package com.publicNumber.javaswdt.thinkAboutJava;

import java.lang.reflect.Field;

// ����һ��������
public class Mst {
    public static void main(String[] args) {
        Integer a = 1;
        Integer b = 2;
        System.out.printf("a = %s, b = %s \n", a, b);
        swap(a, b);
        System.out.printf("a = %s, b = %s \n", a, b);
    }

    // �ر��������ַ�ʽ�Ǵ����
    // �ر��������ַ�ʽ�Ǵ����
    // �ر��������ַ�ʽ�Ǵ����
    /*
    public static void swap (Integer a, Integer b) {
        Integer temp = a;
        a = b;
        b = temp;
    }*/

    // ����д�Ļ�  ���Թٿ϶�������ʺŵ�~~
    /*
    public static void swap (Integer a, Integer b) {
        // TODO ʵ��
        // �޷�ʵ��
    }*/

    // !!!!!!!!!!!!!!
    // a = 1, b = 2
    // a = 2, b = 2
    // !!!!!!!!!!!!!!
    // ��value.set��ʱ��Integer�Ļ���ֵ�ı��ˣ���Ϊvalue.set(Object v1, Object v2)�����������Ƕ������ͣ�����temp�����Զ�
    // װ������������valueOf������������ȡ������Ļ���ֵ������Ϊ�˱��������������ֻ�ܲ���Ҫ���û���ֵ��ֱ��new Integer������
    // �����������档

    /*
    public static void swap(Integer a, Integer b) {
        int temp = a.intValue();
        try {
            Field value = Integer.class.getDeclaredField("value");
            value.setAccessible(true);
            value.set(a, b);
            value.set(b, temp);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }*/

    // if (i >= IntegerCache.low && i <= IntegerCache.high)
    //       return IntegerCache.cache[i + (-IntegerCache.low)];

    public static void swap (Integer a, Integer b) {
        int temp = a.intValue();
        try {
            Field value = Integer.class.getDeclaredField("value");
            value.setAccessible(true);
            value.set(a, b);
            value.set(b, new Integer(temp));
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }


}
