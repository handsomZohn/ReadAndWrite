package com.book.cyc2018.newCharacteristics.eeight.lambdaExample;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

/**
 * @Description ���㼯��Ԫ�ص����ֵ����Сֵ���ܺ��Լ�ƽ��ֵ IntStream��LongStream �� DoubleStream ���������У�
 * �и��ǳ����õķ������� summaryStatistics() ��
 * ���Է��� IntSummaryStatistics��LongSummaryStatistics ���� DoubleSummaryStatistic s����������Ԫ�صĸ���ժҪ���ݡ�
 * �ڱ����У���������������������б�����ֵ����Сֵ����Ҳ�� getSum() �� getAverage() ����������б������Ԫ�ص��ܺͼ�ƽ��ֵ��
 * @CreateDate 18/07/19 17:37
 * @Author zohn
 * @Version 1.0
 */
public class CalculationMaxMinAvg {
    public static void main(String[] args) {
        //��ȡ���ֵĸ�������Сֵ�����ֵ���ܺ��Լ�ƽ��ֵ
        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
        IntSummaryStatistics stats = primes.stream().mapToInt((x) -> x).summaryStatistics();

        System.out.println("Count prime number in List��" + stats.getCount());
        System.out.println("Highest prime number in List : " + stats.getMax());
        System.out.println("Lowest prime number in List : " + stats.getMin());
        System.out.println("Sum of all prime numbers : " + stats.getSum());
        System.out.println("Average of all prime numbers : " + stats.getAverage());

    }
    // Lambda���ʽ vs ������
    // ��Ȼlambda���ʽ������ʽȡ��Java�����е������ڲ��࣬��ô�б�Ҫ�Զ�����һ���ȽϷ�����
    // һ���ؼ��Ĳ�ͬ����ǹؼ��� this��������� this �ؼ���ָ�������࣬��lambda���ʽ�� this �ؼ���ָ���Χlambda���ʽ���ࡣ
    // ��һ����ͬ���Ƕ��ߵı��뷽ʽ��Java��������lambda���ʽ��������˽�з�����
    // ʹ����Java 7�� invokedynamic �ֽ���ָ������̬�����������

    // ��ǣ�
    //1��lambda���ʽ���ܷ������´��룺Ԥ����ʹ���� @Functional ע�͵ĺ���ʽ�ӿڣ��Դ�һ���������ķ�����
    // ����SAM��Single Abstract Method �������󷽷������͡���Щ��Ϊlambda���ʽ��Ŀ�����ͣ����������������ͣ�
    // ��lambdaĿ�����Ĳ��������磬��һ����������Runnable��Comparable���� Callable �ӿڣ����е������󷽷���
    // ���Դ���lambda���ʽ�����Ƶģ����һ���������������� java.util.function ���ڵĽӿڣ�
    // ���� Predicate��Function��Consumer �� Supplier����ô�������䴫lambda���ʽ��
    //2��lambda���ʽ�ڿ���ʹ�÷������ã������÷������޸�lambda���ʽ�ṩ�Ĳ����������е�lambda���ʽ���Ի�Ϊ�������ã���Ϊ�����һ��������ͬ�ļ򵥷������á�
    //        list.forEach(n -> System.out.println(n));
    //        list.forEach(System.out::println);  // ʹ�÷�������
    // Ȼ�������Բ������κ��޸ģ�����ʹ�÷������ã��������������lambda���ʽ��������ʾ��
    // list.forEach((String s) -> System.out.println("*" + s + "*"));
    // ��ʵ�ϣ�����ʡ�������lambda�������������������������Դ��б���������Ʋ������
    // 3��lambda�ڲ�����ʹ�þ�̬���Ǿ�̬�;ֲ����������Ϊlambda�ڵı�������

    // 4��Lambda���ʽ��Java���ֳ�Ϊ�հ����������������������ͬ�°����бհ���ʱ�򣬲��þ��ȡ�

    // 5��Lambda�����ڱ������ڲ��������˽�з��������ɷ� invokedynamic �ֽ���ָ�������е��á�
    // ����ʹ��JDK�е� javap ������������class�ļ���ʹ�� javap -p �� javap -c -v ��������һ��lambda���ʽ���ɵ��ֽ��롣
    // ����Ӧ�ó�������
    // private static java.lang.Object lambda$0(java.lang.String);
    // 6��lambda���ʽ�и����ƣ��Ǿ���ֻ������ final �� final �ֲ������������˵������lambda�ڲ��޸Ķ���������ı�����
    // List<Integer> primes = Arrays.asList(new Integer[]{2, 3,5,7});
    // int factor = 2;
    // primes.forEach(element -> { factor++; });
    // Compile time error : "local variables referenced from a lambda expression must be final or effectively final"
    // ���⣬ֻ�Ƿ������������޸��ǿ��Եģ�������ʾ��
    // List<Integer> primes = Arrays.asList(new Integer[]{2, 3,5,7});
    // int factor = 2;
    // primes.forEach(element -> { System.out.println(factor*element); });
    // �����
    // 4
    // 6
    // 10
    // 14
    // ��ˣ������������񲻿ɱ�հ���������Python��

}
