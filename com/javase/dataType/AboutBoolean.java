package com.javase.dataType;

public class AboutBoolean {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        if (true || false) {
            System.out.println("false----");
        }

        Boolean valueOf = Boolean.valueOf(false);

        System.out.println(valueOf);

        /**
         * ��==�ȽϺ�.equals�Ƚ�����ͬ�ģ�
         */
        System.out.println(Boolean.FALSE == Boolean.TRUE);
        System.out.println(Boolean.TRUE.equals(Boolean.FALSE));

    }

}