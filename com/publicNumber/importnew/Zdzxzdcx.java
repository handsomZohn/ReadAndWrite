package com.publicNumber.importnew;


/**
 * @Description �Զ�װ���Զ�����
 * @CreateDate 18/10/24 15:48
 * @Author zohn
 * @Version 1.0
 */
public class Zdzxzdcx {
    public static void main(String[] args) {
        zdzx();
        zdcx();
        // xxkzz();
        xxj();
    }

    /**
     * �Զ�װ��
     */
    public static void zdzx() {
        Integer i = 10;
        System.out.println(i);// 2: invokestatic  #4                  // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        // ������ֵ������Ӧ��Integer���� ������Զ�װ��
    }

    /**
     * �Զ�����
     */
    public static void zdcx() {
        Integer integer = 10;
        int i = integer;//  7: invokevirtual #7                  // Method java/lang/Integer.intValue:()I
        System.out.println(i);
        // ���ݰ�װ�����ͽ�����ת��Ϊ�������� �Զ�����
    }

    // ԭ��
    // ��javap ��������ֽ���ָ����Ϣ��
    // �Զ�װ���ʱ��Java��������Զ�����Integer��valueOf����
    // �Զ������ʱ��Java��������Զ�����Integer��intValue����

    /**
     * @Description С�Ŀ�ָ��
     * @CreateDate 18/10/24 15:59
     * @Author zohn
     * @Version 1.0
     */
    public static void xxkzz() {
        Object object = null;
        int i = (Integer)object;
        System.out.println(i);
    }

    public static void xxj(){
        Integer integer01 = 100;
        Integer integer02 = 100;
        Integer integer03 = 200;
        Integer integer04 = 200;

        System.out.println(integer01 == integer02);// true
        System.out.println(integer03 == integer04);// false

        Double double01 = 100.0;
        Double double02 = 100.0;
        Double double03 = 100.0;
        Double double04 = 100.0;


        System.out.println(double01 == double02);// false
        System.out.println(double03 == double04);// false

        // ԭ�����:Byte, Short, Integer, Long, Char�⼸��װ�����valueOf()��������128Ϊ�ֽ����˻���
        // ������128���£�������128��-128���ϣ�����-128����ȡ���������ֵ��
        // ��Float��Double�򲻻ᣬ��ΪByte��Short��Integer��Long��Char��ĳ����Χ�ڵ��������������޵ģ�Float��Doubleȴ����

        // ����֪ʶ
        // ����ĸ�����������߳�������Ч�ʡ���ʡ�ڴ�ռ��кܴ����
    }
}
