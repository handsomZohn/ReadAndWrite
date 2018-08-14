package com.cyc2018.newCharacteristics.eeight.lambdaExample;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 *@Description  Java 8 Predicate �����ӣ�չʾ�˹��˼������ݵĶ��ֳ��÷��� �����û��ͨ�����Լ�д�Ĳ����ҵ������Ǵ����--����
 *@CreateDate   18/07/19 13:31
 *@Author        zohn
 *@Version       1.0
 *
 */
public class PredicateExample {
    public static void main(String[] args) {
        List<String> language = Arrays.asList("Java", "Scala", "C++", "Haskell", "Lisp");
        System.out.println("Language which start with J:");
        // filter(language, (str) -> str.s);
    }

    public static void filter(List<String> names, Predicate condition){
        for (String name: names) {
            if (condition.test(name)){
                System.out.println(name + "");
            }
        }
    }

}
