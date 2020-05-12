package com.javaHightRanking.jvm.reference;

import java.lang.ref.WeakReference;

/**
 * ������ʾ��
 * @Author
 */
public class WeakReferenceTest {

    public static void main(String[] args){
        PrintlnMemory.printlnMemory("1.ԭ�����ڴ�����ڴ�");

        //����������
        WeakReference<Object> weakRerference = new WeakReference<Object>(new byte[10*PrintlnMemory.M]);
        PrintlnMemory.printlnMemory("2.ʵ����10M������,������������");
        System.out.println("weakRerference.get() : "+weakRerference.get());

        System.gc();
        PrintlnMemory.printlnMemory("3.GC��");
        System.out.println("weakRerference.get() : "+weakRerference.get());
    }
}
