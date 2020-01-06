package com.book.cyc2018.newCharacteristics.eeight.stream;

import java.util.ArrayList;
import java.util.Optional;

/**
 * @Description ������demo
 * @CreateDate 18/09/17 13:57
 * @Author zohn
 * @Version 1.0
 */
public class ParallelDemo {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(7);
        myList.add(18);
        myList.add(10);
        myList.add(24);
        myList.add(5);


        Optional<Integer> parallelReduce = myList.parallelStream().reduce((a, b) -> (a * b));
        // ���м��㣬���ּ������ʹ��м���Ľ��һ�£�
        // ���м��㣬��Ӳ��Ҫ����Ҫ��˴�����
        if (parallelReduce.isPresent()) {
            System.out.println("���м��㣺");
            System.out.println(parallelReduce.get());
        }
        // < U > U reduce(U identityVal, BiFunction< U, ? super T, U > accumulator, BinaryOperator< U > combiner)
        Integer reduce = myList.parallelStream().reduce(1, (a, b) -> (a * b),  (a, b) -> (a * b));
        System.out.println("accumulator��combinerִ�е�����ͬ�Ĳ���:" + reduce);

        // accumulator��combinerִ�е�����ͬ�Ĳ�����������Щ����£�accumulator��ִ����combiner�Ĳ������벻ͬ

    }
}
