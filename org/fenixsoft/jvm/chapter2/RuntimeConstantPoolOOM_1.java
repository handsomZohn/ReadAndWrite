package org.fenixsoft.jvm.chapter2;

import java.util.HashSet;
import java.util.Set;

/**
 * VM Args��-XX:PermSize=6M -XX:MaxPermSize=6M
 *
 * @author zzm
 */
public class RuntimeConstantPoolOOM_1 {

    public static void main(String[] args) {
        // ʹ��Set�����ų��������ã�����Full GC���ճ�������Ϊ
        Set<String> set = new HashSet<String>();
        // ��short��Χ��������6MB��PermSize����OOM��
        short i = 0;
        while (true) {
            set.add(String.valueOf(i++).intern());
        }
    }
}
