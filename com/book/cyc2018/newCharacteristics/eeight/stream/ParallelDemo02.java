package com.book.cyc2018.newCharacteristics.eeight.stream;

import java.util.ArrayList;
import java.util.Optional;

/**
 * @Description ������demo
 * @CreateDate 18/09/17 13:57
 * @Author zohn
 * @Version 1.0
 */
public class ParallelDemo02 {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(7);
        myList.add(18);
        myList.add(10);
        myList.add(24);
        myList.add(5);
        // < U > U reduce(U identityVal, BiFunction< U, ? super T, U > accumulator, BinaryOperator< U > combiner)
        // accumulator��combinerִ�е�����ͬ�Ĳ�����������Щ����£�accumulator��ִ����combiner�Ĳ������벻ͬ
        // ʹ��reduce()�����ĺϲ����汾�������б���ÿ��Ԫ�ص�ƽ�����ĳ˻���
        // �ۼ���������Ԫ�ص�ƽ�������
        // �ϲ��������ֽ�����
        // ��Ϊ�ǲ���ִ�е� ��������������ִ�У���һ���ּ���7*18*10���ڶ����ּ���24*5
        //
        // �ۼ��������ã�[��״̬������Ԥ�������]
        // ���ǽ���һ���ֵļ��������Եڶ����ּ�����
        // ����7*18*10*24*5
        Double reduce = myList.parallelStream().reduce(1.0, (a, b) -> a * Math.sqrt(b), (a, b) -> (a * b));
        System.out.println("ÿ��Ԫ�ص�ƽ�����ĳ˻�(���������㣨��ȷ��):" + reduce);

        // ������汾��reduce()�����У��ۼ����ͺϲ���������ͬһ���������⽫���´�����Ϊ���ϲ��������ֽ��ʱ����˵������ǵ�ƽ������
        // �����ǲ��ֽ������
        // ��Ϊ�����˲�����
        // (7*18*10)^2����һ������ƽ���˲��������ֽ���Ļ�
        // ��ʹ�ò�����ʱ���Żᷢ������
        Double reduce1 = myList.parallelStream().reduce(1.0, (a, b) -> a * Math.sqrt(b), (a, b) -> a * Math.sqrt(b));

        // ��������
        Double reduce2 = myList.stream().reduce(1.0, (a, b) -> a * Math.sqrt(b), (a, b) -> a * Math.sqrt(b));

        System.out.println("ÿ��Ԫ�ص�ƽ�����ĳ˻�(���������㣨����):" + reduce1);
        System.out.println("ÿ��Ԫ�ص�ƽ�����ĳ˻�(���������㣨��ȷ��):" + reduce2);
    }
}
