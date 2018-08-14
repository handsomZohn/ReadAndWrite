package com.cyc2018.newCharacteristics.eeight.lambdaExample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *@Description  通过过滤创建一个String列表
 *@CreateDate   18/07/19 17:10
 *@Author        zohn
 *@Version       1.0
 *
 */
public class StringListFilter {
    public static void main(String[] args) {
        // 创建过滤器过滤
        List<String> strList = Arrays.asList("abc", "", "bcd", "defg", "jk", "kl");
        List<String> filtered = strList.stream().filter(x -> x.length() > 2).collect(Collectors.toList());
        System.out.printf("Original List : %s, filtered list : %s %n", strList, filtered);
        // 关于 filter() 方法有个常见误解。在现实生活中，做过滤的时候，通常会丢弃部分，但使用filter()方法则是获得一个新的列表，
        // 且其每个元素符合过滤原则
    }
}
