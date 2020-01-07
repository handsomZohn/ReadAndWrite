package com.book.alibaba.generic;

import java.util.ArrayList;
import java.util.List;

public class Animal {

    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        // ���ᱨ��
        int i = countLegs(dogs);
        // ֱ�ӱ��뱨��
        // countLegs001(dogs);
        System.out.println("======^_^======����iֵΪ: " + i + ", " + "��ǰ���Լ�����������: Animal.main()");
    }

    // �涨���ϱ߽絫�ǲ����ľ���������ʲô�����Զ��ڴ���� Animal�Լ��� ���������඼����֧�֣����Ҳ��ᱨ��
    static int countLegs (List<? extends Animal> animals) {
        int retVal = 0;
        for (Animal animal : animals) {
            retVal += animal.countLegs(animals);
        }
        return retVal;
    }


    static int countLegs001 (List<Animal> animals) {
        int retVal = 0;
        for (Animal animal : animals) {
            retVal += animal.countLegs(animals);
        }
        return retVal;
    }

}
