package com.javaHightRanking.jvm.reference;

/**
 * ǿ����ʾ��
 * @Author
 */
public class StrongReferenceTest {


    public static void main(String[] args){
        PrintlnMemory.printlnMemory("1.ԭ�����ڴ�����ڴ�");

        //ʵ����10M�����鲢��strongReference����ǿ����
        byte[] strongReference = new byte[10*PrintlnMemory.M];
        PrintlnMemory.printlnMemory("2.ʵ����10M������,������ǿ����");
        System.out.println("strongReference : "+strongReference);

        System.gc();
        PrintlnMemory.printlnMemory("3.GC��");
        System.out.println("strongReference : "+strongReference);

        //strongReference = null;��,ǿ���öϿ���
        strongReference = null;
        PrintlnMemory.printlnMemory("4.ǿ���öϿ���");
        System.out.println("strongReference : "+strongReference);

        System.gc();
        PrintlnMemory.printlnMemory("5.GC��");
        System.out.println("strongReference : "+strongReference);
    }
}
