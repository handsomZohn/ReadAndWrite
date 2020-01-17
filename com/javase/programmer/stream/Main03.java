package com.javase.programmer.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main03 {
    public static void main(String[] args) {
        outputAsList();
    }

    /**
     * @Description ���Ϊlist
     * @Author zohn
     * @Date 2020\1\17 0017 14:14
     * @Param []
     * @Return void
     */
    static void outputAsList () {
        Stream<String> stream = Stream.of("Apple", "Orange", "", null, "Pear", "   ", "banana");
        List<String> list = stream.filter(s -> s != null && !s.isEmpty()).collect(Collectors.toList());
        System.out.println("======^_^======����listֵΪ: " + list + ", " + "��ǰ���Լ�����������: Main03.main()");
    }

    /**
     * @Description ���Ϊ����
     * @Author zohn
     * @Date 2020\1\17 0017 14:15
     * @Param []
     * @Return void
     */
    static void outputAsArr(){
        // List<String> list =
    }
}
