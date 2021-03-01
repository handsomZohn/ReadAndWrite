package com.javase.list.diff;

import java.util.LinkedList;

public class LinkedListTest {
    public static void addFromHeaderTest(int num) {
        LinkedList<String> list = new LinkedList<String>();
        int i = 0;
        long timeStart = System.currentTimeMillis();
        while (i < num) {
            list.addFirst(i + "��Ĭ����");
            i++;
        }
        long timeEnd = System.currentTimeMillis();

        System.out.println("LinkedList�Ӽ���ͷ��λ������Ԫ�ػ��ѵ�ʱ��" + (timeEnd - timeStart));
    }

    public static void addFromMidTest(int num) {
        LinkedList<String> list = new LinkedList<String>();
        int i = 0;
        long timeStart = System.currentTimeMillis();
        while (i < num) {
            int temp = list.size();
            list.add(temp / 2, i + "��Ĭ����");
            i++;
        }
        long timeEnd = System.currentTimeMillis();

        System.out.println("LinkedList�Ӽ����м�λ������Ԫ�ػ��ѵ�ʱ��" + (timeEnd - timeStart));
    }

    public static void addFromTailTest(int num) {
        LinkedList<String> list = new LinkedList<String>();
        int i = 0;
        long timeStart = System.currentTimeMillis();
        while (i < num) {
            list.add(i + "��Ĭ����");
            i++;
        }
        long timeEnd = System.currentTimeMillis();

        System.out.println("LinkedList�Ӽ���β��λ������Ԫ�ػ��ѵ�ʱ��" + (timeEnd - timeStart));
    }

    /**
     * @Description linkedListͷ��ɾ��
     * @Author zz
     * @Date 2021/2/28 12:45
     * @Param [num]
     * @Return void
     */
    public static void removeFromHeaderTest(int num) {
        LinkedList<String> list = new LinkedList<String>();
        int i = 0;

        while (i < num) {
            list.add(i + "��Ĭ����");
            i++;
        }
        long timeStart = System.currentTimeMillis();
        list.remove(0);
        long timeEnd = System.currentTimeMillis();

        System.out.println("LinkedList�Ӽ���ͷ��λ��ɾ��Ԫ�ػ��ѵ�ʱ��" + (timeEnd - timeStart));
    }

    /**
     * @Description linkedListβ��ɾ��
     * @Author zz
     * @Date 2021/2/28 12:45
     * @Param [num]
     * @Return void
     */
    public static void removeFromTailTest(int num) {
        LinkedList<String> list = new LinkedList<String>();
        int i = 0;

        while (i < num) {
            list.add(i + "��Ĭ����");
            i++;
        }
        long timeStart = System.currentTimeMillis();
        list.removeLast();
        long timeEnd = System.currentTimeMillis();

        System.out.println("LinkedList�Ӽ���β��λ��ɾ��Ԫ�ػ��ѵ�ʱ��" + (timeEnd - timeStart));
    }
}
