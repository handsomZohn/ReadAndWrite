package com.book.alibaba.collection;

import java.util.Arrays;
import java.util.List;

public class Array2List {
    public static void main(String[] args) {
        String[] strArr = {"001", "002", "003", "004", "005"};
        List<String> asList = Arrays.asList(strArr);
        System.out.println("======^_^======����asListֵΪ: " + asList + ", " + "��ǰ���Լ�����������: Array2List.main()");

        // ��һ��Ԫ������ Ȼ���  Exception in thread "main" java.lang.UnsupportedOperationException
        // asList.add("006");

        // asList.get(1)Ҳ�ᱻ�޸��ˡ�
        strArr[1] = "0001";

        System.out.println("======^_^======����asListֵΪ: " + asList + ", " + "��ǰ���Լ�����������: Array2List.main()");
    }
}
