package com.javaHightRanking.jvm.reference;

import java.lang.ref.SoftReference;

/**
 * ������ʾ��
 * @author Administrator
 */
public class SoftReferenceTest {

    public static void main(String[] args){
        PrintlnMemory.printlnMemory("1.ԭ�����ڴ�����ڴ�");

        //����������
        SoftReference<Object> softRerference = new SoftReference<Object>(new byte[10*PrintlnMemory.M]);
        PrintlnMemory.printlnMemory("2.ʵ����10M������,������������");
        System.out.println("softRerference.get() : "+softRerference.get());

        System.gc();
        PrintlnMemory.printlnMemory("3.�ڴ�����������㣬GC��");
        System.out.println("softRerference.get() : "+softRerference.get());

        //ʵ����һ��4M������,ʹ�ڴ治����,������������
        //free=10M=4M+10M-4M,֤���ڴ����������ʱ��GC��byte[10*m]������
        SoftReference<Object> softRerference2 = new SoftReference<Object>(new byte[4*PrintlnMemory.M]);
        PrintlnMemory.printlnMemory("4.ʵ����һ��4M�������");
        System.out.println("softRerference.get() : "+softRerference.get());
        System.out.println("softRerference2.get() : "+softRerference2.get());
    }
}
