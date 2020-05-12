package com.javaHightRanking.jvm.reference;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

/**
 * ������ʾ��
 * @author Administrator
 */
public class PhantomReferenceTest {

    public static void main(String[] args) throws InterruptedException {

        PrintlnMemory.printlnMemory("1.ԭ�����ڴ�����ڴ�");
        byte[] object = new byte[10*PrintlnMemory.M];
        PrintlnMemory.printlnMemory("2.ʵ����10M�������");

        //����������
        ReferenceQueue<Object> referenceQueue = new ReferenceQueue<Object>();
        PhantomReference<Object> phantomReference = new PhantomReference<Object>(object,referenceQueue);

        PrintlnMemory.printlnMemory("3.���������ú�");
        System.out.println("phantomReference : "+phantomReference);
        System.out.println("phantomReference.get() : "+phantomReference.get());
        System.out.println("referenceQueue.poll() : "+referenceQueue.poll());

        //�Ͽ�byte[10*PrintlnMemory.M]��ǿ����
        object = null;
        PrintlnMemory.printlnMemory("4.ִ��object = null;ǿ���öϿ���");

        System.gc();
        PrintlnMemory.printlnMemory("5.GC��");
        System.out.println("phantomReference : "+phantomReference);
        System.out.println("phantomReference.get() : "+phantomReference.get());
        System.out.println("referenceQueue.poll() : "+referenceQueue.poll());

        //�Ͽ�������
        phantomReference = null;
        System.gc();
        PrintlnMemory.printlnMemory("6.�Ͽ������ú�GC");
        System.out.println("phantomReference : "+phantomReference);
        System.out.println("referenceQueue.poll() : "+referenceQueue.poll());
    }
}
