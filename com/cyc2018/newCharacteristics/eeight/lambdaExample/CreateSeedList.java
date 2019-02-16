package com.cyc2018.newCharacteristics.eeight.lambdaExample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Description ���Ʋ�ͬ��ֵ������һ�����б� ����չʾ������������� distinct() �������Լ��Ͻ���ȥ�ء�
 * @CreateDate 18/07/19 17:28
 * @Author zohn
 * @Version 1.0
 */
public class CreateSeedList {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4);
        List<Integer> distinct = numbers.stream().map(i -> i * i).distinct().collect(Collectors.toList());
        System.out.printf("Original List: %s, Square Without duplicates : %s %n", numbers, distinct);
    }
}
