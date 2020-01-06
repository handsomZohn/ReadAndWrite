package com.tools.helper.stringhelper;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class StringHelper extends StringTools {
    private StringHelper() {
    }

    /**
     * ȥ����ո�
     */
    public static void ntos(Object obj) {
        try {
            Class dataBeanClass = obj.getClass();
            Field dataBeanField[] = dataBeanClass.getDeclaredFields();
            String f_name;// ��������
            String m_name;// ��������
            Method gmethod;// ����
            Method smethod;// ����
            String c_value;// ֵ
            // �������Ľṹ��
            for (int i = 0; i < dataBeanField.length; i++) {
                if (!(dataBeanField[i].getType().equals("test".getClass()))) {// ��������ַ���
                    continue;
                }
                f_name = dataBeanField[i].getName();// ����
                m_name = "get" + Character.toUpperCase(f_name.charAt(0)) + f_name.substring(1);// �õ����е�get����
                gmethod = obj.getClass().getMethod(m_name, null);
                m_name = "set" + Character.toUpperCase(f_name.charAt(0)) + f_name.substring(1);// �õ����е�get����
                smethod = obj.getClass().getMethod(m_name,
                        new Class[] { dataBeanField[i].getType() });
                c_value = (String) gmethod.invoke(obj, null);// ȡֵ
                c_value = toTrim(c_value);
                smethod.invoke(obj, new Object[] { c_value });// ��ֵ
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    /**
     * �ж��ַ����Ƿ�Ϊ�ǿ�
     * @param string
     * @return
     */
    public static boolean isNotEmpty(String string) {
        return !isEmpty(string);
    }

    /**
     * �ж��ַ����Ƿ�Ϊ��
     * @param
     * @return
     */
    public static boolean isEmpty(String str) {
        str = toTrim(str);
        if ("".equals(str) || "null".equals(str)) {
            return true;
        }
        return false;
    }

    /**
     * �����������֤�������һλ��ĸת���ɴ�д
     */
    public static String formatSfzhm(String sfzhm) {
        if (isEmpty(sfzhm)) {
            return sfzhm;
        }
        return sfzhm.toUpperCase();
    }

    /**
     * ��;�����ô˷����ɽ�ҳ���еĿ�ֵ��null,"","null"��ת��Ϊ"&nbsp;"��
     */
    public static String vtoh(String temp) {
        if (toTrim(temp).equals("")) {
            return "&nbsp";
        }
        return temp;
    }

    /**
     * <pre>
     *     ��valueBean�е������ַ�����ִ��stringtools.totrim()����
     *     ������������̳е���������
     * </pre>
     * @param obj
     */
    public static void ntosWithSuper(Object obj) {
        try {
            Class dataBeanClass = obj.getClass();
            String temp;
            Method[] dataMethod = dataBeanClass.getMethods();// �õ����еķ���
            Method gmethod;// �����get����
            String c_value;// ֵ
            for (int i = 0; i < dataMethod.length; i++) {
                // �������set����������
                if (dataMethod[i].getName().indexOf("set") == -1) {
                    continue;
                }
                // ��������ַ����ͣ�����
                if (!dataMethod[i].getParameterTypes()[0].equals("test".getClass())) {
                    continue;
                }
                // �ӷ��������еõ�set������ַ�
                temp = dataMethod[i].getName()
                        .substring(dataMethod[i].getName().indexOf("set") + 3);
                gmethod = obj.getClass().getMethod("get" + temp, null);
                c_value = (String) gmethod.invoke(obj, null);// ȡֵ
                c_value = StringTools.toTrim(c_value);
                dataMethod[i].invoke(obj, new Object[] { c_value });// ��ֵ
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static String format(String input, int length) {
        String temp = "<SPAN title=\"" + input + "\">";
        temp += StringTools.fmtString(input, length);
        temp += "</SPAN>";
        return temp;
    }

    /**
     * �����ַ��Ż���������
     * ss �ַ���
     * dc ָ���ĳ���
     * lx 2007-09-22
     */
    public static String strFormat(String ss, int dc) {
        try {
            String temp = "";
            int qq = 0;
            if (ss.length() > 0) {
                qq = ss.length() / dc;
            }
            for (int i = 0; i < qq; i++) {
                temp += ss.substring(0, dc) + "\r\n";
                ss = ss.substring(dc);
            }
            temp += ss;
            return temp;
        } catch (Exception e) {
            return "";
        }
    }

    /**
     * ��������ַ������ֳ�100������������
     * @param temp
     * @return
     */
    public static int toInt(String temp) {
        return (int) (Double.parseDouble(temp) * 100 + 0.5d);
    }
}
