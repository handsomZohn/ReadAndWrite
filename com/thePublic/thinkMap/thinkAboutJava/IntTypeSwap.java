package com.thePublic.thinkMap.thinkAboutJava;

// ����main����
public class IntTypeSwap {
    public static void main(String[] args) {

        // CODE_1
        IntType type1 = new IntType();
        type1.setValue(1);

        // CODE_2
        IntType type2 = new IntType();
        type2.setValue(2);

        // ����
        swap1(type1, type2);
        System.out.printf("type1.value = %s, type2.value = %s", type1.getValue(), type2.getValue());

        System.out.println();

        swap2(type1, type2);
        System.out.printf("type1.value = %s, type2.value = %s", type1.getValue(), type2.getValue());

    }

    // ����������ݲ��õ������ô���,type1��type2���ݹ�������ָ���������ã��ڷ����ڲ�ֱ�Ӳ����βΣ��������βε����ݣ������β�
    // �ı䣬û�ж�ʵ�β����κ�Ӱ�죬Ҳû�иı����ʵ�ʵ�ֵ�����Խ�����޷������ġ�
    public static void swap1 (IntType type1, IntType type2) {
        IntType type = type1;
        type1 = type2;
        type2 = type;
        System.out.println("ֻ���βε�ת��==================");
        System.out.println("======^_^======����type1.getValue()ֵΪ: " + type1.getValue() + ", ����type2.getValue()ֵΪ: " +type2.getValue()+ ", ��ǰ���Լ�����������: IntTypeSwap.swap1()");
    }

    // ����������Ϊ�βδ��ݹ�����û�ж��β����κθı䣬����ֱ�Ӳ������β���ָ��Ķ���ʵ�ʵ�ַ����������������ʵ�λ��������ط���
    // ֻҪ��ָ��ö�������е����õ�ַ��Ӧ��ֵ����ı䡣
    public static void swap2 (IntType type1, IntType type2) {
        int temp = type1.getValue();
        type1.setValue(type2.getValue());
        type2.setValue(temp);
    }
}
