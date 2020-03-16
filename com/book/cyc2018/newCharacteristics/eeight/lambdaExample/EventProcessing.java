package com.book.cyc2018.newCharacteristics.eeight.lambdaExample;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @Description ʹ��Java 8 lambda���ʽ�����¼����� ��lambda���ʽд�����õ��¼���������
 * @CreateDate 18/07/19 10:36
 * @Author zohn
 * @Version 1.0
 */
public class EventProcessing {
    public static void main(String[] args) {
        JButton button = new JButton("Show");
        // 1.8֮ǰ
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Event handing without zlambda is boring");
            }
        });
        // 1.8֮��
        button.addActionListener((e) -> {
            System.out.println("Light, Camera, Action !! Lambda expressions Rocks");
        });
    }
    // Java�����߾���ʹ�����������һ���ط���Ϊ Collections.sort() ���� Comparator��
    // ��Java 8�У�������ø��ɶ���lambda���ʽ������ª�������ࡣ
    // �Ұ����������ϰ��Ӧ�ò��ѣ����԰�������ʹ��lambda���ʽʵ�� Runnable �� ActionListener �Ĺ����е���·������
}
