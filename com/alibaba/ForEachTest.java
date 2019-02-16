package com.alibaba;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Iterator;

/**
 * @Description
 * @CreateDate 18/07/30 17:42
 * @Author zohn
 * @Version 1.0
 */
public class ForEachTest {
    public static void main(String[] args) {
        // iteratorRemove();
        //
        testForLoopRemove();
    }

    private static void iteratorRemove() {
        List<String> arrList = new ArrayList<>();// diamond�﷨
        arrList.add("1");
        arrList.add("2");
        arrList.add("3");
        // ����
        /*Iterator<String> iterator = arrList.iterator();
        while (iterator.hasNext()) {
            String string = iterator.next();
            if ("1".equals(string)) {
                iterator.remove();
            }
        }*/

        // ����
		/*for (String string : arrList) {
			if ("1".equals(string)) {
				arrList.remove(string);// java.util.ConcurrentModificationException
			}
		}*/

        // ����{"1", "1", "1", "2", "3", "4", "5"}��ɾ��1

        // ����תΪlist
        List<String> integerList = new ArrayList<>(); //Arrays.asList("1", "1", "1", "2", "3", "4", "5");// Arrays.asList
        /*integerList.add("1");
        integerList.add("1");
        integerList.add("1");*/
        integerList.addAll(Arrays.asList("1", "1", "1", "2", "3", "4", "5"));// Arrays.asList �����Ϳ��Բ����ˣ�������
        /*@SafeVarargs
        @SuppressWarnings("varargs")
        public static <T> List<T> asList(T... a) {
            return new ArrayList<>(a);
        }*/

        // ��Arrays�������һ���ڲ��� ��û��ʵ��add(E e), remove(int index)��remove(Object o)�ȷ�������Ȼ�ǲ����޸ĵ�

        //
        // �÷��������ַ����ǲ����Ե� ��Ϊ���׳�java.util.ConcurrentModificationException

        // �����������ַ���
        Iterator<String> iterator = integerList.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            if ("1".equals(next)) {
                iterator.remove();
            }
        }
       /* for (int i = 0; i < integerList.size(); i++) {
            int val = integerList.get(i);
            if (val == 1) {
                integerList.remove(val);
            }
        }
        */

        // ����ֻ�Ƴ�����һ��


        // ���תΪstr���
        String string = integerList.toString();
        System.out.println(string);
    }


    public static void testForLoopRemove() {
        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("1", "1", "1", "2", "3", "4", "5"));

        // ���׳�ConcurrentModificationException��foreachɾ����
        // ��Itr�������й�ϵ
        // for (String str : list) {
        //     if ("1".equals(str)) {
        //         list.remove(str);
        //     }
        // }

        for (int i = 0; i < list.size(); i++) {
            if ("1".equals(list.get(i))) {
                list.remove(i--);// i-- �
            }
        }
        System.out.println(list.toString());
    }

    /**
     * ���鲻��������
     */
    public static void testForLoopRemove02(){
        int[] arr = {1,2,1,1,1,1};
        for (int i = 0; i < arr.length; i++) {
            if (1 == arr[i]) {
                //arr[i].
            }
        }
    }
}
