package com.javagame;

import javax.swing.*;
import java.awt.*;

/**
 *@Description ��Ϸ���� 
 *@CreateDate 2020\6\24 0024 14:36
 *@Author z
 *@Version 1.0
 */
public class GamePanel extends JPanel {
    /**
     * ��Ļ�Ŀ�͸�
     */
    private int width, height;

    public GamePanel(int width, int height) {
        this.width = width;
        this.height = height;
        this.setSize(width, height);

        //���õ�ǰ�������Ի�ý��㡣
        this.setFocusable(true);
    }

    /**
     * �����λ��
     */
    private int fk_x = 60;
    private int fk_y = 60;


    /**
     * �����Ļ���
     */
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        //����ɫ����
        g.setColor(new Color(0x9391d6));
        g.fillRect(0, 0, width, height);

        //���Ʒ���
        g.setColor(Color.red);
        g.fillRect(fk_x, fk_y, 80, 80);
    }


    /**
     * ��Ϸ�߼�����������˶���ÿ�κ������궼�ƶ�1������
     */
    public void logic() {
        if (fk_x < 260) {
            fk_x = fk_x + 1;
        } else {
            fk_x = 60;
        }

        if (fk_y < 260) {
            fk_y = fk_y + 1;
        } else {
            fk_y = 60;
        }
    }


}
