package org.fenixsoft.jvm.chapter4;

import java.util.ArrayList;
import java.util.List;

public class JConsoleTestCase {

    /**
     * �ڴ�ռλ������һ��OOMObject��Լռ64K
     */
    static class OOMObject {
        public byte[] placeholder = new byte[64 * 1024];
    }

    public static void fillHeap(int num) throws InterruptedException {
        List<OOMObject> list = new ArrayList<OOMObject>();
        for (int i = 0; i < num; i++) {
            // ������ʱ����������ߵı仯��������
            Thread.sleep(100);
            list.add(new OOMObject());
        }
        // ����û���˳� ���ܻ��յ�ȫ�����ڴ棺��
        System.gc();
    }

    // System.gc();

    /**
     * @Description ��64kb/100ms���ٶ���java����������ݣ�һ�����10w��
     * @Author z
     * @Date 2020/10/12 22:02
     * @Param [args]
     * @Return void
     */
    public static void main(String[] args) throws Exception {
        fillHeap(100000);
    }

}
