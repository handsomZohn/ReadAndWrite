package com.javagame;

import javax.swing.*;

public class GameFrame extends JFrame {
    private int width = 600, height = 400;

    public GameFrame() {
        //���ô������
        this.setTitle("java��Ϸ������̸-̨���Ʒ");

        //����һ������
        GamePanel panel = new GamePanel(width, height);
        //�ѻ������뵽������
        getContentPane().add(panel, "Center");

        //���ô����С
        this.setSize(width, height);
        //�����ܷ���������С
        this.setResizable(false);
        //����ʹ������Ļ�Ͼ�����ʾ
        this.setLocationRelativeTo(null);
        //���رմ����ʱ���˳�����
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        //�Ѵ�����ʾ����
        this.setVisible(true);

        //��ʼ��Ϸ�̵߳�ѭ��
        GameThread gt = new GameThread(panel);
        gt.start();
    }

    /**
     * ������
     */
    public static void main(String[] args) {
        GameFrame frame = new GameFrame();
    }
}
