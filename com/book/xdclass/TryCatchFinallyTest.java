package com.book.xdclass;

/**
 *@Description  TryCatchFinally ����
 *@CreateDate 2020\3\13 0013 10:35
 *@Author zohn
 *@Version 1.0
 */
public class TryCatchFinallyTest {


    public static void main(String[] args) {
        int i = test1();
        int i1 = test2();
        System.out.println("======^_^======����iֵΪ: " + i + ", ����i1ֵΪ: " +i1+ ", ��ǰ���Լ�����������: TryCatchFinallyTest.main()");
    }

    public static int test1() {
        int a = 1;
        try {
            System.out.println(a / 0);
            a = 2;
        } catch (ArithmeticException e) {
            a = 3;
            return a;
        } finally {
            a = 4;
        }
        return a;
    }

    public static int test2() {
        int a = 1;
        try {
            System.out.println(a / 0);
            a = 2;
        } catch (ArithmeticException e) {
            a = 3;
            return a;
        } finally {
            a = 4;
            return a;// ֱ��ִ�������ˣ�finally�е�return���һ���ᱻִ�е�
        }
    }
}
