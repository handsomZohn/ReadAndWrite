package com.book.cyc2018.newCharacteristics.eeight.lambdaExample;

import java.util.Arrays;
import java.util.List;

/**
 *@Description  Java 8��ʹ��lambda���ʽ��Map��Reduceʾ��
 *@CreateDate   18/07/19 14:53
 *@Author        zohn
 *@Version       1.0
 *
 */
public class MapReduceExample {
    public static void main(String[] args) {
//        jiaShui();
        jiaShuiQiuhe();
    }

    private static void jiaShui() {
        List<Integer> costBeforeTax = Arrays.asList(100, 200, 300, 400, 500);

        // ��ʹ��lambdaΪÿ����������12%��˰
        for (Integer cost : costBeforeTax) {
            double price = .12 * cost + cost;
            System.out.println(price);
        }

        // ʹ��lambdaΪÿ����������12%��˰
        costBeforeTax.stream().map((cost) -> cost + .12 * cost).forEach(System.out :: println);
//        for (Integer cost: costBeforeTax) {
//            if (cost > 400) {
//                //System.out :: println;
//                System.out.println(cost);
//            }
//        }


//        costBeforeTax.stream().map((cost) ->{
//            if (cost > 500) {
//                cost + .12 * cost).forEach(System.out :: println)
//            }
//        }
        // �����������Ϊ��֪�ĺ���ʽ��̸���map���������㽫�������ת����
        // �����ڱ����У����ǽ� costBeforeTax �б��ÿ��Ԫ��ת����Ϊ˰���ֵ��
        // ���ǽ� x -> x*x lambda���ʽ���� map() ���������߽���Ӧ�õ����е�ÿһ��Ԫ�ء�
        // Ȼ���� forEach() ���б�Ԫ�ش�ӡ������ʹ����API���ռ����࣬���Եõ����к�˰�Ŀ�����
        // �� toList() �����ķ����� map ���κ����������Ľ���ϲ������������ռ������������ն˲��������֮��㲻���������ˡ�
        // ��������������API�� reduce() �������������ֺϳ�һ������һ�����ӽ��ὲ����
    }

    private static void jiaShuiQiuhe(){
        List<Integer> costBeforeTax = Arrays.asList(100, 200, 300, 400, 500);
        double total = 0;
        // 1.8֮ǰ
        for (Integer cost : costBeforeTax) {
            double price = .12 * cost + cost;
            total = total + price;
        }
        System.out.println("total:" + total);

        // 1.8֮��
        double bill = costBeforeTax.stream().map((cost) -> cost + .12 * cost).reduce((sum, cost) -> sum + cost).get();

        System.out.println("total:" + bill);
    }
}
