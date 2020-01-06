package com.book.cyc2018.newCharacteristics.eeight.lambdaExample;

/**
 *@Description  ��lambda���ʽʵ��Runnable
 *@CreateDate   18/07/19 10:25
 *@Author        zohn
 *@Version       1.0
 *
 */
public class RunnableImpl {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Before Java8 is too large~~");
            }
        }).start();

        new Thread(() -> System.out.println("After Java8 is so cool")).start();
    }
    // ����������չʾ��Java 8 lambda���ʽ���﷨�������ʹ��lambdaд�����´��룺
    // (params) -> Expression
    // (params) -> statement
    // (params) -> {statements}
    // ���磬�����ķ������Բ��������޸ġ���д��ֻ���ڿ���̨��ӡ�㶫���Ļ�����ô��������д��
    // () -> System.out.println("After Java8 is so cool")
    // �����ķ�������������������ô����д������������
    // (int even, int odd) -> even + odd;
    // ͨ�������lambda���ʽ�ڲ�������������ö�һЩ��������ʹ�������̣�����ͬһ�С����ԣ������������У�������ѡ��a��b����x��y���
    // even��oddҪ��
}
