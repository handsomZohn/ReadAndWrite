package com.thread;

/**
 * @Description: ���̵߳��߳�������ʲôȷ������
 * @Author: zohn
 * @CreateDate: 2019/2/5 9:23
 * @UpdateUser: zohn
 * @UpdateDate: 2019/2/5 9:23
 * @UpdateRemark: �޸�����
 * @Version: 1.0
 */
public class MaxThread {

    public static void main(String[] args) {
        int maxThread = Runtime.getRuntime().availableProcessors() * 25;
        System.out.println("maxThread:" + maxThread);

        // ����߳�����CPU�ĺ���*25
        // ��java�����ȡcpu�ĺ�����Runtime.getRuntime.availableProcessors();
    }
}
