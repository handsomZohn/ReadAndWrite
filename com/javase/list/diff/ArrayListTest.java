package com.javase.list.diff;

import java.util.ArrayList;

public class ArrayListTest {
    public static void addFromHeaderTest(int num) {
        ArrayList<String> list = new ArrayList<String>(num);
        int i = 0;

        long timeStart = System.currentTimeMillis();

        while (i < num) {
            list.add(0, i + "��Ĭ����");
            i++;
        }
        long timeEnd = System.currentTimeMillis();

        System.out.println("ArrayList�Ӽ���ͷ��λ������Ԫ�ػ��ѵ�ʱ��" + (timeEnd - timeStart));
    }

    public static void addFromMidTest(int num) {
        ArrayList<String> list = new ArrayList<String>(num);
        int i = 0;

        long timeStart = System.currentTimeMillis();
        while (i < num) {
            int temp = list.size();
            list.add(temp / 2 + "��Ĭ����");
            i++;
        }
        long timeEnd = System.currentTimeMillis();

        System.out.println("ArrayList�Ӽ����м�λ������Ԫ�ػ��ѵ�ʱ��" + (timeEnd - timeStart));
    }

    public static void addFromTailTest(int num) {
        ArrayList<String> list = new ArrayList<String>(num);
        int i = 0;

        long timeStart = System.currentTimeMillis();

        while (i < num) {
            list.add(i + "��Ĭ����");
            i++;
        }

        long timeEnd = System.currentTimeMillis();

        System.out.println("ArrayList�Ӽ���β��λ������Ԫ�ػ��ѵ�ʱ��" + (timeEnd - timeStart));
    }

    /**
     * @Description arrayListͷ��ɾ��
     * @Author zz
     * @Date 2021/2/28 12:44
     * @Param [num]
     * @Return void
     */
    public static void removeFromHeaderTest(int num) {
        ArrayList<String> list = new ArrayList<String>(num);
        int i = 0;

        while (i < num) {
            list.add(i + "��Ĭ����");
            i++;
        }

        long timeStart = System.currentTimeMillis();
        list.remove(0);
        long timeEnd = System.currentTimeMillis();

        System.out.println("ArrayList�Ӽ���ͷ��λ��ɾ��Ԫ�ػ��ѵ�ʱ��" + (timeEnd - timeStart));
    }

    /**
     * @Description arrayListβ��ɾ��
     * @Author zz
     * @Date 2021/2/28 12:44
     * @Param [num]
     * @Return void
     */
    public static void removeFromTailTest(int num) {
        ArrayList<String> list = new ArrayList<String>(num);
        int i = 0;

        while (i < num) {
            list.add(i + "��Ĭ����");
            i++;
        }

        long timeStart = System.currentTimeMillis();
        list.remove(num-1);
        long timeEnd = System.currentTimeMillis();

        System.out.println("ArrayList�Ӽ���β��λ��ɾ��Ԫ�ػ��ѵ�ʱ��" + (timeEnd - timeStart));
    }
}
