package com.javase.list;

import java.util.ArrayList;
import java.util.List;

public class ListRemove {
    public static void main(String[] args) {
        //����һ��list���ϣ�������5��Ԫ�غ��С�a����3�������С�a��
        List<String> list = new ArrayList<>();

        list.add("abc");
        list.add("anc");
        list.add("amg");
        list.add("agf");
        list.add("omg");
        list.add("aig");
        list.add("gme");
        list.add("wbe");

        //�������ϣ��Ƴ����С�a����Ԫ��
        for(int i = 0; i < list.size();i++){
            String str = list.get(i);
            if(str.contains("a")){
                list.remove(i);
                i--;// ��һ�� ���ܰ����а���a�Ķ��Ƴ���
            }
        }

        //��ӡ�������
        for (Object st : list) {
            System.out.println(st+"   ");
        }
    }
}
