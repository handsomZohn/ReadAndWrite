package org.fenixsoft.jvm.chapter9;

import java.lang.reflect.Method;

/**
 * Javaclassִ�й���
 *
 * @author zzm
 */
public class JavaclassExecuter {

    /**
     * ִ���ⲿ�������Ĵ���һ��Java���Byte����<br>
     * ���������byte�����д���java.lang.System��CONSTANT_Utf8_info�����޸�Ϊ�ٳֺ��HackSystem��
     * ִ�з���Ϊ�����static main(String[] args)������������Ϊ������System.out/err�������Ϣ
     *
     * @param classByte ����һ��Java���Byte����
     * @return ִ�н��
     */
    public static String execute(byte[] classByte) {
        HackSystem.clearBuffer();
        ClassModifier cm = new ClassModifier(classByte);
        byte[] modiBytes = cm.modifyUTF8Constant("java/lang/System", "org/fenixsoft/classloading/execute/HackSystem");
        HotSwapClassLoader loader = new HotSwapClassLoader();
        Class clazz = loader.loadByte(modiBytes);
        try {
            Method method = clazz.getMethod("main", new Class[]{String[].class});
            method.invoke(null, new String[]{null});
        } catch (Throwable e) {
            e.printStackTrace(HackSystem.out);
        }
        return HackSystem.getBufferString();
    }
}
