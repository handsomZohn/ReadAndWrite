package com.javagame;

public class GameThread extends Thread {

    private GamePanel panel;

    public GameThread(GamePanel panel) {
        this.panel = panel;
    }

    @Override
    public void run() {
        while (true) {
            try {
                //����������ͣ 0.01��
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            //ѭ���߼���ִ��
            panel.logic();

            //ҳ��ˢ��
            panel.repaint();
        }
    }
}
