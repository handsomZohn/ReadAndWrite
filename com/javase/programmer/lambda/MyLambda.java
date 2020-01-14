package com.javase.programmer.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class MyLambda {
    public static void main(String[] args) {
        MyLambdaInterface aBlockOfCode = (s) -> System.out.println(s);

        filterTest();

        countTest();

    }


    /**
     * @Description ����
     * @Author zohn
     * @Date 2020\1\14 0014 14:05
     * @Param []
     * @Return void
     */
    public static void filterTest() {
        // ʵ����һ��
        Yhxx yhxx = new Yhxx("zohn", "411322199501302430", 2);

        // ����list��һ��
        List<Yhxx> yhxxList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            if (i == 0) {
                yhxxList.add(new Yhxx("zohn", "41132219950130243" + i, i));
            } else {
                yhxxList.add(new Yhxx("zohn" + i, "41132219950130243" + i, i));
            }
        }

        //��ʵ�����ķ���list
        yhxxList.add(yhxx);

        // ���˳���ʵ������yhxx��xmһ������sfzhmһ���ģ�����ӡ��
        List<Yhxx> yhxxList1 = yhxxList.stream().filter(x -> Objects.equals(yhxx.getXm(), x.getXm()) && Objects.equals
                (yhxx.getSfzhm(), x.getSfzhm())).collect(Collectors.toList());

        // ��ӡ����ǰ��
        System.out.println("before filter:");
        System.out.println(yhxxList.toString());

        // ��ӡ���˺��
        System.out.println("after filter:");
        System.out.println(yhxxList1.toString());
    }

    /**
     * @Description ���
     * @Author zohn
     * @Date 2020\1\14 0014 14:25
     * @Param []
     * @Return void
     */
    public static void countTest() {
        // ����list��һ��
        List<Yhxx> yhxxList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            if (i == 0) {
                yhxxList.add(new Yhxx("zohn", "41132219950130243" + i, i));
            } else {
                yhxxList.add(new Yhxx("zohn" + i, "41132219950130243" + i, i));
            }
        }
        // list�зŵ��Ƕ���ÿ�������Ԫ�����
        int sjgs = yhxxList.stream().mapToInt(Yhxx::getSjgs).sum();

        System.out.println("count of sjgs:" + sjgs);

        // list��ֱ�ӷŵľ�������
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            integerList.add(i);
        }

        int countTest = integerList.stream().mapToInt(Integer::intValue).sum();
        System.out.println("count Test:" + countTest);
    }
}


