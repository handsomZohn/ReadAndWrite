package com.book.cyc2018.javabingfa.threadLocal;

/**
 *@Description  ͨ��threadlcoal�ܴﵽ��ÿ���߳��д�������������Ч�� :
 * ���ȣ���ÿ���߳�Thread�ڲ���һ��ThreadLocal.ThreadLocalMap���͵ĳ�Ա����threadLocals�����threadLocals���������洢ʵ�ʵı���
 * �����ģ�keyΪ��ǰThreadLocal������valueΪ������������T���͵ı�����
 * ��ʼʱ����Thread���棬threadLocalsΪ�գ���ͨ��ThreadLocal��������get()��������set�����������ͻ��Thread���е�threadLocals���г�
 * ʼ���������Ե�ǰThreadLocal����Ϊkey����ThreadLocalҪ����ĸ�������Ϊvalue���浽threadLocals��
 * Ȼ�����߳����棬���Ҫʹ�ø����������Ϳ���ͨ��get������threadLocals������ҡ�
 *@CreateDate   18/08/09 14:40
 *@Author        zohn
 *@Version       1.0
 *
 */
public class ThreadLocalTest {
   ThreadLocal<Long> longThreadLocal = new ThreadLocal<>();
   ThreadLocal<String> stringThreadLocal = new ThreadLocal<>();

   public void set(){
       longThreadLocal.set(Thread.currentThread().getId());
       stringThreadLocal.set(Thread.currentThread().getName());
   }

   public long getLong(){
       return longThreadLocal.get();
   }

   public String getString(){
       return stringThreadLocal.get();
   }

    public static void main(String[] args) throws Exception {
        final ThreadLocalTest threadLocalTest = new ThreadLocalTest();
         threadLocalTest.set(); // ����дinitialValueҲ��set() �ڵ��õ��Ǿͻ��쳣
        System.out.println(threadLocalTest.getLong());
        System.out.println(threadLocalTest.getString());

        Thread thread = new Thread(() ->{
            threadLocalTest.set();
            System.out.println(threadLocalTest.getLong());
            System.out.println(threadLocalTest.getString());
        });

        thread.start();
        thread.join();

        System.out.println(threadLocalTest.getLong());
        System.out.println(threadLocalTest.getString());
    }
}
/**
 * �ܽ᣺
 * 1.ʵ�ʵ�ͨ��ThreadLocal�����ĸ����Ǵ洢��ÿ���߳��Լ���threadLocals�еģ�
 * 2.Ϊ��threadLocals������ThreadLocalMap�ļ�ֵΪThreadLocal������Ϊÿ���߳��п��ж��threadLocal��������������Ĵ����е�
 * longLocal��StringLocal
 * 3.��get֮ǰ����set����ᱨ��ָ���쳣
 * �����get֮ǰ����Ҫ����set������������ ������дinitialValue��������
 */
