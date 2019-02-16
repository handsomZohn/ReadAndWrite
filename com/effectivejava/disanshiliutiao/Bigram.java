package com.effectivejava.disanshiliutiao;

import java.util.HashSet;
import java.util.Set;

// Can you spot the bug?
public class Bigram {
    private final char first;
    private final char second;

    public Bigram(char first, char second) {
        this.first = first;
        this.second = second;
    }

    // û�и���equals ���ǽ�equals�����������ˣ���Ҫ����Object��equals�������Ǿͱ��붨��һ������ΪObject��equals������
    // ���equals�����ǲ��Զ����ͬһ�� ������==��
    //
    /*public boolean equals(Bigram bigram){
        return bigram.first == first && bigram.second == second;
    }*/

    @Override
    public boolean equals(Object o){
        if (!(o instanceof Bigram)) {
            return false;
        }
        Bigram bigram = (Bigram) o;
        return bigram.first == first && bigram.second == second;
    }

    public int hashCode() {
        return 31 * first + second;
    }

    public static void main(String[] args) {
        Set<Bigram> set = new HashSet<Bigram>();
        for (int i = 0; i < 10; i++) {
            for (char ch = 'a'; ch <= 'z'; ch++) {
                set.add(new Bigram(ch,ch));

            }
        }
        System.out.println(set.size());
    }

}
