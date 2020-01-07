package com.book.alibaba.generic;

public class GlmapperGeneric<T> {
    private T t;

    public T get() {
        return t;
    }

    public void set(T t) {
        this.t = t;
    }

    public static void main(String[] args) {
        new GlmapperGeneric().noSpecifyType();
        new GlmapperGeneric().specifyType();
    }

    /**
     * ��ָ������
     */
    public void noSpecifyType(){
        GlmapperGeneric glmapperGeneric = new GlmapperGeneric();
        glmapperGeneric.set("noSpecifyType");
        // ��Ҫǿ������ת��
        String test = (String) glmapperGeneric.get();
        System.out.println(test);
    }

    /**
     * ָ������
     */
    public void specifyType(){
        GlmapperGeneric<String> glmapperGeneric = new GlmapperGeneric();
        glmapperGeneric.set("specifyType");
        // ����Ҫǿ������ת��
        String test = glmapperGeneric.get();
        System.out.println(test);
    }
}
