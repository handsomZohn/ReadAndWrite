package com.book.cyc2018.newCharacteristics.eeight.stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Optional;

/**
 * @Description
 * @CreateDate 18/09/17 13:30
 * @Author zohn
 * @Version 1.0
 */
public class ReduceDemo {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(7);
        myList.add(18);
        myList.add(10);
        myList.add(24);
        myList.add(5);
        // myList.add(0);// û���0��ʱ��������89����  ÿ�����кķ�ʱ���������һ��

        // ʹ��lambda���ʽ����������ֵ�ó˻�
        // ����ֵ�ֱ�����ۻ�����еĵ�ǰֵ�����е���һ��Ԫ��
        Optional<Integer> reduce = myList.stream().reduce((a, b) -> (a * b));

        if (reduce.isPresent()) {
            System.out.println("product as optional:" + reduce.get());
            // �ڵڶ����汾�У���ʾָ���˵�λֵ�����ڳ˷����Ծ���1

            int product = myList.stream().reduce(1, (a, b) -> a * b);// 1 ����Ԫ��ȫ��*����
            System.out.println("product as int:" + product);

            // ��ȡż���ĳ˻�
            int evenProduct = myList.stream().reduce(1, (a, b) -> {
                if (b % 2 == 0) {
                    return a * b;
                } else {
                    return a;
                }
            });
            System.out.println("����ż���ĳ˻���" + evenProduct);
        }
    }

    //
    @Test
    public void test() {
        new ReduceDemo().main(new String[]{});
    }
}
