package com.javase.programmer.ifelse;

/**
 * @Description Java�����Թ���꿽�ʣ�if���ִ����else�����Ĳ�����ִ����
 * https://mp.weixin.qq.com/s/TmZ892ptjreKPbeRlFqdCw
 * @CreateDate 2020\6\3 0003 11:49
 * @Author z
 * @Version 1.0
 */
public class IfElseTest {
    public static void main(String[] args) {
        new IfElseTest().print(args == null || new IfElseTest() {{
            IfElseTest.main(null);
        }}.equals(null));
    }

    public void print(boolean flag) {
        if (flag) {
            System.out.println("����if���ķ�֧");
        } else {
            System.out.println("����else���ķ�֧");
        }
    }
}
