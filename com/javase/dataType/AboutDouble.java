package com.javase.dataType;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class AboutDouble {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hdxsdhlw();
	}
	
	//��һ��double���͵����ݣ���ȡ�� �� �� С���� ����λ
	public static void hdxsdhlw(){
		//��һ��
		DecimalFormat decimalFormat = new DecimalFormat("#########0.0000");//.����0�ĸ�����ʾ����λ��
		double d1 = 1.23567;
		System.out.println(decimalFormat.format(d1) + "formater");
		//�ڶ���
		BigDecimal bigDecimal = new BigDecimal(d1);
		double doubleValue = bigDecimal.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
		System.out.println(doubleValue + "BigDecimal");
		//������   since 1.5
		String result = String.format("%.2f",d1);//%.��ʾ.ǰ����λ�� 2��ʾ.����λ
		System.out.println(result + "%.2f");
		//������
		NumberFormat numberInstance = NumberFormat.getNumberInstance();
		numberInstance.setMaximumFractionDigits(2);
		System.out.println(numberInstance.format(d1) + "numberFormat");
	}

}
