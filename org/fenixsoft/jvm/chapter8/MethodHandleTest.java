package org.fenixsoft.jvm.chapter8;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;

import static java.lang.invoke.MethodHandles.lookup;

/**
 * JSR 292 MethodHandle�����÷���ʾ
 * @author zzm
 */
public class MethodHandleTest {

    static class ClassA {
        public void println(String s) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) throws Throwable {
        Object obj = System.currentTimeMillis() % 2 == 0 ? System.out : new ClassA();
        // ����obj�������ĸ�ʵ���࣬������䶼����ȷ���õ�println������
        getPrintlnMH(obj).invokeExact("icyfenix");
    }

    private static MethodHandle getPrintlnMH(Object reveiver) throws Throwable {
        // MethodType�������������͡��������˷����ķ���ֵ��methodType()�ĵ�һ���������;��������methodType()�ڶ������Ժ�Ĳ�������
        MethodType mt = MethodType.methodType(void.class, String.class);
        // lookup()����������MethodHandles.lookup��������������ָ�����в��ҷ��ϸ����ķ������ơ��������ͣ����ҷ��ϵ���Ȩ�޵ķ��������
        // ��Ϊ������õ���һ���鷽��������Java���ԵĹ��򣬷�����һ����������ʽ�ģ�����÷����Ľ����ߣ�Ҳ����thisָ��Ķ������������ǰ�Ƿ��ڲ����б��н��д��ݣ������ṩ��bindTo()���������������顣
        return lookup().findVirtual(reveiver.getClass(), "println", mt).bindTo(reveiver);
    }
}
