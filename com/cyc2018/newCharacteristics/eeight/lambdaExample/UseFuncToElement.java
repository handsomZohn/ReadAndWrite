package com.cyc2018.newCharacteristics.eeight.lambdaExample;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Description ���б��ÿ��Ԫ��Ӧ�ú��� ����ͨ����Ҫ���б��ÿ��Ԫ��ʹ��ĳ��������������һ����ĳ����������ĳ��������������������
 * ��Щ���������ʺ��� map() ���������Խ�ת���߼���lambda���ʽ����ʽ���� map() ������Ϳ��ԶԼ��ϵĸ���Ԫ�ؽ���ת����
 * @CreateDate 18/07/19 17:21
 * @Author zohn
 * @Version 1.0
 */
public class UseFuncToElement {
    public static void main(String[] args) {
        List<String> G7 = Arrays.asList("USA", "Japan", "France", "Germany", "Italy", "U.K.", "Canada");
        String G7Countries = G7.stream().map(x -> x.toUpperCase()).collect(Collectors.joining(", "));
        System.out.println(G7Countries);
    }
}
