package com.jingdiansuanfa;

public class Jdsf2 {

    /**
     * ������2�� ��Ŀ���ж�101-200֮���ж��ٸ����������������������
     * 1.����������ж������ķ�������һ�����ֱ�ȥ��2��sqrt(�����)������ܱ������� ���������������������֮��������
     *
     * @param args
     */
    public static void main(String[] args) {
        int i = 0;
        //int count = 0;
        math mymath = new math();
        for (i = 2; i <= 200; i++) {
            if (mymath.iszhishu(i))
                //count++;
                System.out.println(i);
        }
        //System.out.println("101-200֮��������ĸ�����:"+count);
    }

}

class math {
    public int f(int x) {
        if (x == 1 || x == 2)
            return x;
        else
            return f(x - 1) + f(x - 2);
    }

    public boolean iszhishu(int x) {
        for (int i = 2; i < x / 2; i++) {
            if (x % 2 == 0)
                return false;
        }
        return true;
    }
}
