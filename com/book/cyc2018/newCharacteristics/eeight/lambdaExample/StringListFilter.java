package com.book.cyc2018.newCharacteristics.eeight.lambdaExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Description ͨ�����˴���һ��String�б�
 * @CreateDate 18/07/19 17:10
 * @Author zohn
 * @Version 1.0
 */
public class StringListFilter {
    public static void main(String[] args) {
        strFilter();// ����
        filter02();// ���
        filter03();// �����������
    }

    private static void strFilter() {
        // ��������������
        List<String> strList = Arrays.asList("abc", "", "bcd", "defg", "jk", "kl");
        List<String> filtered = strList.stream().filter(x -> x.length() > 2).collect(Collectors.toList());
        System.out.printf("Original List : %s, filtered list : %s %n", strList, filtered);
        // ���� filter() �����и�������⡣����ʵ�����У������˵�ʱ��ͨ���ᶪ�����֣���ʹ��filter()�������ǻ��һ���µ��б�
        // ����ÿ��Ԫ�ط��Ϲ���ԭ��
    }


    public static void filter02() {
        List<Integer> list = new ArrayList<>();

        list.add(5);
        int size = list.size();
        System.out.println("======^_^======����sizeֵΪ: " + size + ", " + "��ǰ���Լ�����������: StringListFilter.filter02()");

        //Integer integer = list.stream().filter(q -> q == 3).reduce(Integer::sum).get();
        // Integer integer = list.stream().filter(q -> q == 3).reduce(Integer::sum).get();

        Integer integer1 = list.stream().filter(q -> q == 5).reduce(0, Integer::sum);
        System.out.println("======^_^======����integer1ֵΪ: " + integer1 + ", " + "��ǰ���Լ�����������: StringListFilter.filter02()");
        // list.stream().filter(s -> s == 5).map(Integer :: intValue).reduce(Integer :: sum).get();
    }

    /**
     * @Description ���㼸���༶��������
     * @CreateDate 18/11/22 9:31
     * @Author zohn
     * @Version 1.0
     */
    public static void filter03() {
        List<ClassRoom> classRoomList = new ArrayList<>();
        for (int i = 0; i < 5; i++){
            classRoomList.add(new ClassRoom("���꼶(" + i +")��", (i + 30) + ""));
        }

        classRoomList.forEach(System.out :: print);

        // classRoomList.stream().filter(x -> Integer.valueOf(x.getBjrs()) > 31).reduce(0, Integer :: sum);
    }
}

/**
 * @Description ����
 * @CreateDate 18/11/22 9:29
 * @Author zohn
 * @Version 1.0
 */
class ClassRoom {
    private String bjmc;// �༶����
    private String bjrs;// �༶����

    public ClassRoom(String bjmc, String bjrs) {
        this.bjmc = bjmc;
        this.bjrs = bjrs;
    }

    public String getBjmc() {
        return bjmc;
    }

    public void setBjmc(String bjmc) {
        this.bjmc = bjmc;
    }

    public String getBjrs() {
        return bjrs;
    }

    public void setBjrs(String bjrs) {
        this.bjrs = bjrs;
    }
}
