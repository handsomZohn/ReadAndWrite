package com.javase.passbyvalueorreference;

/**
 * @Description ֵ���ݻ������ô���
 * �ο����£���https://juejin.im/post/5bce68226fb9a05ce46a0476
 * @CreateDate 2020\4\8 0008 14:43
 * @Author zz
 * @Version 1.0
 */
public class PassByValueOrReference {

    public static void main(String[] args) {
        Student student = new Student() {{
            setId(100);
            setName("test001");
        }};

        String nameBeforeMain = student.getName();
        System.out.println("======^_^======variable nameBeforeMain value is : " + nameBeforeMain + ", " + " current method and class name is : PassByValueOrReference.test001()");

        test002(student);


        String nameAfterMain = student.getName();
        System.out.println("======^_^======variable nameAfterMain value is : " + nameAfterMain + ", " + " current method and class name is : PassByValueOrReference.test001()");
    }

    /*
    public void test001 () {
        Student student = new Student() {{
            setId(100);
            setName("test001");
        }};

        test002(student);
    }*/

    /**
     * @Description ���ô��ݣ������á�Ҳ����ָ����ʵ���ݵĵ�ֵַ���ڷ�������ʱ��ʵ�εĵ�ַͨ���������ô��ݸ���Ӧ���βΣ��ڷ�������ڲ�
     * �βκ�ʵ��ָ��ͬһ���ڴ��ַ�����βεĲ�������Ӱ�쵽ʵ�ε�����
     * @Author zz
     * @Date 2020\4\8 0008 15:11
     * @Param [student]
     * @Return void
     */
    public static void test002(Student student) {


        String nameBeforeTest002 = student.getName();

        System.out.println("======^_^======variable nameBeforeTest002 value is : " + nameBeforeTest002 + ", " + " current method and class name is : PassByValueOrReference.test002()");

        // ������Ϊ��001 001 002 002
        // �������һ��ħ���Ĵ��� ����ͱ������ 001 001 002 001
        // student = new Student();
        student.setName("test002");


        String nameAfterTest002 = student.getName();

        System.out.println("======^_^======variable nameAfterTest002 value is : " + nameAfterTest002 + ", " + " current method and class name is : PassByValueOrReference.test002()");
    }
}
