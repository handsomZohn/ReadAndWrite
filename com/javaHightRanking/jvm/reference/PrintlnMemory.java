package com.javaHightRanking.jvm.reference;

/**
 * ��ӡ�ڴ���Ϣ
 * @author Administrator
 */
public class PrintlnMemory {

    public static int M = 1024*1024;

    /**
     * ��ӡ�ڴ���Ϣ
     * @param tag
     */
    public static void printlnMemory(String tag){
        Runtime runtime = Runtime.getRuntime();
        int M = PrintlnMemory.M;
        System.out.println("\n"+tag+":");
        System.out.println(runtime.freeMemory()/M+"M(free)/" + runtime.totalMemory()/M+"M(total)");
    }
}
