package com.javase.programmer.lambda;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ForZhu {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Student student = new Student();
            student.setAge((i + 1) + "");
            student.setId(Long.parseLong(i + ""));
            if (i < 5) {
                student.setGrade("һ�꼶");
            } else {
                student.setGrade("���꼶");
            }
            student.setName("zhangsan" + 2);
            students.add(student);
        }

        // ����
        Map<String, List<Student>> collect = students.stream().collect(Collectors.groupingBy(x -> x.getGrade()));

        // ���鲢ȡ����ֵ
        Map<String, Student> packTaskOrderMap = students.stream().collect(Collectors.groupingBy(p -> p.getGrade(),
                Collectors.collectingAndThen(Collectors.reducing((c1, c2) -> c1.getId() > c2.getId() ? c1 : c2), Optional::get)));

        // ������newһ�� ����
        Student student = packTaskOrderMap.putIfAbsent("���꼶", new Student());

        int i = 0;
        System.out.println("======^_^======����iֵΪ: " + i + ", " + "��ǰ���Լ�����������: ForZhu.main()");

        // ȷ����û��ֵ��one��
        boolean b = students.stream().anyMatch(s -> Objects.equals(s.getGrade(), "���꼶"));
        System.out.println("======^_^======����bֵΪ: " + b + ", " + "��ǰ���Լ�����������: ForZhu.main()");

        // ȷ����û��ֵ��all��
        boolean b02 = students.stream().allMatch(s -> Objects.equals(s.getAge(), "3"));
        System.out.println("======^_^======����b02ֵΪ: " + b02 + ", " + "��ǰ���Լ�����������: ForZhu.main()");


        int j = 10;
        System.out.println("======^_^======����jֵΪ: " + j + ", " + "��ǰ���Լ�����������: ForZhu.main()");

        // sort ����
        List<Student> studentList = students.stream().sorted(Comparator.comparing(Student::getGrade).reversed().thenComparing(Student::getId)).collect(Collectors.toList());
        String s = studentList.toString();
        System.out.println("======^_^======����sֵΪ: " + s + ", " + "��ǰ���Լ�����������: ForZhu.main()");

        int k = 20;
        System.out.println("======^_^======����kֵΪ: " + k + ", " + "��ǰ���Լ�����������: ForZhu.main()");

        //  ������ĺ�
        int sum = students.stream().mapToInt(r -> Integer.valueOf(r.getAge())).sum();
        // int sum02 = students.stream().mapToInt(Student::(Integer)getAge).sum();
        System.out.println("======^_^======����sumֵΪ: " + sum + ", " + "��ǰ���Լ�����������: ForZhu.main()");

        // ��һ��,�������ַ���ת��Ϊ����
        String[] str = {"1", "2", "3"};
        List<String> stringList = Arrays.stream(str).collect(Collectors.toList());
        // ���Ƽ�ʹ�õķ���
        // Arrays.asList(str);
    }
}
