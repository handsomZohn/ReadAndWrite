package com.cyc2018.newCharacteristics.eeight.stream;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * https://blog.csdn.net/zxc123e/article/details/50533760
 * @Description ������һ����myList��ArrayList�����ڴ洢�������ϣ��Զ�װ��ΪInteger�������ͣ���Ȼ�󣬻��һ��ʹ��myList��ΪԴ������
 * �����ʾ�˸�����������
 * @CreateDate 18/09/17 11:39
 * @Author zohn
 * @Version 1.0
 */
public class StreamDemo {

    public static void main(String[] args) {

        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(7);
        myList.add(18);
        myList.add(10);
        myList.add(24);
        myList.add(5);

        // �����Сֵ��
        Stream<Integer> integerStream = myList.stream(); // ��ȡ��

        Optional<Integer> min = integerStream.min(Integer::compareTo);// list����С

        if (min.isPresent()){
            System.out.println("Min value:" + min.get());
        }

        // Exception in thread "main" java.lang.IllegalStateException: stream has already been operated upon or closed
        //	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:229)
        // ������һ���µ�������Ϊ����MIN�����������ĵ������ն˵Ĳ�����
        integerStream = myList.stream();
        Optional<Integer> max = integerStream.max(Integer::compare);

        if (max.isPresent()){
            System.out.println("Max value:" + max.get());
        }


        // ����

        Stream<Integer> sorted = myList.stream().sorted();

        // ʹ��forEach������ʾ�����������
        System.out.println("sorted stream: ");
        System.out.println();

        // ֻ��ʾ����
        Stream<Integer> odd = myList.stream().sorted().filter((n) -> (n % 2 == 1));
        System.out.println("odd values:");
        // odd.forEach((n) -> System.out.println(n + ""));
        odd.forEach(System.out :: println);

        // ֻ��ʾ����5������
        Stream<Integer> oddBigerThan5 = myList.stream().sorted().filter((n) -> (n % 2 == 1)).filter((n) -> (n > 5));
        System.out.println("odd values that bigger than 5 :");
        oddBigerThan5.forEach(System.out :: println);
    }
}
