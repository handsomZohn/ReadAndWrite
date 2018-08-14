package com.cyc2018.newCharacteristics.eeight.lambdaExample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *@Description  ͨ�����˴���һ��String�б�
 *@CreateDate   18/07/19 17:10
 *@Author        zohn
 *@Version       1.0
 *
 */
public class StringListFilter {
    public static void main(String[] args) {
        // ��������������
        List<String> strList = Arrays.asList("abc", "", "bcd", "defg", "jk", "kl");
        List<String> filtered = strList.stream().filter(x -> x.length() > 2).collect(Collectors.toList());
        System.out.printf("Original List : %s, filtered list : %s %n", strList, filtered);
        // ���� filter() �����и�������⡣����ʵ�����У������˵�ʱ��ͨ���ᶪ�����֣���ʹ��filter()�������ǻ��һ���µ��б�
        // ����ÿ��Ԫ�ط��Ϲ���ԭ��
    }
}
