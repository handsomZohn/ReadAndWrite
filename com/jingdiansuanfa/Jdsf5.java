package com.jingdiansuanfa;

import javax.swing.JOptionPane;

public class Jdsf5 {

	/**
	 * ������5�� ��Ŀ�����������������Ƕ������ɴ��⣺ѧϰ�ɼ�> =90�ֵ�ͬѧ��A��ʾ��60-89��֮�����B��ʾ��60�����µ���C��ʾ��
	 * 1.���������(a> b)?a:b��������������Ļ������ӡ�
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "";
		str = JOptionPane.showInputDialog("���������ֵ(����exit�˳�):");
		int mark = 0;
		try {
			
			if("exit".equals(str)){
				System.exit(0);
			}
			mark = Integer.parseInt(str);
		} catch (NumberFormatException e) {
			throw new RuntimeException("������ʽ����!!!");
			// e.printStackTrace();
		}
		System.out.println(mark > 90 ? "A" : (mark > 60 ? "B" : "C"));
	}
}
