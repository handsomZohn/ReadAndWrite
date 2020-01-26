package com.javase.programmer.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main03 {
    public static void main(String[] args) {
        outputAsList();
    }

    /**
     * @Description 输出为list
     * @Author zohn
     * @Date 2020\1\17 0017 14:14
     * @Param []
     * @Return void
     */
    static void outputAsList () {
        Stream<String> stream = Stream.of("Apple", "Orange", "", null, "Pear", "   ", "banana");
        List<String> list = stream.filter(s -> s != null && !s.isEmpty()).collect(Collectors.toList());
        System.out.println("======^_^======变量list值为: " + list + ", " + "当前类以及方法名字是: Main03.main()");
    }

    /**
     * @Description 输出为数组
     * @Author zohn
     * @Date 2020\1\17 0017 14:15
     * @Param []
     * @Return void
     */
    static void outputAsArr(){
        // List<String> list =
    }
}
