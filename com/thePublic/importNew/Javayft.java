package com.thePublic.importNew;






import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

/**
 * @Description java�﷨���Լ�Foreachѭ����ԭ��
 * @CreateDate 18/10/24 14:23
 * @Author zohn
 * @Version 1.0
 */

public class Javayft {


    public static void main(String[] args) {
        // kbccs(1, 2, "3", "222", "333", "120", "110");
        feachyl();
    }


    //java �﷨��--�ɱ䳤����
    public static void kbccs(int a, int b, @NotNull String... args) {
        System.out.println("---------zohn-----------aֵ=" + a + ", bֵ=" + b + ", argsֵ=" + args + ", ��ǰ��=Javayft.kbccs()");
        // ---------zohn-----------aֵ=1, bֵ=2, argsֵ=[Ljava.lang.String;@6d6f6e28, ��ǰ��=Javayft.kbccs()
        // ���Կ�����ӡ���ڴ��ַǰ����һ��[
        // ����˵�����ɱ����������������ʵ�ֵģ�
        for (String arg : args) {// ˵���������ñ�������ķ�ʽȥ�����ɱ����
            System.out.print(arg + " ");
        }

        // !! �ɱ����������Ϊ�����б�����һ������������һ�������б������һ���ɱ����
    }

    // foreach ѭ����ԭ��
    public static void feachyl() {
        ArrayList<String> strings = new ArrayList<String>() {{
            add("111");
            add("111");
            add("111");
            add("111");
        }};

        for(String str: strings){
            System.out.print(str + " ") ;
        }
    }
    // javap -verbose Javayft.class
    //  9: invokevirtual #19                 // Method java/util/ArrayList.iterator:()Ljava/util/Iterator;
    // 23: invokeinterface #21,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
    // ���Կ���Iterator���ڱ����ʱ����������Զ�����for����ؼ��ֵ�ʹ��ת��Ϊ��Ŀ��ĵ�������ʹ�ã�
    // �����ٵó��������ۣ�
    // 1��ArrayList֮������ʹ��foreachѭ������������ΪArrayList���е�List����Collection���ӽӿڣ�
    // ��Collection��Iterable���ӽӿڣ�ArrayList�ĸ���AbstractList��ȷ��ʵ����Iterable�ӿڵ�iterator����
    // 2���κ�һ�����ϣ�������JDK�ṩ�Ļ����Լ�д�ģ�ֻҪ��ʹ��foreachѭ���������ͱ�����ȷ��ʵ��Iterable�ӿ�

    // ���������foreach������ԭ��
    public static void szforeachyy() {
        int[] intArr = {1, 3, 5, 7, 9};
        for (int i : intArr) {
            System.out.print(i + " ");
        }
    }
    // ��������һ�� Ҳû����ʲô��˼

    // Java�����������foreachѭ��ת��Ϊ  �����������ÿһ��Ԫ�ص�ѭ������


}



