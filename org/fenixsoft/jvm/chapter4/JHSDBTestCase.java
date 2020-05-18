package org.fenixsoft.jvm.chapter4;

/**
 * staticObj��instanceObj��localObj��������
 */
public class JHSDBTestCase {

    static class Test {
        static ObjectHolder staticObj = new ObjectHolder();
        ObjectHolder instanceObj = new ObjectHolder();

        void foo() {
            ObjectHolder localObj = new ObjectHolder();
            System.out.println("done");    // ������һ���ϵ�
        }
    }

    private static class ObjectHolder {}

    public static void main(String[] args) {
        Test test = new Test();
        test.foo();
    }
}
